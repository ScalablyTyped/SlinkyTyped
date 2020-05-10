package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputValuesQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldValuesQuery extends InputValuesQuery {
  @JSName("inputValues")
  var inputValues_FieldValuesQuery: js.Array[FieldInputValues] = js.native
  var scope: String = js.native
}

object FieldValuesQuery {
  @scala.inline
  def apply(
    currentValues: StringDictionary[String],
    inputValues: js.Array[FieldInputValues],
    resource: js.Any,
    scope: String
  ): FieldValuesQuery = {
    val __obj = js.Dynamic.literal(currentValues = currentValues.asInstanceOf[js.Any], inputValues = inputValues.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldValuesQuery]
  }
  @scala.inline
  implicit class FieldValuesQueryOps[Self <: FieldValuesQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputValues(value: js.Array[FieldInputValues]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

