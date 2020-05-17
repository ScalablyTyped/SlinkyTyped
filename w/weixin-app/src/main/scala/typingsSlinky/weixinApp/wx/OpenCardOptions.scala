package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.CardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenCardOptions
  extends BaseOptions[js.Any, js.Any] {
  var cardList: js.Array[CardId] = js.native
}

object OpenCardOptions {
  @scala.inline
  def apply(cardList: js.Array[CardId]): OpenCardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardOptions]
  }
  @scala.inline
  implicit class OpenCardOptionsOps[Self <: OpenCardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardList(value: js.Array[CardId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

