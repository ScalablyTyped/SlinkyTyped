package typingsSlinky.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHierarchySeparator extends js.Object {
  var hierarchyRootSeparator: js.UndefOr[scala.Nothing] = js.native
  var hierarchySeparator: String = js.native
}

object AnonHierarchySeparator {
  @scala.inline
  def apply(hierarchySeparator: String): AnonHierarchySeparator = {
    val __obj = js.Dynamic.literal(hierarchySeparator = hierarchySeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHierarchySeparator]
  }
  @scala.inline
  implicit class AnonHierarchySeparatorOps[Self <: AnonHierarchySeparator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHierarchySeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchySeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchyRootSeparator(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchyRootSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHierarchyRootSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchyRootSeparator")(js.undefined)
        ret
    }
  }
  
}

