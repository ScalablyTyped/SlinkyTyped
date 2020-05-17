package typingsSlinky.web3Core.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iv extends js.Object {
  var iv: String = js.native
}

object Iv {
  @scala.inline
  def apply(iv: String): Iv = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iv]
  }
  @scala.inline
  implicit class IvOps[Self <: Iv] (val x: Self) extends AnyVal {
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

