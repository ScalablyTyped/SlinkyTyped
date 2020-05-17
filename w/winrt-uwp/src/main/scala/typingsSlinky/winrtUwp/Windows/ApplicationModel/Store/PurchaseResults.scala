package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information detailing the results of an in-app product purchase transaction. */
@js.native
trait PurchaseResults extends js.Object {
  /** A unique ID used to identify a specific in-app product within a large catalog. */
  var offerId: String = js.native
  /** A full receipt that provides a transaction history for the purchase of an in-app product */
  var receiptXml: String = js.native
  /** The current state of the purchase transaction for an in-app product. */
  var status: ProductPurchaseStatus = js.native
  /** A unique transaction ID associated with the purchase of a consumable in-app product. */
  var transactionId: String = js.native
}

object PurchaseResults {
  @scala.inline
  def apply(offerId: String, receiptXml: String, status: ProductPurchaseStatus, transactionId: String): PurchaseResults = {
    val __obj = js.Dynamic.literal(offerId = offerId.asInstanceOf[js.Any], receiptXml = receiptXml.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseResults]
  }
  @scala.inline
  implicit class PurchaseResultsOps[Self <: PurchaseResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOfferId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiptXml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiptXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ProductPurchaseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

