package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateEntity` operation. */
@js.native
trait UpdateEntityParams extends js.Object {
  /** The name of the entity. */
  var entity: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** The description of the entity. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 128 characters. */
  var new_description: js.UndefOr[String] = js.native
  /** The name of the entity. This string must conform to the following restrictions: - It can contain only Unicode alphanumeric, underscore, and hyphen characters. - It cannot begin with the reserved prefix `sys-`. - It must be no longer than 64 characters. */
  var new_entity: js.UndefOr[String] = js.native
  /** Whether to use fuzzy matching for the entity. */
  var new_fuzzy_match: js.UndefOr[Boolean] = js.native
  /** Any metadata related to the entity. */
  var new_metadata: js.UndefOr[js.Object] = js.native
  /** An array of objects describing the entity values. */
  var new_values: js.UndefOr[js.Array[CreateValue]] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object UpdateEntityParams {
  @scala.inline
  def apply(entity: String, workspace_id: String): UpdateEntityParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEntityParams]
  }
  @scala.inline
  implicit class UpdateEntityParamsOps[Self <: UpdateEntityParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
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
    def withNew_entity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_entity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_entity")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_fuzzy_match(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_fuzzy_match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_fuzzy_match: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_fuzzy_match")(js.undefined)
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
    def withNew_values(value: js.Array[CreateValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_values: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_values")(js.undefined)
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

