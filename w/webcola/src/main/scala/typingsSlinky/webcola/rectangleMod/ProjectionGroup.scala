package typingsSlinky.webcola.rectangleMod

import typingsSlinky.webcola.vpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectionGroup extends js.Object {
  var bounds: Rectangle = js.native
  var groups: js.Array[ProjectionGroup] = js.native
  var leaves: js.Array[Leaf] = js.native
  var maxVar: Variable = js.native
  var minVar: Variable = js.native
  var padding: Double = js.native
  var stiffness: Double = js.native
}

object ProjectionGroup {
  @scala.inline
  def apply(
    bounds: Rectangle,
    groups: js.Array[ProjectionGroup],
    leaves: js.Array[Leaf],
    maxVar: Variable,
    minVar: Variable,
    padding: Double,
    stiffness: Double
  ): ProjectionGroup = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any], maxVar = maxVar.asInstanceOf[js.Any], minVar = minVar.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionGroup]
  }
  @scala.inline
  implicit class ProjectionGroupOps[Self <: ProjectionGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[ProjectionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeaves(value: js.Array[Leaf]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVar(value: Variable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinVar(value: Variable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStiffness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stiffness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

