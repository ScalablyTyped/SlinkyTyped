package typingsSlinky.vueI18n.mod.VueI18n

import typingsSlinky.vueI18n.vueI18nStrings.currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrencyNumberFormatOptions
  extends typingsSlinky.std.Intl.NumberFormatOptions
     with NumberFormatOptions {
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
  implicit class CurrencyNumberFormatOptionsOps[Self <: CurrencyNumberFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyDisplay(value: CurrencyDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatMatcher(value: FormatMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleMatcher(value: LocaleMatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(js.undefined)
        ret
    }
  }
  
}

