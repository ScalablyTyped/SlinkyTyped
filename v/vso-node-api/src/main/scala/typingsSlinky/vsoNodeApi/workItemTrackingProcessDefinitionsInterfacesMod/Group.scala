package typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  /**
    * Contribution for the group.
    */
  var contribution: WitContribution = js.native
  /**
    * Controls to be put in the group.
    */
  var controls: js.Array[Control] = js.native
  /**
    * The height for the contribution.
    */
  var height: Double = js.native
  /**
    * The id for the layout node.
    */
  var id: String = js.native
  /**
    * A value indicating whether this layout node has been inherited from a parent layout.  This is expected to only be only set by the combiner.
    */
  var inherited: Boolean = js.native
  /**
    * A value indicating if the layout node is contribution are not.
    */
  var isContribution: Boolean = js.native
  /**
    * Label for the group.
    */
  var label: String = js.native
  /**
    * Order in which the group should appear in the section.
    */
  var order: Double = js.native
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean = js.native
  /**
    * A value indicating if the group should be hidden or not.
    */
  var visible: Boolean = js.native
}

object Group {
  @scala.inline
  def apply(
    contribution: WitContribution,
    controls: js.Array[Control],
    height: Double,
    id: String,
    inherited: Boolean,
    isContribution: Boolean,
    label: String,
    order: Double,
    overridden: Boolean,
    visible: Boolean
  ): Group = {
    val __obj = js.Dynamic.literal(contribution = contribution.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], isContribution = isContribution.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContribution(value: WitContribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControls(value: js.Array[Control]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsContribution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isContribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverridden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

