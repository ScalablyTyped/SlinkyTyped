package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.tensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatOffset extends js.Object {
  var flatOffset: Double = js.native
  var origDataId: DataId = js.native
}

object FlatOffset {
  @scala.inline
  def apply(flatOffset: Double, origDataId: DataId): FlatOffset = {
    val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], origDataId = origDataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatOffset]
  }
  @scala.inline
  implicit class FlatOffsetOps[Self <: FlatOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlatOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigDataId(value: DataId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origDataId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

