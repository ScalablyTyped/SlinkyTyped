package typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Formats and parses currencies. */
@js.native
trait CurrencyFormatter extends js.Object {
  /** Gets the identifier for the currency to be used for formatting and parsing currency values. */
  var currency: String = js.native
  /** Gets or sets the minimum number of digits to display for the fraction part of the currency value. */
  var fractionDigits: Double = js.native
  /** Gets the region that is used when formatting and parsing currency values. */
  var geographicRegion: String = js.native
  /** Gets or sets the minimum number of digits to display for the integer part of the currency value. */
  var integerDigits: Double = js.native
  /** Gets or sets whether the decimal point of the currency value should always be displayed. */
  var isDecimalPointAlwaysDisplayed: Boolean = js.native
  /** Gets or sets whether the integer part of the currency value should be grouped. */
  var isGrouped: Boolean = js.native
  /** Gets or sets whether -0 is formatted using the conventions for negative numbers or for positive numbers. (In the Latin numeral system, the choice is "-0" or "0".) */
  var isZeroSigned: Boolean = js.native
  /** Gets the priority list of language identifiers that is used when formatting and parsing currency values. */
  var languages: IVectorView[String] = js.native
  /** Gets or sets whether the currency is formatted with the currency symbol or currency code. */
  var mode: CurrencyFormatterMode = js.native
  /** Gets or sets the current rounding strategy to be used when formatting currency amounts. */
  var numberRounder: INumberRounder = js.native
  /** Gets or sets the numbering system that is used to format and parse currency values. */
  var numeralSystem: String = js.native
  /** Gets the geographic region that was most recently used to format or parse currency values. */
  var resolvedGeographicRegion: String = js.native
  /** Gets the language that was most recently used to format or parse currency values. */
  var resolvedLanguage: String = js.native
  /** Gets or sets the current padding to significant digits when a currency amount is formatted. */
  var significantDigits: Double = js.native
  /**
    * Prepares the CurrencyFormatter object to format currency values with a specified rounding algorithm.
    * @param roundingAlgorithm The desired rounding algorithm for the currency. This must be one of the members of RoundingAlgorithm , excluding None.
    */
  def applyRoundingForCurrency(roundingAlgorithm: RoundingAlgorithm): Unit = js.native
  /**
    * Returns a string representation of a UInt64 currency value.
    * @param value The UInt64 currency value to be formatted.
    * @return A string that represents the value.
    */
  def format(value: Double): String = js.native
  /**
    * Returns a string representation of a Double currency value.
    * @param value The Double currency value to be formatted.
    * @return A string that represents the value.
    */
  def formatDouble(value: Double): String = js.native
  /**
    * Returns a string representation of an Int64 currency value.
    * @param value The Int64 currency value to be formatted.
    * @return A string that represents the value.
    */
  def formatInt(value: Double): String = js.native
  /**
    * Returns a string representation of a UInt64 currency value.
    * @param value The UInt64 currency value to be formatted.
    * @return The UInt64 currency value to be formatted.
    */
  def formatUInt(value: Double): String = js.native
  /**
    * Attempts to parse a string representation of a Double currency value.
    * @param text The text to be parsed.
    * @return If successful, a Double that corresponds to the string representation, and otherwise null.
    */
  def parseDouble(text: String): Double = js.native
  /**
    * Attempts to parse a string representation of an integer currency value.
    * @param text The text to be parsed.
    * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
    */
  def parseInt(text: String): Double = js.native
  /**
    * Attempts to parse a string representation of an unsigned integer currency value.
    * @param text The text to be parsed.
    * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
    */
  def parseUInt(text: String): Double = js.native
}

object CurrencyFormatter {
  @scala.inline
  def apply(
    applyRoundingForCurrency: RoundingAlgorithm => Unit,
    currency: String,
    format: Double => String,
    formatDouble: Double => String,
    formatInt: Double => String,
    formatUInt: Double => String,
    fractionDigits: Double,
    geographicRegion: String,
    integerDigits: Double,
    isDecimalPointAlwaysDisplayed: Boolean,
    isGrouped: Boolean,
    isZeroSigned: Boolean,
    languages: IVectorView[String],
    mode: CurrencyFormatterMode,
    numberRounder: INumberRounder,
    numeralSystem: String,
    parseDouble: String => Double,
    parseInt: String => Double,
    parseUInt: String => Double,
    resolvedGeographicRegion: String,
    resolvedLanguage: String,
    significantDigits: Double
  ): CurrencyFormatter = {
    val __obj = js.Dynamic.literal(applyRoundingForCurrency = js.Any.fromFunction1(applyRoundingForCurrency), currency = currency.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), formatDouble = js.Any.fromFunction1(formatDouble), formatInt = js.Any.fromFunction1(formatInt), formatUInt = js.Any.fromFunction1(formatUInt), fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], isZeroSigned = isZeroSigned.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], numberRounder = numberRounder.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], parseDouble = js.Any.fromFunction1(parseDouble), parseInt = js.Any.fromFunction1(parseInt), parseUInt = js.Any.fromFunction1(parseUInt), resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], significantDigits = significantDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyFormatter]
  }
  @scala.inline
  implicit class CurrencyFormatterOps[Self <: CurrencyFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyRoundingForCurrency(value: RoundingAlgorithm => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyRoundingForCurrency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatDouble(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDouble")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatInt(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatInt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatUInt(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatUInt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeographicRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geographicRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegerDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDecimalPointAlwaysDisplayed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDecimalPointAlwaysDisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGrouped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsZeroSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZeroSigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: CurrencyFormatterMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberRounder(value: INumberRounder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberRounder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumeralSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseDouble(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDouble")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseInt(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseInt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseUInt(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseUInt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolvedGeographicRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedGeographicRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolvedLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignificantDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("significantDigits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

