package typingsSlinky.walk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkOptionsListeners extends js.Object {
  var directories: js.UndefOr[WalkStatArrayEventCallback] = js.native
  var directory: js.UndefOr[WalkStatEventCallback] = js.native
  var directoryError: js.UndefOr[WalkStatArrayEventCallback] = js.native
  var end: js.UndefOr[WalkStatArrayEventCallback] = js.native
  var errors: js.UndefOr[WalkStatArrayEventCallback] = js.native
  var file: js.UndefOr[WalkStatEventCallback] = js.native
  var files: js.UndefOr[WalkStatArrayEventCallback] = js.native
  var names: js.UndefOr[WalkNamesEventCallback] = js.native
  var nodeError: js.UndefOr[WalkStatArrayEventCallback] = js.native
}

object WalkOptionsListeners {
  @scala.inline
  def apply(): WalkOptionsListeners = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkOptionsListeners]
  }
  @scala.inline
  implicit class WalkOptionsListenersOps[Self <: WalkOptionsListeners] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectories(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectory(value: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryError(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDirectoryError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryError")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: (/* base */ String, /* names */ js.Array[String], /* next */ WalkNext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeError(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNodeError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeError")(js.undefined)
        ret
    }
  }
  
}

