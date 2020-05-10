package typingsSlinky.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubstitutiondata extends js.Object {
  var draft: js.UndefOr[Boolean] = js.native
  var substitution_data: js.UndefOr[js.Any] = js.native
}

object AnonSubstitutiondata {
  @scala.inline
  def apply(): AnonSubstitutiondata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSubstitutiondata]
  }
  @scala.inline
  implicit class AnonSubstitutiondataOps[Self <: AnonSubstitutiondata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitution_data(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitution_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_data")(js.undefined)
        ret
    }
  }
  
}

