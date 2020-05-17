package typingsSlinky.zrender.anon

import typingsSlinky.zrender.zrender.ColorStops
import typingsSlinky.zrender.zrender.GlobalCoords
import typingsSlinky.zrender.zrender.X
import typingsSlinky.zrender.zrender.X2
import typingsSlinky.zrender.zrender.Y
import typingsSlinky.zrender.zrender.Y2
import typingsSlinky.zrender.zrenderStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddColorStop extends js.Object {
  var colorStops: ColorStops = js.native
  var globalCoord: GlobalCoords = js.native
  var `type`: linear = js.native
  var x: X = js.native
  var x2: X2 = js.native
  var y: Y = js.native
  var y2: Y2 = js.native
  def addColorStop(offset: Double, color: String): Unit = js.native
}

object AddColorStop {
  @scala.inline
  def apply(
    addColorStop: (Double, String) => Unit,
    colorStops: ColorStops,
    globalCoord: GlobalCoords,
    `type`: linear,
    x: X,
    x2: X2,
    y: Y,
    y2: Y2
  ): AddColorStop = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), colorStops = colorStops.asInstanceOf[js.Any], globalCoord = globalCoord.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddColorStop]
  }
  @scala.inline
  implicit class AddColorStopOps[Self <: AddColorStop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddColorStop(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addColorStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withColorStops(value: ColorStops): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalCoord(value: GlobalCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalCoord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX2(value: X2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2(value: Y2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

