package typingsSlinky.web3Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIv extends js.Object {
  var iv: String = js.native
}

object AnonIv {
  @scala.inline
  def apply(iv: String): AnonIv = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIv]
  }
  @scala.inline
  implicit class AnonIvOps[Self <: AnonIv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

