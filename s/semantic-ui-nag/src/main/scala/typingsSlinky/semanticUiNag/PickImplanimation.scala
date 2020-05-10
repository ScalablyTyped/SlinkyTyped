package typingsSlinky.semanticUiNag

import typingsSlinky.semanticUiNag.SemanticUI.Nag.AnimationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'animation'> */
@js.native
trait PickImplanimation extends js.Object {
  var animation: AnimationSettings = js.native
}

object PickImplanimation {
  @scala.inline
  def apply(animation: AnimationSettings): PickImplanimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimation]
  }
  @scala.inline
  implicit class PickImplanimationOps[Self <: PickImplanimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: AnimationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

