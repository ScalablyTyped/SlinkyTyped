package typingsSlinky.wampy.mod

import typingsSlinky.wampy.wampyStrings.kill
import typingsSlinky.wampy.wampyStrings.killnowait
import typingsSlinky.wampy.wampyStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelAdvancedOptions extends js.Object {
  var mode: js.UndefOr[skip | kill | killnowait] = js.native
}

object CancelAdvancedOptions {
  @scala.inline
  def apply(): CancelAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelAdvancedOptions]
  }
  @scala.inline
  implicit class CancelAdvancedOptionsOps[Self <: CancelAdvancedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: skip | kill | killnowait): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

