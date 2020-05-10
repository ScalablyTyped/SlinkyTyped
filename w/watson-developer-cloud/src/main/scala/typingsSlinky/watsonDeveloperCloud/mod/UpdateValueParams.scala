package typingsSlinky.watsonDeveloperCloud.mod

import typingsSlinky.watsonDeveloperCloud.mod.UpdateValueConstants.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `updateValue` operation. */
@js.native
trait UpdateValueParams extends js.Object {
  /** The name of the entity. */
  var entity: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  /** Any metadata related to the entity value. */
  var new_metadata: js.UndefOr[js.Object] = js.native
  /** An array of patterns for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A pattern is a regular expression no longer than 512 characters. For more information about how to specify a pattern, see the [documentation](https://cloud.ibm.com/docs/services/assistant/entities.html#entities-create-dictionary-based). */
  var new_patterns: js.UndefOr[js.Array[String]] = js.native
  /** An array of synonyms for the entity value. A value can specify either synonyms or patterns (depending on the value type), but not both. A synonym must conform to the following resrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var new_synonyms: js.UndefOr[js.Array[String]] = js.native
  /** The text of the entity value. This string must conform to the following restrictions: - It cannot contain carriage return, newline, or tab characters. - It cannot consist of only whitespace characters. - It must be no longer than 64 characters. */
  var new_value: js.UndefOr[String] = js.native
  /** Specifies the type of entity value. */
  var new_value_type: js.UndefOr[ValueType | String] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The text of the entity value. */
  var value: String = js.native
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}

object UpdateValueParams {
  @scala.inline
  def apply(entity: String, value: String, workspace_id: String): UpdateValueParams = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateValueParams]
  }
  @scala.inline
  implicit class UpdateValueParamsOps[Self <: UpdateValueParams] (val x: Self) extends AnyVal {
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
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
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
    def withNew_patterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_patterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_patterns")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_synonyms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_synonyms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_synonyms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_synonyms")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_value(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_value")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_value_type(value: ValueType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_value_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_value_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_value_type")(js.undefined)
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

