package typingsSlinky.stripe.mod.issuing.disputes

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.issuing.transactions.ITransaction
import typingsSlinky.stripe.stripeStrings.issuingDotdispute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * As a card issuer, you can dispute transactions that you do not recognize, suspect to be fraudulent, or have some other issue.
  */
@js.native
trait IIssuingDispute extends IResourceObject {
  /**
    * Disputed amount. Usually the amount of the disputed_transaction, but can differ (usually because of currency fluctuation or because only part of the order is disputed).
    */
  var amount: Double = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * The currency the disputed_transaction was made in.
    */
  var currency: String = js.native
  /**
    * The transaction being disputed.
    */
  var disputed_transaction: String | ITransaction = js.native
  /**
    * Evidence related to the dispute. This hash will contain exactly one non-null value, containing an evidence object that matches its reason
    */
  var evidence: IIssuingDisputeEvidence = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
    */
  var metadata: IMetadata = js.native
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_IIssuingDispute: issuingDotdispute = js.native
  /**
    * Reason for this dispute. One of other or fraudulent.
    */
  var reason: IssuingDisputeReason = js.native
  /**
    * Current status of dispute. One of lost, under_review, unsubmitted, or won.
    */
  var status: IssuingDisputeStatus = js.native
}

object IIssuingDispute {
  @scala.inline
  def apply(
    amount: Double,
    created: Double,
    currency: String,
    disputed_transaction: String | ITransaction,
    evidence: IIssuingDisputeEvidence,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: issuingDotdispute,
    reason: IssuingDisputeReason,
    status: IssuingDisputeStatus
  ): IIssuingDispute = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], disputed_transaction = disputed_transaction.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingDispute]
  }
  @scala.inline
  implicit class IIssuingDisputeOps[Self <: IIssuingDispute] (val x: Self) extends AnyVal {
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
    def withDisputed_transaction(value: String | ITransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disputed_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvidence(value: IIssuingDisputeEvidence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: issuingDotdispute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: IssuingDisputeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: IssuingDisputeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

