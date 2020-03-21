package typingsSlinky.stripe.mod.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.stripeStrings.Asterisk
  - typingsSlinky.stripe.stripeStrings.accountDotupdated
  - typingsSlinky.stripe.stripeStrings.accountDotapplicationDotauthorized
  - typingsSlinky.stripe.stripeStrings.accountDotapplicationDotdeauthorized
  - typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotcreated
  - typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotdeleted
  - typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotupdated
  - typingsSlinky.stripe.stripeStrings.application_feeDotcreated
  - typingsSlinky.stripe.stripeStrings.application_feeDotrefunded
  - typingsSlinky.stripe.stripeStrings.application_feeDotrefundDotupdated
  - typingsSlinky.stripe.stripeStrings.balanceDotavailable
  - typingsSlinky.stripe.stripeStrings.capabilityDotupdated
  - typingsSlinky.stripe.stripeStrings.chargeDotcaptured
  - typingsSlinky.stripe.stripeStrings.chargeDotexpired
  - typingsSlinky.stripe.stripeStrings.chargeDotfailed
  - typingsSlinky.stripe.stripeStrings.chargeDotpending
  - typingsSlinky.stripe.stripeStrings.chargeDotrefunded
  - typingsSlinky.stripe.stripeStrings.chargeDotsucceeded
  - typingsSlinky.stripe.stripeStrings.chargeDotupdated
  - typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotclosed
  - typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotcreated
  - typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotfunds_reinstated
  - typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotfunds_withdrawn
  - typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotupdated
  - typingsSlinky.stripe.stripeStrings.chargeDotrefundDotupdated
  - typingsSlinky.stripe.stripeStrings.checkoutDotsessionDotcompleted
  - typingsSlinky.stripe.stripeStrings.couponDotcreated
  - typingsSlinky.stripe.stripeStrings.couponDotdeleted
  - typingsSlinky.stripe.stripeStrings.couponDotupdated
  - typingsSlinky.stripe.stripeStrings.credit_noteDotcreated
  - typingsSlinky.stripe.stripeStrings.credit_noteDotupdated
  - typingsSlinky.stripe.stripeStrings.credit_noteDotvoided
  - typingsSlinky.stripe.stripeStrings.customerDotcreated
  - typingsSlinky.stripe.stripeStrings.customerDotdeleted
  - typingsSlinky.stripe.stripeStrings.customerDotupdated
  - typingsSlinky.stripe.stripeStrings.customerDotdiscountDotcreated
  - typingsSlinky.stripe.stripeStrings.customerDotdiscountDotdeleted
  - typingsSlinky.stripe.stripeStrings.customerDotdiscountDotupdated
  - typingsSlinky.stripe.stripeStrings.customerDotsourceDotcreated
  - typingsSlinky.stripe.stripeStrings.customerDotsourceDotdeleted
  - typingsSlinky.stripe.stripeStrings.customerDotsourceDotexpiring
  - typingsSlinky.stripe.stripeStrings.customerDotsourceDotupdated
  - typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotcreated
  - typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotdeleted
  - typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDottrial_will_end
  - typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotupdated
  - typingsSlinky.stripe.stripeStrings.customerDottax_idDotcreated
  - typingsSlinky.stripe.stripeStrings.customerDottax_idDotdeleted
  - typingsSlinky.stripe.stripeStrings.customerDottax_idDotupdated
  - typingsSlinky.stripe.stripeStrings.fileDotcreated
  - typingsSlinky.stripe.stripeStrings.invoiceDotcreated
  - typingsSlinky.stripe.stripeStrings.invoiceDotdeleted
  - typingsSlinky.stripe.stripeStrings.invoiceDotfinalized
  - typingsSlinky.stripe.stripeStrings.invoiceDotmarked_uncollectible
  - typingsSlinky.stripe.stripeStrings.invoiceDotpayment_action_required
  - typingsSlinky.stripe.stripeStrings.invoiceDotpayment_failed
  - typingsSlinky.stripe.stripeStrings.invoiceDotpayment_succeeded
  - typingsSlinky.stripe.stripeStrings.invoiceDotsent
  - typingsSlinky.stripe.stripeStrings.invoiceDotupcoming
  - typingsSlinky.stripe.stripeStrings.invoiceDotupdated
  - typingsSlinky.stripe.stripeStrings.invoiceDotvoided
  - typingsSlinky.stripe.stripeStrings.invoiceitemDotcreated
  - typingsSlinky.stripe.stripeStrings.invoiceitemDotdeleted
  - typingsSlinky.stripe.stripeStrings.invoiceitemDotupdated
  - typingsSlinky.stripe.stripeStrings.issuing_authorizationDotcreated
  - typingsSlinky.stripe.stripeStrings.issuing_authorizationDotrequest
  - typingsSlinky.stripe.stripeStrings.issuing_authorizationDotupdated
  - typingsSlinky.stripe.stripeStrings.issuing_cardDotcreated
  - typingsSlinky.stripe.stripeStrings.issuing_cardDotupdated
  - typingsSlinky.stripe.stripeStrings.issuing_cardholderDotcreated
  - typingsSlinky.stripe.stripeStrings.issuing_cardholderDotupdated
  - typingsSlinky.stripe.stripeStrings.issuing_disputeDotcreated
  - typingsSlinky.stripe.stripeStrings.issuing_disputeDotupdated
  - typingsSlinky.stripe.stripeStrings.issuing_settlementDotcreated
  - typingsSlinky.stripe.stripeStrings.issuing_settlementDotupdated
  - typingsSlinky.stripe.stripeStrings.issuing_transactionDotcreated
  - typingsSlinky.stripe.stripeStrings.issuing_transactionDotupdated
  - typingsSlinky.stripe.stripeStrings.mandateDotupdated
  - typingsSlinky.stripe.stripeStrings.orderDotcreated
  - typingsSlinky.stripe.stripeStrings.orderDotpayment_failed
  - typingsSlinky.stripe.stripeStrings.orderDotpayment_succeeded
  - typingsSlinky.stripe.stripeStrings.orderDotupdated
  - typingsSlinky.stripe.stripeStrings.order_returnDotcreated
  - typingsSlinky.stripe.stripeStrings.payment_intentDotamount_capturable_updated
  - typingsSlinky.stripe.stripeStrings.payment_intentDotcanceled
  - typingsSlinky.stripe.stripeStrings.payment_intentDotcreated
  - typingsSlinky.stripe.stripeStrings.payment_intentDotpayment_failed
  - typingsSlinky.stripe.stripeStrings.payment_intentDotsucceeded
  - typingsSlinky.stripe.stripeStrings.payment_methodDotattached
  - typingsSlinky.stripe.stripeStrings.payment_methodDotcard_automatically_updated
  - typingsSlinky.stripe.stripeStrings.payment_methodDotdetached
  - typingsSlinky.stripe.stripeStrings.payment_methodDotupdated
  - typingsSlinky.stripe.stripeStrings.payoutDotcanceled
  - typingsSlinky.stripe.stripeStrings.payoutDotcreated
  - typingsSlinky.stripe.stripeStrings.payoutDotfailed
  - typingsSlinky.stripe.stripeStrings.payoutDotpaid
  - typingsSlinky.stripe.stripeStrings.payoutDotupdated
  - typingsSlinky.stripe.stripeStrings.personDotcreated
  - typingsSlinky.stripe.stripeStrings.personDotdeleted
  - typingsSlinky.stripe.stripeStrings.personDotupdated
  - typingsSlinky.stripe.stripeStrings.planDotcreated
  - typingsSlinky.stripe.stripeStrings.planDotdeleted
  - typingsSlinky.stripe.stripeStrings.planDotupdated
  - typingsSlinky.stripe.stripeStrings.productDotcreated
  - typingsSlinky.stripe.stripeStrings.productDotdeleted
  - typingsSlinky.stripe.stripeStrings.productDotupdated
  - typingsSlinky.stripe.stripeStrings.radarDotearly_fraud_warningDotcreated
  - typingsSlinky.stripe.stripeStrings.radarDotearly_fraud_warningDotupdated
  - typingsSlinky.stripe.stripeStrings.recipientDotcreated
  - typingsSlinky.stripe.stripeStrings.recipientDotdeleted
  - typingsSlinky.stripe.stripeStrings.recipientDotupdated
  - typingsSlinky.stripe.stripeStrings.reportingDotreport_runDotfailed
  - typingsSlinky.stripe.stripeStrings.reportingDotreport_runDotsucceeded
  - typingsSlinky.stripe.stripeStrings.reportingDotreport_typeDotupdated
  - typingsSlinky.stripe.stripeStrings.reviewDotclosed
  - typingsSlinky.stripe.stripeStrings.reviewDotopened
  - typingsSlinky.stripe.stripeStrings.setup_intentDotcanceled
  - typingsSlinky.stripe.stripeStrings.setup_intentDotcreated
  - typingsSlinky.stripe.stripeStrings.setup_intentDotsetup_failed
  - typingsSlinky.stripe.stripeStrings.setup_intentDotsucceeded
  - typingsSlinky.stripe.stripeStrings.sigmaDotscheduled_query_runDotcreated
  - typingsSlinky.stripe.stripeStrings.skuDotcreated
  - typingsSlinky.stripe.stripeStrings.skuDotdeleted
  - typingsSlinky.stripe.stripeStrings.skuDotupdated
  - typingsSlinky.stripe.stripeStrings.sourceDotcanceled
  - typingsSlinky.stripe.stripeStrings.sourceDotchargeable
  - typingsSlinky.stripe.stripeStrings.sourceDotfailed
  - typingsSlinky.stripe.stripeStrings.sourceDotmandate_notification
  - typingsSlinky.stripe.stripeStrings.sourceDotrefund_attributes_required
  - typingsSlinky.stripe.stripeStrings.sourceDottransactionDotcreated
  - typingsSlinky.stripe.stripeStrings.sourceDottransactionDotupdated
  - typingsSlinky.stripe.stripeStrings.subscription_scheduleDotaborted
  - typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcanceled
  - typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcompleted
  - typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcreated
  - typingsSlinky.stripe.stripeStrings.subscription_scheduleDotexpiring
  - typingsSlinky.stripe.stripeStrings.subscription_scheduleDotreleased
  - typingsSlinky.stripe.stripeStrings.subscription_scheduleDotupdated
  - typingsSlinky.stripe.stripeStrings.tax_rateDotcreated
  - typingsSlinky.stripe.stripeStrings.tax_rateDotupdated
  - typingsSlinky.stripe.stripeStrings.topupDotcreated
  - typingsSlinky.stripe.stripeStrings.topupDotfailed
  - typingsSlinky.stripe.stripeStrings.topupDotreversed
  - typingsSlinky.stripe.stripeStrings.topupDotsucceeded
  - typingsSlinky.stripe.stripeStrings.transferDotcreated
  - typingsSlinky.stripe.stripeStrings.transferDotfailed
  - typingsSlinky.stripe.stripeStrings.transferDotpaid
  - typingsSlinky.stripe.stripeStrings.transferDotreversed
  - typingsSlinky.stripe.stripeStrings.transferDotupdated
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def Asterisk: typingsSlinky.stripe.stripeStrings.Asterisk = this.cast("*")
  @scala.inline
  def accountDotapplicationDotauthorized: typingsSlinky.stripe.stripeStrings.accountDotapplicationDotauthorized = this.cast("account.application.authorized")
  @scala.inline
  def accountDotapplicationDotdeauthorized: typingsSlinky.stripe.stripeStrings.accountDotapplicationDotdeauthorized = this.cast("account.application.deauthorized")
  @scala.inline
  def accountDotexternal_accountDotcreated: typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotcreated = this.cast("account.external_account.created")
  @scala.inline
  def accountDotexternal_accountDotdeleted: typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotdeleted = this.cast("account.external_account.deleted")
  @scala.inline
  def accountDotexternal_accountDotupdated: typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotupdated = this.cast("account.external_account.updated")
  @scala.inline
  def accountDotupdated: typingsSlinky.stripe.stripeStrings.accountDotupdated = this.cast("account.updated")
  @scala.inline
  def application_feeDotcreated: typingsSlinky.stripe.stripeStrings.application_feeDotcreated = this.cast("application_fee.created")
  @scala.inline
  def application_feeDotrefundDotupdated: typingsSlinky.stripe.stripeStrings.application_feeDotrefundDotupdated = this.cast("application_fee.refund.updated")
  @scala.inline
  def application_feeDotrefunded: typingsSlinky.stripe.stripeStrings.application_feeDotrefunded = this.cast("application_fee.refunded")
  @scala.inline
  def balanceDotavailable: typingsSlinky.stripe.stripeStrings.balanceDotavailable = this.cast("balance.available")
  @scala.inline
  def capabilityDotupdated: typingsSlinky.stripe.stripeStrings.capabilityDotupdated = this.cast("capability.updated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chargeDotcaptured: typingsSlinky.stripe.stripeStrings.chargeDotcaptured = this.cast("charge.captured")
  @scala.inline
  def chargeDotdisputeDotclosed: typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotclosed = this.cast("charge.dispute.closed")
  @scala.inline
  def chargeDotdisputeDotcreated: typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotcreated = this.cast("charge.dispute.created")
  @scala.inline
  def chargeDotdisputeDotfunds_reinstated: typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotfunds_reinstated = this.cast("charge.dispute.funds_reinstated")
  @scala.inline
  def chargeDotdisputeDotfunds_withdrawn: typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotfunds_withdrawn = this.cast("charge.dispute.funds_withdrawn")
  @scala.inline
  def chargeDotdisputeDotupdated: typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotupdated = this.cast("charge.dispute.updated")
  @scala.inline
  def chargeDotexpired: typingsSlinky.stripe.stripeStrings.chargeDotexpired = this.cast("charge.expired")
  @scala.inline
  def chargeDotfailed: typingsSlinky.stripe.stripeStrings.chargeDotfailed = this.cast("charge.failed")
  @scala.inline
  def chargeDotpending: typingsSlinky.stripe.stripeStrings.chargeDotpending = this.cast("charge.pending")
  @scala.inline
  def chargeDotrefundDotupdated: typingsSlinky.stripe.stripeStrings.chargeDotrefundDotupdated = this.cast("charge.refund.updated")
  @scala.inline
  def chargeDotrefunded: typingsSlinky.stripe.stripeStrings.chargeDotrefunded = this.cast("charge.refunded")
  @scala.inline
  def chargeDotsucceeded: typingsSlinky.stripe.stripeStrings.chargeDotsucceeded = this.cast("charge.succeeded")
  @scala.inline
  def chargeDotupdated: typingsSlinky.stripe.stripeStrings.chargeDotupdated = this.cast("charge.updated")
  @scala.inline
  def checkoutDotsessionDotcompleted: typingsSlinky.stripe.stripeStrings.checkoutDotsessionDotcompleted = this.cast("checkout.session.completed")
  @scala.inline
  def couponDotcreated: typingsSlinky.stripe.stripeStrings.couponDotcreated = this.cast("coupon.created")
  @scala.inline
  def couponDotdeleted: typingsSlinky.stripe.stripeStrings.couponDotdeleted = this.cast("coupon.deleted")
  @scala.inline
  def couponDotupdated: typingsSlinky.stripe.stripeStrings.couponDotupdated = this.cast("coupon.updated")
  @scala.inline
  def credit_noteDotcreated: typingsSlinky.stripe.stripeStrings.credit_noteDotcreated = this.cast("credit_note.created")
  @scala.inline
  def credit_noteDotupdated: typingsSlinky.stripe.stripeStrings.credit_noteDotupdated = this.cast("credit_note.updated")
  @scala.inline
  def credit_noteDotvoided: typingsSlinky.stripe.stripeStrings.credit_noteDotvoided = this.cast("credit_note.voided")
  @scala.inline
  def customerDotcreated: typingsSlinky.stripe.stripeStrings.customerDotcreated = this.cast("customer.created")
  @scala.inline
  def customerDotdeleted: typingsSlinky.stripe.stripeStrings.customerDotdeleted = this.cast("customer.deleted")
  @scala.inline
  def customerDotdiscountDotcreated: typingsSlinky.stripe.stripeStrings.customerDotdiscountDotcreated = this.cast("customer.discount.created")
  @scala.inline
  def customerDotdiscountDotdeleted: typingsSlinky.stripe.stripeStrings.customerDotdiscountDotdeleted = this.cast("customer.discount.deleted")
  @scala.inline
  def customerDotdiscountDotupdated: typingsSlinky.stripe.stripeStrings.customerDotdiscountDotupdated = this.cast("customer.discount.updated")
  @scala.inline
  def customerDotsourceDotcreated: typingsSlinky.stripe.stripeStrings.customerDotsourceDotcreated = this.cast("customer.source.created")
  @scala.inline
  def customerDotsourceDotdeleted: typingsSlinky.stripe.stripeStrings.customerDotsourceDotdeleted = this.cast("customer.source.deleted")
  @scala.inline
  def customerDotsourceDotexpiring: typingsSlinky.stripe.stripeStrings.customerDotsourceDotexpiring = this.cast("customer.source.expiring")
  @scala.inline
  def customerDotsourceDotupdated: typingsSlinky.stripe.stripeStrings.customerDotsourceDotupdated = this.cast("customer.source.updated")
  @scala.inline
  def customerDotsubscriptionDotcreated: typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotcreated = this.cast("customer.subscription.created")
  @scala.inline
  def customerDotsubscriptionDotdeleted: typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotdeleted = this.cast("customer.subscription.deleted")
  @scala.inline
  def customerDotsubscriptionDottrial_will_end: typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDottrial_will_end = this.cast("customer.subscription.trial_will_end")
  @scala.inline
  def customerDotsubscriptionDotupdated: typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotupdated = this.cast("customer.subscription.updated")
  @scala.inline
  def customerDottax_idDotcreated: typingsSlinky.stripe.stripeStrings.customerDottax_idDotcreated = this.cast("customer.tax_id.created")
  @scala.inline
  def customerDottax_idDotdeleted: typingsSlinky.stripe.stripeStrings.customerDottax_idDotdeleted = this.cast("customer.tax_id.deleted")
  @scala.inline
  def customerDottax_idDotupdated: typingsSlinky.stripe.stripeStrings.customerDottax_idDotupdated = this.cast("customer.tax_id.updated")
  @scala.inline
  def customerDotupdated: typingsSlinky.stripe.stripeStrings.customerDotupdated = this.cast("customer.updated")
  @scala.inline
  def fileDotcreated: typingsSlinky.stripe.stripeStrings.fileDotcreated = this.cast("file.created")
  @scala.inline
  def invoiceDotcreated: typingsSlinky.stripe.stripeStrings.invoiceDotcreated = this.cast("invoice.created")
  @scala.inline
  def invoiceDotdeleted: typingsSlinky.stripe.stripeStrings.invoiceDotdeleted = this.cast("invoice.deleted")
  @scala.inline
  def invoiceDotfinalized: typingsSlinky.stripe.stripeStrings.invoiceDotfinalized = this.cast("invoice.finalized")
  @scala.inline
  def invoiceDotmarked_uncollectible: typingsSlinky.stripe.stripeStrings.invoiceDotmarked_uncollectible = this.cast("invoice.marked_uncollectible")
  @scala.inline
  def invoiceDotpayment_action_required: typingsSlinky.stripe.stripeStrings.invoiceDotpayment_action_required = this.cast("invoice.payment_action_required")
  @scala.inline
  def invoiceDotpayment_failed: typingsSlinky.stripe.stripeStrings.invoiceDotpayment_failed = this.cast("invoice.payment_failed")
  @scala.inline
  def invoiceDotpayment_succeeded: typingsSlinky.stripe.stripeStrings.invoiceDotpayment_succeeded = this.cast("invoice.payment_succeeded")
  @scala.inline
  def invoiceDotsent: typingsSlinky.stripe.stripeStrings.invoiceDotsent = this.cast("invoice.sent")
  @scala.inline
  def invoiceDotupcoming: typingsSlinky.stripe.stripeStrings.invoiceDotupcoming = this.cast("invoice.upcoming")
  @scala.inline
  def invoiceDotupdated: typingsSlinky.stripe.stripeStrings.invoiceDotupdated = this.cast("invoice.updated")
  @scala.inline
  def invoiceDotvoided: typingsSlinky.stripe.stripeStrings.invoiceDotvoided = this.cast("invoice.voided")
  @scala.inline
  def invoiceitemDotcreated: typingsSlinky.stripe.stripeStrings.invoiceitemDotcreated = this.cast("invoiceitem.created")
  @scala.inline
  def invoiceitemDotdeleted: typingsSlinky.stripe.stripeStrings.invoiceitemDotdeleted = this.cast("invoiceitem.deleted")
  @scala.inline
  def invoiceitemDotupdated: typingsSlinky.stripe.stripeStrings.invoiceitemDotupdated = this.cast("invoiceitem.updated")
  @scala.inline
  def issuing_authorizationDotcreated: typingsSlinky.stripe.stripeStrings.issuing_authorizationDotcreated = this.cast("issuing_authorization.created")
  @scala.inline
  def issuing_authorizationDotrequest: typingsSlinky.stripe.stripeStrings.issuing_authorizationDotrequest = this.cast("issuing_authorization.request")
  @scala.inline
  def issuing_authorizationDotupdated: typingsSlinky.stripe.stripeStrings.issuing_authorizationDotupdated = this.cast("issuing_authorization.updated")
  @scala.inline
  def issuing_cardDotcreated: typingsSlinky.stripe.stripeStrings.issuing_cardDotcreated = this.cast("issuing_card.created")
  @scala.inline
  def issuing_cardDotupdated: typingsSlinky.stripe.stripeStrings.issuing_cardDotupdated = this.cast("issuing_card.updated")
  @scala.inline
  def issuing_cardholderDotcreated: typingsSlinky.stripe.stripeStrings.issuing_cardholderDotcreated = this.cast("issuing_cardholder.created")
  @scala.inline
  def issuing_cardholderDotupdated: typingsSlinky.stripe.stripeStrings.issuing_cardholderDotupdated = this.cast("issuing_cardholder.updated")
  @scala.inline
  def issuing_disputeDotcreated: typingsSlinky.stripe.stripeStrings.issuing_disputeDotcreated = this.cast("issuing_dispute.created")
  @scala.inline
  def issuing_disputeDotupdated: typingsSlinky.stripe.stripeStrings.issuing_disputeDotupdated = this.cast("issuing_dispute.updated")
  @scala.inline
  def issuing_settlementDotcreated: typingsSlinky.stripe.stripeStrings.issuing_settlementDotcreated = this.cast("issuing_settlement.created")
  @scala.inline
  def issuing_settlementDotupdated: typingsSlinky.stripe.stripeStrings.issuing_settlementDotupdated = this.cast("issuing_settlement.updated")
  @scala.inline
  def issuing_transactionDotcreated: typingsSlinky.stripe.stripeStrings.issuing_transactionDotcreated = this.cast("issuing_transaction.created")
  @scala.inline
  def issuing_transactionDotupdated: typingsSlinky.stripe.stripeStrings.issuing_transactionDotupdated = this.cast("issuing_transaction.updated")
  @scala.inline
  def mandateDotupdated: typingsSlinky.stripe.stripeStrings.mandateDotupdated = this.cast("mandate.updated")
  @scala.inline
  def orderDotcreated: typingsSlinky.stripe.stripeStrings.orderDotcreated = this.cast("order.created")
  @scala.inline
  def orderDotpayment_failed: typingsSlinky.stripe.stripeStrings.orderDotpayment_failed = this.cast("order.payment_failed")
  @scala.inline
  def orderDotpayment_succeeded: typingsSlinky.stripe.stripeStrings.orderDotpayment_succeeded = this.cast("order.payment_succeeded")
  @scala.inline
  def orderDotupdated: typingsSlinky.stripe.stripeStrings.orderDotupdated = this.cast("order.updated")
  @scala.inline
  def order_returnDotcreated: typingsSlinky.stripe.stripeStrings.order_returnDotcreated = this.cast("order_return.created")
  @scala.inline
  def payment_intentDotamount_capturable_updated: typingsSlinky.stripe.stripeStrings.payment_intentDotamount_capturable_updated = this.cast("payment_intent.amount_capturable_updated")
  @scala.inline
  def payment_intentDotcanceled: typingsSlinky.stripe.stripeStrings.payment_intentDotcanceled = this.cast("payment_intent.canceled")
  @scala.inline
  def payment_intentDotcreated: typingsSlinky.stripe.stripeStrings.payment_intentDotcreated = this.cast("payment_intent.created")
  @scala.inline
  def payment_intentDotpayment_failed: typingsSlinky.stripe.stripeStrings.payment_intentDotpayment_failed = this.cast("payment_intent.payment_failed")
  @scala.inline
  def payment_intentDotsucceeded: typingsSlinky.stripe.stripeStrings.payment_intentDotsucceeded = this.cast("payment_intent.succeeded")
  @scala.inline
  def payment_methodDotattached: typingsSlinky.stripe.stripeStrings.payment_methodDotattached = this.cast("payment_method.attached")
  @scala.inline
  def payment_methodDotcard_automatically_updated: typingsSlinky.stripe.stripeStrings.payment_methodDotcard_automatically_updated = this.cast("payment_method.card_automatically_updated")
  @scala.inline
  def payment_methodDotdetached: typingsSlinky.stripe.stripeStrings.payment_methodDotdetached = this.cast("payment_method.detached")
  @scala.inline
  def payment_methodDotupdated: typingsSlinky.stripe.stripeStrings.payment_methodDotupdated = this.cast("payment_method.updated")
  @scala.inline
  def payoutDotcanceled: typingsSlinky.stripe.stripeStrings.payoutDotcanceled = this.cast("payout.canceled")
  @scala.inline
  def payoutDotcreated: typingsSlinky.stripe.stripeStrings.payoutDotcreated = this.cast("payout.created")
  @scala.inline
  def payoutDotfailed: typingsSlinky.stripe.stripeStrings.payoutDotfailed = this.cast("payout.failed")
  @scala.inline
  def payoutDotpaid: typingsSlinky.stripe.stripeStrings.payoutDotpaid = this.cast("payout.paid")
  @scala.inline
  def payoutDotupdated: typingsSlinky.stripe.stripeStrings.payoutDotupdated = this.cast("payout.updated")
  @scala.inline
  def personDotcreated: typingsSlinky.stripe.stripeStrings.personDotcreated = this.cast("person.created")
  @scala.inline
  def personDotdeleted: typingsSlinky.stripe.stripeStrings.personDotdeleted = this.cast("person.deleted")
  @scala.inline
  def personDotupdated: typingsSlinky.stripe.stripeStrings.personDotupdated = this.cast("person.updated")
  @scala.inline
  def planDotcreated: typingsSlinky.stripe.stripeStrings.planDotcreated = this.cast("plan.created")
  @scala.inline
  def planDotdeleted: typingsSlinky.stripe.stripeStrings.planDotdeleted = this.cast("plan.deleted")
  @scala.inline
  def planDotupdated: typingsSlinky.stripe.stripeStrings.planDotupdated = this.cast("plan.updated")
  @scala.inline
  def productDotcreated: typingsSlinky.stripe.stripeStrings.productDotcreated = this.cast("product.created")
  @scala.inline
  def productDotdeleted: typingsSlinky.stripe.stripeStrings.productDotdeleted = this.cast("product.deleted")
  @scala.inline
  def productDotupdated: typingsSlinky.stripe.stripeStrings.productDotupdated = this.cast("product.updated")
  @scala.inline
  def radarDotearly_fraud_warningDotcreated: typingsSlinky.stripe.stripeStrings.radarDotearly_fraud_warningDotcreated = this.cast("radar.early_fraud_warning.created")
  @scala.inline
  def radarDotearly_fraud_warningDotupdated: typingsSlinky.stripe.stripeStrings.radarDotearly_fraud_warningDotupdated = this.cast("radar.early_fraud_warning.updated")
  @scala.inline
  def recipientDotcreated: typingsSlinky.stripe.stripeStrings.recipientDotcreated = this.cast("recipient.created")
  @scala.inline
  def recipientDotdeleted: typingsSlinky.stripe.stripeStrings.recipientDotdeleted = this.cast("recipient.deleted")
  @scala.inline
  def recipientDotupdated: typingsSlinky.stripe.stripeStrings.recipientDotupdated = this.cast("recipient.updated")
  @scala.inline
  def reportingDotreport_runDotfailed: typingsSlinky.stripe.stripeStrings.reportingDotreport_runDotfailed = this.cast("reporting.report_run.failed")
  @scala.inline
  def reportingDotreport_runDotsucceeded: typingsSlinky.stripe.stripeStrings.reportingDotreport_runDotsucceeded = this.cast("reporting.report_run.succeeded")
  @scala.inline
  def reportingDotreport_typeDotupdated: typingsSlinky.stripe.stripeStrings.reportingDotreport_typeDotupdated = this.cast("reporting.report_type.updated")
  @scala.inline
  def reviewDotclosed: typingsSlinky.stripe.stripeStrings.reviewDotclosed = this.cast("review.closed")
  @scala.inline
  def reviewDotopened: typingsSlinky.stripe.stripeStrings.reviewDotopened = this.cast("review.opened")
  @scala.inline
  def setup_intentDotcanceled: typingsSlinky.stripe.stripeStrings.setup_intentDotcanceled = this.cast("setup_intent.canceled")
  @scala.inline
  def setup_intentDotcreated: typingsSlinky.stripe.stripeStrings.setup_intentDotcreated = this.cast("setup_intent.created")
  @scala.inline
  def setup_intentDotsetup_failed: typingsSlinky.stripe.stripeStrings.setup_intentDotsetup_failed = this.cast("setup_intent.setup_failed")
  @scala.inline
  def setup_intentDotsucceeded: typingsSlinky.stripe.stripeStrings.setup_intentDotsucceeded = this.cast("setup_intent.succeeded")
  @scala.inline
  def sigmaDotscheduled_query_runDotcreated: typingsSlinky.stripe.stripeStrings.sigmaDotscheduled_query_runDotcreated = this.cast("sigma.scheduled_query_run.created")
  @scala.inline
  def skuDotcreated: typingsSlinky.stripe.stripeStrings.skuDotcreated = this.cast("sku.created")
  @scala.inline
  def skuDotdeleted: typingsSlinky.stripe.stripeStrings.skuDotdeleted = this.cast("sku.deleted")
  @scala.inline
  def skuDotupdated: typingsSlinky.stripe.stripeStrings.skuDotupdated = this.cast("sku.updated")
  @scala.inline
  def sourceDotcanceled: typingsSlinky.stripe.stripeStrings.sourceDotcanceled = this.cast("source.canceled")
  @scala.inline
  def sourceDotchargeable: typingsSlinky.stripe.stripeStrings.sourceDotchargeable = this.cast("source.chargeable")
  @scala.inline
  def sourceDotfailed: typingsSlinky.stripe.stripeStrings.sourceDotfailed = this.cast("source.failed")
  @scala.inline
  def sourceDotmandate_notification: typingsSlinky.stripe.stripeStrings.sourceDotmandate_notification = this.cast("source.mandate_notification")
  @scala.inline
  def sourceDotrefund_attributes_required: typingsSlinky.stripe.stripeStrings.sourceDotrefund_attributes_required = this.cast("source.refund_attributes_required")
  @scala.inline
  def sourceDottransactionDotcreated: typingsSlinky.stripe.stripeStrings.sourceDottransactionDotcreated = this.cast("source.transaction.created")
  @scala.inline
  def sourceDottransactionDotupdated: typingsSlinky.stripe.stripeStrings.sourceDottransactionDotupdated = this.cast("source.transaction.updated")
  @scala.inline
  def subscription_scheduleDotaborted: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotaborted = this.cast("subscription_schedule.aborted")
  @scala.inline
  def subscription_scheduleDotcanceled: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcanceled = this.cast("subscription_schedule.canceled")
  @scala.inline
  def subscription_scheduleDotcompleted: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcompleted = this.cast("subscription_schedule.completed")
  @scala.inline
  def subscription_scheduleDotcreated: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcreated = this.cast("subscription_schedule.created")
  @scala.inline
  def subscription_scheduleDotexpiring: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotexpiring = this.cast("subscription_schedule.expiring")
  @scala.inline
  def subscription_scheduleDotreleased: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotreleased = this.cast("subscription_schedule.released")
  @scala.inline
  def subscription_scheduleDotupdated: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotupdated = this.cast("subscription_schedule.updated")
  @scala.inline
  def tax_rateDotcreated: typingsSlinky.stripe.stripeStrings.tax_rateDotcreated = this.cast("tax_rate.created")
  @scala.inline
  def tax_rateDotupdated: typingsSlinky.stripe.stripeStrings.tax_rateDotupdated = this.cast("tax_rate.updated")
  @scala.inline
  def topupDotcreated: typingsSlinky.stripe.stripeStrings.topupDotcreated = this.cast("topup.created")
  @scala.inline
  def topupDotfailed: typingsSlinky.stripe.stripeStrings.topupDotfailed = this.cast("topup.failed")
  @scala.inline
  def topupDotreversed: typingsSlinky.stripe.stripeStrings.topupDotreversed = this.cast("topup.reversed")
  @scala.inline
  def topupDotsucceeded: typingsSlinky.stripe.stripeStrings.topupDotsucceeded = this.cast("topup.succeeded")
  @scala.inline
  def transferDotcreated: typingsSlinky.stripe.stripeStrings.transferDotcreated = this.cast("transfer.created")
  @scala.inline
  def transferDotfailed: typingsSlinky.stripe.stripeStrings.transferDotfailed = this.cast("transfer.failed")
  @scala.inline
  def transferDotpaid: typingsSlinky.stripe.stripeStrings.transferDotpaid = this.cast("transfer.paid")
  @scala.inline
  def transferDotreversed: typingsSlinky.stripe.stripeStrings.transferDotreversed = this.cast("transfer.reversed")
  @scala.inline
  def transferDotupdated: typingsSlinky.stripe.stripeStrings.transferDotupdated = this.cast("transfer.updated")
}

