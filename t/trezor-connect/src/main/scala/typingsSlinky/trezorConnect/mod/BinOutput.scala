package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinOutput extends js.Object {
  var amount: Double = js.native
  var script_pubkey: String = js.native
}

object BinOutput {
  @scala.inline
  def apply(amount: Double, script_pubkey: String): BinOutput = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], script_pubkey = script_pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinOutput]
  }
  @scala.inline
  implicit class BinOutputOps[Self <: BinOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScript_pubkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script_pubkey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

