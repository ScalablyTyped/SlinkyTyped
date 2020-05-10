package typingsSlinky.stellarBase.mod.Signer

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreAuthTx extends js.Object {
  var preAuthTx: Buffer = js.native
  var weight: js.UndefOr[Double] = js.native
}

object PreAuthTx {
  @scala.inline
  def apply(preAuthTx: Buffer): PreAuthTx = {
    val __obj = js.Dynamic.literal(preAuthTx = preAuthTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAuthTx]
  }
  @scala.inline
  implicit class PreAuthTxOps[Self <: PreAuthTx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreAuthTx(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preAuthTx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

