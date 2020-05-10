package typingsSlinky.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputValue extends js.Object {
  /**
    * Any other data about this input
    */
  var data: StringDictionary[js.Any] = js.native
  /**
    * The text to show for the display of this value
    */
  var displayValue: String = js.native
  /**
    * The value to store for this input
    */
  var value: String = js.native
}

object InputValue {
  @scala.inline
  def apply(data: StringDictionary[js.Any], displayValue: String, value: String): InputValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValue]
  }
  @scala.inline
  implicit class InputValueOps[Self <: InputValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

