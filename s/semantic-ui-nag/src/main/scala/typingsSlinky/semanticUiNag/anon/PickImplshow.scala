package typingsSlinky.semanticUiNag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.AnimationSettings._Impl, 'show'> */
@js.native
trait PickImplshow extends js.Object {
  
  var show: String = js.native
}
object PickImplshow {
  
  @scala.inline
  def apply(show: String): PickImplshow = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshow]
  }
  
  @scala.inline
  implicit class PickImplshowOps[Self <: PickImplshow] (val x: Self) extends AnyVal {
    
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
    def setShow(value: String): Self = this.set("show", value.asInstanceOf[js.Any])
  }
}
