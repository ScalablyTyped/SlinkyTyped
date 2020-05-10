package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDouble extends js.Object {
  var boolean: Double = js.native
  var dateTime: Double = js.native
  var double: Double = js.native
  var integer: Double = js.native
  var plainText: Double = js.native
  var string: Double = js.native
  var treePath: Double = js.native
}

object AnonDouble {
  @scala.inline
  def apply(
    boolean: Double,
    dateTime: Double,
    double: Double,
    integer: Double,
    plainText: Double,
    string: Double,
    treePath: Double
  ): AnonDouble = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDouble]
  }
  @scala.inline
  implicit class AnonDoubleOps[Self <: AnonDouble] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDouble(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("double")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlainText(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreePath(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

