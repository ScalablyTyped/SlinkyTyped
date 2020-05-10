package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlwaysInclude extends js.Object {
  var alwaysInclude: Double = js.native
  var onlyIfLicensed: Double = js.native
  var onlyIfUnlicensed: Double = js.native
}

object AnonAlwaysInclude {
  @scala.inline
  def apply(alwaysInclude: Double, onlyIfLicensed: Double, onlyIfUnlicensed: Double): AnonAlwaysInclude = {
    val __obj = js.Dynamic.literal(alwaysInclude = alwaysInclude.asInstanceOf[js.Any], onlyIfLicensed = onlyIfLicensed.asInstanceOf[js.Any], onlyIfUnlicensed = onlyIfUnlicensed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlwaysInclude]
  }
  @scala.inline
  implicit class AnonAlwaysIncludeOps[Self <: AnonAlwaysInclude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysInclude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyIfLicensed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyIfLicensed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyIfUnlicensed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyIfUnlicensed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

