package typingsSlinky.tensorflowTfjsCore.backendWebglMod

import typingsSlinky.tensorflowTfjsCore.anon.Error
import typingsSlinky.tensorflowTfjsCore.engineMod.TimingInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLTimingInfo extends TimingInfo {
  var downloadWaitMs: Double = js.native
  var uploadWaitMs: Double = js.native
}

object WebGLTimingInfo {
  @scala.inline
  def apply(downloadWaitMs: Double, kernelMs: Double | Error, uploadWaitMs: Double, wallMs: Double): WebGLTimingInfo = {
    val __obj = js.Dynamic.literal(downloadWaitMs = downloadWaitMs.asInstanceOf[js.Any], kernelMs = kernelMs.asInstanceOf[js.Any], uploadWaitMs = uploadWaitMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLTimingInfo]
  }
  @scala.inline
  implicit class WebGLTimingInfoOps[Self <: WebGLTimingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadWaitMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadWaitMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadWaitMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadWaitMs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

