package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleResolutionHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.native
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.native
  var getDirectories: js.UndefOr[js.Function1[/* path */ java.lang.String, js.Array[java.lang.String]]] = js.native
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.native
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  def fileExists(fileName: java.lang.String): Boolean = js.native
  def readFile(fileName: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

object ModuleResolutionHost {
  @scala.inline
  def apply(
    fileExists: java.lang.String => Boolean,
    readFile: java.lang.String => js.UndefOr[java.lang.String]
  ): ModuleResolutionHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), readFile = js.Any.fromFunction1(readFile))
    __obj.asInstanceOf[ModuleResolutionHost]
  }
  @scala.inline
  implicit class ModuleResolutionHostOps[Self <: ModuleResolutionHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileExists(value: java.lang.String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadFile(value: java.lang.String => js.UndefOr[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDirectoryExists(value: /* directoryName */ java.lang.String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDirectoryExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryExists")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCurrentDirectory(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentDirectory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCurrentDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirectories(value: /* path */ java.lang.String => js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectories")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectories")(js.undefined)
        ret
    }
    @scala.inline
    def withRealpath(value: /* path */ java.lang.String => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRealpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpath")(js.undefined)
        ret
    }
    @scala.inline
    def withTrace(value: /* s */ java.lang.String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
  }
  
}

