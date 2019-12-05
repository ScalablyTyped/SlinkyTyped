package typingsSlinky.stripe.stripeMod.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.`*`
  - typings.stripe.stripeStrings.accountDOTupdated
  - typings.stripe.stripeStrings.accountDOTapplicationDOTauthorized
  - typings.stripe.stripeStrings.accountDOTapplicationDOTdeauthorized
  - typings.stripe.stripeStrings.accountDOTexternal_accountDOTcreated
  - typings.stripe.stripeStrings.accountDOTexternal_accountDOTdeleted
  - typings.stripe.stripeStrings.accountDOTexternal_accountDOTupdated
  - typings.stripe.stripeStrings.application_feeDOTcreated
  - typings.stripe.stripeStrings.application_feeDOTrefunded
  - typings.stripe.stripeStrings.application_feeDOTrefundDOTupdated
  - typings.stripe.stripeStrings.balanceDOTavailable
  - typings.stripe.stripeStrings.capabilityDOTupdated
  - typings.stripe.stripeStrings.chargeDOTcaptured
  - typings.stripe.stripeStrings.chargeDOTexpired
  - typings.stripe.stripeStrings.chargeDOTfailed
  - typings.stripe.stripeStrings.chargeDOTpending
  - typings.stripe.stripeStrings.chargeDOTrefunded
  - typings.stripe.stripeStrings.chargeDOTsucceeded
  - typings.stripe.stripeStrings.chargeDOTupdated
  - typings.stripe.stripeStrings.chargeDOTdisputeDOTclosed
  - typings.stripe.stripeStrings.chargeDOTdisputeDOTcreated
  - typings.stripe.stripeStrings.chargeDOTdisputeDOTfunds_reinstated
  - typings.stripe.stripeStrings.chargeDOTdisputeDOTfunds_withdrawn
  - typings.stripe.stripeStrings.chargeDOTdisputeDOTupdated
  - typings.stripe.stripeStrings.chargeDOTrefundDOTupdated
  - typings.stripe.stripeStrings.checkoutDOTsessionDOTcompleted
  - typings.stripe.stripeStrings.couponDOTcreated
  - typings.stripe.stripeStrings.couponDOTdeleted
  - typings.stripe.stripeStrings.couponDOTupdated
  - typings.stripe.stripeStrings.credit_noteDOTcreated
  - typings.stripe.stripeStrings.credit_noteDOTupdated
  - typings.stripe.stripeStrings.credit_noteDOTvoided
  - typings.stripe.stripeStrings.customerDOTcreated
  - typings.stripe.stripeStrings.customerDOTdeleted
  - typings.stripe.stripeStrings.customerDOTupdated
  - typings.stripe.stripeStrings.customerDOTdiscountDOTcreated
  - typings.stripe.stripeStrings.customerDOTdiscountDOTdeleted
  - typings.stripe.stripeStrings.customerDOTdiscountDOTupdated
  - typings.stripe.stripeStrings.customerDOTsourceDOTcreated
  - typings.stripe.stripeStrings.customerDOTsourceDOTdeleted
  - typings.stripe.stripeStrings.customerDOTsourceDOTexpiring
  - typings.stripe.stripeStrings.customerDOTsourceDOTupdated
  - typings.stripe.stripeStrings.customerDOTsubscriptionDOTcreated
  - typings.stripe.stripeStrings.customerDOTsubscriptionDOTdeleted
  - typings.stripe.stripeStrings.customerDOTsubscriptionDOTtrial_will_end
  - typings.stripe.stripeStrings.customerDOTsubscriptionDOTupdated
  - typings.stripe.stripeStrings.customerDOTtax_idDOTcreated
  - typings.stripe.stripeStrings.customerDOTtax_idDOTdeleted
  - typings.stripe.stripeStrings.customerDOTtax_idDOTupdated
  - typings.stripe.stripeStrings.fileDOTcreated
  - typings.stripe.stripeStrings.invoiceDOTcreated
  - typings.stripe.stripeStrings.invoiceDOTdeleted
  - typings.stripe.stripeStrings.invoiceDOTfinalized
  - typings.stripe.stripeStrings.invoiceDOTmarked_uncollectible
  - typings.stripe.stripeStrings.invoiceDOTpayment_action_required
  - typings.stripe.stripeStrings.invoiceDOTpayment_failed
  - typings.stripe.stripeStrings.invoiceDOTpayment_succeeded
  - typings.stripe.stripeStrings.invoiceDOTsent
  - typings.stripe.stripeStrings.invoiceDOTupcoming
  - typings.stripe.stripeStrings.invoiceDOTupdated
  - typings.stripe.stripeStrings.invoiceDOTvoided
  - typings.stripe.stripeStrings.invoiceitemDOTcreated
  - typings.stripe.stripeStrings.invoiceitemDOTdeleted
  - typings.stripe.stripeStrings.invoiceitemDOTupdated
  - typings.stripe.stripeStrings.issuing_authorizationDOTcreated
  - typings.stripe.stripeStrings.issuing_authorizationDOTrequest
  - typings.stripe.stripeStrings.issuing_authorizationDOTupdated
  - typings.stripe.stripeStrings.issuing_cardDOTcreated
  - typings.stripe.stripeStrings.issuing_cardDOTupdated
  - typings.stripe.stripeStrings.issuing_cardholderDOTcreated
  - typings.stripe.stripeStrings.issuing_cardholderDOTupdated
  - typings.stripe.stripeStrings.issuing_disputeDOTcreated
  - typings.stripe.stripeStrings.issuing_disputeDOTupdated
  - typings.stripe.stripeStrings.issuing_settlementDOTcreated
  - typings.stripe.stripeStrings.issuing_settlementDOTupdated
  - typings.stripe.stripeStrings.issuing_transactionDOTcreated
  - typings.stripe.stripeStrings.issuing_transactionDOTupdated
  - typings.stripe.stripeStrings.mandateDOTupdated
  - typings.stripe.stripeStrings.orderDOTcreated
  - typings.stripe.stripeStrings.orderDOTpayment_failed
  - typings.stripe.stripeStrings.orderDOTpayment_succeeded
  - typings.stripe.stripeStrings.orderDOTupdated
  - typings.stripe.stripeStrings.order_returnDOTcreated
  - typings.stripe.stripeStrings.payment_intentDOTamount_capturable_updated
  - typings.stripe.stripeStrings.payment_intentDOTcanceled
  - typings.stripe.stripeStrings.payment_intentDOTcreated
  - typings.stripe.stripeStrings.payment_intentDOTpayment_failed
  - typings.stripe.stripeStrings.payment_intentDOTsucceeded
  - typings.stripe.stripeStrings.payment_methodDOTattached
  - typings.stripe.stripeStrings.payment_methodDOTcard_automatically_updated
  - typings.stripe.stripeStrings.payment_methodDOTdetached
  - typings.stripe.stripeStrings.payment_methodDOTupdated
  - typings.stripe.stripeStrings.payoutDOTcanceled
  - typings.stripe.stripeStrings.payoutDOTcreated
  - typings.stripe.stripeStrings.payoutDOTfailed
  - typings.stripe.stripeStrings.payoutDOTpaid
  - typings.stripe.stripeStrings.payoutDOTupdated
  - typings.stripe.stripeStrings.personDOTcreated
  - typings.stripe.stripeStrings.personDOTdeleted
  - typings.stripe.stripeStrings.personDOTupdated
  - typings.stripe.stripeStrings.planDOTcreated
  - typings.stripe.stripeStrings.planDOTdeleted
  - typings.stripe.stripeStrings.planDOTupdated
  - typings.stripe.stripeStrings.productDOTcreated
  - typings.stripe.stripeStrings.productDOTdeleted
  - typings.stripe.stripeStrings.productDOTupdated
  - typings.stripe.stripeStrings.radarDOTearly_fraud_warningDOTcreated
  - typings.stripe.stripeStrings.radarDOTearly_fraud_warningDOTupdated
  - typings.stripe.stripeStrings.recipientDOTcreated
  - typings.stripe.stripeStrings.recipientDOTdeleted
  - typings.stripe.stripeStrings.recipientDOTupdated
  - typings.stripe.stripeStrings.reportingDOTreport_runDOTfailed
  - typings.stripe.stripeStrings.reportingDOTreport_runDOTsucceeded
  - typings.stripe.stripeStrings.reportingDOTreport_typeDOTupdated
  - typings.stripe.stripeStrings.reviewDOTclosed
  - typings.stripe.stripeStrings.reviewDOTopened
  - typings.stripe.stripeStrings.setup_intentDOTcanceled
  - typings.stripe.stripeStrings.setup_intentDOTcreated
  - typings.stripe.stripeStrings.setup_intentDOTsetup_failed
  - typings.stripe.stripeStrings.setup_intentDOTsucceeded
  - typings.stripe.stripeStrings.sigmaDOTscheduled_query_runDOTcreated
  - typings.stripe.stripeStrings.skuDOTcreated
  - typings.stripe.stripeStrings.skuDOTdeleted
  - typings.stripe.stripeStrings.skuDOTupdated
  - typings.stripe.stripeStrings.sourceDOTcanceled
  - typings.stripe.stripeStrings.sourceDOTchargeable
  - typings.stripe.stripeStrings.sourceDOTfailed
  - typings.stripe.stripeStrings.sourceDOTmandate_notification
  - typings.stripe.stripeStrings.sourceDOTrefund_attributes_required
  - typings.stripe.stripeStrings.sourceDOTtransactionDOTcreated
  - typings.stripe.stripeStrings.sourceDOTtransactionDOTupdated
  - typings.stripe.stripeStrings.subscription_scheduleDOTaborted
  - typings.stripe.stripeStrings.subscription_scheduleDOTcanceled
  - typings.stripe.stripeStrings.subscription_scheduleDOTcompleted
  - typings.stripe.stripeStrings.subscription_scheduleDOTcreated
  - typings.stripe.stripeStrings.subscription_scheduleDOTexpiring
  - typings.stripe.stripeStrings.subscription_scheduleDOTreleased
  - typings.stripe.stripeStrings.subscription_scheduleDOTupdated
  - typings.stripe.stripeStrings.tax_rateDOTcreated
  - typings.stripe.stripeStrings.tax_rateDOTupdated
  - typings.stripe.stripeStrings.topupDOTcreated
  - typings.stripe.stripeStrings.topupDOTfailed
  - typings.stripe.stripeStrings.topupDOTreversed
  - typings.stripe.stripeStrings.topupDOTsucceeded
  - typings.stripe.stripeStrings.transferDOTcreated
  - typings.stripe.stripeStrings.transferDOTfailed
  - typings.stripe.stripeStrings.transferDOTpaid
  - typings.stripe.stripeStrings.transferDOTreversed
  - typings.stripe.stripeStrings.transferDOTupdated
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def `*`: typingsSlinky.stripe.stripeStrings.`*` = this.cast("*")
  @scala.inline
  def accountDOTapplicationDOTauthorized: typingsSlinky.stripe.stripeStrings.accountDOTapplicationDOTauthorized = this.cast("account.application.authorized")
  @scala.inline
  def accountDOTapplicationDOTdeauthorized: typingsSlinky.stripe.stripeStrings.accountDOTapplicationDOTdeauthorized = this.cast("account.application.deauthorized")
  @scala.inline
  def accountDOTexternal_accountDOTcreated: typingsSlinky.stripe.stripeStrings.accountDOTexternal_accountDOTcreated = this.cast("account.external_account.created")
  @scala.inline
  def accountDOTexternal_accountDOTdeleted: typingsSlinky.stripe.stripeStrings.accountDOTexternal_accountDOTdeleted = this.cast("account.external_account.deleted")
  @scala.inline
  def accountDOTexternal_accountDOTupdated: typingsSlinky.stripe.stripeStrings.accountDOTexternal_accountDOTupdated = this.cast("account.external_account.updated")
  @scala.inline
  def accountDOTupdated: typingsSlinky.stripe.stripeStrings.accountDOTupdated = this.cast("account.updated")
  @scala.inline
  def application_feeDOTcreated: typingsSlinky.stripe.stripeStrings.application_feeDOTcreated = this.cast("application_fee.created")
  @scala.inline
  def application_feeDOTrefundDOTupdated: typingsSlinky.stripe.stripeStrings.application_feeDOTrefundDOTupdated = this.cast("application_fee.refund.updated")
  @scala.inline
  def application_feeDOTrefunded: typingsSlinky.stripe.stripeStrings.application_feeDOTrefunded = this.cast("application_fee.refunded")
  @scala.inline
  def balanceDOTavailable: typingsSlinky.stripe.stripeStrings.balanceDOTavailable = this.cast("balance.available")
  @scala.inline
  def capabilityDOTupdated: typingsSlinky.stripe.stripeStrings.capabilityDOTupdated = this.cast("capability.updated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chargeDOTcaptured: typingsSlinky.stripe.stripeStrings.chargeDOTcaptured = this.cast("charge.captured")
  @scala.inline
  def chargeDOTdisputeDOTclosed: typingsSlinky.stripe.stripeStrings.chargeDOTdisputeDOTclosed = this.cast("charge.dispute.closed")
  @scala.inline
  def chargeDOTdisputeDOTcreated: typingsSlinky.stripe.stripeStrings.chargeDOTdisputeDOTcreated = this.cast("charge.dispute.created")
  @scala.inline
  def chargeDOTdisputeDOTfunds_reinstated: typingsSlinky.stripe.stripeStrings.chargeDOTdisputeDOTfunds_reinstated = this.cast("charge.dispute.funds_reinstated")
  @scala.inline
  def chargeDOTdisputeDOTfunds_withdrawn: typingsSlinky.stripe.stripeStrings.chargeDOTdisputeDOTfunds_withdrawn = this.cast("charge.dispute.funds_withdrawn")
  @scala.inline
  def chargeDOTdisputeDOTupdated: typingsSlinky.stripe.stripeStrings.chargeDOTdisputeDOTupdated = this.cast("charge.dispute.updated")
  @scala.inline
  def chargeDOTexpired: typingsSlinky.stripe.stripeStrings.chargeDOTexpired = this.cast("charge.expired")
  @scala.inline
  def chargeDOTfailed: typingsSlinky.stripe.stripeStrings.chargeDOTfailed = this.cast("charge.failed")
  @scala.inline
  def chargeDOTpending: typingsSlinky.stripe.stripeStrings.chargeDOTpending = this.cast("charge.pending")
  @scala.inline
  def chargeDOTrefundDOTupdated: typingsSlinky.stripe.stripeStrings.chargeDOTrefundDOTupdated = this.cast("charge.refund.updated")
  @scala.inline
  def chargeDOTrefunded: typingsSlinky.stripe.stripeStrings.chargeDOTrefunded = this.cast("charge.refunded")
  @scala.inline
  def chargeDOTsucceeded: typingsSlinky.stripe.stripeStrings.chargeDOTsucceeded = this.cast("charge.succeeded")
  @scala.inline
  def chargeDOTupdated: typingsSlinky.stripe.stripeStrings.chargeDOTupdated = this.cast("charge.updated")
  @scala.inline
  def checkoutDOTsessionDOTcompleted: typingsSlinky.stripe.stripeStrings.checkoutDOTsessionDOTcompleted = this.cast("checkout.session.completed")
  @scala.inline
  def couponDOTcreated: typingsSlinky.stripe.stripeStrings.couponDOTcreated = this.cast("coupon.created")
  @scala.inline
  def couponDOTdeleted: typingsSlinky.stripe.stripeStrings.couponDOTdeleted = this.cast("coupon.deleted")
  @scala.inline
  def couponDOTupdated: typingsSlinky.stripe.stripeStrings.couponDOTupdated = this.cast("coupon.updated")
  @scala.inline
  def credit_noteDOTcreated: typingsSlinky.stripe.stripeStrings.credit_noteDOTcreated = this.cast("credit_note.created")
  @scala.inline
  def credit_noteDOTupdated: typingsSlinky.stripe.stripeStrings.credit_noteDOTupdated = this.cast("credit_note.updated")
  @scala.inline
  def credit_noteDOTvoided: typingsSlinky.stripe.stripeStrings.credit_noteDOTvoided = this.cast("credit_note.voided")
  @scala.inline
  def customerDOTcreated: typingsSlinky.stripe.stripeStrings.customerDOTcreated = this.cast("customer.created")
  @scala.inline
  def customerDOTdeleted: typingsSlinky.stripe.stripeStrings.customerDOTdeleted = this.cast("customer.deleted")
  @scala.inline
  def customerDOTdiscountDOTcreated: typingsSlinky.stripe.stripeStrings.customerDOTdiscountDOTcreated = this.cast("customer.discount.created")
  @scala.inline
  def customerDOTdiscountDOTdeleted: typingsSlinky.stripe.stripeStrings.customerDOTdiscountDOTdeleted = this.cast("customer.discount.deleted")
  @scala.inline
  def customerDOTdiscountDOTupdated: typingsSlinky.stripe.stripeStrings.customerDOTdiscountDOTupdated = this.cast("customer.discount.updated")
  @scala.inline
  def customerDOTsourceDOTcreated: typingsSlinky.stripe.stripeStrings.customerDOTsourceDOTcreated = this.cast("customer.source.created")
  @scala.inline
  def customerDOTsourceDOTdeleted: typingsSlinky.stripe.stripeStrings.customerDOTsourceDOTdeleted = this.cast("customer.source.deleted")
  @scala.inline
  def customerDOTsourceDOTexpiring: typingsSlinky.stripe.stripeStrings.customerDOTsourceDOTexpiring = this.cast("customer.source.expiring")
  @scala.inline
  def customerDOTsourceDOTupdated: typingsSlinky.stripe.stripeStrings.customerDOTsourceDOTupdated = this.cast("customer.source.updated")
  @scala.inline
  def customerDOTsubscriptionDOTcreated: typingsSlinky.stripe.stripeStrings.customerDOTsubscriptionDOTcreated = this.cast("customer.subscription.created")
  @scala.inline
  def customerDOTsubscriptionDOTdeleted: typingsSlinky.stripe.stripeStrings.customerDOTsubscriptionDOTdeleted = this.cast("customer.subscription.deleted")
  @scala.inline
  def customerDOTsubscriptionDOTtrial_will_end: typingsSlinky.stripe.stripeStrings.customerDOTsubscriptionDOTtrial_will_end = this.cast("customer.subscription.trial_will_end")
  @scala.inline
  def customerDOTsubscriptionDOTupdated: typingsSlinky.stripe.stripeStrings.customerDOTsubscriptionDOTupdated = this.cast("customer.subscription.updated")
  @scala.inline
  def customerDOTtax_idDOTcreated: typingsSlinky.stripe.stripeStrings.customerDOTtax_idDOTcreated = this.cast("customer.tax_id.created")
  @scala.inline
  def customerDOTtax_idDOTdeleted: typingsSlinky.stripe.stripeStrings.customerDOTtax_idDOTdeleted = this.cast("customer.tax_id.deleted")
  @scala.inline
  def customerDOTtax_idDOTupdated: typingsSlinky.stripe.stripeStrings.customerDOTtax_idDOTupdated = this.cast("customer.tax_id.updated")
  @scala.inline
  def customerDOTupdated: typingsSlinky.stripe.stripeStrings.customerDOTupdated = this.cast("customer.updated")
  @scala.inline
  def fileDOTcreated: typingsSlinky.stripe.stripeStrings.fileDOTcreated = this.cast("file.created")
  @scala.inline
  def invoiceDOTcreated: typingsSlinky.stripe.stripeStrings.invoiceDOTcreated = this.cast("invoice.created")
  @scala.inline
  def invoiceDOTdeleted: typingsSlinky.stripe.stripeStrings.invoiceDOTdeleted = this.cast("invoice.deleted")
  @scala.inline
  def invoiceDOTfinalized: typingsSlinky.stripe.stripeStrings.invoiceDOTfinalized = this.cast("invoice.finalized")
  @scala.inline
  def invoiceDOTmarked_uncollectible: typingsSlinky.stripe.stripeStrings.invoiceDOTmarked_uncollectible = this.cast("invoice.marked_uncollectible")
  @scala.inline
  def invoiceDOTpayment_action_required: typingsSlinky.stripe.stripeStrings.invoiceDOTpayment_action_required = this.cast("invoice.payment_action_required")
  @scala.inline
  def invoiceDOTpayment_failed: typingsSlinky.stripe.stripeStrings.invoiceDOTpayment_failed = this.cast("invoice.payment_failed")
  @scala.inline
  def invoiceDOTpayment_succeeded: typingsSlinky.stripe.stripeStrings.invoiceDOTpayment_succeeded = this.cast("invoice.payment_succeeded")
  @scala.inline
  def invoiceDOTsent: typingsSlinky.stripe.stripeStrings.invoiceDOTsent = this.cast("invoice.sent")
  @scala.inline
  def invoiceDOTupcoming: typingsSlinky.stripe.stripeStrings.invoiceDOTupcoming = this.cast("invoice.upcoming")
  @scala.inline
  def invoiceDOTupdated: typingsSlinky.stripe.stripeStrings.invoiceDOTupdated = this.cast("invoice.updated")
  @scala.inline
  def invoiceDOTvoided: typingsSlinky.stripe.stripeStrings.invoiceDOTvoided = this.cast("invoice.voided")
  @scala.inline
  def invoiceitemDOTcreated: typingsSlinky.stripe.stripeStrings.invoiceitemDOTcreated = this.cast("invoiceitem.created")
  @scala.inline
  def invoiceitemDOTdeleted: typingsSlinky.stripe.stripeStrings.invoiceitemDOTdeleted = this.cast("invoiceitem.deleted")
  @scala.inline
  def invoiceitemDOTupdated: typingsSlinky.stripe.stripeStrings.invoiceitemDOTupdated = this.cast("invoiceitem.updated")
  @scala.inline
  def issuing_authorizationDOTcreated: typingsSlinky.stripe.stripeStrings.issuing_authorizationDOTcreated = this.cast("issuing_authorization.created")
  @scala.inline
  def issuing_authorizationDOTrequest: typingsSlinky.stripe.stripeStrings.issuing_authorizationDOTrequest = this.cast("issuing_authorization.request")
  @scala.inline
  def issuing_authorizationDOTupdated: typingsSlinky.stripe.stripeStrings.issuing_authorizationDOTupdated = this.cast("issuing_authorization.updated")
  @scala.inline
  def issuing_cardDOTcreated: typingsSlinky.stripe.stripeStrings.issuing_cardDOTcreated = this.cast("issuing_card.created")
  @scala.inline
  def issuing_cardDOTupdated: typingsSlinky.stripe.stripeStrings.issuing_cardDOTupdated = this.cast("issuing_card.updated")
  @scala.inline
  def issuing_cardholderDOTcreated: typingsSlinky.stripe.stripeStrings.issuing_cardholderDOTcreated = this.cast("issuing_cardholder.created")
  @scala.inline
  def issuing_cardholderDOTupdated: typingsSlinky.stripe.stripeStrings.issuing_cardholderDOTupdated = this.cast("issuing_cardholder.updated")
  @scala.inline
  def issuing_disputeDOTcreated: typingsSlinky.stripe.stripeStrings.issuing_disputeDOTcreated = this.cast("issuing_dispute.created")
  @scala.inline
  def issuing_disputeDOTupdated: typingsSlinky.stripe.stripeStrings.issuing_disputeDOTupdated = this.cast("issuing_dispute.updated")
  @scala.inline
  def issuing_settlementDOTcreated: typingsSlinky.stripe.stripeStrings.issuing_settlementDOTcreated = this.cast("issuing_settlement.created")
  @scala.inline
  def issuing_settlementDOTupdated: typingsSlinky.stripe.stripeStrings.issuing_settlementDOTupdated = this.cast("issuing_settlement.updated")
  @scala.inline
  def issuing_transactionDOTcreated: typingsSlinky.stripe.stripeStrings.issuing_transactionDOTcreated = this.cast("issuing_transaction.created")
  @scala.inline
  def issuing_transactionDOTupdated: typingsSlinky.stripe.stripeStrings.issuing_transactionDOTupdated = this.cast("issuing_transaction.updated")
  @scala.inline
  def mandateDOTupdated: typingsSlinky.stripe.stripeStrings.mandateDOTupdated = this.cast("mandate.updated")
  @scala.inline
  def orderDOTcreated: typingsSlinky.stripe.stripeStrings.orderDOTcreated = this.cast("order.created")
  @scala.inline
  def orderDOTpayment_failed: typingsSlinky.stripe.stripeStrings.orderDOTpayment_failed = this.cast("order.payment_failed")
  @scala.inline
  def orderDOTpayment_succeeded: typingsSlinky.stripe.stripeStrings.orderDOTpayment_succeeded = this.cast("order.payment_succeeded")
  @scala.inline
  def orderDOTupdated: typingsSlinky.stripe.stripeStrings.orderDOTupdated = this.cast("order.updated")
  @scala.inline
  def order_returnDOTcreated: typingsSlinky.stripe.stripeStrings.order_returnDOTcreated = this.cast("order_return.created")
  @scala.inline
  def payment_intentDOTamount_capturable_updated: typingsSlinky.stripe.stripeStrings.payment_intentDOTamount_capturable_updated = this.cast("payment_intent.amount_capturable_updated")
  @scala.inline
  def payment_intentDOTcanceled: typingsSlinky.stripe.stripeStrings.payment_intentDOTcanceled = this.cast("payment_intent.canceled")
  @scala.inline
  def payment_intentDOTcreated: typingsSlinky.stripe.stripeStrings.payment_intentDOTcreated = this.cast("payment_intent.created")
  @scala.inline
  def payment_intentDOTpayment_failed: typingsSlinky.stripe.stripeStrings.payment_intentDOTpayment_failed = this.cast("payment_intent.payment_failed")
  @scala.inline
  def payment_intentDOTsucceeded: typingsSlinky.stripe.stripeStrings.payment_intentDOTsucceeded = this.cast("payment_intent.succeeded")
  @scala.inline
  def payment_methodDOTattached: typingsSlinky.stripe.stripeStrings.payment_methodDOTattached = this.cast("payment_method.attached")
  @scala.inline
  def payment_methodDOTcard_automatically_updated: typingsSlinky.stripe.stripeStrings.payment_methodDOTcard_automatically_updated = this.cast("payment_method.card_automatically_updated")
  @scala.inline
  def payment_methodDOTdetached: typingsSlinky.stripe.stripeStrings.payment_methodDOTdetached = this.cast("payment_method.detached")
  @scala.inline
  def payment_methodDOTupdated: typingsSlinky.stripe.stripeStrings.payment_methodDOTupdated = this.cast("payment_method.updated")
  @scala.inline
  def payoutDOTcanceled: typingsSlinky.stripe.stripeStrings.payoutDOTcanceled = this.cast("payout.canceled")
  @scala.inline
  def payoutDOTcreated: typingsSlinky.stripe.stripeStrings.payoutDOTcreated = this.cast("payout.created")
  @scala.inline
  def payoutDOTfailed: typingsSlinky.stripe.stripeStrings.payoutDOTfailed = this.cast("payout.failed")
  @scala.inline
  def payoutDOTpaid: typingsSlinky.stripe.stripeStrings.payoutDOTpaid = this.cast("payout.paid")
  @scala.inline
  def payoutDOTupdated: typingsSlinky.stripe.stripeStrings.payoutDOTupdated = this.cast("payout.updated")
  @scala.inline
  def personDOTcreated: typingsSlinky.stripe.stripeStrings.personDOTcreated = this.cast("person.created")
  @scala.inline
  def personDOTdeleted: typingsSlinky.stripe.stripeStrings.personDOTdeleted = this.cast("person.deleted")
  @scala.inline
  def personDOTupdated: typingsSlinky.stripe.stripeStrings.personDOTupdated = this.cast("person.updated")
  @scala.inline
  def planDOTcreated: typingsSlinky.stripe.stripeStrings.planDOTcreated = this.cast("plan.created")
  @scala.inline
  def planDOTdeleted: typingsSlinky.stripe.stripeStrings.planDOTdeleted = this.cast("plan.deleted")
  @scala.inline
  def planDOTupdated: typingsSlinky.stripe.stripeStrings.planDOTupdated = this.cast("plan.updated")
  @scala.inline
  def productDOTcreated: typingsSlinky.stripe.stripeStrings.productDOTcreated = this.cast("product.created")
  @scala.inline
  def productDOTdeleted: typingsSlinky.stripe.stripeStrings.productDOTdeleted = this.cast("product.deleted")
  @scala.inline
  def productDOTupdated: typingsSlinky.stripe.stripeStrings.productDOTupdated = this.cast("product.updated")
  @scala.inline
  def radarDOTearly_fraud_warningDOTcreated: typingsSlinky.stripe.stripeStrings.radarDOTearly_fraud_warningDOTcreated = this.cast("radar.early_fraud_warning.created")
  @scala.inline
  def radarDOTearly_fraud_warningDOTupdated: typingsSlinky.stripe.stripeStrings.radarDOTearly_fraud_warningDOTupdated = this.cast("radar.early_fraud_warning.updated")
  @scala.inline
  def recipientDOTcreated: typingsSlinky.stripe.stripeStrings.recipientDOTcreated = this.cast("recipient.created")
  @scala.inline
  def recipientDOTdeleted: typingsSlinky.stripe.stripeStrings.recipientDOTdeleted = this.cast("recipient.deleted")
  @scala.inline
  def recipientDOTupdated: typingsSlinky.stripe.stripeStrings.recipientDOTupdated = this.cast("recipient.updated")
  @scala.inline
  def reportingDOTreport_runDOTfailed: typingsSlinky.stripe.stripeStrings.reportingDOTreport_runDOTfailed = this.cast("reporting.report_run.failed")
  @scala.inline
  def reportingDOTreport_runDOTsucceeded: typingsSlinky.stripe.stripeStrings.reportingDOTreport_runDOTsucceeded = this.cast("reporting.report_run.succeeded")
  @scala.inline
  def reportingDOTreport_typeDOTupdated: typingsSlinky.stripe.stripeStrings.reportingDOTreport_typeDOTupdated = this.cast("reporting.report_type.updated")
  @scala.inline
  def reviewDOTclosed: typingsSlinky.stripe.stripeStrings.reviewDOTclosed = this.cast("review.closed")
  @scala.inline
  def reviewDOTopened: typingsSlinky.stripe.stripeStrings.reviewDOTopened = this.cast("review.opened")
  @scala.inline
  def setup_intentDOTcanceled: typingsSlinky.stripe.stripeStrings.setup_intentDOTcanceled = this.cast("setup_intent.canceled")
  @scala.inline
  def setup_intentDOTcreated: typingsSlinky.stripe.stripeStrings.setup_intentDOTcreated = this.cast("setup_intent.created")
  @scala.inline
  def setup_intentDOTsetup_failed: typingsSlinky.stripe.stripeStrings.setup_intentDOTsetup_failed = this.cast("setup_intent.setup_failed")
  @scala.inline
  def setup_intentDOTsucceeded: typingsSlinky.stripe.stripeStrings.setup_intentDOTsucceeded = this.cast("setup_intent.succeeded")
  @scala.inline
  def sigmaDOTscheduled_query_runDOTcreated: typingsSlinky.stripe.stripeStrings.sigmaDOTscheduled_query_runDOTcreated = this.cast("sigma.scheduled_query_run.created")
  @scala.inline
  def skuDOTcreated: typingsSlinky.stripe.stripeStrings.skuDOTcreated = this.cast("sku.created")
  @scala.inline
  def skuDOTdeleted: typingsSlinky.stripe.stripeStrings.skuDOTdeleted = this.cast("sku.deleted")
  @scala.inline
  def skuDOTupdated: typingsSlinky.stripe.stripeStrings.skuDOTupdated = this.cast("sku.updated")
  @scala.inline
  def sourceDOTcanceled: typingsSlinky.stripe.stripeStrings.sourceDOTcanceled = this.cast("source.canceled")
  @scala.inline
  def sourceDOTchargeable: typingsSlinky.stripe.stripeStrings.sourceDOTchargeable = this.cast("source.chargeable")
  @scala.inline
  def sourceDOTfailed: typingsSlinky.stripe.stripeStrings.sourceDOTfailed = this.cast("source.failed")
  @scala.inline
  def sourceDOTmandate_notification: typingsSlinky.stripe.stripeStrings.sourceDOTmandate_notification = this.cast("source.mandate_notification")
  @scala.inline
  def sourceDOTrefund_attributes_required: typingsSlinky.stripe.stripeStrings.sourceDOTrefund_attributes_required = this.cast("source.refund_attributes_required")
  @scala.inline
  def sourceDOTtransactionDOTcreated: typingsSlinky.stripe.stripeStrings.sourceDOTtransactionDOTcreated = this.cast("source.transaction.created")
  @scala.inline
  def sourceDOTtransactionDOTupdated: typingsSlinky.stripe.stripeStrings.sourceDOTtransactionDOTupdated = this.cast("source.transaction.updated")
  @scala.inline
  def subscription_scheduleDOTaborted: typingsSlinky.stripe.stripeStrings.subscription_scheduleDOTaborted = this.cast("subscription_schedule.aborted")
  @scala.inline
  def subscription_scheduleDOTcanceled: typingsSlinky.stripe.stripeStrings.subscription_scheduleDOTcanceled = this.cast("subscription_schedule.canceled")
  @scala.inline
  def subscription_scheduleDOTcompleted: typingsSlinky.stripe.stripeStrings.subscription_scheduleDOTcompleted = this.cast("subscription_schedule.completed")
  @scala.inline
  def subscription_scheduleDOTcreated: typingsSlinky.stripe.stripeStrings.subscription_scheduleDOTcreated = this.cast("subscription_schedule.created")
  @scala.inline
  def subscription_scheduleDOTexpiring: typingsSlinky.stripe.stripeStrings.subscription_scheduleDOTexpiring = this.cast("subscription_schedule.expiring")
  @scala.inline
  def subscription_scheduleDOTreleased: typingsSlinky.stripe.stripeStrings.subscription_scheduleDOTreleased = this.cast("subscription_schedule.released")
  @scala.inline
  def subscription_scheduleDOTupdated: typingsSlinky.stripe.stripeStrings.subscription_scheduleDOTupdated = this.cast("subscription_schedule.updated")
  @scala.inline
  def tax_rateDOTcreated: typingsSlinky.stripe.stripeStrings.tax_rateDOTcreated = this.cast("tax_rate.created")
  @scala.inline
  def tax_rateDOTupdated: typingsSlinky.stripe.stripeStrings.tax_rateDOTupdated = this.cast("tax_rate.updated")
  @scala.inline
  def topupDOTcreated: typingsSlinky.stripe.stripeStrings.topupDOTcreated = this.cast("topup.created")
  @scala.inline
  def topupDOTfailed: typingsSlinky.stripe.stripeStrings.topupDOTfailed = this.cast("topup.failed")
  @scala.inline
  def topupDOTreversed: typingsSlinky.stripe.stripeStrings.topupDOTreversed = this.cast("topup.reversed")
  @scala.inline
  def topupDOTsucceeded: typingsSlinky.stripe.stripeStrings.topupDOTsucceeded = this.cast("topup.succeeded")
  @scala.inline
  def transferDOTcreated: typingsSlinky.stripe.stripeStrings.transferDOTcreated = this.cast("transfer.created")
  @scala.inline
  def transferDOTfailed: typingsSlinky.stripe.stripeStrings.transferDOTfailed = this.cast("transfer.failed")
  @scala.inline
  def transferDOTpaid: typingsSlinky.stripe.stripeStrings.transferDOTpaid = this.cast("transfer.paid")
  @scala.inline
  def transferDOTreversed: typingsSlinky.stripe.stripeStrings.transferDOTreversed = this.cast("transfer.reversed")
  @scala.inline
  def transferDOTupdated: typingsSlinky.stripe.stripeStrings.transferDOTupdated = this.cast("transfer.updated")
}

