package typingsSlinky.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardId extends js.Object {
  var cardId: String = js.native
  var code: String = js.native
}

object CardId {
  @scala.inline
  def apply(cardId: String, code: String): CardId = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardId]
  }
  @scala.inline
  implicit class CardIdOps[Self <: CardId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

