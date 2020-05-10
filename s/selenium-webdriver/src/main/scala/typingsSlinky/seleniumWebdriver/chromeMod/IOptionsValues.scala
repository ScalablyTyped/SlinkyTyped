package typingsSlinky.seleniumWebdriver.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptionsValues extends js.Object {
  var args: js.Array[String] = js.native
  var binary: js.UndefOr[String] = js.native
  var detach: Boolean = js.native
  var extensions: js.Array[String] = js.native
  var localState: js.UndefOr[js.Any] = js.native
  var logFile: js.UndefOr[String] = js.native
  var prefs: js.UndefOr[js.Any] = js.native
}

object IOptionsValues {
  @scala.inline
  def apply(args: js.Array[String], detach: Boolean, extensions: js.Array[String]): IOptionsValues = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], detach = detach.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptionsValues]
  }
  @scala.inline
  implicit class IOptionsValuesOps[Self <: IOptionsValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localState")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFile")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefs")(js.undefined)
        ret
    }
  }
  
}

