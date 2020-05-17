package typingsSlinky.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolographicSpaceCameraAddedEventArgs extends js.Object {
  var camera: js.Any = js.native
   /* unmapped type */ var getDeferral: js.Any = js.native
}

object HolographicSpaceCameraAddedEventArgs {
  @scala.inline
  def apply(camera: js.Any, getDeferral: js.Any): HolographicSpaceCameraAddedEventArgs = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], getDeferral = getDeferral.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicSpaceCameraAddedEventArgs]
  }
  @scala.inline
  implicit class HolographicSpaceCameraAddedEventArgsOps[Self <: HolographicSpaceCameraAddedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamera(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

