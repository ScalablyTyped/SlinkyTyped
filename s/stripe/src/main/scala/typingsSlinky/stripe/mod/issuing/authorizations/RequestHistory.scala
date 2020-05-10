package typingsSlinky.stripe.mod.issuing.authorizations

import typingsSlinky.stripe.AnonEntity
import typingsSlinky.stripe.stripeStrings.account_compliance_disabled
import typingsSlinky.stripe.stripeStrings.account_inactive
import typingsSlinky.stripe.stripeStrings.authentication_failed
import typingsSlinky.stripe.stripeStrings.authorization_controls
import typingsSlinky.stripe.stripeStrings.card_active
import typingsSlinky.stripe.stripeStrings.card_inactive
import typingsSlinky.stripe.stripeStrings.insufficient_funds
import typingsSlinky.stripe.stripeStrings.suspected_fraud
import typingsSlinky.stripe.stripeStrings.webhook_approved
import typingsSlinky.stripe.stripeStrings.webhook_declined
import typingsSlinky.stripe.stripeStrings.webhook_timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHistory extends js.Object {
  /**
    * Whether this request was approved.
    */
  var approved: Boolean = js.native
  /**
    * The amount that was authorized at the time of this request
    */
  var authorized_amount: Double = js.native
  /**
    * The currency that was presented to the cardholder for the authorization. Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var authorized_currency: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * The amount Stripe held from your account to fund the authorization, if the request was approved
    */
  var held_amount: Double = js.native
  /**
    * The currency of the held amount
    */
  var held_currency: String = js.native
  /**
    * One of authentication_failed, authorization_controls, card_active, card_inactive, insufficient_funds, account_compliance_disabled, account_inactive, suspected_fraud, webhook_approved, webhook_declined, or webhook_timeout.
    */
  var reason: authentication_failed | authorization_controls | card_active | card_inactive | insufficient_funds | account_compliance_disabled | account_inactive | suspected_fraud | webhook_approved | webhook_declined | webhook_timeout = js.native
  /**
    * When an authorization is declined due to authorization_controls, this array contains details about the authorization controls that were violated. Otherwise, it is empty.
    */
  var violated_authorization_controls: AnonEntity = js.native
}

object RequestHistory {
  @scala.inline
  def apply(
    approved: Boolean,
    authorized_amount: Double,
    authorized_currency: String,
    created: Double,
    held_amount: Double,
    held_currency: String,
    reason: authentication_failed | authorization_controls | card_active | card_inactive | insufficient_funds | account_compliance_disabled | account_inactive | suspected_fraud | webhook_approved | webhook_declined | webhook_timeout,
    violated_authorization_controls: AnonEntity
  ): RequestHistory = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], authorized_amount = authorized_amount.asInstanceOf[js.Any], authorized_currency = authorized_currency.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], held_amount = held_amount.asInstanceOf[js.Any], held_currency = held_currency.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], violated_authorization_controls = violated_authorization_controls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestHistory]
  }
  @scala.inline
  implicit class RequestHistoryOps[Self <: RequestHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorized_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorized_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorized_currency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorized_currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeld_amount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("held_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeld_currency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("held_currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(
      value: authentication_failed | authorization_controls | card_active | card_inactive | insufficient_funds | account_compliance_disabled | account_inactive | suspected_fraud | webhook_approved | webhook_declined | webhook_timeout
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViolated_authorization_controls(value: AnonEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violated_authorization_controls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

