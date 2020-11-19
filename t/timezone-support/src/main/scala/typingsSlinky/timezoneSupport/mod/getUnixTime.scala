package typingsSlinky.timezoneSupport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezone-support", "getUnixTime")
@js.native
object getUnixTime extends js.Object {
  
  def apply(time: Time): Double = js.native
  def apply(time: Time, timeZone: TimeZoneInfo): Double = js.native
}
