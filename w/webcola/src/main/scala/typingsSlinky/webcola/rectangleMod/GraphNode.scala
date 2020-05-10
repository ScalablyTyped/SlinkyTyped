package typingsSlinky.webcola.rectangleMod

import typingsSlinky.webcola.vpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphNode extends Leaf {
  var fixed: Boolean = js.native
  var fixedWeight: js.UndefOr[Double] = js.native
  var height: Double = js.native
  var px: Double = js.native
  var py: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object GraphNode {
  @scala.inline
  def apply(
    bounds: Rectangle,
    fixed: Boolean,
    height: Double,
    px: Double,
    py: Double,
    variable: Variable,
    width: Double,
    x: Double,
    y: Double
  ): GraphNode = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], px = px.asInstanceOf[js.Any], py = py.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphNode]
  }
  @scala.inline
  implicit class GraphNodeOps[Self <: GraphNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("py")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWeight")(js.undefined)
        ret
    }
  }
  
}

