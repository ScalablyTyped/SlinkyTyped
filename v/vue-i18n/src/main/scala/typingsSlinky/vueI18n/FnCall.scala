package typingsSlinky.vueI18n

import typingsSlinky.vueI18n.mod.VueI18n.Locale
import typingsSlinky.vueI18n.mod.VueI18n.Path
import typingsSlinky.vueI18n.mod.VueI18n.TranslateResult
import typingsSlinky.vueI18n.mod.VueI18n.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(key: Path): TranslateResult = js.native
  def apply(key: Path, locale: Locale): TranslateResult = js.native
  def apply(key: Path, locale: Locale, values: Values): TranslateResult = js.native
  def apply(key: Path, values: Values): TranslateResult = js.native
}

