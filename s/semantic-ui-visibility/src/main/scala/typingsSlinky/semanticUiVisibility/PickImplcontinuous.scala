package typingsSlinky.semanticUiVisibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'continuous'> */
@js.native
trait PickImplcontinuous extends js.Object {
  var continuous: Boolean = js.native
}

object PickImplcontinuous {
  @scala.inline
  def apply(continuous: Boolean): PickImplcontinuous = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontinuous]
  }
  @scala.inline
  implicit class PickImplcontinuousOps[Self <: PickImplcontinuous] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

