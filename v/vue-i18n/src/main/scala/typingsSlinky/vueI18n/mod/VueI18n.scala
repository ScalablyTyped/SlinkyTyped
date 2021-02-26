package typingsSlinky.vueI18n.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vueI18n.mod.VueI18n.PluralizationRulesMap
import typingsSlinky.vueI18n.vueI18nBooleans.`false`
import typingsSlinky.vueI18n.vueI18nStrings.currency
import typingsSlinky.vueI18n.vueI18nStrings.decimal
import typingsSlinky.vueI18n.vueI18nStrings.long
import typingsSlinky.vueI18n.vueI18nStrings.percent
import typingsSlinky.vueI18n.vueI18nStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueI18n extends StObject {
  
  val availableLocales: js.Array[typingsSlinky.vueI18n.mod.VueI18n.Locale] = js.native
  
  def d(value: js.Date): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: js.Date, args: StringDictionary[String]): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: js.Date, key: js.UndefOr[scala.Nothing], locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: js.Date, key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(
    value: js.Date,
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
  ): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, args: StringDictionary[String]): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: js.UndefOr[scala.Nothing], locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(value: Double, key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  def d(
    value: Double,
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
  ): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatResult = js.native
  
  val dateTimeFormats: typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormats = js.native
  
  var fallbackLocale: typingsSlinky.vueI18n.mod.VueI18n.FallbackLocale = js.native
  
  var formatFallbackMessages: Boolean = js.native
  
  var formatter: typingsSlinky.vueI18n.mod.VueI18n.Formatter = js.native
  
  /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  def getChoiceIndex(choice: Double, choicesLength: Double): Double = js.native
  
  def getDateTimeFormat(locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormat = js.native
  
  def getLocaleMessage(locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject = js.native
  
  def getNumberFormat(locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.NumberFormat = js.native
  
  var locale: typingsSlinky.vueI18n.mod.VueI18n.Locale = js.native
  
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
  
  val messages: typingsSlinky.vueI18n.mod.VueI18n.LocaleMessages = js.native
  
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
  @JSName("missing")
  var missing_Original: typingsSlinky.vueI18n.mod.VueI18n.MissingHandler = js.native
  
  def n(value: Double): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, args: StringDictionary[String]): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: js.UndefOr[scala.Nothing], locale: typingsSlinky.vueI18n.mod.VueI18n.Locale): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(value: Double, key: typingsSlinky.vueI18n.mod.VueI18n.Path): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  def n(
    value: Double,
    key: typingsSlinky.vueI18n.mod.VueI18n.Path,
    locale: typingsSlinky.vueI18n.mod.VueI18n.Locale
  ): typingsSlinky.vueI18n.mod.VueI18n.NumberFormatResult = js.native
  
  val numberFormats: typingsSlinky.vueI18n.mod.VueI18n.NumberFormats = js.native
  
  var pluralizationRules: PluralizationRulesMap = js.native
  
  def postTranslation(str: String): String = js.native
  def postTranslation(str: String, key: String): String = js.native
  @JSName("postTranslation")
  var postTranslation_Original: typingsSlinky.vueI18n.mod.VueI18n.PostTranslationHandler = js.native
  
  var preserveDirectiveContent: Boolean = js.native
  
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
  
  var silentFallbackWarn: Boolean | js.RegExp = js.native
  
  var silentTranslationWarn: Boolean | js.RegExp = js.native
  
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
  
  var warnHtmlInMessage: typingsSlinky.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel = js.native
}
object VueI18n {
  
  type Choice = Double
  
  type ComponentInstanceCreatedListener = js.Function2[/* newVm */ VueI18n with IVueI18n, /* rootVm */ VueI18n with IVueI18n, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vueI18n.vueI18nStrings.symbol
    - typingsSlinky.vueI18n.vueI18nStrings.code
    - typingsSlinky.vueI18n.vueI18nStrings.name
  */
  trait CurrencyDisplay extends StObject
  object CurrencyDisplay {
    
    @scala.inline
    def code: typingsSlinky.vueI18n.vueI18nStrings.code = "code".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.code]
    
    @scala.inline
    def name: typingsSlinky.vueI18n.vueI18nStrings.name = "name".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.name]
    
    @scala.inline
    def symbol: typingsSlinky.vueI18n.vueI18nStrings.symbol = "symbol".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.symbol]
  }
  
  @js.native
  trait CurrencyNumberFormatOptions
    extends typingsSlinky.std.Intl.NumberFormatOptions
       with _NumberFormatOptions {
    
    // Obligatory if style is 'currency'
    @JSName("currencyDisplay")
    var currencyDisplay_CurrencyNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.native
    
    @JSName("currency")
    var currency_CurrencyNumberFormatOptions: String = js.native
    
    var formatMatcher: js.UndefOr[FormatMatcher] = js.native
    
    @JSName("localeMatcher")
    var localeMatcher_CurrencyNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.native
    
    @JSName("style")
    var style_CurrencyNumberFormatOptions: currency = js.native
  }
  object CurrencyNumberFormatOptions {
    
    @scala.inline
    def apply(currency: String, style: currency): CurrencyNumberFormatOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrencyNumberFormatOptions]
    }
    
    @scala.inline
    implicit class CurrencyNumberFormatOptionsMutableBuilder[Self <: CurrencyNumberFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplay(value: CurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      @scala.inline
      def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setStyle(value: currency): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vueI18n.vueI18nStrings.numeric
    - typingsSlinky.vueI18n.vueI18nStrings.`2-digit`
  */
  trait DateTimeDigital extends StObject
  object DateTimeDigital {
    
    @scala.inline
    def `2-digit`: typingsSlinky.vueI18n.vueI18nStrings.`2-digit` = "2-digit".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.`2-digit`]
    
    @scala.inline
    def numeric: typingsSlinky.vueI18n.vueI18nStrings.numeric = "numeric".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.numeric]
  }
  
  type DateTimeFormat = StringDictionary[typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormatOptions]
  
  type DateTimeFormatOptions = typingsSlinky.std.Intl.DateTimeFormatOptions | SpecificDateTimeFormatOptions
  
  type DateTimeFormatResult = String
  
  type DateTimeFormats = StringDictionary[typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormat]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vueI18n.vueI18nStrings.long
    - typingsSlinky.vueI18n.vueI18nStrings.short
    - typingsSlinky.vueI18n.vueI18nStrings.narrow
  */
  trait DateTimeHumanReadable extends StObject
  object DateTimeHumanReadable {
    
    @scala.inline
    def long: typingsSlinky.vueI18n.vueI18nStrings.long = "long".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.long]
    
    @scala.inline
    def narrow: typingsSlinky.vueI18n.vueI18nStrings.narrow = "narrow".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.narrow]
    
    @scala.inline
    def short: typingsSlinky.vueI18n.vueI18nStrings.short = "short".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.short]
  }
  
  type FallbackLocale = String | js.Array[String] | `false` | StringDictionary[js.Array[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vueI18n.vueI18nStrings.basic
    - typingsSlinky.vueI18n.vueI18nStrings.`best-fit`
  */
  trait FormatMatcher extends StObject
  object FormatMatcher {
    
    @scala.inline
    def basic: typingsSlinky.vueI18n.vueI18nStrings.basic = "basic".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.basic]
    
    @scala.inline
    def `best-fit`: typingsSlinky.vueI18n.vueI18nStrings.`best-fit` = "best-fit".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.`best-fit`]
  }
  
  @js.native
  trait FormattedNumberPart extends StObject {
    
    var `type`: FormattedNumberPartType = js.native
    
    var value: String = js.native
  }
  object FormattedNumberPart {
    
    @scala.inline
    def apply(`type`: FormattedNumberPartType, value: String): FormattedNumberPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedNumberPart]
    }
    
    @scala.inline
    implicit class FormattedNumberPartMutableBuilder[Self <: FormattedNumberPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: FormattedNumberPartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vueI18n.vueI18nStrings.currency
    - typingsSlinky.vueI18n.vueI18nStrings.decimal
    - typingsSlinky.vueI18n.vueI18nStrings.fraction
    - typingsSlinky.vueI18n.vueI18nStrings.group
    - typingsSlinky.vueI18n.vueI18nStrings.infinity
    - typingsSlinky.vueI18n.vueI18nStrings.integer
    - typingsSlinky.vueI18n.vueI18nStrings.literal
    - typingsSlinky.vueI18n.vueI18nStrings.minusSign
    - typingsSlinky.vueI18n.vueI18nStrings.nan
    - typingsSlinky.vueI18n.vueI18nStrings.plusSign
    - typingsSlinky.vueI18n.vueI18nStrings.percentSign
  */
  trait FormattedNumberPartType extends StObject
  object FormattedNumberPartType {
    
    @scala.inline
    def currency: typingsSlinky.vueI18n.vueI18nStrings.currency = "currency".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.currency]
    
    @scala.inline
    def decimal: typingsSlinky.vueI18n.vueI18nStrings.decimal = "decimal".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.decimal]
    
    @scala.inline
    def fraction: typingsSlinky.vueI18n.vueI18nStrings.fraction = "fraction".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.fraction]
    
    @scala.inline
    def group: typingsSlinky.vueI18n.vueI18nStrings.group = "group".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.group]
    
    @scala.inline
    def infinity: typingsSlinky.vueI18n.vueI18nStrings.infinity = "infinity".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.infinity]
    
    @scala.inline
    def integer: typingsSlinky.vueI18n.vueI18nStrings.integer = "integer".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.integer]
    
    @scala.inline
    def literal: typingsSlinky.vueI18n.vueI18nStrings.literal = "literal".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.literal]
    
    @scala.inline
    def minusSign: typingsSlinky.vueI18n.vueI18nStrings.minusSign = "minusSign".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.minusSign]
    
    @scala.inline
    def nan: typingsSlinky.vueI18n.vueI18nStrings.nan = "nan".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.nan]
    
    @scala.inline
    def percentSign: typingsSlinky.vueI18n.vueI18nStrings.percentSign = "percentSign".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.percentSign]
    
    @scala.inline
    def plusSign: typingsSlinky.vueI18n.vueI18nStrings.plusSign = "plusSign".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.plusSign]
  }
  
  @js.native
  trait Formatter extends StObject {
    
    def interpolate(message: String, values: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.Values], path: String): js.Array[_] | Null = js.native
  }
  
  // tslint:disable-next-line:interface-name
  @js.native
  trait I18nOptions extends StObject {
    
    var componentInstanceCreatedListener: js.UndefOr[ComponentInstanceCreatedListener] = js.native
    
    var dateTimeFormats: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormats] = js.native
    
    var escapeParameterHtml: js.UndefOr[Boolean] = js.native
    
    var fallbackLocale: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.FallbackLocale] = js.native
    
    var fallbackRoot: js.UndefOr[Boolean] = js.native
    
    var formatFallbackMessages: js.UndefOr[Boolean] = js.native
    
    var formatter: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.Formatter] = js.native
    
    var locale: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.Locale] = js.native
    
    var messages: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.LocaleMessages] = js.native
    
    var missing: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.MissingHandler] = js.native
    
    var modifiers: js.UndefOr[Modifiers] = js.native
    
    var numberFormats: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.NumberFormats] = js.native
    
    var pluralizationRules: js.UndefOr[PluralizationRulesMap] = js.native
    
    var postTranslation: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.PostTranslationHandler] = js.native
    
    var preserveDirectiveContent: js.UndefOr[Boolean] = js.native
    
    var sharedMessages: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.LocaleMessages] = js.native
    
    var silentFallbackWarn: js.UndefOr[Boolean | js.RegExp] = js.native
    
    var silentTranslationWarn: js.UndefOr[Boolean | js.RegExp] = js.native
    
    var sync: js.UndefOr[Boolean] = js.native
    
    var warnHtmlInMessage: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel] = js.native
  }
  object I18nOptions {
    
    @scala.inline
    def apply(): typingsSlinky.vueI18n.mod.VueI18n.I18nOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.vueI18n.mod.VueI18n.I18nOptions]
    }
    
    @scala.inline
    implicit class I18nOptionsMutableBuilder[Self <: typingsSlinky.vueI18n.mod.VueI18n.I18nOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentInstanceCreatedListener(value: (/* newVm */ VueI18n with IVueI18n, /* rootVm */ VueI18n with IVueI18n) => Unit): Self = StObject.set(x, "componentInstanceCreatedListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComponentInstanceCreatedListenerUndefined: Self = StObject.set(x, "componentInstanceCreatedListener", js.undefined)
      
      @scala.inline
      def setDateTimeFormats(value: typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormats): Self = StObject.set(x, "dateTimeFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeFormatsUndefined: Self = StObject.set(x, "dateTimeFormats", js.undefined)
      
      @scala.inline
      def setEscapeParameterHtml(value: Boolean): Self = StObject.set(x, "escapeParameterHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeParameterHtmlUndefined: Self = StObject.set(x, "escapeParameterHtml", js.undefined)
      
      @scala.inline
      def setFallbackLocale(value: typingsSlinky.vueI18n.mod.VueI18n.FallbackLocale): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackLocaleUndefined: Self = StObject.set(x, "fallbackLocale", js.undefined)
      
      @scala.inline
      def setFallbackLocaleVarargs(value: String*): Self = StObject.set(x, "fallbackLocale", js.Array(value :_*))
      
      @scala.inline
      def setFallbackRoot(value: Boolean): Self = StObject.set(x, "fallbackRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackRootUndefined: Self = StObject.set(x, "fallbackRoot", js.undefined)
      
      @scala.inline
      def setFormatFallbackMessages(value: Boolean): Self = StObject.set(x, "formatFallbackMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFallbackMessagesUndefined: Self = StObject.set(x, "formatFallbackMessages", js.undefined)
      
      @scala.inline
      def setFormatter(value: typingsSlinky.vueI18n.mod.VueI18n.Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setLocale(value: typingsSlinky.vueI18n.mod.VueI18n.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMessages(value: typingsSlinky.vueI18n.mod.VueI18n.LocaleMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMissing(
        value: (/* locale */ typingsSlinky.vueI18n.mod.VueI18n.Locale, /* key */ typingsSlinky.vueI18n.mod.VueI18n.Path, /* vm */ Vue | Null, /* values */ js.Any) => String | Unit
      ): Self = StObject.set(x, "missing", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      
      @scala.inline
      def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setNumberFormats(value: typingsSlinky.vueI18n.mod.VueI18n.NumberFormats): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormatsUndefined: Self = StObject.set(x, "numberFormats", js.undefined)
      
      @scala.inline
      def setPluralizationRules(value: PluralizationRulesMap): Self = StObject.set(x, "pluralizationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralizationRulesUndefined: Self = StObject.set(x, "pluralizationRules", js.undefined)
      
      @scala.inline
      def setPostTranslation(value: (/* str */ String, /* key */ js.UndefOr[String]) => String): Self = StObject.set(x, "postTranslation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostTranslationUndefined: Self = StObject.set(x, "postTranslation", js.undefined)
      
      @scala.inline
      def setPreserveDirectiveContent(value: Boolean): Self = StObject.set(x, "preserveDirectiveContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveDirectiveContentUndefined: Self = StObject.set(x, "preserveDirectiveContent", js.undefined)
      
      @scala.inline
      def setSharedMessages(value: typingsSlinky.vueI18n.mod.VueI18n.LocaleMessages): Self = StObject.set(x, "sharedMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedMessagesUndefined: Self = StObject.set(x, "sharedMessages", js.undefined)
      
      @scala.inline
      def setSilentFallbackWarn(value: Boolean | js.RegExp): Self = StObject.set(x, "silentFallbackWarn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentFallbackWarnRegExp(value: js.RegExp): Self = StObject.set(x, "silentFallbackWarn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentFallbackWarnUndefined: Self = StObject.set(x, "silentFallbackWarn", js.undefined)
      
      @scala.inline
      def setSilentTranslationWarn(value: Boolean | js.RegExp): Self = StObject.set(x, "silentTranslationWarn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentTranslationWarnRegExp(value: js.RegExp): Self = StObject.set(x, "silentTranslationWarn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentTranslationWarnUndefined: Self = StObject.set(x, "silentTranslationWarn", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      @scala.inline
      def setWarnHtmlInMessage(value: typingsSlinky.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel): Self = StObject.set(x, "warnHtmlInMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnHtmlInMessageUndefined: Self = StObject.set(x, "warnHtmlInMessage", js.undefined)
    }
  }
  
  @js.native
  trait IntlAvailability extends StObject {
    
    var dateTimeFormat: Boolean = js.native
    
    var numberFormat: Boolean = js.native
  }
  object IntlAvailability {
    
    @scala.inline
    def apply(dateTimeFormat: Boolean, numberFormat: Boolean): typingsSlinky.vueI18n.mod.VueI18n.IntlAvailability = {
      val __obj = js.Dynamic.literal(dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vueI18n.mod.VueI18n.IntlAvailability]
    }
    
    @scala.inline
    implicit class IntlAvailabilityMutableBuilder[Self <: typingsSlinky.vueI18n.mod.VueI18n.IntlAvailability] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateTimeFormat(value: Boolean): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    }
  }
  
  type Locale = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vueI18n.vueI18nStrings.lookup
    - typingsSlinky.vueI18n.vueI18nStrings.`best-fit`
  */
  trait LocaleMatcher extends StObject
  object LocaleMatcher {
    
    @scala.inline
    def `best-fit`: typingsSlinky.vueI18n.vueI18nStrings.`best-fit` = "best-fit".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.`best-fit`]
    
    @scala.inline
    def lookup: typingsSlinky.vueI18n.vueI18nStrings.lookup = "lookup".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.lookup]
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.vueI18n.mod.VueI18n.MessageFunction
    - typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject
    - typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageArray
  */
  type LocaleMessage = _LocaleMessage | String | typingsSlinky.vueI18n.mod.VueI18n.MessageFunction
  
  @js.native
  trait LocaleMessageArray
    extends /* index */ NumberDictionary[typingsSlinky.vueI18n.mod.VueI18n.LocaleMessage]
       with _LocaleMessage
  object LocaleMessageArray {
    
    @scala.inline
    def apply(): typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageArray]
    }
  }
  
  @js.native
  trait LocaleMessageObject
    extends /* key */ StringDictionary[typingsSlinky.vueI18n.mod.VueI18n.LocaleMessage]
       with _LocaleMessage
  object LocaleMessageObject {
    
    @scala.inline
    def apply(): typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject]
    }
  }
  
  type LocaleMessages = StringDictionary[typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject]
  
  @js.native
  trait MessageContext extends StObject {
    
    def list(index: Double): js.Any = js.native
    
    def named(key: String): js.Any = js.native
  }
  object MessageContext {
    
    @scala.inline
    def apply(list: Double => js.Any, named: String => js.Any): typingsSlinky.vueI18n.mod.VueI18n.MessageContext = {
      val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), named = js.Any.fromFunction1(named))
      __obj.asInstanceOf[typingsSlinky.vueI18n.mod.VueI18n.MessageContext]
    }
    
    @scala.inline
    implicit class MessageContextMutableBuilder[Self <: typingsSlinky.vueI18n.mod.VueI18n.MessageContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setList(value: Double => js.Any): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNamed(value: String => js.Any): Self = StObject.set(x, "named", js.Any.fromFunction1(value))
    }
  }
  
  type MessageFunction = js.Function1[/* ctx */ typingsSlinky.vueI18n.mod.VueI18n.MessageContext, String]
  
  type MissingHandler = js.Function4[
    /* locale */ typingsSlinky.vueI18n.mod.VueI18n.Locale, 
    /* key */ typingsSlinky.vueI18n.mod.VueI18n.Path, 
    /* vm */ Vue | Null, 
    /* values */ js.Any, 
    String | Unit
  ]
  
  type Modifiers = StringDictionary[js.Function1[/* str */ String, String]]
  
  type NumberFormat = StringDictionary[typingsSlinky.vueI18n.mod.VueI18n.NumberFormatOptions]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.std.Intl.NumberFormatOptions
    - typingsSlinky.vueI18n.mod.VueI18n.SpecificNumberFormatOptions
    - typingsSlinky.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions
  */
  type NumberFormatOptions = _NumberFormatOptions | typingsSlinky.std.Intl.NumberFormatOptions
  
  type NumberFormatResult = String
  
  type NumberFormatToPartsResult = NumberDictionary[FormattedNumberPart]
  
  type NumberFormats = StringDictionary[typingsSlinky.vueI18n.mod.VueI18n.NumberFormat]
  
  type Path = String
  
  type PluralizationRulesMap = /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  StringDictionary[js.Function2[/* choice */ Double, /* choicesLength */ Double, Double]]
  
  type PostTranslationHandler = js.Function2[/* str */ String, /* key */ js.UndefOr[String], String]
  
  @js.native
  trait SpecificDateTimeFormatOptions
    extends typingsSlinky.std.Intl.DateTimeFormatOptions {
    
    @JSName("day")
    var day_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
    
    @JSName("era")
    var era_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.native
    
    @JSName("formatMatcher")
    var formatMatcher_SpecificDateTimeFormatOptions: js.UndefOr[FormatMatcher] = js.native
    
    @JSName("hour")
    var hour_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
    
    @JSName("localeMatcher")
    var localeMatcher_SpecificDateTimeFormatOptions: js.UndefOr[LocaleMatcher] = js.native
    
    @JSName("minute")
    var minute_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
    
    @JSName("month")
    var month_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital | DateTimeHumanReadable] = js.native
    
    @JSName("second")
    var second_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
    
    @JSName("timeZoneName")
    var timeZoneName_SpecificDateTimeFormatOptions: js.UndefOr[long | short] = js.native
    
    @JSName("weekday")
    var weekday_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.native
    
    @JSName("year")
    var year_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.native
  }
  object SpecificDateTimeFormatOptions {
    
    @scala.inline
    def apply(): SpecificDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificDateTimeFormatOptions]
    }
    
    @scala.inline
    implicit class SpecificDateTimeFormatOptionsMutableBuilder[Self <: SpecificDateTimeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: DateTimeDigital): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setEra(value: DateTimeHumanReadable): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      @scala.inline
      def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      @scala.inline
      def setHour(value: DateTimeDigital): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setMinute(value: DateTimeDigital): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMonth(value: DateTimeDigital | DateTimeHumanReadable): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setSecond(value: DateTimeDigital): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setTimeZoneName(value: long | short): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      @scala.inline
      def setWeekday(value: DateTimeHumanReadable): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      @scala.inline
      def setYear(value: DateTimeDigital): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  @js.native
  trait SpecificNumberFormatOptions
    extends typingsSlinky.std.Intl.NumberFormatOptions
       with _NumberFormatOptions {
    
    @JSName("currencyDisplay")
    var currencyDisplay_SpecificNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.native
    
    var formatMatcher: js.UndefOr[FormatMatcher] = js.native
    
    @JSName("localeMatcher")
    var localeMatcher_SpecificNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.native
    
    @JSName("style")
    var style_SpecificNumberFormatOptions: js.UndefOr[decimal | percent] = js.native
  }
  object SpecificNumberFormatOptions {
    
    @scala.inline
    def apply(): SpecificNumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificNumberFormatOptions]
    }
    
    @scala.inline
    implicit class SpecificNumberFormatOptionsMutableBuilder[Self <: SpecificNumberFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrencyDisplay(value: CurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      @scala.inline
      def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setStyle(value: decimal | percent): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type TranslateResult = String | typingsSlinky.vueI18n.mod.VueI18n.LocaleMessages
  
  type Values = js.Array[js.Any] | StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vueI18n.vueI18nStrings.off
    - typingsSlinky.vueI18n.vueI18nStrings.warn
    - typingsSlinky.vueI18n.vueI18nStrings.error
  */
  trait WarnHtmlInMessageLevel extends StObject
  object WarnHtmlInMessageLevel {
    
    @scala.inline
    def error: typingsSlinky.vueI18n.vueI18nStrings.error = "error".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.error]
    
    @scala.inline
    def off: typingsSlinky.vueI18n.vueI18nStrings.off = "off".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.off]
    
    @scala.inline
    def warn: typingsSlinky.vueI18n.vueI18nStrings.warn = "warn".asInstanceOf[typingsSlinky.vueI18n.vueI18nStrings.warn]
  }
  
  trait _LocaleMessage extends StObject
  object _LocaleMessage {
    
    @scala.inline
    def LocaleMessageArray(): typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageArray]
    }
    
    @scala.inline
    def LocaleMessageObject(): typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.vueI18n.mod.VueI18n.LocaleMessageObject]
    }
  }
  
  trait _NumberFormatOptions extends StObject
  object _NumberFormatOptions {
    
    @scala.inline
    def CurrencyNumberFormatOptions(currency: String, style: currency): typingsSlinky.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vueI18n.mod.VueI18n.CurrencyNumberFormatOptions]
    }
    
    @scala.inline
    def SpecificNumberFormatOptions(): typingsSlinky.vueI18n.mod.VueI18n.SpecificNumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.vueI18n.mod.VueI18n.SpecificNumberFormatOptions]
    }
  }
}
