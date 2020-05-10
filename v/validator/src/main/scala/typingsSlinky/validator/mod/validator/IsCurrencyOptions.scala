package typingsSlinky.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsCurrencyOptions extends js.Object {
  /**
    * @default true
    */
  var allow_decimal: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var allow_negative_sign_placeholder: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var allow_negatives: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var allow_space_after_digits: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var allow_space_after_symbol: js.UndefOr[Boolean] = js.native
  /**
    * @default '.'
    */
  var decimal_separator: js.UndefOr[String] = js.native
  /**
    * The array `digits_after_decimal` is filled with the exact number of digits allowed not a range, for example a range `1` to `3` will be given as `[1, 2, 3]`.
    *
    * @default [2]
    */
  var digits_after_decimal: js.UndefOr[js.Array[Double]] = js.native
  /**
    * @default false
    */
  var negative_sign_after_digits: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var negative_sign_before_digits: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var parens_for_negatives: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var require_decimal: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var require_symbol: js.UndefOr[Boolean] = js.native
  /**
    * @default '$'
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * @default false
    */
  var symbol_after_digits: js.UndefOr[Boolean] = js.native
  /**
    * @default ','
    */
  var thousands_separator: js.UndefOr[String] = js.native
}

object IsCurrencyOptions {
  @scala.inline
  def apply(): IsCurrencyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCurrencyOptions]
  }
  @scala.inline
  implicit class IsCurrencyOptionsOps[Self <: IsCurrencyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_decimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_decimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_negative_sign_placeholder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_negative_sign_placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_negative_sign_placeholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_negative_sign_placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_negatives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_negatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_negatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_negatives")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_space_after_digits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_space_after_digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_space_after_digits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_space_after_digits")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_space_after_symbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_space_after_symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_space_after_symbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_space_after_symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimal_separator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimal_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal_separator")(js.undefined)
        ret
    }
    @scala.inline
    def withDigits_after_decimal(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits_after_decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigits_after_decimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits_after_decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withNegative_sign_after_digits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative_sign_after_digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegative_sign_after_digits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative_sign_after_digits")(js.undefined)
        ret
    }
    @scala.inline
    def withNegative_sign_before_digits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative_sign_before_digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegative_sign_before_digits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative_sign_before_digits")(js.undefined)
        ret
    }
    @scala.inline
    def withParens_for_negatives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parens_for_negatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParens_for_negatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parens_for_negatives")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_decimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_decimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_symbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_symbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol_after_digits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol_after_digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol_after_digits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol_after_digits")(js.undefined)
        ret
    }
    @scala.inline
    def withThousands_separator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousands_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousands_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousands_separator")(js.undefined)
        ret
    }
  }
  
}

