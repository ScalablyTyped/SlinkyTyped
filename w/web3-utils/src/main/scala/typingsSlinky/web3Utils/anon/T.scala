package typingsSlinky.web3Utils.anon

import typingsSlinky.bnJs.mod.^
import typingsSlinky.web3Utils.mod.Mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait T extends Mixed {
  var t: String = js.native
  var v: String | ^  | Double = js.native
}

object T {
  @scala.inline
  def apply(t: String, v: String | ^  | Double): T = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[T]
  }
  @scala.inline
  implicit class TOps[Self <: T] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(value: String | ^  | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

