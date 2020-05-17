package typingsSlinky.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cards extends js.Object {
  var cards: js.UndefOr[Cscrequired] = js.native
  var wallet: js.UndefOr[Allowed] = js.native
}

object Cards {
  @scala.inline
  def apply(): Cards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cards]
  }
  @scala.inline
  implicit class CardsOps[Self <: Cards] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCards(value: Cscrequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(js.undefined)
        ret
    }
    @scala.inline
    def withWallet(value: Allowed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWallet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallet")(js.undefined)
        ret
    }
  }
  
}

