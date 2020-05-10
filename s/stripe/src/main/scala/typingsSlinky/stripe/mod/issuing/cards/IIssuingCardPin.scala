package typingsSlinky.stripe.mod.issuing.cards

import typingsSlinky.stripe.stripeStrings.active
import typingsSlinky.stripe.stripeStrings.blocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about the PIN on the card.
  */
@js.native
trait IIssuingCardPin extends js.Object {
  var status: blocked | active = js.native
}

object IIssuingCardPin {
  @scala.inline
  def apply(status: blocked | active): IIssuingCardPin = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardPin]
  }
  @scala.inline
  implicit class IIssuingCardPinOps[Self <: IIssuingCardPin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: blocked | active): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

