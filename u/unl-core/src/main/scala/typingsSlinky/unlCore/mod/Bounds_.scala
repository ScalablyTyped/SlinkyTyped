package typingsSlinky.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds_ extends js.Object {
  var elevation: Double = js.native
  var elevationType: ElevationType = js.native
  @JSName("ne")
  var ne_FBounds_ : Point = js.native
  var sw: Point = js.native
}

object Bounds_ {
  @scala.inline
  def apply(elevation: Double, elevationType: ElevationType, ne: Point, sw: Point): Bounds_ = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds_]
  }
  @scala.inline
  implicit class Bounds_Ops[Self <: Bounds_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElevation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElevationType(value: ElevationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNe(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSw(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

