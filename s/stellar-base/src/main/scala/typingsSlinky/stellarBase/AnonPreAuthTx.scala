package typingsSlinky.stellarBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreAuthTx extends js.Object {
  var preAuthTx: js.Any = js.native
}

object AnonPreAuthTx {
  @scala.inline
  def apply(preAuthTx: js.Any): AnonPreAuthTx = {
    val __obj = js.Dynamic.literal(preAuthTx = preAuthTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreAuthTx]
  }
  @scala.inline
  implicit class AnonPreAuthTxOps[Self <: AnonPreAuthTx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreAuthTx(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preAuthTx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

