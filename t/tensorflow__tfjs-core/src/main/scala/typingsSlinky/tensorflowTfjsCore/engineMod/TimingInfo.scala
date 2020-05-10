package typingsSlinky.tensorflowTfjsCore.engineMod

import typingsSlinky.tensorflowTfjsCore.AnonError
import typingsSlinky.tensorflowTfjsCore.backendMod.BackendTimingInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimingInfo extends BackendTimingInfo {
  var wallMs: Double = js.native
}

object TimingInfo {
  @scala.inline
  def apply(kernelMs: Double | AnonError, wallMs: Double): TimingInfo = {
    val __obj = js.Dynamic.literal(kernelMs = kernelMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingInfo]
  }
  @scala.inline
  implicit class TimingInfoOps[Self <: TimingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWallMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wallMs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

