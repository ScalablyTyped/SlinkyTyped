package typingsSlinky.suncalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMoonTimes_ extends js.Object {
  var alwaysDown: Boolean
  var alwaysUp: Boolean
  var rise: js.Date
  var set: js.Date
}

object GetMoonTimes_ {
  @scala.inline
  def apply(alwaysDown: Boolean, alwaysUp: Boolean, rise: js.Date, set: js.Date): GetMoonTimes_ = {
    val __obj = js.Dynamic.literal(alwaysDown = alwaysDown.asInstanceOf[js.Any], alwaysUp = alwaysUp.asInstanceOf[js.Any], rise = rise.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMoonTimes_]
  }
}

