package typingsSlinky.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolographicSpaceCameraRemovedEventArgs extends js.Object {
  var camera: js.Any = js.native
}

object HolographicSpaceCameraRemovedEventArgs {
  @scala.inline
  def apply(camera: js.Any): HolographicSpaceCameraRemovedEventArgs = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicSpaceCameraRemovedEventArgs]
  }
  @scala.inline
  implicit class HolographicSpaceCameraRemovedEventArgsOps[Self <: HolographicSpaceCameraRemovedEventArgs] (val x: Self) extends AnyVal {
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
  }
  
}

