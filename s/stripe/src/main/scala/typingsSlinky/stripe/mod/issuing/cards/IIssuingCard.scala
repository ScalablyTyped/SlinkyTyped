package typingsSlinky.stripe.mod.issuing.cards

import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.issuing.cardholders.ICardholder
import typingsSlinky.stripe.stripeStrings.issuingDotcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can create physical or virtual cards that are issued to cardholders.
  */
@js.native
trait IIssuingCard extends IResourceObject {
  /**
    * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
    */
  var authorization_controls: ICardAuthorizationControls = js.native
  /**
    * The brand of the card.
    */
  var brand: String = js.native
  /**
    * The Cardholder object to which the card belongs.
    */
  var cardholder: ICardholder = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * The expiration month of the card.
    */
  var exp_month: Double = js.native
  /**
    * The expiration year of the card.
    */
  var exp_year: Double = js.native
  /**
    * The last 4 digits of the card number.
    */
  var last4: String = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * The name of the cardholder, printed on the card.
    */
  var name: String = js.native
  /**
    * Value is "issuing.card"
    */
  @JSName("object")
  var object_IIssuingCard: issuingDotcard = js.native
  /**
    * Metadata about the PIN on the card.
    */
  var pin: IIssuingCardPin = js.native
  /**
    * The card this card replaces, if any.
    */
  var replacement_for: String | IIssuingCard = js.native
  /**
    * Why the card that this card replaces (if any) needed to be replaced. One of damage, expiration, loss, or theft.
    */
  var replacement_reason: IssuingCardReplacementReason = js.native
  /**
    * Where and how the card will be shipped.
    */
  var shipping: IIssuingCardShippingDetails = js.native
  /**
    * One of active, inactive, canceled, lost, or stolen.
    */
  var status: IssuingCardStatus = js.native
  /**
    * One of virtual or physical.
    */
  var `type`: IssuingCardType = js.native
}

object IIssuingCard {
  @scala.inline
  def apply(
    authorization_controls: ICardAuthorizationControls,
    brand: String,
    cardholder: ICardholder,
    created: Double,
    currency: String,
    exp_month: Double,
    exp_year: Double,
    id: String,
    last4: String,
    livemode: Boolean,
    metadata: IMetadata,
    name: String,
    `object`: issuingDotcard,
    pin: IIssuingCardPin,
    replacement_for: String | IIssuingCard,
    replacement_reason: IssuingCardReplacementReason,
    shipping: IIssuingCardShippingDetails,
    status: IssuingCardStatus,
    `type`: IssuingCardType
  ): IIssuingCard = {
    val __obj = js.Dynamic.literal(authorization_controls = authorization_controls.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], cardholder = cardholder.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], replacement_for = replacement_for.asInstanceOf[js.Any], replacement_reason = replacement_reason.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCard]
  }
  @scala.inline
  implicit class IIssuingCardOps[Self <: IIssuingCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization_controls(value: ICardAuthorizationControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization_controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardholder(value: ICardholder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholder")(value.asInstanceOf[js.Any])
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
    def withExp_month(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExp_year(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp_year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
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
    def withObject(value: issuingDotcard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPin(value: IIssuingCardPin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacement_for(value: String | IIssuingCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement_for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacement_reason(value: IssuingCardReplacementReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShipping(value: IIssuingCardShippingDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: IssuingCardStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: IssuingCardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

