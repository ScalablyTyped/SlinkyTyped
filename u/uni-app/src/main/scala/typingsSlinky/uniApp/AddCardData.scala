package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCardData extends js.Object {
  /**
    * 卡券的扩展参数
    */
  var cardExt: js.UndefOr[String] = js.native
  /**
    * 卡券 id
    */
  var cardId: js.UndefOr[String] = js.native
}

object AddCardData {
  @scala.inline
  def apply(): AddCardData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCardData]
  }
  @scala.inline
  implicit class AddCardDataOps[Self <: AddCardData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardExt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardExt")(js.undefined)
        ret
    }
    @scala.inline
    def withCardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardId")(js.undefined)
        ret
    }
  }
  
}

