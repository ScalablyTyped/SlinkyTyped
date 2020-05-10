package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookProperties extends js.Object {
  /** Name of Document Module in associated VBA Project */
  var CodeName: js.UndefOr[String] = js.native
  /** Worksheet Epoch (1904 if true, 1900 if false) */
  var date1904: js.UndefOr[Boolean] = js.native
  /** Warn or strip personally identifying info on save */
  var filterPrivacy: js.UndefOr[Boolean] = js.native
}

object WorkbookProperties {
  @scala.inline
  def apply(): WorkbookProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookProperties]
  }
  @scala.inline
  implicit class WorkbookPropertiesOps[Self <: WorkbookProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withDate1904(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date1904")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate1904: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date1904")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPrivacy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPrivacy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPrivacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPrivacy")(js.undefined)
        ret
    }
  }
  
}

