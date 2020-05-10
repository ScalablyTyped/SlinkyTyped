package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptReferenceHost extends js.Object {
  def getCompilerOptions(): CompilerOptions = js.native
  def getCurrentDirectory(): java.lang.String = js.native
  def getSourceFile(fileName: java.lang.String): js.UndefOr[SourceFile] = js.native
  def getSourceFileByPath(path: Path): js.UndefOr[SourceFile] = js.native
}

object ScriptReferenceHost {
  @scala.inline
  def apply(
    getCompilerOptions: () => CompilerOptions,
    getCurrentDirectory: () => java.lang.String,
    getSourceFile: java.lang.String => js.UndefOr[SourceFile],
    getSourceFileByPath: Path => js.UndefOr[SourceFile]
  ): ScriptReferenceHost = {
    val __obj = js.Dynamic.literal(getCompilerOptions = js.Any.fromFunction0(getCompilerOptions), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getSourceFile = js.Any.fromFunction1(getSourceFile), getSourceFileByPath = js.Any.fromFunction1(getSourceFileByPath))
    __obj.asInstanceOf[ScriptReferenceHost]
  }
  @scala.inline
  implicit class ScriptReferenceHostOps[Self <: ScriptReferenceHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCompilerOptions(value: () => CompilerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompilerOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentDirectory(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentDirectory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceFile(value: java.lang.String => js.UndefOr[SourceFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSourceFileByPath(value: Path => js.UndefOr[SourceFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceFileByPath")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

