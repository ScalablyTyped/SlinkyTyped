package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamFieldValues extends TeamSettingsDataContractBase {
  /**
    * The default team field value
    */
  var defaultValue: String = js.native
  /**
    * Shallow ref to the field being used as a team field
    */
  var field: FieldReference = js.native
  /**
    * Collection of all valid team field values
    */
  var values: js.Array[TeamFieldValue] = js.native
}

object TeamFieldValues {
  @scala.inline
  def apply(
    _links: js.Any,
    defaultValue: String,
    field: FieldReference,
    url: String,
    values: js.Array[TeamFieldValue]
  ): TeamFieldValues = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamFieldValues]
  }
  @scala.inline
  implicit class TeamFieldValuesOps[Self <: TeamFieldValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: FieldReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[TeamFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

