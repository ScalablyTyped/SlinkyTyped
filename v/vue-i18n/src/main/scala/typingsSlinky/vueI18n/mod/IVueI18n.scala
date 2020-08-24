package typingsSlinky.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueI18n.mod.VueI18n.PluralizationRulesMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVueI18n extends js.Object {
  val dateTimeFormats: typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormats = js.native
  var fallbackLocale: typingsSlinky.vueI18n.mod.VueI18n.FallbackLocale = js.native
  var formatFallbackMessages: Boolean = js.native
  var formatter: typingsSlinky.vueI18n.mod.VueI18n.Formatter = js.native
  var locale: typingsSlinky.vueI18n.mod.VueI18n.Locale = js.native
  val messages: typingsSlinky.vueI18n.mod.VueI18n.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: typingsSlinky.vueI18n.mod.VueI18n.MissingHandler = js.native
  val numberFormats: typingsSlinky.vueI18n.mod.VueI18n.NumberFormats = js.native
  var pluralizationRules: PluralizationRulesMap = js.native
  @JSName("postTranslation")
  var postTranslation_Original: typingsSlinky.vueI18n.mod.VueI18n.PostTranslationHandler = js.native
  var preserveDirectiveContent: Boolean = js.native
  var silentFallbackWarn: Boolean | js.RegExp = js.native
  var silentTranslationWarn: Boolean | js.RegExp = js.native
  var warnHtmlInMessage: typingsSlinky.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel = js.native
  def d(value: Double): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, args: StringDictionary[String]): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: js.UndefOr[scala.Nothing], locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(
    value: Double,
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
  ): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: js.Date): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: js.Date, args: StringDictionary[String]): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: js.Date, key: js.UndefOr[scala.Nothing], locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: js.Date, key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(
    value: js.Date,
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
  ): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def getChoiceIndex(choice: Double, choicesLength: Double): Double = js.native
  def getDateTimeFormat(locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormat = js.native
  def getLocaleMessage(locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject = js.native
  def getNumberFormat(locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.NumberFormat = js.native
  def mergeDateTimeFormat(
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
    format: typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormat
  ): Unit = js.native
  def mergeLocaleMessage(
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
    message: typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  def mergeNumberFormat(
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
    format: typingsSlinky.vueI18n.mod.VueI18n.NumberFormat
  ): Unit = js.native
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
  def n(value: Double): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, args: StringDictionary[String]): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: js.UndefOr[scala.Nothing], locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(
    value: Double,
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
  ): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def postTranslation(str: String): String = js.native
  def postTranslation(str: String, key: String): String = js.native
  def setDateTimeFormat(
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
    format: typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormat
  ): Unit = js.native
  def setLocaleMessage(
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
    message: typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  def setNumberFormat(
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
    format: typingsSlinky.vueI18n.mod.VueI18n.NumberFormat
  ): Unit = js.native
  def t(key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.TranslateResult = js.native
  def t(key: typingsSlinky.vueI18n.mod.VueI18n.Path, locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.TranslateResult = js.native
  def t(
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
    values: typingsSlinky.vueI18n.mod.VueI18n.Values
  ): typingsSlinky.vueI18n.mod.VueI18n.TranslateResult = js.native
  def t(key: typingsSlinky.vueI18n.mod.VueI18n.Path, values: typingsSlinky.vueI18n.mod.VueI18n.Values): typingsSlinky.vueI18n.mod.VueI18n.TranslateResult = js.native
  def tc(key: typingsSlinky.vueI18n.mod.VueI18n.Path): String = js.native
  def tc(
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    choice: js.UndefOr[scala.Nothing],
    values: typingsSlinky.vueI18n.mod.VueI18n.Values
  ): String = js.native
  def tc(key: typingsSlinky.vueI18n.mod.VueI18n.Path, choice: typingsSlinky.vueI18n.mod.VueI18n.Choice): String = js.native
  def tc(
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    choice: typingsSlinky.vueI18n.mod.VueI18n.Choice,
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
  ): String = js.native
  def tc(
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    choice: typingsSlinky.vueI18n.mod.VueI18n.Choice,
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale,
    values: typingsSlinky.vueI18n.mod.VueI18n.Values
  ): String = js.native
  def tc(
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    choice: typingsSlinky.vueI18n.mod.VueI18n.Choice,
    values: typingsSlinky.vueI18n.mod.VueI18n.Values
  ): String = js.native
  def te(key: typingsSlinky.vueI18n.mod.VueI18n.Path): Boolean = js.native
  def te(key: typingsSlinky.vueI18n.mod.VueI18n.Path, locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): Boolean = js.native
}

