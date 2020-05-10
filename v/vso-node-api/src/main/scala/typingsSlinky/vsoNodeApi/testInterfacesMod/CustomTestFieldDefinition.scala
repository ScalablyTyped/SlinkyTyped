package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTestFieldDefinition extends js.Object {
  var fieldId: Double = js.native
  var fieldName: String = js.native
  var fieldType: CustomTestFieldType = js.native
  var scope: CustomTestFieldScope = js.native
}

object CustomTestFieldDefinition {
  @scala.inline
  def apply(fieldId: Double, fieldName: String, fieldType: CustomTestFieldType, scope: CustomTestFieldScope): CustomTestFieldDefinition = {
    val __obj = js.Dynamic.literal(fieldId = fieldId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestFieldDefinition]
  }
  @scala.inline
  implicit class CustomTestFieldDefinitionOps[Self <: CustomTestFieldDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldType(value: CustomTestFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: CustomTestFieldScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

