package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents job info for a contact. */
@js.native
trait ContactJobInfo extends js.Object {
  /** Gets and sets the company address of the job info for a contact. The maximum string length for the company address is 1024 characters. */
  var companyAddress: String = js.native
  /** Gets and sets the company name of the job info for a contact. The maximum string length for the company name is 64 characters. */
  var companyName: String = js.native
  /** Gets and sets the company Yomi (phonetic Japanese equivalent) name of the job info for a contact. The maximum string length for the company Yomi name is 200 characters. */
  var companyYomiName: String = js.native
  /** Gets and sets the department of the job info for a contact. The maximum string length for the department is 100 characters. */
  var department: String = js.native
  /** Gets and sets the description of the job info for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  /** Gets and sets the manager of the job info for a contact. The maximum string length for the manager is 1024 characters. */
  var manager: String = js.native
  /** Gets and sets the office of the job info for a contact. The maximum string length for the office is 40 characters. */
  var office: String = js.native
  /** Gets and sets the title of the job info for a contact. The maximum string length for the title is 1024 characters. */
  var title: String = js.native
}

object ContactJobInfo {
  @scala.inline
  def apply(
    companyAddress: String,
    companyName: String,
    companyYomiName: String,
    department: String,
    description: String,
    manager: String,
    office: String,
    title: String
  ): ContactJobInfo = {
    val __obj = js.Dynamic.literal(companyAddress = companyAddress.asInstanceOf[js.Any], companyName = companyName.asInstanceOf[js.Any], companyYomiName = companyYomiName.asInstanceOf[js.Any], department = department.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], office = office.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactJobInfo]
  }
  @scala.inline
  implicit class ContactJobInfoOps[Self <: ContactJobInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanyAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompanyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompanyYomiName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyYomiName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManager(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("office")(value.asInstanceOf[js.Any])
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

