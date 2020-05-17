package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Guid extends js.Object {
  var boolean: scala.Double = js.native
  var dateTime: scala.Double = js.native
  var double: scala.Double = js.native
  var guid: scala.Double = js.native
  var history: scala.Double = js.native
  var html: scala.Double = js.native
  var identity: scala.Double = js.native
  var integer: scala.Double = js.native
  var picklistDouble: scala.Double = js.native
  var picklistInteger: scala.Double = js.native
  var picklistString: scala.Double = js.native
  var plainText: scala.Double = js.native
  var string: scala.Double = js.native
  var treePath: scala.Double = js.native
}

object Guid {
  @scala.inline
  def apply(
    boolean: scala.Double,
    dateTime: scala.Double,
    double: scala.Double,
    guid: scala.Double,
    history: scala.Double,
    html: scala.Double,
    identity: scala.Double,
    integer: scala.Double,
    picklistDouble: scala.Double,
    picklistInteger: scala.Double,
    picklistString: scala.Double,
    plainText: scala.Double,
    string: scala.Double,
    treePath: scala.Double
  ): Guid = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], picklistDouble = picklistDouble.asInstanceOf[js.Any], picklistInteger = picklistInteger.asInstanceOf[js.Any], picklistString = picklistString.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
  @scala.inline
  implicit class GuidOps[Self <: Guid] (val x: Self) extends AnyVal {
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
    def withGuid(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistory(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteger(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicklistDouble(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picklistDouble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicklistInteger(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picklistInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicklistString(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picklistString")(value.asInstanceOf[js.Any])
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

