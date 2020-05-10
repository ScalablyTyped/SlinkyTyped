package typingsSlinky.vueI18n.mod.VueI18n

import typingsSlinky.vueI18n.vueI18nStrings.decimal
import typingsSlinky.vueI18n.vueI18nStrings.percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class SpecificNumberFormatOptionsOps[Self <: SpecificNumberFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withStyle(value: decimal | percent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

