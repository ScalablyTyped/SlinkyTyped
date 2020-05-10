package typingsSlinky.stripe.mod.disputes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisputeEvidence extends js.Object {
  /**
    * Any server or activity logs showing proof that the customer accessed or downloaded the purchased
    * digital product. This information should include IP addresses, corresponding timestamps, and any
    * detailed recorded activity.
    */
  var access_activity_log: js.UndefOr[String] = js.native
  /**
    * The billing address provided by the customer.
    */
  var billing_address: js.UndefOr[String] = js.native
  /**
    * (ID of a file) Your subscription cancellation policy, as shown to the customer. [Expandable]
    */
  var cancellation_policy: js.UndefOr[String] = js.native
  /**
    * An explanation of how and when the customer was shown your refund policy prior to purchase.
    */
  var cancellation_policy_disclosure: js.UndefOr[String] = js.native
  /**
    * A justification for why the customer's subscription was not canceled.
    */
  var cancellation_rebuttal: js.UndefOr[String] = js.native
  /**
    * (ID of a file) Any communication with the customer that you feel is relevant to your case (for
    * example emails proving that they received the product or service, or demonstrating their use of or
    * satisfaction with the product or service).
    */
  var customer_communication: js.UndefOr[String] = js.native
  /**
    * The email address of the customer.
    */
  var customer_email_address: js.UndefOr[String] = js.native
  /**
    * The name of the customer.
    */
  var customer_name: js.UndefOr[String] = js.native
  /**
    * The IP address that the customer used when making the purchase.
    */
  var customer_purchase_ip: js.UndefOr[String] = js.native
  /**
    * (ID of a file) A relevant document or contract showing the customer's signature. [Expandable]
    */
  var customer_signature: js.UndefOr[String] = js.native
  /**
    * (ID of a file) Documentation for the prior charge that can uniquely identify the charge,
    * such as a receipt, shipping label, work order, etc. This document should be paired with a similar
    * document from the disputed payment that proves the two payments are separate. [Expandable]
    */
  var duplicate_charge_documentation: js.UndefOr[String] = js.native
  /**
    * An explanation of the difference between the disputed charge and the prior charge that appears to be a duplicate.
    */
  var duplicate_charge_explanation: js.UndefOr[String] = js.native
  /**
    * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge.
    */
  var duplicate_charge_id: js.UndefOr[String] = js.native
  /**
    * A description of the product or service which was sold.
    */
  var product_description: js.UndefOr[String] = js.native
  /**
    * (ID of a file) Any receipt or message sent to the customer notifying them of the charge. [Expandable]
    */
  var receipt: js.UndefOr[String] = js.native
  /**
    * (ID of a file) Your refund policy, as shown to the customer. [Expandable]
    */
  var refund_policy: js.UndefOr[String] = js.native
  /**
    * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
    */
  var refund_policy_disclosure: js.UndefOr[String] = js.native
  /**
    * A justification for why the customer is not entitled to a refund.
    */
  var refund_refusal_explanation: js.UndefOr[String] = js.native
  /**
    * The date on which the customer received or began receiving the purchased service, in a clear human-readable format.
    */
  var service_date: js.UndefOr[String] = js.native
  /**
    * (ID of a file) Documentation showing proof that a service was provided to the customer. This could
    * include a copy of a signed contract, work order, or other form of written agreement.
    */
  var service_documentation: js.UndefOr[String] = js.native
  /**
    * The address to which a physical product was shipped. You should try to include as much complete address information as possible.
    */
  var shipping_address: js.UndefOr[String] = js.native
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If multiple carriers were used
    * for this purchase, please separate them with commas.
    */
  var shipping_carrier: js.UndefOr[String] = js.native
  /**
    * The date on which a physical product began its route to the shipping address, in a clear human-readable format.
    */
  var shipping_date: js.UndefOr[String] = js.native
  /**
    * (ID of a file) Documentation showing proof that a product was shipped to the customer at the same address
    * the customer provided to you. This could include a copy of the shipment receipt, shipping label, etc, and should
    * show the full shipping address of the customer, if possible. [Expandable]
    */
  var shipping_documentation: js.UndefOr[String] = js.native
  /**
    * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers
    * were generated for this purchase, please separate them with commas.
    */
  var shipping_tracking_number: js.UndefOr[String] = js.native
  /**
    * (ID of a file) Any additional evidence or statements. [Expandable]
    */
  var uncategorized_file: js.UndefOr[String] = js.native
  /**
    * Any additional evidence or statements.
    */
  var uncategorized_text: js.UndefOr[String] = js.native
}

object IDisputeEvidence {
  @scala.inline
  def apply(): IDisputeEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDisputeEvidence]
  }
  @scala.inline
  implicit class IDisputeEvidenceOps[Self <: IDisputeEvidence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_activity_log(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_activity_log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_activity_log: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_activity_log")(js.undefined)
        ret
    }
    @scala.inline
    def withBilling_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_address")(js.undefined)
        ret
    }
    @scala.inline
    def withCancellation_policy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellation_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_policy")(js.undefined)
        ret
    }
    @scala.inline
    def withCancellation_policy_disclosure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_policy_disclosure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellation_policy_disclosure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_policy_disclosure")(js.undefined)
        ret
    }
    @scala.inline
    def withCancellation_rebuttal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_rebuttal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellation_rebuttal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_rebuttal")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer_communication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_communication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_communication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_communication")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer_email_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_email_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_email_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_email_address")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_name")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer_purchase_ip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_purchase_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_purchase_ip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_purchase_ip")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer_signature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_signature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_signature")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicate_charge_documentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate_charge_documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicate_charge_documentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate_charge_documentation")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicate_charge_explanation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate_charge_explanation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicate_charge_explanation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate_charge_explanation")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicate_charge_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate_charge_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicate_charge_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate_charge_id")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product_description")(js.undefined)
        ret
    }
    @scala.inline
    def withReceipt(value: String): Self = {
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
    def withRefund_policy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_policy")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund_policy_disclosure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_policy_disclosure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_policy_disclosure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_policy_disclosure")(js.undefined)
        ret
    }
    @scala.inline
    def withRefund_refusal_explanation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_refusal_explanation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_refusal_explanation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_refusal_explanation")(js.undefined)
        ret
    }
    @scala.inline
    def withService_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_date")(js.undefined)
        ret
    }
    @scala.inline
    def withService_documentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService_documentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_documentation")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_address")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_carrier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_carrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_carrier")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_date")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_documentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_documentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_documentation")(js.undefined)
        ret
    }
    @scala.inline
    def withShipping_tracking_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_tracking_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipping_tracking_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping_tracking_number")(js.undefined)
        ret
    }
    @scala.inline
    def withUncategorized_file(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncategorized_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncategorized_file: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncategorized_file")(js.undefined)
        ret
    }
    @scala.inline
    def withUncategorized_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncategorized_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncategorized_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncategorized_text")(js.undefined)
        ret
    }
  }
  
}

