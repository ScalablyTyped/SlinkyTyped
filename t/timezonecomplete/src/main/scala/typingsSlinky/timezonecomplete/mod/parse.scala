package typingsSlinky.timezonecomplete.mod

import typingsSlinky.timezonecomplete.localeMod.PartialLocale
import typingsSlinky.timezonecomplete.parseMod.AwareTimeStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "parse")
@js.native
object parse extends js.Object {
  def apply(dateTimeString: String, formatString: String): AwareTimeStruct = js.native
  def apply(dateTimeString: String, formatString: String, overrideZone: Null, allowTrailing: Boolean): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone
  ): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone,
    allowTrailing: Boolean
  ): AwareTimeStruct = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    overrideZone: typingsSlinky.timezonecomplete.timezoneMod.TimeZone,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = js.native
}

