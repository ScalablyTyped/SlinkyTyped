package typingsSlinky.stripe.mod.tokens

import typingsSlinky.stripe.mod.cards.ICardSourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardTokenCreationOptions extends ITokenCreationOptionsBase {
  /**
    * The card this token will represent. If you also pass in a customer,
    * the card must be the ID of a card belonging to the customer.
    * Otherwise, if you do not pass a customer, a object containing a
    * user's credit card details, with the options described below.
    */
  var card: js.UndefOr[String | ICardSourceCreationOptions] = js.native
}

object ICardTokenCreationOptions {
  @scala.inline
  def apply(): ICardTokenCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardTokenCreationOptions]
  }
  @scala.inline
  implicit class ICardTokenCreationOptionsOps[Self <: ICardTokenCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: String | ICardSourceCreationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(js.undefined)
        ret
    }
  }
  
}

