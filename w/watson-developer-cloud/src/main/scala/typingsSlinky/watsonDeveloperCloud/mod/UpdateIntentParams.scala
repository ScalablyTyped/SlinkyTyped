package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateIntent` operation. */
@js.native
trait UpdateIntentParams extends js.Object {
  var headers: js.UndefOr[js.Object] = js.native
  /** The intent name. */
  var intent: String = js.native
  /** The description of the intent. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.native
  /** An array of user input examples for the intent. */
  var new_examples: js.UndefOr[js.Array[Example]] = js.native
  /** The name of the intent. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, hyphen, and dot characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 128 characters. */
  var new_intent: js.UndefOr[String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object UpdateIntentParams {
  @scala.inline
  def apply(intent: String, workspace_id: String): UpdateIntentParams = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIntentParams]
  }
  @scala.inline
  implicit class UpdateIntentParamsOps[Self <: UpdateIntentParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
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
    def withNew_examples(value: js.Array[Example]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_examples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_examples")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_intent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_intent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_intent")(js.undefined)
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

