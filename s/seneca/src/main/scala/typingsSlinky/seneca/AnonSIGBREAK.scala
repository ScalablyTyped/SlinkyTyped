package typingsSlinky.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSIGBREAK extends js.Object {
  var SIGBREAK: js.UndefOr[Boolean] = js.native
  var SIGHUP: js.UndefOr[Boolean] = js.native
  var SIGINT: js.UndefOr[Boolean] = js.native
  var SIGTERM: js.UndefOr[Boolean] = js.native
}

object AnonSIGBREAK {
  @scala.inline
  def apply(): AnonSIGBREAK = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSIGBREAK]
  }
  @scala.inline
  implicit class AnonSIGBREAKOps[Self <: AnonSIGBREAK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSIGBREAK(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGBREAK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIGBREAK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGBREAK")(js.undefined)
        ret
    }
    @scala.inline
    def withSIGHUP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGHUP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIGHUP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGHUP")(js.undefined)
        ret
    }
    @scala.inline
    def withSIGINT(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGINT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIGINT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGINT")(js.undefined)
        ret
    }
    @scala.inline
    def withSIGTERM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGTERM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIGTERM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGTERM")(js.undefined)
        ret
    }
  }
  
}

