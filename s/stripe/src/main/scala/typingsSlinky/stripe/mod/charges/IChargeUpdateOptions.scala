package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.anon.Userreport
import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import typingsSlinky.stripe.mod.IShippingInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChargeUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * An arbitrary string which you can attach to a charge object. It is displayed when in the web interface alongside the charge.
    * Note that if you use Stripe to send automatic email receipts to your customers, your receipt emails will include the description
    * of the charge(s) that they are describing. This can be unset by updating the value to null and then saving.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A set of key/value pairs you can attach to a charge giving information about its riskiness.
    */
  var fraud_details: js.UndefOr[Userreport] = js.native
  /**
    * This is the email address that the receipt for this charge will be sent to.
    * If this field is updated, then a new email receipt will be sent to the updated address.
    */
  var receipt_email: js.UndefOr[String] = js.native
  /**
    * Shipping information for the charge. Helps prevent fraud on charges for
    * physical goods.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.native
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    *
    * Connect only.
    */
  var transfer_group: js.UndefOr[String] = js.native
}

object IChargeUpdateOptions {
  @scala.inline
  def apply(): IChargeUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChargeUpdateOptions]
  }
  @scala.inline
  implicit class IChargeUpdateOptionsOps[Self <: IChargeUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFraud_details(value: Userreport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraud_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFraud_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraud_details")(js.undefined)
        ret
    }
    @scala.inline
    def withReceipt_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceipt_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt_email")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping(value: IShippingInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(js.undefined)
        ret
    }
    @scala.inline
    def withTransfer_group(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransfer_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_group")(js.undefined)
        ret
    }
  }
  
}

