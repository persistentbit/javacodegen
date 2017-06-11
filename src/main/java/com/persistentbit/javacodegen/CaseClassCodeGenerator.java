package com.persistentbit.javacodegen;

import com.persistentbit.core.ModuleCore;
import com.persistentbit.core.OK;
import com.persistentbit.core.io.IO;
import com.persistentbit.core.io.IOFiles;
import com.persistentbit.core.javacodegen.JClass;
import com.persistentbit.core.javacodegen.JJavaFile;
import com.persistentbit.core.logging.printing.LogPrint;
import com.persistentbit.core.result.Result;

import java.io.File;

/**
 * TODOC
 *
 * @author petermuys
 * @since 11/06/17
 */
public class CaseClassCodeGenerator{

	public static Result<OK>	generateCaseClasses(File sourceDirPath){
		return Result.function(sourceDirPath).code(l -> {
			return JavaSourceReader.importJavaSourceDirectory(sourceDirPath)
				.flatMap(tlist -> {
					return Result.fromSequence(tlist.map(titem -> {
						JJavaFile jfile = titem._2;
						JJavaFile resultfile = makeCaseClasses(jfile);
						if(resultfile.equals(jfile)){
							l.info("Skipping " + titem._1);
							return Result.success(OK.inst);
						}
						l.info("Writing " + titem._1);
						return IOFiles.write(resultfile.print().printToString(), titem._1, IO.utf8);
					})).map(pstream -> OK.inst);
				});
		});
	}

	private static JJavaFile	makeCaseClasses(JJavaFile javaFile){
		return javaFile
			.withClasses(javaFile.getClasses().map(CaseClassCodeGenerator::makeCaseClass));
	}

	private static JClass makeCaseClass(JClass cls){
		cls = cls.withClasses(cls.getInternalClasses().map(CaseClassCodeGenerator::makeCaseClass));
		if(cls.hasAnnotation("CaseClass") == false){
			return cls;
		}
		return cls.makeCaseClass();
	}

	public static void main(String[] args) {
		LogPrint lp = ModuleCore.consoleLogPrint.registerAsGlobalHandler();
		File srcDir = new File("/Users/petermuys/feniks/persistentbit/javacodegen/src/test/java/com/persistentbit/javacodegen/tests");
		generateCaseClasses(srcDir).withLogs(log -> lp.print(log)).orElseThrow();
	}
}
