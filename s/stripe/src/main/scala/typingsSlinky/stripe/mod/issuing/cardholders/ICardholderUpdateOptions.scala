package typingsSlinky.stripe.mod.issuing.cardholders

import typingsSlinky.std.Exclude
import typingsSlinky.stripe.AnonAddressICardholderBillingAddress
import typingsSlinky.stripe.mod.IOptionsMetadata
import typingsSlinky.stripe.stripeStrings.blocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardholderUpdateOptions extends js.Object {
  /**
    * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
    */
  var authorization_controls: js.UndefOr[ICardholderAuthorizationControls] = js.native
  /**
    * The cardholder’s billing address.
    */
  var billing: js.UndefOr[AnonAddressICardholderBillingAddress] = js.native
  /**
    * Additional information about a business_entity cardholder.
    */
  var company: js.UndefOr[ICardholderBusinessEntity] = js.native
  /**
    * The cardholder’s email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Additional information about an individual cardholder.
    */
  var individual: js.UndefOr[ICardholderIndividual] = js.native
  /**
    * Specifies whether to set this as the default cardholder.
    */
  var is_default: js.UndefOr[Boolean] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * The cardholder’s phone number.
    */
  var phone_number: js.UndefOr[String] = js.native
  /**
    * Specifies whether to permit authorizations on this cardholder’s cards. Possible values are active or inactive.
    */
  var status: js.UndefOr[Exclude[CardholderStatus, blocked]] = js.native
}

object ICardholderUpdateOptions {
  @scala.inline
  def apply(): ICardholderUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardholderUpdateOptions]
  }
  @scala.inline
  implicit class ICardholderUpdateOptionsOps[Self <: ICardholderUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization_controls(value: ICardholderAuthorizationControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization_controls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_controls")(js.undefined)
        ret
    }
    @scala.inline
    def withBilling(value: AnonAddressICardholderBillingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany(value: ICardholderBusinessEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withIndividual(value: ICardholderIndividual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndividual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_default(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_default: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_default")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: IOptionsMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Exclude[CardholderStatus, blocked]): Self = {
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
  }
  
}

