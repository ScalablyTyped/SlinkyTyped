package typingsSlinky.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card extends js.Object {
  var card: String = js.native
}

object Card {
  @scala.inline
  def apply(card: String): Card = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  @scala.inline
  implicit class CardOps[Self <: Card] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

