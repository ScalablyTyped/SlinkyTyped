package typingsSlinky.vsoNodeApi.formInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputFilterCondition extends js.Object {
  /**
    * Whether or not to do a case sensitive match
    */
  var caseSensitive: Boolean = js.native
  /**
    * The Id of the input to filter on
    */
  var inputId: String = js.native
  /**
    * The "expected" input value to compare with the actual input value
    */
  var inputValue: String = js.native
  /**
    * The operator applied between the expected and actual input value
    */
  var operator: InputFilterOperator = js.native
}

object InputFilterCondition {
  @scala.inline
  def apply(caseSensitive: Boolean, inputId: String, inputValue: String, operator: InputFilterOperator): InputFilterCondition = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], inputId = inputId.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFilterCondition]
  }
  @scala.inline
  implicit class InputFilterConditionOps[Self <: InputFilterCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: InputFilterOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

