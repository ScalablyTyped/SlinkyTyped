package typingsSlinky.stripe.mod.setupIntents

import typingsSlinky.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetupIntentUpdateOptions extends js.Object {
  /**
    * ID of the customer this SetupIntent is for if one exists.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    * This can be unset by updating the value to `null` and then saving.
    */
  var description: js.UndefOr[String | Null] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing
    * additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
    * to attach to this SetupIntent.
    */
  var payment_method: js.UndefOr[String] = js.native
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
    */
  var payment_method_types: js.UndefOr[js.Array[SetupIntentPaymentMethodType]] = js.native
}

object ISetupIntentUpdateOptions {
  @scala.inline
  def apply(): ISetupIntentUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetupIntentUpdateOptions]
  }
  @scala.inline
  implicit class ISetupIntentUpdateOptionsOps[Self <: ISetupIntentUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
        ret
    }
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
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withMetadata(value: IOptionsMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_method_types(value: js.Array[SetupIntentPaymentMethodType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_method_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_method_types")(js.undefined)
        ret
    }
  }
  
}

