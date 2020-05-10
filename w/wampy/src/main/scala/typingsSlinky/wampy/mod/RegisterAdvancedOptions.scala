package typingsSlinky.wampy.mod

import typingsSlinky.wampy.wampyStrings.first
import typingsSlinky.wampy.wampyStrings.last
import typingsSlinky.wampy.wampyStrings.prefix
import typingsSlinky.wampy.wampyStrings.random
import typingsSlinky.wampy.wampyStrings.roundrobin
import typingsSlinky.wampy.wampyStrings.single
import typingsSlinky.wampy.wampyStrings.wildcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterAdvancedOptions extends js.Object {
  var invoke: js.UndefOr[single | roundrobin | random | first | last] = js.native
  var `match`: js.UndefOr[prefix | wildcard] = js.native
}

object RegisterAdvancedOptions {
  @scala.inline
  def apply(): RegisterAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterAdvancedOptions]
  }
  @scala.inline
  implicit class RegisterAdvancedOptionsOps[Self <: RegisterAdvancedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvoke(value: single | roundrobin | random | first | last): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch(value: prefix | wildcard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
  }
  
}

