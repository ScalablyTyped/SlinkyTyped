package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIban extends js.Object {
  var iban: js.UndefOr[String] = js.native
  var ideal: js.UndefOr[String] = js.native
}

object AnonIban {
  @scala.inline
  def apply(): AnonIban = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIban]
  }
  @scala.inline
  implicit class AnonIbanOps[Self <: AnonIban] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIban(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iban")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIban: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iban")(js.undefined)
        ret
    }
    @scala.inline
    def withIdeal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdeal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(js.undefined)
        ret
    }
  }
  
}

