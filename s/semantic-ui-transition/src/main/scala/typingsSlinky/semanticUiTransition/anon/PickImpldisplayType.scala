package typingsSlinky.semanticUiTransition.anon

import typingsSlinky.semanticUiTransition.semanticUiTransitionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'displayType'> */
@js.native
trait PickImpldisplayType extends js.Object {
  var displayType: `false` | String = js.native
}

object PickImpldisplayType {
  @scala.inline
  def apply(displayType: `false` | String): PickImpldisplayType = {
    val __obj = js.Dynamic.literal(displayType = displayType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldisplayType]
  }
  @scala.inline
  implicit class PickImpldisplayTypeOps[Self <: PickImpldisplayType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayType(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

