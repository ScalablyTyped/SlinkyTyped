package typingsSlinky.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateidString extends js.Object {
  var template_id: String = js.native
}

object TemplateidString {
  @scala.inline
  def apply(template_id: String): TemplateidString = {
    val __obj = js.Dynamic.literal(template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateidString]
  }
  @scala.inline
  implicit class TemplateidStringOps[Self <: TemplateidString] (val x: Self) extends AnyVal {
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
  }
  
}

