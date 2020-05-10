package typingsSlinky.stripe

import typingsSlinky.stripe.mod.cards.ICardSourceCreationOptionsExtended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCard extends js.Object {
  var card: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.native
}

object AnonCard {
  @scala.inline
  def apply(): AnonCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCard]
  }
  @scala.inline
  implicit class AnonCardOps[Self <: AnonCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: String | ICardSourceCreationOptionsExtended): Self = {
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

