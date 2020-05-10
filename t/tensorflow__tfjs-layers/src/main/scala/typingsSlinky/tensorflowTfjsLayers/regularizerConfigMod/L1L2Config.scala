package typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait L1L2Config extends js.Object {
  var l1: js.UndefOr[Double] = js.native
  var l2: js.UndefOr[Double] = js.native
}

object L1L2Config {
  @scala.inline
  def apply(): L1L2Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[L1L2Config]
  }
  @scala.inline
  implicit class L1L2ConfigOps[Self <: L1L2Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withL1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1")(js.undefined)
        ret
    }
    @scala.inline
    def withL2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2")(js.undefined)
        ret
    }
  }
  
}

