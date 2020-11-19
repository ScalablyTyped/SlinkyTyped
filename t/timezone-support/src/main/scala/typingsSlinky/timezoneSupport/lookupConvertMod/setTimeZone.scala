package typingsSlinky.timezoneSupport.lookupConvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezone-support/dist/lookup-convert", "setTimeZone")
@js.native
object setTimeZone extends js.Object {
  
  def apply(time: js.Date, timeZone: TimeZoneInfo): Time = js.native
  def apply(time: js.Date, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
  def apply(time: Time, timeZone: TimeZoneInfo): Time = js.native
  def apply(time: Time, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
}
