package typingsSlinky.semanticUiRating

import typingsSlinky.semanticUiRating.semanticUiRatingStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, 'clearable'> */
@js.native
trait PickImplclearable extends js.Object {
  var clearable: auto | Boolean = js.native
}

object PickImplclearable {
  @scala.inline
  def apply(clearable: auto | Boolean): PickImplclearable = {
    val __obj = js.Dynamic.literal(clearable = clearable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclearable]
  }
  @scala.inline
  implicit class PickImplclearableOps[Self <: PickImplclearable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearable(value: auto | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

