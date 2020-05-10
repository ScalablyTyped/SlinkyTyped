package typingsSlinky.stripe.mod.issuing.disputes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIssuingDisputeCreateOptions extends IIssuingDisputeUpdateOptions {
  /**
    * Amount to dispute, defaults to full value, given in the currency the transaction was made in.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * The ID of the issuing transaction to create a dispute for.
    */
  var disputed_transaction: String = js.native
  /**
    * A hash containing all the evidence related to the dispute. This should have a single key, equal to the provided reason, mapping to an appropriate evidence object.
    */
  var evidence: js.UndefOr[IIssuingDisputeEvidence] = js.native
  /**
    * The reason for the dispute. One of other or fraudulent.
    */
  var reason: IssuingDisputeReason = js.native
}

object IIssuingDisputeCreateOptions {
  @scala.inline
  def apply(disputed_transaction: String, reason: IssuingDisputeReason): IIssuingDisputeCreateOptions = {
    val __obj = js.Dynamic.literal(disputed_transaction = disputed_transaction.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingDisputeCreateOptions]
  }
  @scala.inline
  implicit class IIssuingDisputeCreateOptionsOps[Self <: IIssuingDisputeCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisputed_transaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disputed_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: IssuingDisputeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount(value: Double): Self = {
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
    def withEvidence(value: IIssuingDisputeEvidence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evidence")(js.undefined)
        ret
    }
  }
  
}

