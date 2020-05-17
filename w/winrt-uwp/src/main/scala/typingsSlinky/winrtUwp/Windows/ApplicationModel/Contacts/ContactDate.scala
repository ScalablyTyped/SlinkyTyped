package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an important date for a contact. */
@js.native
trait ContactDate extends js.Object {
  /** Gets and sets the day for an important date for a contact. */
  var day: Double = js.native
  /** Gets and sets the description for an important date for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  /** Gets and sets the kind of important date for a contact. */
  var kind: ContactDateKind = js.native
  /** Gets and sets the month for an important date for a contact. */
  var month: Double = js.native
  /** Gets and sets the year for an important date for a contact. */
  var year: Double = js.native
}

object ContactDate {
  @scala.inline
  def apply(day: Double, description: String, kind: ContactDateKind, month: Double, year: Double): ContactDate = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactDate]
  }
  @scala.inline
  implicit class ContactDateOps[Self <: ContactDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ContactDateKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

