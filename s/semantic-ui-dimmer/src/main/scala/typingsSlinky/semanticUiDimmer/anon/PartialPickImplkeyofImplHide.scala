package typingsSlinky.semanticUiDimmer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.DurationSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.DurationSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplHide extends js.Object {
  
  var hide: js.UndefOr[Double] = js.native
  
  var show: js.UndefOr[Double] = js.native
}
object PartialPickImplkeyofImplHide {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplHide]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplHideOps[Self <: PartialPickImplkeyofImplHide] (val x: Self) extends AnyVal {
    
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
    def setHide(value: Double): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setShow(value: Double): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
