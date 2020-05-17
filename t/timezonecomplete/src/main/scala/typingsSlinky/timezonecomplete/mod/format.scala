package typingsSlinky.timezonecomplete.mod

import typingsSlinky.timezonecomplete.localeMod.PartialLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "format")
@js.native
object format extends js.Object {
  def apply(
    dateTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    localZone: js.UndefOr[Null | typingsSlinky.timezonecomplete.timezoneMod.TimeZone],
    formatString: String
  ): String = js.native
  def apply(
    dateTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    utcTime: typingsSlinky.timezonecomplete.basicsMod.TimeStruct,
    localZone: js.UndefOr[Null | typingsSlinky.timezonecomplete.timezoneMod.TimeZone],
    formatString: String,
    locale: PartialLocale
  ): String = js.native
}

