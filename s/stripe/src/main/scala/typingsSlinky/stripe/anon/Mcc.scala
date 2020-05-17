package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mcc extends js.Object {
  /**
    * The merchant category code for the account. MCCs are used to classify businesses
    * based on the goods or services they provide.
    */
  var mcc: js.UndefOr[String] = js.native
  /**
    * The customer-facing business name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Internal-only description of the product sold or service provided by the
    * business. It’s used by Stripe for risk and underwriting purposes.
    */
  var product_description: js.UndefOr[String] = js.native
  /**
    * A publicly available mailing address for sending support issues to.
    */
  var support_address: js.UndefOr[City] = js.native
  /**
    * A publicly available email address for sending support issues to.
    */
  var support_email: js.UndefOr[String] = js.native
  /**
    * A publicly available phone number to call with support issues.
    */
  var support_phone: js.UndefOr[String] = js.native
  /**
    * A publicly available website for handling support issues.
    */
  var support_url: js.UndefOr[String] = js.native
  /**
    * The business’s publicly available website.
    */
  var url: js.UndefOr[String] = js.native
}

object Mcc {
  @scala.inline
  def apply(): Mcc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mcc]
  }
  @scala.inline
  implicit class MccOps[Self <: Mcc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMcc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMcc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mcc")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_description")(js.undefined)
        ret
    }
    @scala.inline
    def withSupport_address(value: City): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupport_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support_address")(js.undefined)
        ret
    }
    @scala.inline
    def withSupport_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupport_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support_email")(js.undefined)
        ret
    }
    @scala.inline
    def withSupport_phone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support_phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupport_phone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support_phone")(js.undefined)
        ret
    }
    @scala.inline
    def withSupport_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupport_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("support_url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

