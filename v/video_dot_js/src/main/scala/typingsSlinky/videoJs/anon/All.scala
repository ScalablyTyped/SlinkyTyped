package typingsSlinky.videoJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait All extends js.Object {
  var DEFAULT: String = js.native
  var all: String = js.native
  var debug: String = js.native
  var error: String = js.native
  var info: String = js.native
  var off: String = js.native
  var warn: String = js.native
}

object All {
  @scala.inline
  def apply(
    DEFAULT: String,
    all: String,
    debug: String,
    error: String,
    info: String,
    off: String,
    warn: String
  ): All = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEFAULT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

