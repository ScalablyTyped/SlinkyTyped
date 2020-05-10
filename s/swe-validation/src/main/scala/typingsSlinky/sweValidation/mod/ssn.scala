package typingsSlinky.sweValidation.mod

import typingsSlinky.sweValidation.AnonSex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ssn extends js.Object {
  var isValid: Boolean = js.native
  var person: js.UndefOr[AnonSex] = js.native
}

object ssn {
  @scala.inline
  def apply(isValid: Boolean): ssn = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ssn]
  }
  @scala.inline
  implicit class ssnOps[Self <: ssn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerson(value: AnonSex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("person")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("person")(js.undefined)
        ret
    }
  }
  
}

