package typingsSlinky.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnlyFromCamera extends js.Object {
  var onlyFromCamera: js.UndefOr[Boolean] = js.native
  var scanType: js.UndefOr[js.Array[String]] = js.native
}

object AnonOnlyFromCamera {
  @scala.inline
  def apply(): AnonOnlyFromCamera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOnlyFromCamera]
  }
  @scala.inline
  implicit class AnonOnlyFromCameraOps[Self <: AnonOnlyFromCamera] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnlyFromCamera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFromCamera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyFromCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFromCamera")(js.undefined)
        ret
    }
    @scala.inline
    def withScanType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanType")(js.undefined)
        ret
    }
  }
  
}

