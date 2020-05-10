package typingsSlinky.semanticUiSticky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'pushing'> */
@js.native
trait PickImplpushing extends js.Object {
  var pushing: Boolean = js.native
}

object PickImplpushing {
  @scala.inline
  def apply(pushing: Boolean): PickImplpushing = {
    val __obj = js.Dynamic.literal(pushing = pushing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpushing]
  }
  @scala.inline
  implicit class PickImplpushingOps[Self <: PickImplpushing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPushing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

