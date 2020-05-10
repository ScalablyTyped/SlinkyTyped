package typingsSlinky.stripe.mod.topups

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.ISource
import typingsSlinky.stripe.stripeStrings.canceled
import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.reversed
import typingsSlinky.stripe.stripeStrings.succeeded
import typingsSlinky.stripe.stripeStrings.topup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITopup extends IResourceObject {
  /**
    * Amount transferred
    */
  var amount: Double = js.native
  /**
    * ID of the balance transaction that describes the impact of this top-up on your account balance.
    * May not be specified depending on status of top-up.
    */
  var balance_transaction: String | Null = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String = js.native
  /**
    * Date the funds are expected to arrive in your Stripe account for payouts. This factors in delays
    * like weekends or bank holidays. May not be specified depending on status of top-up.
    */
  var expected_availability_date: Double = js.native
  /**
    * Error code explaining reason for top-up failure if available
    */
  var failure_code: String | Null = js.native
  /**
    * Message to user further explaining reason for top-up failure if available.
    */
  var failure_message: String | Null = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists
    * in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing
    * additional information about the object in a structured format.
    */
  var metaData: IMetadata = js.native
  /**
    * Value is "topup"
    */
  @JSName("object")
  var object_ITopup: topup = js.native
  /**
    * For most Stripe users, the source of every top-up is a bank account. This hash is then the
    * source object describing that bank account.
    */
  var source: ISource = js.native
  /**
    * Extra information about a top-up. This will appear on your source’s bank statement.
    * It must contain at least one letter.
    */
  var statement_descriptor: String | Null = js.native
  /**
    * Status of topup
    */
  var status: canceled | failed | pending | reversed | succeeded = js.native
  /**
    * A string that identifies this top-up as part of a group.
    */
  var transfer_group: String | Null = js.native
}

object ITopup {
  @scala.inline
  def apply(
    amount: Double,
    created: Double,
    currency: String,
    description: String,
    expected_availability_date: Double,
    id: String,
    livemode: Boolean,
    metaData: IMetadata,
    `object`: topup,
    source: ISource,
    status: canceled | failed | pending | reversed | succeeded
  ): ITopup = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expected_availability_date = expected_availability_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopup]
  }
  @scala.inline
  implicit class ITopupOps[Self <: ITopup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpected_availability_date(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected_availability_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaData(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: topup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: ISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: canceled | failed | pending | reversed | succeeded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance_transaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance_transactionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_transaction")(null)
        ret
    }
    @scala.inline
    def withFailure_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure_codeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_code")(null)
        ret
    }
    @scala.inline
    def withFailure_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure_messageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_message")(null)
        ret
    }
    @scala.inline
    def withStatement_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatement_descriptorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(null)
        ret
    }
    @scala.inline
    def withTransfer_group(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransfer_groupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer_group")(null)
        ret
    }
  }
  
}

