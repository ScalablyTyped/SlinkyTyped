package typingsSlinky.semanticUiNag.anon

import typingsSlinky.semanticUiNag.SemanticUI.Nag.AnimationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimation(value: AnimationSettings): Self = this.set("animation", value.asInstanceOf[js.Any])
  }
}
