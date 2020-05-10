package typingsSlinky.wordpressApiFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRendered extends js.Object {
  var rendered: String = js.native
}

object AnonRendered {
  @scala.inline
  def apply(rendered: String): AnonRendered = {
    val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRendered]
  }
  @scala.inline
  implicit class AnonRenderedOps[Self <: AnonRendered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRendered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

