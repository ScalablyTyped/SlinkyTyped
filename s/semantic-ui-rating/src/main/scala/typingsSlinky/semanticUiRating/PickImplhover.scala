package typingsSlinky.semanticUiRating

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl, 'hover'> */
@js.native
trait PickImplhover extends js.Object {
  var hover: String = js.native
}

object PickImplhover {
  @scala.inline
  def apply(hover: String): PickImplhover = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhover]
  }
  @scala.inline
  implicit class PickImplhoverOps[Self <: PickImplhover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

