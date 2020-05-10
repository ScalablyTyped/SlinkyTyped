package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPersonalidnumber extends js.Object {
  /**
    * The personal_id_number for PII in string form.
    */
  var personal_id_number: String = js.native
}

object AnonPersonalidnumber {
  @scala.inline
  def apply(personal_id_number: String): AnonPersonalidnumber = {
    val __obj = js.Dynamic.literal(personal_id_number = personal_id_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPersonalidnumber]
  }
  @scala.inline
  implicit class AnonPersonalidnumberOps[Self <: AnonPersonalidnumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersonal_id_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personal_id_number")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

