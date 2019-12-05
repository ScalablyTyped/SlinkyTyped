package typingsSlinky.vueDashI18n.vueDashI18nMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Date
import typingsSlinky.vue.typesVueMod.Vue
import typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.PluralizationRulesMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("VueI18n")
@js.native
trait VueI18n_ extends js.Object {
  val availableLocales: js.Array[typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale] = js.native
  val dateTimeFormats: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormats = js.native
  var fallbackLocale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale = js.native
  var formatFallbackMessages: Boolean = js.native
  var formatter: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Formatter = js.native
  var locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale = js.native
  val messages: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessages = js.native
  @JSName("missing")
  var missing_Original: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.MissingHandler = js.native
  val numberFormats: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormats = js.native
  var pluralizationRules: PluralizationRulesMap = js.native
  var preserveDirectiveContent: Boolean = js.native
  var silentFallbackWarn: Boolean | js.RegExp = js.native
  var silentTranslationWarn: Boolean | js.RegExp = js.native
  var warnHtmlInMessage: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.WarnHtmlInMessageLevel = js.native
  def d(value: Double): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, args: StringDictionary[String]): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(
    value: Double,
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, args: StringDictionary[String]): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Date, key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  def d(
    value: Date,
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
  /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  def getChoiceIndex(choice: Double, choicesLength: Double): Double = js.native
  def getDateTimeFormat(locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormat = js.native
  def getLocaleMessage(locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessageObject = js.native
  def getNumberFormat(locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormat = js.native
  def mergeDateTimeFormat(
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    format: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormat
  ): Unit = js.native
  def mergeLocaleMessage(
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    message: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  def mergeNumberFormat(
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    format: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormat
  ): Unit = js.native
  def missing(
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    vm: Null,
    values: js.Any
  ): String | Unit = js.native
  def missing(
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    vm: Vue,
    values: js.Any
  ): String | Unit = js.native
  def n(value: Double): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, args: StringDictionary[String]): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
  def n(
    value: Double,
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
  def setDateTimeFormat(
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    format: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormat
  ): Unit = js.native
  def setLocaleMessage(
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    message: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessageObject
  ): Unit = js.native
  def setNumberFormat(
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    format: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormat
  ): Unit = js.native
  def t(key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
  def t(
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
  def t(
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    values: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Values
  ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
  def t(
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    values: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Values
  ): typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
  def tc(key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): String = js.native
  def tc(
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    choice: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Choice
  ): String = js.native
  def tc(
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    choice: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): String = js.native
  def tc(
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    choice: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
    values: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Values
  ): String = js.native
  def tc(
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    choice: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
    values: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Values
  ): String = js.native
  def te(key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path): Boolean = js.native
  def te(
    key: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Path,
    locale: typingsSlinky.vueDashI18n.vueDashI18nMod.VueI18n.Locale
  ): Boolean = js.native
}

