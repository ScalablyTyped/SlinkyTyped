package typingsSlinky.winrt.Windows.System.UserProfile

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Globalization.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
@js.native
class GlobalizationPreferences () extends js.Object

/* static members */
@JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
@js.native
object GlobalizationPreferences extends js.Object {
  var calendars: IVectorView[String] = js.native
  var clocks: IVectorView[String] = js.native
  var currencies: IVectorView[String] = js.native
  var homeGeographicRegion: String = js.native
  var languages: IVectorView[String] = js.native
  var weekStartsOn: DayOfWeek = js.native
}

