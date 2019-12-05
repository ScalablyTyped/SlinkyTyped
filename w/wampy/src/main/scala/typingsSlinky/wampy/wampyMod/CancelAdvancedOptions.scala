package typingsSlinky.wampy.wampyMod

import typingsSlinky.wampy.wampyStrings.kill
import typingsSlinky.wampy.wampyStrings.killnowait
import typingsSlinky.wampy.wampyStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelAdvancedOptions extends js.Object {
  var mode: js.UndefOr[skip | kill | killnowait] = js.undefined
}

object CancelAdvancedOptions {
  @scala.inline
  def apply(mode: skip | kill | killnowait = null): CancelAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAdvancedOptions]
  }
}

