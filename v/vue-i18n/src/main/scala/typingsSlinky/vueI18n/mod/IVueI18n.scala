package typingsSlinky.vueI18n.mod

import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueI18n.mod.VueI18n.PluralizationRulesMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVueI18n extends js.Object {
  val dateTimeFormats: typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormats = js.native
  var fallbackLocale: typingsSlinky.vueI18n.mod.VueI18n.Locale = js.native
  var formatFallbackMessages: Boolean = js.native
  var formatter: typingsSlinky.vueI18n.mod.VueI18n.Formatter = js.native
  var locale: typingsSlinky.vueI18n.mod.VueI18n.Locale = js.native
  val messages: typingsSlinky.vueI18n.mod.VueI18n.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: typingsSlinky.vueI18n.mod.VueI18n.MissingHandler = js.native
  val numberFormats: typingsSlinky.vueI18n.mod.VueI18n.NumberFormats = js.native
  var pluralizationRules: PluralizationRulesMap = js.native
  var preserveDirectiveContent: Boolean = js.native
  var silentFallbackWarn: Boolean | js.RegExp = js.native
  var silentTranslationWarn: Boolean | js.RegExp = js.native
  var warnHtmlInMessage: typingsSlinky.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel = js.native
  def missing(
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    vm: Null,
    values: js.Any
  ): String | Unit = js.native
  def missing(
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    vm: Vue,
    values: js.Any
  ): String | Unit = js.native
}

