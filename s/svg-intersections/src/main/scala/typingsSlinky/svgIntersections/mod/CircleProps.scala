package typingsSlinky.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleProps
  extends SvgProperties[js.Any] {
  var cx: Double = js.native
  var cy: Double = js.native
  var r: Double = js.native
}

object CircleProps {
  @scala.inline
  def apply(cx: Double, cy: Double, r: Double): CircleProps = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleProps]
  }
  @scala.inline
  implicit class CirclePropsOps[Self <: CircleProps] (val x: Self) extends AnyVal {
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
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

