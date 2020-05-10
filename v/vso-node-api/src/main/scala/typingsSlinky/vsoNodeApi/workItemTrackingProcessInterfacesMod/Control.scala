package typingsSlinky.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control extends js.Object {
  /**
    * Contribution for the control.
    */
  var contribution: WitContribution = js.native
  /**
    * Type of the control.
    */
  var controlType: String = js.native
  /**
    * Height of the control, for html controls.
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
    * A value indicating if the layout node is contribution or not.
    */
  var isContribution: Boolean = js.native
  /**
    * Label for the field
    */
  var label: String = js.native
  /**
    * Inner text of the control.
    */
  var metadata: String = js.native
  var order: Double = js.native
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean = js.native
  /**
    * A value indicating if the control is readonly.
    */
  var readOnly: Boolean = js.native
  /**
    * A value indicating if the control should be hidden or not.
    */
  var visible: Boolean = js.native
  /**
    * Watermark text for the textbox.
    */
  var watermark: String = js.native
}

object Control {
  @scala.inline
  def apply(
    contribution: WitContribution,
    controlType: String,
    height: Double,
    id: String,
    inherited: Boolean,
    isContribution: Boolean,
    label: String,
    metadata: String,
    order: Double,
    overridden: Boolean,
    readOnly: Boolean,
    visible: Boolean,
    watermark: String
  ): Control = {
    val __obj = js.Dynamic.literal(contribution = contribution.asInstanceOf[js.Any], controlType = controlType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], isContribution = isContribution.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], watermark = watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  @scala.inline
  implicit class ControlOps[Self <: Control] (val x: Self) extends AnyVal {
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
    def withControlType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlType")(value.asInstanceOf[js.Any])
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
    def withMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
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
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatermark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermark")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

