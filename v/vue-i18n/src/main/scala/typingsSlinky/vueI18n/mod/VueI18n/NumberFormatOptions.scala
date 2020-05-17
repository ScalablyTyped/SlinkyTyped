package typingsSlinky.vueI18n.mod.VueI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Intl.NumberFormatOptions
  - typingsSlinky.vueI18n.mod.VueI18n.SpecificNumberFormatOptions
  - typingsSlinky.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions
*/
trait NumberFormatOptions extends js.Object

object NumberFormatOptions {
  @scala.inline
  implicit def apply(value: CurrencyNumberFormatOptions): NumberFormatOptions = value.asInstanceOf[NumberFormatOptions]
  @scala.inline
  implicit def apply(value: typingsSlinky.std.Intl.NumberFormatOptions): NumberFormatOptions = value.asInstanceOf[NumberFormatOptions]
  @scala.inline
  implicit def apply(value: SpecificNumberFormatOptions): NumberFormatOptions = value.asInstanceOf[NumberFormatOptions]
}

