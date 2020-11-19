package typingsSlinky.timezonecomplete.parseMod

import typingsSlinky.timezonecomplete.localeMod.PartialLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezonecomplete/dist/lib/parse", "parseable")
@js.native
object parseable extends js.Object {
  
  def apply(dateTimeString: String, formatString: String): Boolean = js.native
  def apply(
    dateTimeString: String,
    formatString: String,
    allowTrailing: js.UndefOr[scala.Nothing],
    locale: PartialLocale
  ): Boolean = js.native
  def apply(dateTimeString: String, formatString: String, allowTrailing: Boolean): Boolean = js.native
  def apply(dateTimeString: String, formatString: String, allowTrailing: Boolean, locale: PartialLocale): Boolean = js.native
}
