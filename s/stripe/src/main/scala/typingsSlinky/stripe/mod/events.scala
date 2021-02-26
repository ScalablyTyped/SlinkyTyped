package typingsSlinky.stripe.mod

import typingsSlinky.stripe.anon.Id
import typingsSlinky.stripe.anon.Previousattributes
import typingsSlinky.stripe.stripeStrings.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
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
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def Asterisk: typingsSlinky.stripe.stripeStrings.Asterisk = "*".asInstanceOf[typingsSlinky.stripe.stripeStrings.Asterisk]
    
    @scala.inline
    def accountDotapplicationDotauthorized: typingsSlinky.stripe.stripeStrings.accountDotapplicationDotauthorized = "account.application.authorized".asInstanceOf[typingsSlinky.stripe.stripeStrings.accountDotapplicationDotauthorized]
    
    @scala.inline
    def accountDotapplicationDotdeauthorized: typingsSlinky.stripe.stripeStrings.accountDotapplicationDotdeauthorized = "account.application.deauthorized".asInstanceOf[typingsSlinky.stripe.stripeStrings.accountDotapplicationDotdeauthorized]
    
    @scala.inline
    def accountDotexternal_accountDotcreated: typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotcreated = "account.external_account.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotcreated]
    
    @scala.inline
    def accountDotexternal_accountDotdeleted: typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotdeleted = "account.external_account.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotdeleted]
    
    @scala.inline
    def accountDotexternal_accountDotupdated: typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotupdated = "account.external_account.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.accountDotexternal_accountDotupdated]
    
    @scala.inline
    def accountDotupdated: typingsSlinky.stripe.stripeStrings.accountDotupdated = "account.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.accountDotupdated]
    
    @scala.inline
    def application_feeDotcreated: typingsSlinky.stripe.stripeStrings.application_feeDotcreated = "application_fee.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.application_feeDotcreated]
    
    @scala.inline
    def application_feeDotrefundDotupdated: typingsSlinky.stripe.stripeStrings.application_feeDotrefundDotupdated = "application_fee.refund.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.application_feeDotrefundDotupdated]
    
    @scala.inline
    def application_feeDotrefunded: typingsSlinky.stripe.stripeStrings.application_feeDotrefunded = "application_fee.refunded".asInstanceOf[typingsSlinky.stripe.stripeStrings.application_feeDotrefunded]
    
    @scala.inline
    def balanceDotavailable: typingsSlinky.stripe.stripeStrings.balanceDotavailable = "balance.available".asInstanceOf[typingsSlinky.stripe.stripeStrings.balanceDotavailable]
    
    @scala.inline
    def capabilityDotupdated: typingsSlinky.stripe.stripeStrings.capabilityDotupdated = "capability.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.capabilityDotupdated]
    
    @scala.inline
    def chargeDotcaptured: typingsSlinky.stripe.stripeStrings.chargeDotcaptured = "charge.captured".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotcaptured]
    
    @scala.inline
    def chargeDotdisputeDotclosed: typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotclosed = "charge.dispute.closed".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotclosed]
    
    @scala.inline
    def chargeDotdisputeDotcreated: typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotcreated = "charge.dispute.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotcreated]
    
    @scala.inline
    def chargeDotdisputeDotfunds_reinstated: typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotfunds_reinstated = "charge.dispute.funds_reinstated".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotfunds_reinstated]
    
    @scala.inline
    def chargeDotdisputeDotfunds_withdrawn: typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotfunds_withdrawn = "charge.dispute.funds_withdrawn".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotfunds_withdrawn]
    
    @scala.inline
    def chargeDotdisputeDotupdated: typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotupdated = "charge.dispute.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotdisputeDotupdated]
    
    @scala.inline
    def chargeDotexpired: typingsSlinky.stripe.stripeStrings.chargeDotexpired = "charge.expired".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotexpired]
    
    @scala.inline
    def chargeDotfailed: typingsSlinky.stripe.stripeStrings.chargeDotfailed = "charge.failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotfailed]
    
    @scala.inline
    def chargeDotpending: typingsSlinky.stripe.stripeStrings.chargeDotpending = "charge.pending".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotpending]
    
    @scala.inline
    def chargeDotrefundDotupdated: typingsSlinky.stripe.stripeStrings.chargeDotrefundDotupdated = "charge.refund.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotrefundDotupdated]
    
    @scala.inline
    def chargeDotrefunded: typingsSlinky.stripe.stripeStrings.chargeDotrefunded = "charge.refunded".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotrefunded]
    
    @scala.inline
    def chargeDotsucceeded: typingsSlinky.stripe.stripeStrings.chargeDotsucceeded = "charge.succeeded".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotsucceeded]
    
    @scala.inline
    def chargeDotupdated: typingsSlinky.stripe.stripeStrings.chargeDotupdated = "charge.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.chargeDotupdated]
    
    @scala.inline
    def checkoutDotsessionDotcompleted: typingsSlinky.stripe.stripeStrings.checkoutDotsessionDotcompleted = "checkout.session.completed".asInstanceOf[typingsSlinky.stripe.stripeStrings.checkoutDotsessionDotcompleted]
    
    @scala.inline
    def couponDotcreated: typingsSlinky.stripe.stripeStrings.couponDotcreated = "coupon.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.couponDotcreated]
    
    @scala.inline
    def couponDotdeleted: typingsSlinky.stripe.stripeStrings.couponDotdeleted = "coupon.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.couponDotdeleted]
    
    @scala.inline
    def couponDotupdated: typingsSlinky.stripe.stripeStrings.couponDotupdated = "coupon.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.couponDotupdated]
    
    @scala.inline
    def credit_noteDotcreated: typingsSlinky.stripe.stripeStrings.credit_noteDotcreated = "credit_note.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.credit_noteDotcreated]
    
    @scala.inline
    def credit_noteDotupdated: typingsSlinky.stripe.stripeStrings.credit_noteDotupdated = "credit_note.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.credit_noteDotupdated]
    
    @scala.inline
    def credit_noteDotvoided: typingsSlinky.stripe.stripeStrings.credit_noteDotvoided = "credit_note.voided".asInstanceOf[typingsSlinky.stripe.stripeStrings.credit_noteDotvoided]
    
    @scala.inline
    def customerDotcreated: typingsSlinky.stripe.stripeStrings.customerDotcreated = "customer.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotcreated]
    
    @scala.inline
    def customerDotdeleted: typingsSlinky.stripe.stripeStrings.customerDotdeleted = "customer.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotdeleted]
    
    @scala.inline
    def customerDotdiscountDotcreated: typingsSlinky.stripe.stripeStrings.customerDotdiscountDotcreated = "customer.discount.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotdiscountDotcreated]
    
    @scala.inline
    def customerDotdiscountDotdeleted: typingsSlinky.stripe.stripeStrings.customerDotdiscountDotdeleted = "customer.discount.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotdiscountDotdeleted]
    
    @scala.inline
    def customerDotdiscountDotupdated: typingsSlinky.stripe.stripeStrings.customerDotdiscountDotupdated = "customer.discount.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotdiscountDotupdated]
    
    @scala.inline
    def customerDotsourceDotcreated: typingsSlinky.stripe.stripeStrings.customerDotsourceDotcreated = "customer.source.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotsourceDotcreated]
    
    @scala.inline
    def customerDotsourceDotdeleted: typingsSlinky.stripe.stripeStrings.customerDotsourceDotdeleted = "customer.source.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotsourceDotdeleted]
    
    @scala.inline
    def customerDotsourceDotexpiring: typingsSlinky.stripe.stripeStrings.customerDotsourceDotexpiring = "customer.source.expiring".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotsourceDotexpiring]
    
    @scala.inline
    def customerDotsourceDotupdated: typingsSlinky.stripe.stripeStrings.customerDotsourceDotupdated = "customer.source.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotsourceDotupdated]
    
    @scala.inline
    def customerDotsubscriptionDotcreated: typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotcreated = "customer.subscription.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotcreated]
    
    @scala.inline
    def customerDotsubscriptionDotdeleted: typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotdeleted = "customer.subscription.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotdeleted]
    
    @scala.inline
    def customerDotsubscriptionDottrial_will_end: typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDottrial_will_end = "customer.subscription.trial_will_end".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDottrial_will_end]
    
    @scala.inline
    def customerDotsubscriptionDotupdated: typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotupdated = "customer.subscription.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotsubscriptionDotupdated]
    
    @scala.inline
    def customerDottax_idDotcreated: typingsSlinky.stripe.stripeStrings.customerDottax_idDotcreated = "customer.tax_id.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDottax_idDotcreated]
    
    @scala.inline
    def customerDottax_idDotdeleted: typingsSlinky.stripe.stripeStrings.customerDottax_idDotdeleted = "customer.tax_id.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDottax_idDotdeleted]
    
    @scala.inline
    def customerDottax_idDotupdated: typingsSlinky.stripe.stripeStrings.customerDottax_idDotupdated = "customer.tax_id.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDottax_idDotupdated]
    
    @scala.inline
    def customerDotupdated: typingsSlinky.stripe.stripeStrings.customerDotupdated = "customer.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.customerDotupdated]
    
    @scala.inline
    def fileDotcreated: typingsSlinky.stripe.stripeStrings.fileDotcreated = "file.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.fileDotcreated]
    
    @scala.inline
    def invoiceDotcreated: typingsSlinky.stripe.stripeStrings.invoiceDotcreated = "invoice.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotcreated]
    
    @scala.inline
    def invoiceDotdeleted: typingsSlinky.stripe.stripeStrings.invoiceDotdeleted = "invoice.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotdeleted]
    
    @scala.inline
    def invoiceDotfinalized: typingsSlinky.stripe.stripeStrings.invoiceDotfinalized = "invoice.finalized".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotfinalized]
    
    @scala.inline
    def invoiceDotmarked_uncollectible: typingsSlinky.stripe.stripeStrings.invoiceDotmarked_uncollectible = "invoice.marked_uncollectible".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotmarked_uncollectible]
    
    @scala.inline
    def invoiceDotpayment_action_required: typingsSlinky.stripe.stripeStrings.invoiceDotpayment_action_required = "invoice.payment_action_required".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotpayment_action_required]
    
    @scala.inline
    def invoiceDotpayment_failed: typingsSlinky.stripe.stripeStrings.invoiceDotpayment_failed = "invoice.payment_failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotpayment_failed]
    
    @scala.inline
    def invoiceDotpayment_succeeded: typingsSlinky.stripe.stripeStrings.invoiceDotpayment_succeeded = "invoice.payment_succeeded".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotpayment_succeeded]
    
    @scala.inline
    def invoiceDotsent: typingsSlinky.stripe.stripeStrings.invoiceDotsent = "invoice.sent".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotsent]
    
    @scala.inline
    def invoiceDotupcoming: typingsSlinky.stripe.stripeStrings.invoiceDotupcoming = "invoice.upcoming".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotupcoming]
    
    @scala.inline
    def invoiceDotupdated: typingsSlinky.stripe.stripeStrings.invoiceDotupdated = "invoice.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotupdated]
    
    @scala.inline
    def invoiceDotvoided: typingsSlinky.stripe.stripeStrings.invoiceDotvoided = "invoice.voided".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceDotvoided]
    
    @scala.inline
    def invoiceitemDotcreated: typingsSlinky.stripe.stripeStrings.invoiceitemDotcreated = "invoiceitem.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceitemDotcreated]
    
    @scala.inline
    def invoiceitemDotdeleted: typingsSlinky.stripe.stripeStrings.invoiceitemDotdeleted = "invoiceitem.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceitemDotdeleted]
    
    @scala.inline
    def invoiceitemDotupdated: typingsSlinky.stripe.stripeStrings.invoiceitemDotupdated = "invoiceitem.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.invoiceitemDotupdated]
    
    @scala.inline
    def issuing_authorizationDotcreated: typingsSlinky.stripe.stripeStrings.issuing_authorizationDotcreated = "issuing_authorization.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_authorizationDotcreated]
    
    @scala.inline
    def issuing_authorizationDotrequest: typingsSlinky.stripe.stripeStrings.issuing_authorizationDotrequest = "issuing_authorization.request".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_authorizationDotrequest]
    
    @scala.inline
    def issuing_authorizationDotupdated: typingsSlinky.stripe.stripeStrings.issuing_authorizationDotupdated = "issuing_authorization.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_authorizationDotupdated]
    
    @scala.inline
    def issuing_cardDotcreated: typingsSlinky.stripe.stripeStrings.issuing_cardDotcreated = "issuing_card.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_cardDotcreated]
    
    @scala.inline
    def issuing_cardDotupdated: typingsSlinky.stripe.stripeStrings.issuing_cardDotupdated = "issuing_card.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_cardDotupdated]
    
    @scala.inline
    def issuing_cardholderDotcreated: typingsSlinky.stripe.stripeStrings.issuing_cardholderDotcreated = "issuing_cardholder.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_cardholderDotcreated]
    
    @scala.inline
    def issuing_cardholderDotupdated: typingsSlinky.stripe.stripeStrings.issuing_cardholderDotupdated = "issuing_cardholder.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_cardholderDotupdated]
    
    @scala.inline
    def issuing_disputeDotcreated: typingsSlinky.stripe.stripeStrings.issuing_disputeDotcreated = "issuing_dispute.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_disputeDotcreated]
    
    @scala.inline
    def issuing_disputeDotupdated: typingsSlinky.stripe.stripeStrings.issuing_disputeDotupdated = "issuing_dispute.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_disputeDotupdated]
    
    @scala.inline
    def issuing_settlementDotcreated: typingsSlinky.stripe.stripeStrings.issuing_settlementDotcreated = "issuing_settlement.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_settlementDotcreated]
    
    @scala.inline
    def issuing_settlementDotupdated: typingsSlinky.stripe.stripeStrings.issuing_settlementDotupdated = "issuing_settlement.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_settlementDotupdated]
    
    @scala.inline
    def issuing_transactionDotcreated: typingsSlinky.stripe.stripeStrings.issuing_transactionDotcreated = "issuing_transaction.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_transactionDotcreated]
    
    @scala.inline
    def issuing_transactionDotupdated: typingsSlinky.stripe.stripeStrings.issuing_transactionDotupdated = "issuing_transaction.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.issuing_transactionDotupdated]
    
    @scala.inline
    def mandateDotupdated: typingsSlinky.stripe.stripeStrings.mandateDotupdated = "mandate.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.mandateDotupdated]
    
    @scala.inline
    def orderDotcreated: typingsSlinky.stripe.stripeStrings.orderDotcreated = "order.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.orderDotcreated]
    
    @scala.inline
    def orderDotpayment_failed: typingsSlinky.stripe.stripeStrings.orderDotpayment_failed = "order.payment_failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.orderDotpayment_failed]
    
    @scala.inline
    def orderDotpayment_succeeded: typingsSlinky.stripe.stripeStrings.orderDotpayment_succeeded = "order.payment_succeeded".asInstanceOf[typingsSlinky.stripe.stripeStrings.orderDotpayment_succeeded]
    
    @scala.inline
    def orderDotupdated: typingsSlinky.stripe.stripeStrings.orderDotupdated = "order.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.orderDotupdated]
    
    @scala.inline
    def order_returnDotcreated: typingsSlinky.stripe.stripeStrings.order_returnDotcreated = "order_return.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.order_returnDotcreated]
    
    @scala.inline
    def payment_intentDotamount_capturable_updated: typingsSlinky.stripe.stripeStrings.payment_intentDotamount_capturable_updated = "payment_intent.amount_capturable_updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.payment_intentDotamount_capturable_updated]
    
    @scala.inline
    def payment_intentDotcanceled: typingsSlinky.stripe.stripeStrings.payment_intentDotcanceled = "payment_intent.canceled".asInstanceOf[typingsSlinky.stripe.stripeStrings.payment_intentDotcanceled]
    
    @scala.inline
    def payment_intentDotcreated: typingsSlinky.stripe.stripeStrings.payment_intentDotcreated = "payment_intent.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.payment_intentDotcreated]
    
    @scala.inline
    def payment_intentDotpayment_failed: typingsSlinky.stripe.stripeStrings.payment_intentDotpayment_failed = "payment_intent.payment_failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.payment_intentDotpayment_failed]
    
    @scala.inline
    def payment_intentDotsucceeded: typingsSlinky.stripe.stripeStrings.payment_intentDotsucceeded = "payment_intent.succeeded".asInstanceOf[typingsSlinky.stripe.stripeStrings.payment_intentDotsucceeded]
    
    @scala.inline
    def payment_methodDotattached: typingsSlinky.stripe.stripeStrings.payment_methodDotattached = "payment_method.attached".asInstanceOf[typingsSlinky.stripe.stripeStrings.payment_methodDotattached]
    
    @scala.inline
    def payment_methodDotcard_automatically_updated: typingsSlinky.stripe.stripeStrings.payment_methodDotcard_automatically_updated = "payment_method.card_automatically_updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.payment_methodDotcard_automatically_updated]
    
    @scala.inline
    def payment_methodDotdetached: typingsSlinky.stripe.stripeStrings.payment_methodDotdetached = "payment_method.detached".asInstanceOf[typingsSlinky.stripe.stripeStrings.payment_methodDotdetached]
    
    @scala.inline
    def payment_methodDotupdated: typingsSlinky.stripe.stripeStrings.payment_methodDotupdated = "payment_method.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.payment_methodDotupdated]
    
    @scala.inline
    def payoutDotcanceled: typingsSlinky.stripe.stripeStrings.payoutDotcanceled = "payout.canceled".asInstanceOf[typingsSlinky.stripe.stripeStrings.payoutDotcanceled]
    
    @scala.inline
    def payoutDotcreated: typingsSlinky.stripe.stripeStrings.payoutDotcreated = "payout.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.payoutDotcreated]
    
    @scala.inline
    def payoutDotfailed: typingsSlinky.stripe.stripeStrings.payoutDotfailed = "payout.failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.payoutDotfailed]
    
    @scala.inline
    def payoutDotpaid: typingsSlinky.stripe.stripeStrings.payoutDotpaid = "payout.paid".asInstanceOf[typingsSlinky.stripe.stripeStrings.payoutDotpaid]
    
    @scala.inline
    def payoutDotupdated: typingsSlinky.stripe.stripeStrings.payoutDotupdated = "payout.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.payoutDotupdated]
    
    @scala.inline
    def personDotcreated: typingsSlinky.stripe.stripeStrings.personDotcreated = "person.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.personDotcreated]
    
    @scala.inline
    def personDotdeleted: typingsSlinky.stripe.stripeStrings.personDotdeleted = "person.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.personDotdeleted]
    
    @scala.inline
    def personDotupdated: typingsSlinky.stripe.stripeStrings.personDotupdated = "person.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.personDotupdated]
    
    @scala.inline
    def planDotcreated: typingsSlinky.stripe.stripeStrings.planDotcreated = "plan.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.planDotcreated]
    
    @scala.inline
    def planDotdeleted: typingsSlinky.stripe.stripeStrings.planDotdeleted = "plan.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.planDotdeleted]
    
    @scala.inline
    def planDotupdated: typingsSlinky.stripe.stripeStrings.planDotupdated = "plan.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.planDotupdated]
    
    @scala.inline
    def productDotcreated: typingsSlinky.stripe.stripeStrings.productDotcreated = "product.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.productDotcreated]
    
    @scala.inline
    def productDotdeleted: typingsSlinky.stripe.stripeStrings.productDotdeleted = "product.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.productDotdeleted]
    
    @scala.inline
    def productDotupdated: typingsSlinky.stripe.stripeStrings.productDotupdated = "product.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.productDotupdated]
    
    @scala.inline
    def radarDotearly_fraud_warningDotcreated: typingsSlinky.stripe.stripeStrings.radarDotearly_fraud_warningDotcreated = "radar.early_fraud_warning.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.radarDotearly_fraud_warningDotcreated]
    
    @scala.inline
    def radarDotearly_fraud_warningDotupdated: typingsSlinky.stripe.stripeStrings.radarDotearly_fraud_warningDotupdated = "radar.early_fraud_warning.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.radarDotearly_fraud_warningDotupdated]
    
    @scala.inline
    def recipientDotcreated: typingsSlinky.stripe.stripeStrings.recipientDotcreated = "recipient.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.recipientDotcreated]
    
    @scala.inline
    def recipientDotdeleted: typingsSlinky.stripe.stripeStrings.recipientDotdeleted = "recipient.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.recipientDotdeleted]
    
    @scala.inline
    def recipientDotupdated: typingsSlinky.stripe.stripeStrings.recipientDotupdated = "recipient.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.recipientDotupdated]
    
    @scala.inline
    def reportingDotreport_runDotfailed: typingsSlinky.stripe.stripeStrings.reportingDotreport_runDotfailed = "reporting.report_run.failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.reportingDotreport_runDotfailed]
    
    @scala.inline
    def reportingDotreport_runDotsucceeded: typingsSlinky.stripe.stripeStrings.reportingDotreport_runDotsucceeded = "reporting.report_run.succeeded".asInstanceOf[typingsSlinky.stripe.stripeStrings.reportingDotreport_runDotsucceeded]
    
    @scala.inline
    def reportingDotreport_typeDotupdated: typingsSlinky.stripe.stripeStrings.reportingDotreport_typeDotupdated = "reporting.report_type.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.reportingDotreport_typeDotupdated]
    
    @scala.inline
    def reviewDotclosed: typingsSlinky.stripe.stripeStrings.reviewDotclosed = "review.closed".asInstanceOf[typingsSlinky.stripe.stripeStrings.reviewDotclosed]
    
    @scala.inline
    def reviewDotopened: typingsSlinky.stripe.stripeStrings.reviewDotopened = "review.opened".asInstanceOf[typingsSlinky.stripe.stripeStrings.reviewDotopened]
    
    @scala.inline
    def setup_intentDotcanceled: typingsSlinky.stripe.stripeStrings.setup_intentDotcanceled = "setup_intent.canceled".asInstanceOf[typingsSlinky.stripe.stripeStrings.setup_intentDotcanceled]
    
    @scala.inline
    def setup_intentDotcreated: typingsSlinky.stripe.stripeStrings.setup_intentDotcreated = "setup_intent.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.setup_intentDotcreated]
    
    @scala.inline
    def setup_intentDotsetup_failed: typingsSlinky.stripe.stripeStrings.setup_intentDotsetup_failed = "setup_intent.setup_failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.setup_intentDotsetup_failed]
    
    @scala.inline
    def setup_intentDotsucceeded: typingsSlinky.stripe.stripeStrings.setup_intentDotsucceeded = "setup_intent.succeeded".asInstanceOf[typingsSlinky.stripe.stripeStrings.setup_intentDotsucceeded]
    
    @scala.inline
    def sigmaDotscheduled_query_runDotcreated: typingsSlinky.stripe.stripeStrings.sigmaDotscheduled_query_runDotcreated = "sigma.scheduled_query_run.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.sigmaDotscheduled_query_runDotcreated]
    
    @scala.inline
    def skuDotcreated: typingsSlinky.stripe.stripeStrings.skuDotcreated = "sku.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.skuDotcreated]
    
    @scala.inline
    def skuDotdeleted: typingsSlinky.stripe.stripeStrings.skuDotdeleted = "sku.deleted".asInstanceOf[typingsSlinky.stripe.stripeStrings.skuDotdeleted]
    
    @scala.inline
    def skuDotupdated: typingsSlinky.stripe.stripeStrings.skuDotupdated = "sku.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.skuDotupdated]
    
    @scala.inline
    def sourceDotcanceled: typingsSlinky.stripe.stripeStrings.sourceDotcanceled = "source.canceled".asInstanceOf[typingsSlinky.stripe.stripeStrings.sourceDotcanceled]
    
    @scala.inline
    def sourceDotchargeable: typingsSlinky.stripe.stripeStrings.sourceDotchargeable = "source.chargeable".asInstanceOf[typingsSlinky.stripe.stripeStrings.sourceDotchargeable]
    
    @scala.inline
    def sourceDotfailed: typingsSlinky.stripe.stripeStrings.sourceDotfailed = "source.failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.sourceDotfailed]
    
    @scala.inline
    def sourceDotmandate_notification: typingsSlinky.stripe.stripeStrings.sourceDotmandate_notification = "source.mandate_notification".asInstanceOf[typingsSlinky.stripe.stripeStrings.sourceDotmandate_notification]
    
    @scala.inline
    def sourceDotrefund_attributes_required: typingsSlinky.stripe.stripeStrings.sourceDotrefund_attributes_required = "source.refund_attributes_required".asInstanceOf[typingsSlinky.stripe.stripeStrings.sourceDotrefund_attributes_required]
    
    @scala.inline
    def sourceDottransactionDotcreated: typingsSlinky.stripe.stripeStrings.sourceDottransactionDotcreated = "source.transaction.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.sourceDottransactionDotcreated]
    
    @scala.inline
    def sourceDottransactionDotupdated: typingsSlinky.stripe.stripeStrings.sourceDottransactionDotupdated = "source.transaction.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.sourceDottransactionDotupdated]
    
    @scala.inline
    def subscription_scheduleDotaborted: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotaborted = "subscription_schedule.aborted".asInstanceOf[typingsSlinky.stripe.stripeStrings.subscription_scheduleDotaborted]
    
    @scala.inline
    def subscription_scheduleDotcanceled: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcanceled = "subscription_schedule.canceled".asInstanceOf[typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcanceled]
    
    @scala.inline
    def subscription_scheduleDotcompleted: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcompleted = "subscription_schedule.completed".asInstanceOf[typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcompleted]
    
    @scala.inline
    def subscription_scheduleDotcreated: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcreated = "subscription_schedule.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.subscription_scheduleDotcreated]
    
    @scala.inline
    def subscription_scheduleDotexpiring: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotexpiring = "subscription_schedule.expiring".asInstanceOf[typingsSlinky.stripe.stripeStrings.subscription_scheduleDotexpiring]
    
    @scala.inline
    def subscription_scheduleDotreleased: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotreleased = "subscription_schedule.released".asInstanceOf[typingsSlinky.stripe.stripeStrings.subscription_scheduleDotreleased]
    
    @scala.inline
    def subscription_scheduleDotupdated: typingsSlinky.stripe.stripeStrings.subscription_scheduleDotupdated = "subscription_schedule.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.subscription_scheduleDotupdated]
    
    @scala.inline
    def tax_rateDotcreated: typingsSlinky.stripe.stripeStrings.tax_rateDotcreated = "tax_rate.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.tax_rateDotcreated]
    
    @scala.inline
    def tax_rateDotupdated: typingsSlinky.stripe.stripeStrings.tax_rateDotupdated = "tax_rate.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.tax_rateDotupdated]
    
    @scala.inline
    def topupDotcreated: typingsSlinky.stripe.stripeStrings.topupDotcreated = "topup.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.topupDotcreated]
    
    @scala.inline
    def topupDotfailed: typingsSlinky.stripe.stripeStrings.topupDotfailed = "topup.failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.topupDotfailed]
    
    @scala.inline
    def topupDotreversed: typingsSlinky.stripe.stripeStrings.topupDotreversed = "topup.reversed".asInstanceOf[typingsSlinky.stripe.stripeStrings.topupDotreversed]
    
    @scala.inline
    def topupDotsucceeded: typingsSlinky.stripe.stripeStrings.topupDotsucceeded = "topup.succeeded".asInstanceOf[typingsSlinky.stripe.stripeStrings.topupDotsucceeded]
    
    @scala.inline
    def transferDotcreated: typingsSlinky.stripe.stripeStrings.transferDotcreated = "transfer.created".asInstanceOf[typingsSlinky.stripe.stripeStrings.transferDotcreated]
    
    @scala.inline
    def transferDotfailed: typingsSlinky.stripe.stripeStrings.transferDotfailed = "transfer.failed".asInstanceOf[typingsSlinky.stripe.stripeStrings.transferDotfailed]
    
    @scala.inline
    def transferDotpaid: typingsSlinky.stripe.stripeStrings.transferDotpaid = "transfer.paid".asInstanceOf[typingsSlinky.stripe.stripeStrings.transferDotpaid]
    
    @scala.inline
    def transferDotreversed: typingsSlinky.stripe.stripeStrings.transferDotreversed = "transfer.reversed".asInstanceOf[typingsSlinky.stripe.stripeStrings.transferDotreversed]
    
    @scala.inline
    def transferDotupdated: typingsSlinky.stripe.stripeStrings.transferDotupdated = "transfer.updated".asInstanceOf[typingsSlinky.stripe.stripeStrings.transferDotupdated]
  }
  
  @js.native
  trait IEvent extends IResourceObject {
    
    /**
      * The connected account that originated the event.
      * CONNECT ONLY
      */
    var account: js.UndefOr[String] = js.native
    
    /**
      * The Stripe API version used to render data.
      * Note: this property is populated for events on or after October 31, 2014.
      */
    var api_version: String = js.native
    
    var created: Double = js.native
    
    /**
      * Hash containing data associated with the event.
      */
    var data: Previousattributes = js.native
    
    var livemode: Boolean = js.native
    
    /**
      * Value is "event"
      */
    @JSName("object")
    var object_IEvent: event = js.native
    
    /**
      * Number of webhooks yet to be delivered successfully (return a 20x response) to the URLs you’ve specified.
      *
      * positive integer or zero
      */
    var pending_webhooks: Double = js.native
    
    /**
      * Information on the API request that instigated the event.
      */
    var request: Id = js.native
    
    /**
      * Description of the event: e.g. invoice.created, charge.refunded, etc.
      */
    var `type`: String = js.native
  }
  object IEvent {
    
    @scala.inline
    def apply(
      api_version: String,
      created: Double,
      data: Previousattributes,
      id: String,
      livemode: Boolean,
      `object`: event,
      pending_webhooks: Double,
      request: Id,
      `type`: String
    ): IEvent = {
      val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], pending_webhooks = pending_webhooks.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEvent]
    }
    
    @scala.inline
    implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      @scala.inline
      def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: Previousattributes): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: event): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending_webhooks(value: Double): Self = StObject.set(x, "pending_webhooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Id): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IEventListOptions extends IListOptionsCreated {
    
    /**
      * A string containing a specific event name, or group of events using * as a
      * wildcard. The list will be filtered to include only events with a matching
      * event property
      */
    var `type`: String = js.native
  }
  object IEventListOptions {
    
    @scala.inline
    def apply(`type`: String): IEventListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEventListOptions]
    }
    
    @scala.inline
    implicit class IEventListOptionsMutableBuilder[Self <: IEventListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
