package typingsSlinky.tensorflowTfjsCore.backendMod

import typingsSlinky.tensorflowTfjsCore.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendTimingInfo extends js.Object {
  var getExtraProfileInfo: js.UndefOr[js.Function0[String]] = js.native
  var kernelMs: Double | Error = js.native
}

object BackendTimingInfo {
  @scala.inline
  def apply(kernelMs: Double | Error): BackendTimingInfo = {
    val __obj = js.Dynamic.literal(kernelMs = kernelMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendTimingInfo]
  }
  @scala.inline
  implicit class BackendTimingInfoOps[Self <: BackendTimingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKernelMs(value: Double | Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetExtraProfileInfo(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraProfileInfo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetExtraProfileInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtraProfileInfo")(js.undefined)
        ret
    }
  }
  
}

