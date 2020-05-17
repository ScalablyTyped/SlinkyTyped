package typingsSlinky.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipseProps
  extends SvgProperties[js.Any] {
  var cx: Double = js.native
  var cy: Double = js.native
  var rx: Double = js.native
  var ry: Double = js.native
}

object EllipseProps {
  @scala.inline
  def apply(cx: Double, cy: Double, rx: Double, ry: Double): EllipseProps = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipseProps]
  }
  @scala.inline
  implicit class EllipsePropsOps[Self <: EllipseProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

