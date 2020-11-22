package typingsSlinky.std

import typingsSlinky.std.stdNumbers.`0`
import typingsSlinky.std.stdNumbers.`10`
import typingsSlinky.std.stdNumbers.`11`
import typingsSlinky.std.stdNumbers.`12`
import typingsSlinky.std.stdNumbers.`13`
import typingsSlinky.std.stdNumbers.`14`
import typingsSlinky.std.stdNumbers.`15`
import typingsSlinky.std.stdNumbers.`16`
import typingsSlinky.std.stdNumbers.`17`
import typingsSlinky.std.stdNumbers.`18`
import typingsSlinky.std.stdNumbers.`19`
import typingsSlinky.std.stdNumbers.`1`
import typingsSlinky.std.stdNumbers.`20`
import typingsSlinky.std.stdNumbers.`21`
import typingsSlinky.std.stdNumbers.`2`
import typingsSlinky.std.stdNumbers.`3`
import typingsSlinky.std.stdNumbers.`4`
import typingsSlinky.std.stdNumbers.`5`
import typingsSlinky.std.stdNumbers.`6`
import typingsSlinky.std.stdNumbers.`7`
import typingsSlinky.std.stdNumbers.`8`
import typingsSlinky.std.stdNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigIntToLocaleStringOptions extends js.Object {
  
  /**
    * used only when notation is "compact"
    */
  var compactDisplay: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The currency to use in currency formatting. Possible values are the ISO 4217 currency codes, such as "USD" for the US dollar, "EUR" for the euro, or "CNY" for the Chinese RMB — see the Current currency & funds code list. There is no default value; if the style is "currency", the currency property must be provided. It is only used when [[Style]] has the value "currency".
    */
  var currency: js.UndefOr[java.lang.String] = js.native
  
  /**
    * How to display the currency in currency formatting. It is only used when [[Style]] has the value "currency". The default is "symbol".
    *
    * "symbol" to use a localized currency symbol such as €,
    *
    * "code" to use the ISO currency code,
    *
    * "name" to use a localized currency name such as "dollar"
    */
  var currencyDisplay: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The locale matching algorithm to use.The default is "best fit". For information about this option, see the {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation Intl page}.
    */
  var localeMatcher: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The maximum number of fraction digits to use. Possible values are from 0 to 20; the default for plain number formatting is the larger of minimumFractionDigits and 3; the default for currency formatting is the larger of minimumFractionDigits and the number of minor unit digits provided by the {@link http://www.currency-iso.org/en/home/tables/table-a1.html ISO 4217 currency codes list} (2 if the list doesn't provide that information); the default for percent formatting is the larger of minimumFractionDigits and 0.
    */
  var maximumFractionDigits: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20`
  ] = js.native
  
  /**
    * The maximum number of significant digits to use. Possible values are from 1 to 21; the default is 21.
    */
  var maximumSignificantDigits: js.UndefOr[
    `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21`
  ] = js.native
  
  /**
    * The minimum number of fraction digits to use. Possible values are from 0 to 20; the default for plain number and percent formatting is 0; the default for currency formatting is the number of minor unit digits provided by the {@link http://www.currency-iso.org/en/home/tables/table-a1.html ISO 4217 currency codes list} (2 if the list doesn't provide that information).
    */
  var minimumFractionDigits: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20`
  ] = js.native
  
  /**
    * The minimum number of integer digits to use. Possible values are from 1 to 21; the default is 1.
    */
  var minimumIntegerDigits: js.UndefOr[
    `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21`
  ] = js.native
  
  /**
    * The minimum number of significant digits to use. Possible values are from 1 to 21; the default is 1.
    */
  var minimumSignificantDigits: js.UndefOr[
    `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21`
  ] = js.native
  
  /**
    * The formatting that should be displayed for the number, the defaults is "standard"
    *
    *     "standard" plain number formatting
    *
    *     "scientific" return the order-of-magnitude for formatted number.
    *
    *     "engineering" return the exponent of ten when divisible by three
    *
    *     "compact" string representing exponent, defaults is using the "short" form
    */
  var notation: js.UndefOr[java.lang.String] = js.native
  
  var numberingSystem: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The formatting style to use , the default is "decimal".
    */
  var style: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The unit to use in unit formatting, Possible values are core unit identifiers, defined in UTS #35, Part 2, Section 6. A subset of units from the full list was selected for use in ECMAScript. Pairs of simple units can be concatenated with "-per-" to make a compound unit. There is no default value; if the style is "unit", the unit property must be provided.
    */
  var unit: js.UndefOr[java.lang.String] = js.native
  
  /**
    * The unit formatting style to use in unit formatting, the defaults is "short".
    */
  var unitDisplay: js.UndefOr[java.lang.String] = js.native
  
  /**
    * Whether to use grouping separators, such as thousands separators or thousand/lakh/crore separators. The default is true.
    */
  var useGrouping: js.UndefOr[scala.Boolean] = js.native
}
object BigIntToLocaleStringOptions {
  
  @scala.inline
  def apply(): BigIntToLocaleStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigIntToLocaleStringOptions]
  }
  
  @scala.inline
  implicit class BigIntToLocaleStringOptionsOps[Self <: BigIntToLocaleStringOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompactDisplay(value: java.lang.String): Self = this.set("compactDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompactDisplay: Self = this.set("compactDisplay", js.undefined)
    
    @scala.inline
    def setCurrency(value: java.lang.String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setCurrencyDisplay(value: java.lang.String): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyDisplay: Self = this.set("currencyDisplay", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: java.lang.String): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
    
    @scala.inline
    def setMaximumFractionDigits(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20`
    ): Self = this.set("maximumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumFractionDigits: Self = this.set("maximumFractionDigits", js.undefined)
    
    @scala.inline
    def setMaximumSignificantDigits(
      value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21`
    ): Self = this.set("maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumSignificantDigits: Self = this.set("maximumSignificantDigits", js.undefined)
    
    @scala.inline
    def setMinimumFractionDigits(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20`
    ): Self = this.set("minimumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumFractionDigits: Self = this.set("minimumFractionDigits", js.undefined)
    
    @scala.inline
    def setMinimumIntegerDigits(
      value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21`
    ): Self = this.set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumIntegerDigits: Self = this.set("minimumIntegerDigits", js.undefined)
    
    @scala.inline
    def setMinimumSignificantDigits(
      value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21`
    ): Self = this.set("minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSignificantDigits: Self = this.set("minimumSignificantDigits", js.undefined)
    
    @scala.inline
    def setNotation(value: java.lang.String): Self = this.set("notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotation: Self = this.set("notation", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: java.lang.String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberingSystem: Self = this.set("numberingSystem", js.undefined)
    
    @scala.inline
    def setStyle(value: java.lang.String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUnit(value: java.lang.String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setUnitDisplay(value: java.lang.String): Self = this.set("unitDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitDisplay: Self = this.set("unitDisplay", js.undefined)
    
    @scala.inline
    def setUseGrouping(value: scala.Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseGrouping: Self = this.set("useGrouping", js.undefined)
  }
}
