package typingsSlinky.watsonDeveloperCloud.mod

import typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressIn
import typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOut
import typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.DigressOutSlots
import typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.EventName
import typingsSlinky.watsonDeveloperCloud.mod.UpdateDialogNodeConstants.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateDialogNode` operation. */
@js.native
trait UpdateDialogNodeParams extends js.Object {
  /** The dialog node ID (for example, `get_order`). */
  var dialog_node: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** An array of objects describing any actions to be invoked by the dialog node. */
  var new_actions: js.UndefOr[js.Array[DialogNodeAction]] = js.native
  /** The condition that will trigger the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var new_conditions: js.UndefOr[String] = js.native
  /** The context for the dialog node. */
  var new_context: js.UndefOr[js.Object] = js.native
  /** The description of the dialog node. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.native
  /** The dialog node ID. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 1024 characters. */
  var new_dialog_node: js.UndefOr[String] = js.native
  /** Whether this top-level dialog node can be digressed into. */
  var new_digress_in: js.UndefOr[DigressIn | String] = js.native
  /** Whether this dialog node can be returned to after a digression. */
  var new_digress_out: js.UndefOr[DigressOut | String] = js.native
  /** Whether the user can digress to top-level nodes while filling out slots. */
  var new_digress_out_slots: js.UndefOr[DigressOutSlots | String] = js.native
  /** How an `event_handler` node is processed. */
  var new_event_name: js.UndefOr[EventName | String] = js.native
  /** The metadata for the dialog node. */
  var new_metadata: js.UndefOr[js.Object] = js.native
  /** The next step to execute following this dialog node. */
  var new_next_step: js.UndefOr[DialogNodeNextStep] = js.native
  /** How the dialog node is processed. */
  var new_node_type: js.UndefOr[NodeType | String] = js.native
  /** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
  var new_output: js.UndefOr[DialogNodeOutput] = js.native
  /** The ID of the parent dialog node. This property is omitted if the dialog node has no parent. */
  var new_parent: js.UndefOr[String] = js.native
  /** The ID of the previous sibling dialog node. This property is omitted if the dialog node has no previous sibling. */
  var new_previous_sibling: js.UndefOr[String] = js.native
  /** The alias used to identify the dialog node. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, space, underscore, hyphen, and dot characters. - It must be no longer than 64 characters. */
  var new_title: js.UndefOr[String] = js.native
  /** A label that can be displayed externally to describe the purpose of the node to users. This string must be no longer than 512 characters. */
  var new_user_label: js.UndefOr[String] = js.native
  /** The location in the dialog context where output is stored. */
  var new_variable: js.UndefOr[String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object UpdateDialogNodeParams {
  @scala.inline
  def apply(dialog_node: String, workspace_id: String): UpdateDialogNodeParams = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDialogNodeParams]
  }
  @scala.inline
  implicit class UpdateDialogNodeParamsOps[Self <: UpdateDialogNodeParams] (val x: Self) extends AnyVal {
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
    def withWorkspace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_actions(value: js.Array[DialogNodeAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_actions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_actions")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_conditions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_conditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_context(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_context: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_context")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_description")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_dialog_node(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_dialog_node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_dialog_node: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_dialog_node")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_digress_in(value: DigressIn | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_digress_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_digress_in: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_digress_in")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_digress_out(value: DigressOut | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_digress_out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_digress_out: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_digress_out")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_digress_out_slots(value: DigressOutSlots | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_digress_out_slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_digress_out_slots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_digress_out_slots")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_event_name(value: EventName | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_event_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_event_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_event_name")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_metadata(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_metadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_next_step(value: DialogNodeNextStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_next_step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_next_step: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_next_step")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_node_type(value: NodeType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_node_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_node_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_node_type")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_output(value: DialogNodeOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_output: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_output")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_parent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_parent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_parent")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_previous_sibling(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_previous_sibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_previous_sibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_previous_sibling")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_title")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_user_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_user_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_user_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_user_label")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_variable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_variable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_variable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_variable")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_response(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(js.undefined)
        ret
    }
  }
  
}

