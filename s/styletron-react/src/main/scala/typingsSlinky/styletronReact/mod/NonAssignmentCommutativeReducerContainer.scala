package typingsSlinky.styletronReact.mod

import typingsSlinky.styletronReact.styletronReactBooleans.`false`
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonAssignmentCommutativeReducerContainer extends ReducerContainer {
  var assignmentCommutative: `false` = js.native
  var reducer: Reducer = js.native
}

object NonAssignmentCommutativeReducerContainer {
  @scala.inline
  def apply(
    assignmentCommutative: `false`,
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject
  ): NonAssignmentCommutativeReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any], reducer = js.Any.fromFunction2(reducer))
    __obj.asInstanceOf[NonAssignmentCommutativeReducerContainer]
  }
  @scala.inline
  implicit class NonAssignmentCommutativeReducerContainerOps[Self <: NonAssignmentCommutativeReducerContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignmentCommutative(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignmentCommutative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReducer(value: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducer")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

