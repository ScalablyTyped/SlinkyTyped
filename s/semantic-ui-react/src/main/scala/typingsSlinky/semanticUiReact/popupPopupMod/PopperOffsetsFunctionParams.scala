package typingsSlinky.semanticUiReact.popupPopupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopperOffsetsFunctionParams extends js.Object {
  
  var placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any = js.native
  
  var popper: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any = js.native
  
  var reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any = js.native
}
object PopperOffsetsFunctionParams {
  
  @scala.inline
  def apply(
    placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any,
    popper: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any,
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any
  ): PopperOffsetsFunctionParams = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperOffsetsFunctionParams]
  }
  
  @scala.inline
  implicit class PopperOffsetsFunctionParamsOps[Self <: PopperOffsetsFunctionParams] (val x: Self) extends AnyVal {
    
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
    def setPlacement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ js.Any
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopper(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any
    ): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any
    ): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
}
