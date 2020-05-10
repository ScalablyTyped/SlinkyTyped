package typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Section extends js.Object {
  var groups: js.Array[Group] = js.native
  /**
    * The id for the layout node.
    */
  var id: String = js.native
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean = js.native
}

object Section {
  @scala.inline
  def apply(groups: js.Array[Group], id: String, overridden: Boolean): Section = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  @scala.inline
  implicit class SectionOps[Self <: Section] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[Group]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverridden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridden")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

