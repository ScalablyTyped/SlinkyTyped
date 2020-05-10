package typingsSlinky.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizedViewportProps extends FlyToViewportProps {
  var bearing: Double = js.native
  var pitch: Double = js.native
}

object NormalizedViewportProps {
  @scala.inline
  def apply(
    bearing: Double,
    height: Double,
    latitude: Double,
    longitude: Double,
    pitch: Double,
    width: Double,
    zoom: Double
  ): NormalizedViewportProps = {
    val __obj = js.Dynamic.literal(bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedViewportProps]
  }
  @scala.inline
  implicit class NormalizedViewportPropsOps[Self <: NormalizedViewportProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

