package typingsSlinky.stripe.mod.issuing.cards

import typingsSlinky.stripe.stripeStrings.issuingDotcard_details
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIssuingCardDetails extends js.Object {
  /**
    * The card object
    */
  var card: IIssuingCard = js.native
  /**
    * The CVC of the card.
    */
  var cvc: String = js.native
  /**
    * The expiration month of the card.
    */
  var exp_month: Double = js.native
  /**
    * The expiration year of the card.
    */
  var exp_year: Double = js.native
  /**
    * The card number.
    */
  var number: String = js.native
  /**
    * Value is "object.card"
    */
  var `object`: issuingDotcard_details = js.native
}

object IIssuingCardDetails {
  @scala.inline
  def apply(
    card: IIssuingCard,
    cvc: String,
    exp_month: Double,
    exp_year: Double,
    number: String,
    `object`: issuingDotcard_details
  ): IIssuingCardDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], cvc = cvc.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardDetails]
  }
  @scala.inline
  implicit class IIssuingCardDetailsOps[Self <: IIssuingCardDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: IIssuingCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCvc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvc")(value.asInstanceOf[js.Any])
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
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: issuingDotcard_details): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

