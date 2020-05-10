package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReferenceResolverHost extends js.Object {
  def directoryExists(path: String): Boolean = js.native
  def fileExists(path: String): Boolean = js.native
  def getParentDirectory(path: String): String = js.native
  def getScriptSnapshot(fileName: String): IScriptSnapshot = js.native
  def resolveRelativePath(path: String, directory: String): String = js.native
}

object IReferenceResolverHost {
  @scala.inline
  def apply(
    directoryExists: String => Boolean,
    fileExists: String => Boolean,
    getParentDirectory: String => String,
    getScriptSnapshot: String => IScriptSnapshot,
    resolveRelativePath: (String, String) => String
  ): IReferenceResolverHost = {
    val __obj = js.Dynamic.literal(directoryExists = js.Any.fromFunction1(directoryExists), fileExists = js.Any.fromFunction1(fileExists), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath))
    __obj.asInstanceOf[IReferenceResolverHost]
  }
  @scala.inline
  implicit class IReferenceResolverHostOps[Self <: IReferenceResolverHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFileExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetParentDirectory(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentDirectory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScriptSnapshot(value: String => IScriptSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolveRelativePath(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveRelativePath")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

