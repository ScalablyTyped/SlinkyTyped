package typingsSlinky.shopifyPrime.transactionMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.paymentDetailsMod.PaymentDetails
import typingsSlinky.shopifyPrime.transactionKindMod.TransactionKind
import typingsSlinky.shopifyPrime.transactionStatusMod.TransactionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends ShopifyObject {
  /**
    * The amount of money that the transaction was for. Note: Shopify may return this property as a string.
    */
  var amount: js.UndefOr[String | Double] = js.native
  /**
    * The authorization code associated with the transaction.
    */
  var authorization: js.UndefOr[String] = js.native
  /**
    * The date and time when the transaction was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The three letter code (ISO 4217) for the currency used for the payment.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the device.
    */
  var device_id: js.UndefOr[String] = js.native
  /**
    * A standardized error code, e.g. 'incorrect_number', independent of the payment provider. Value can be null. A full list of known values can be found at https://help.shopify.com/api/reference/transaction.
    */
  var error_code: js.UndefOr[String] = js.native
  /**
    * The name of the gateway the transaction was issued through.
    */
  var gateway: js.UndefOr[String] = js.native
  /**
    * The kind of transaction. Known values are 'authorization', 'capture', 'sale', 'void' and 'refund'.
    */
  var kind: js.UndefOr[TransactionKind] = js.native
  /**
    * A unique numeric identifier for the order.
    */
  var order_id: js.UndefOr[Double] = js.native
  /**
    * An object containing information about the credit card used for this transaction.
    */
  var payment_details: js.UndefOr[PaymentDetails] = js.native
  /**
    * Shopify does not currently offer documentation for this object.
    */
  var receipt: js.UndefOr[js.Any] = js.native
  /**
    * The origin of the transaction. This is set by Shopify and cannot be overridden. Example values include: 'web', 'pos', 'iphone', 'android'.
    */
  var source_name: js.UndefOr[String] = js.native
  /**
    * The status of the transaction. Known values are: pending, failure, success or error.
    */
  var status: js.UndefOr[TransactionStatus] = js.native
  /**
    * Whether the transaction is for testing purposes.
    */
  var test: js.UndefOr[Boolean] = js.native
  /**
    * The unique identifier for the user.
    */
  var user_id: js.UndefOr[Double] = js.native
}

object Transaction {
  @scala.inline
  def apply(): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device_id")(js.undefined)
        ret
    }
    @scala.inline
    def withError_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_code")(js.undefined)
        ret
    }
    @scala.inline
    def withGateway(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGateway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: TransactionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_details(value: PaymentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_details")(js.undefined)
        ret
    }
    @scala.inline
    def withReceipt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceipt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TransactionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(js.undefined)
        ret
    }
  }
  
}

