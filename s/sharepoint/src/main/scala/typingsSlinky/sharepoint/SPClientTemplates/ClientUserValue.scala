package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientUserValue extends js.Object {
  var department: String = js.native
  var displayStr: String = js.native
  var email: String = js.native
  var jobTitle: String = js.native
  var lookupId: Double = js.native
  var lookupValue: String = js.native
  var picture: String = js.native
  var sip: String = js.native
  var title: String = js.native
}

object ClientUserValue {
  @scala.inline
  def apply(
    department: String,
    displayStr: String,
    email: String,
    jobTitle: String,
    lookupId: Double,
    lookupValue: String,
    picture: String,
    sip: String,
    title: String
  ): ClientUserValue = {
    val __obj = js.Dynamic.literal(department = department.asInstanceOf[js.Any], displayStr = displayStr.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], jobTitle = jobTitle.asInstanceOf[js.Any], lookupId = lookupId.asInstanceOf[js.Any], lookupValue = lookupValue.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sip = sip.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientUserValue]
  }
  @scala.inline
  implicit class ClientUserValueOps[Self <: ClientUserValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookupValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

