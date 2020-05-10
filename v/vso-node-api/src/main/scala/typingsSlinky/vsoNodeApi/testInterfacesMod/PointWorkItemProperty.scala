package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.AnonValueAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointWorkItemProperty extends js.Object {
  var workItem: AnonValueAny = js.native
}

object PointWorkItemProperty {
  @scala.inline
  def apply(workItem: AnonValueAny): PointWorkItemProperty = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointWorkItemProperty]
  }
  @scala.inline
  implicit class PointWorkItemPropertyOps[Self <: PointWorkItemProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkItem(value: AnonValueAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

