package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlwaysInclude extends js.Object {
  var alwaysInclude: scala.Double = js.native
  var onlyIfLicensed: scala.Double = js.native
  var onlyIfUnlicensed: scala.Double = js.native
}

object AlwaysInclude {
  @scala.inline
  def apply(alwaysInclude: scala.Double, onlyIfLicensed: scala.Double, onlyIfUnlicensed: scala.Double): AlwaysInclude = {
    val __obj = js.Dynamic.literal(alwaysInclude = alwaysInclude.asInstanceOf[js.Any], onlyIfLicensed = onlyIfLicensed.asInstanceOf[js.Any], onlyIfUnlicensed = onlyIfUnlicensed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlwaysInclude]
  }
  @scala.inline
  implicit class AlwaysIncludeOps[Self <: AlwaysInclude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysInclude(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyIfLicensed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyIfLicensed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyIfUnlicensed(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyIfUnlicensed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

