package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWorkItem extends js.Object {
  var workItem: Double = js.native
  var workItemLink: Double = js.native
}

object AnonWorkItem {
  @scala.inline
  def apply(workItem: Double, workItemLink: Double): AnonWorkItem = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any], workItemLink = workItemLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWorkItem]
  }
  @scala.inline
  implicit class AnonWorkItemOps[Self <: AnonWorkItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemLink(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemLink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

