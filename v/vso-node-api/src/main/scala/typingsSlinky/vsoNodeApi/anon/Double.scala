package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Double extends js.Object {
  var boolean: scala.Double = js.native
  var dateTime: scala.Double = js.native
  var double: scala.Double = js.native
  var integer: scala.Double = js.native
  var plainText: scala.Double = js.native
  var string: scala.Double = js.native
  var treePath: scala.Double = js.native
}

object Double {
  @scala.inline
  def apply(
    boolean: scala.Double,
    dateTime: scala.Double,
    double: scala.Double,
    integer: scala.Double,
    plainText: scala.Double,
    string: scala.Double,
    treePath: scala.Double
  ): Double = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Double]
  }
  @scala.inline
  implicit class DoubleOps[Self <: Double] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTime(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDouble(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("double")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteger(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlainText(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreePath(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

