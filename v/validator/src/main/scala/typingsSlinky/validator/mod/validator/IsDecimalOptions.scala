package typingsSlinky.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsDecimalOptions extends js.Object {
  /**
    * `decimal_digits` is given as a range like `'1,3'`,
    * a specific value like `'3'` or min like `'1,'`
    *
    * @default '1,'
    */
  var decimal_digits: js.UndefOr[String] = js.native
  /**
    * @default false
    */
  var force_decimal: js.UndefOr[Boolean] = js.native
  /**
    * DecimalLocale
    *
    * @default 'en-US'
    */
  var locale: js.UndefOr[DecimalLocale] = js.native
}

object IsDecimalOptions {
  @scala.inline
  def apply(): IsDecimalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDecimalOptions]
  }
  @scala.inline
  implicit class IsDecimalOptionsOps[Self <: IsDecimalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimal_digits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal_digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimal_digits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal_digits")(js.undefined)
        ret
    }
    @scala.inline
    def withForce_decimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce_decimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force_decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: DecimalLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
  }
  
}

