package typingsSlinky.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, 'animating'> */
@js.native
trait PickImplanimating extends js.Object {
  var animating: String = js.native
}

object PickImplanimating {
  @scala.inline
  def apply(animating: String): PickImplanimating = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimating]
  }
  @scala.inline
  implicit class PickImplanimatingOps[Self <: PickImplanimating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

