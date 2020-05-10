package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNode. */
@js.native
trait DialogNode extends js.Object {
  /** An array of objects describing any actions to be invoked by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.native
  /** The condition that will trigger the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var conditions: js.UndefOr[String] = js.native
  /** The context for the dialog node. */
  var context: js.UndefOr[js.Object] = js.native
  /** The timestamp for creation of the object. */
  var created: js.UndefOr[String] = js.native
  /** The description of the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var description: js.UndefOr[String] = js.native
  /** The dialog node ID. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 1024 characters. */
  var dialog_node: String = js.native
  /** Whether this top-level dialog node can be digressed into. */
  var digress_in: js.UndefOr[String] = js.native
  /** Whether this dialog node can be returned to after a digression. */
  var digress_out: js.UndefOr[String] = js.native
  /** Whether the user can digress to top-level nodes while filling out slots. */
  var digress_out_slots: js.UndefOr[String] = js.native
  /** For internal use only. */
  var disabled: js.UndefOr[Boolean] = js.native
  /** How an `event_handler` node is processed. */
  var event_name: js.UndefOr[String] = js.native
  /** The metadata for the dialog node. */
  var metadata: js.UndefOr[js.Object] = js.native
  /** The next step to execute following this dialog node. */
  var next_step: js.UndefOr[DialogNodeNextStep] = js.native
  /** How the dialog node is processed. */
  var node_type: js.UndefOr[String] = js.native
  /** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
  var output: js.UndefOr[DialogNodeOutput] = js.native
  /** The ID of the parent dialog node. This property is omitted if the dialog node has no parent. */
  var parent: js.UndefOr[String] = js.native
  /** The ID of the previous sibling dialog node. This property is omitted if the dialog node has no previous sibling. */
  var previous_sibling: js.UndefOr[String] = js.native
  /** The alias used to identify the dialog node. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 64 characters. */
  var title: js.UndefOr[String] = js.native
  /** The timestamp for the most recent update to the object. */
  var updated: js.UndefOr[String] = js.native
  /** A label that can be displayed externally to describe the purpose of the node to users. This string must be no longer than 512 characters. */
  var user_label: js.UndefOr[String] = js.native
  /** The location in the dialog context where output is stored. */
  var variable: js.UndefOr[String] = js.native
}

object DialogNode {
  @scala.inline
  def apply(dialog_node: String): DialogNode = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNode]
  }
  @scala.inline
  implicit class DialogNodeOps[Self <: DialogNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialog_node(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog_node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: js.Array[DialogNodeAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDigress_in(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digress_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigress_in: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digress_in")(js.undefined)
        ret
    }
    @scala.inline
    def withDigress_out(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digress_out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigress_out: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digress_out")(js.undefined)
        ret
    }
    @scala.inline
    def withDigress_out_slots(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digress_out_slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigress_out_slots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digress_out_slots")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_name")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNext_step(value: DialogNodeNextStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_step: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_step")(js.undefined)
        ret
    }
    @scala.inline
    def withNode_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_type")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: DialogNodeOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevious_sibling(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous_sibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevious_sibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous_sibling")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_label")(js.undefined)
        ret
    }
    @scala.inline
    def withVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(js.undefined)
        ret
    }
  }
  
}

