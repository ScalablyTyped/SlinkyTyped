package typingsSlinky.wampy.wampyMod

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

trait RegisterAdvancedOptions extends js.Object {
  var invoke: js.UndefOr[single | roundrobin | random | first | last] = js.undefined
  var `match`: js.UndefOr[prefix | wildcard] = js.undefined
}

object RegisterAdvancedOptions {
  @scala.inline
  def apply(invoke: single | roundrobin | random | first | last = null, `match`: prefix | wildcard = null): RegisterAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (invoke != null) __obj.updateDynamic("invoke")(invoke.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterAdvancedOptions]
  }
}

