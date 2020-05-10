package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeStateColors extends js.Object {
  /**
    * Work item type state colors
    */
  var stateColors: js.Array[WorkItemStateColor] = js.native
  /**
    * Work item type name
    */
  var workItemTypeName: String = js.native
}

object WorkItemTypeStateColors {
  @scala.inline
  def apply(stateColors: js.Array[WorkItemStateColor], workItemTypeName: String): WorkItemTypeStateColors = {
    val __obj = js.Dynamic.literal(stateColors = stateColors.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeStateColors]
  }
  @scala.inline
  implicit class WorkItemTypeStateColorsOps[Self <: WorkItemTypeStateColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateColors(value: js.Array[WorkItemStateColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemTypeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

