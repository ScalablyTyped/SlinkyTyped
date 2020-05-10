package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDateTime extends js.Object {
  var boolean: Double = js.native
  var dateTime: Double = js.native
  var double: Double = js.native
  var guid: Double = js.native
  var history: Double = js.native
  var html: Double = js.native
  var identity: Double = js.native
  var integer: Double = js.native
  var picklistDouble: Double = js.native
  var picklistInteger: Double = js.native
  var picklistString: Double = js.native
  var plainText: Double = js.native
  var string: Double = js.native
  var teamProject: Double = js.native
  var treePath: Double = js.native
}

object AnonDateTime {
  @scala.inline
  def apply(
    boolean: Double,
    dateTime: Double,
    double: Double,
    guid: Double,
    history: Double,
    html: Double,
    identity: Double,
    integer: Double,
    picklistDouble: Double,
    picklistInteger: Double,
    picklistString: Double,
    plainText: Double,
    string: Double,
    teamProject: Double,
    treePath: Double
  ): AnonDateTime = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], picklistDouble = picklistDouble.asInstanceOf[js.Any], picklistInteger = picklistInteger.asInstanceOf[js.Any], picklistString = picklistString.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDateTime]
  }
  @scala.inline
  implicit class AnonDateTimeOps[Self <: AnonDateTime] (val x: Self) extends AnyVal {
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
    def withGuid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicklistDouble(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picklistDouble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicklistInteger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picklistInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicklistString(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picklistString")(value.asInstanceOf[js.Any])
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
    def withTeamProject(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamProject")(value.asInstanceOf[js.Any])
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

