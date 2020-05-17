package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array extends js.Object {
  var array: scala.Double = js.native
  var boolean: scala.Double = js.native
  var dateTime: scala.Double = js.native
  var dictionary: scala.Double = js.native
  var double: scala.Double = js.native
  var guid: scala.Double = js.native
  var integer: scala.Double = js.native
  var `object`: scala.Double = js.native
  var string: scala.Double = js.native
  var unknown: scala.Double = js.native
  var uri: scala.Double = js.native
}

object Array {
  @scala.inline
  def apply(
    array: scala.Double,
    boolean: scala.Double,
    dateTime: scala.Double,
    dictionary: scala.Double,
    double: scala.Double,
    guid: scala.Double,
    integer: scala.Double,
    `object`: scala.Double,
    string: scala.Double,
    unknown: scala.Double,
    uri: scala.Double
  ): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDictionary(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDouble(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("double")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuid(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteger(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

