package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldDetailsForTestResults extends js.Object {
  /**
    * Group by field name
    */
  var fieldName: String = js.native
  /**
    * Group by field values
    */
  var groupsForField: js.Array[_] = js.native
}

object FieldDetailsForTestResults {
  @scala.inline
  def apply(fieldName: String, groupsForField: js.Array[_]): FieldDetailsForTestResults = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], groupsForField = groupsForField.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDetailsForTestResults]
  }
  @scala.inline
  implicit class FieldDetailsForTestResultsOps[Self <: FieldDetailsForTestResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupsForField(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupsForField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

