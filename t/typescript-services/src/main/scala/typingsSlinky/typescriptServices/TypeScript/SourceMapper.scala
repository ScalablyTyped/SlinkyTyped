package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapper extends js.Object {
  var allSourceMappings: js.Any = js.native
  var currentMappings: js.Array[js.Array[SourceMapping]] = js.native
  var currentNameIndex: js.Array[Double] = js.native
  var jsFile: js.Any = js.native
  var jsFileName: js.Any = js.native
  var mappingLevel: js.Any = js.native
  var names: js.Array[String] = js.native
  var sourceMapDirectory: js.Any = js.native
  var sourceMapEntries: js.Any = js.native
  var sourceMapOut: js.Any = js.native
  var sourceMapPath: js.Any = js.native
  var sourceRoot: js.Any = js.native
  var tsFilePaths: js.Any = js.native
  def decreaseMappingLevel(ast: IASTSpan): Unit = js.native
  def emitSourceMapping(): Unit = js.native
  def getOutputFile(): OutputFile = js.native
  def increaseMappingLevel(ast: IASTSpan): Unit = js.native
  def setNewSourceFile(document: Document, emitOptions: EmitOptions): Unit = js.native
  /* private */ def setNewSourceFilePath(document: js.Any, emitOptions: js.Any): js.Any = js.native
  /* private */ def setSourceMapOptions(document: js.Any, jsFilePath: js.Any, emitOptions: js.Any, resolvePath: js.Any): js.Any = js.native
}

object SourceMapper {
  @scala.inline
  def apply(
    allSourceMappings: js.Any,
    currentMappings: js.Array[js.Array[SourceMapping]],
    currentNameIndex: js.Array[Double],
    decreaseMappingLevel: IASTSpan => Unit,
    emitSourceMapping: () => Unit,
    getOutputFile: () => OutputFile,
    increaseMappingLevel: IASTSpan => Unit,
    jsFile: js.Any,
    jsFileName: js.Any,
    mappingLevel: js.Any,
    names: js.Array[String],
    setNewSourceFile: (Document, EmitOptions) => Unit,
    setNewSourceFilePath: (js.Any, js.Any) => js.Any,
    setSourceMapOptions: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    sourceMapDirectory: js.Any,
    sourceMapEntries: js.Any,
    sourceMapOut: js.Any,
    sourceMapPath: js.Any,
    sourceRoot: js.Any,
    tsFilePaths: js.Any
  ): SourceMapper = {
    val __obj = js.Dynamic.literal(allSourceMappings = allSourceMappings.asInstanceOf[js.Any], currentMappings = currentMappings.asInstanceOf[js.Any], currentNameIndex = currentNameIndex.asInstanceOf[js.Any], decreaseMappingLevel = js.Any.fromFunction1(decreaseMappingLevel), emitSourceMapping = js.Any.fromFunction0(emitSourceMapping), getOutputFile = js.Any.fromFunction0(getOutputFile), increaseMappingLevel = js.Any.fromFunction1(increaseMappingLevel), jsFile = jsFile.asInstanceOf[js.Any], jsFileName = jsFileName.asInstanceOf[js.Any], mappingLevel = mappingLevel.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], setNewSourceFile = js.Any.fromFunction2(setNewSourceFile), setNewSourceFilePath = js.Any.fromFunction2(setNewSourceFilePath), setSourceMapOptions = js.Any.fromFunction4(setSourceMapOptions), sourceMapDirectory = sourceMapDirectory.asInstanceOf[js.Any], sourceMapEntries = sourceMapEntries.asInstanceOf[js.Any], sourceMapOut = sourceMapOut.asInstanceOf[js.Any], sourceMapPath = sourceMapPath.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], tsFilePaths = tsFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapper]
  }
  @scala.inline
  implicit class SourceMapperOps[Self <: SourceMapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllSourceMappings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSourceMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentMappings(value: js.Array[js.Array[SourceMapping]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentNameIndex(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNameIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecreaseMappingLevel(value: IASTSpan => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreaseMappingLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmitSourceMapping(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitSourceMapping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOutputFile(value: () => OutputFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutputFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIncreaseMappingLevel(value: IASTSpan => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseMappingLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJsFile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsFileName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMappingLevel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetNewSourceFile(value: (Document, EmitOptions) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNewSourceFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetNewSourceFilePath(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNewSourceFilePath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSourceMapOptions(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSourceMapOptions")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSourceMapDirectory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMapEntries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMapOut(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceMapPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTsFilePaths(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsFilePaths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

