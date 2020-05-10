package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataValue extends js.Object {
  var dataValue: js.Any = js.native
  var isValid: Boolean = js.native
  var normalizedLocValue: String = js.native
}

object AnonDataValue {
  @scala.inline
  def apply(dataValue: js.Any, isValid: Boolean, normalizedLocValue: String): AnonDataValue = {
    val __obj = js.Dynamic.literal(dataValue = dataValue.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], normalizedLocValue = normalizedLocValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataValue]
  }
  @scala.inline
  implicit class AnonDataValueOps[Self <: AnonDataValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizedLocValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedLocValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

