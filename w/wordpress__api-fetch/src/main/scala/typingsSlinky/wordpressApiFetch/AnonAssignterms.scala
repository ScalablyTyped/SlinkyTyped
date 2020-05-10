package typingsSlinky.wordpressApiFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssignterms extends js.Object {
  var assign_terms: String = js.native
  var delete_terms: String = js.native
  var edit_terms: String = js.native
  var manage_terms: String = js.native
}

object AnonAssignterms {
  @scala.inline
  def apply(assign_terms: String, delete_terms: String, edit_terms: String, manage_terms: String): AnonAssignterms = {
    val __obj = js.Dynamic.literal(assign_terms = assign_terms.asInstanceOf[js.Any], delete_terms = delete_terms.asInstanceOf[js.Any], edit_terms = edit_terms.asInstanceOf[js.Any], manage_terms = manage_terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssignterms]
  }
  @scala.inline
  implicit class AnonAssigntermsOps[Self <: AnonAssignterms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssign_terms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assign_terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete_terms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete_terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit_terms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManage_terms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manage_terms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

