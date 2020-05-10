package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclSRPGroup extends js.Object {
  var N: BigNumber = js.native
  var g: BigNumber = js.native
}

object SjclSRPGroup {
  @scala.inline
  def apply(N: BigNumber, g: BigNumber): SjclSRPGroup = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclSRPGroup]
  }
  @scala.inline
  implicit class SjclSRPGroupOps[Self <: SjclSRPGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withN(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("N")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withG(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

