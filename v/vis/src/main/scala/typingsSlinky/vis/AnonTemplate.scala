package typingsSlinky.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTemplate extends js.Object {
  def template(item: js.Any): js.Any = js.native
}

object AnonTemplate {
  @scala.inline
  def apply(template: js.Any => js.Any): AnonTemplate = {
    val __obj = js.Dynamic.literal(template = js.Any.fromFunction1(template))
    __obj.asInstanceOf[AnonTemplate]
  }
  @scala.inline
  implicit class AnonTemplateOps[Self <: AnonTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

