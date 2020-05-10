package typingsSlinky.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTemplateid extends js.Object {
  var template_id: String = js.native
  var use_draft_template: js.UndefOr[Boolean] = js.native
}

object AnonTemplateid {
  @scala.inline
  def apply(template_id: String): AnonTemplateid = {
    val __obj = js.Dynamic.literal(template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTemplateid]
  }
  @scala.inline
  implicit class AnonTemplateidOps[Self <: AnonTemplateid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse_draft_template(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_draft_template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_draft_template: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_draft_template")(js.undefined)
        ret
    }
  }
  
}

