package typingsSlinky.stripe.mod.issuing.cardholders

import typingsSlinky.stripe.AnonAddressName
import typingsSlinky.stripe.AnonPastdue
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.stripeStrings.issuingDotcardholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Issuing Cardholder object represents an individual or business entity who is issued cards.
  */
@js.native
trait ICardholder extends IResourceObject {
  var authorization_controls: ICardholderAuthorizationControls = js.native
  /**
    * The cardholder’s billing address.
    */
  var billing: AnonAddressName = js.native
  /**
    * Additional information about a business_entity cardholder.
    */
  var company: ICardholderBusinessEntity = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * The cardholder’s email address.
    */
  var email: String = js.native
  /**
    * Additional information about an individual cardholder.
    */
  var individual: ICardholderIndividual = js.native
  /**
    * Whether or not this cardholder is the default cardholder.
    */
  var is_default: Boolean = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * The cardholder’s name. This will be printed on cards issued to them.
    */
  var name: String = js.native
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_ICardholder: issuingDotcardholder = js.native
  /**
    * The cardholder’s phone number.
    */
  var phone_number: String = js.native
  /**
    * Information about verification requirements for the cardholder, including what information needs to be collected.
    */
  var requirements: AnonPastdue = js.native
  /**
    * One of active, inactive, or blocked.
    */
  var status: CardholderStatus = js.native
  /**
    * One of individual or business_entity.
    */
  var `type`: CardholderType = js.native
}

object ICardholder {
  @scala.inline
  def apply(
    authorization_controls: ICardholderAuthorizationControls,
    billing: AnonAddressName,
    company: ICardholderBusinessEntity,
    created: Double,
    email: String,
    id: String,
    individual: ICardholderIndividual,
    is_default: Boolean,
    livemode: Boolean,
    metadata: IMetadata,
    name: String,
    `object`: issuingDotcardholder,
    phone_number: String,
    requirements: AnonPastdue,
    status: CardholderStatus,
    `type`: CardholderType
  ): ICardholder = {
    val __obj = js.Dynamic.literal(authorization_controls = authorization_controls.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], is_default = is_default.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholder]
  }
  @scala.inline
  implicit class ICardholderOps[Self <: ICardholder] (val x: Self) extends AnyVal {
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
    def withBilling(value: AnonAddressName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompany(value: ICardholderBusinessEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndividual(value: ICardholderIndividual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_default(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_default")(value.asInstanceOf[js.Any])
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: issuingDotcardholder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequirements(value: AnonPastdue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: CardholderStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CardholderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

