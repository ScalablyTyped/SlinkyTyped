package typingsSlinky.semanticUiSticky.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'fixed'> */
@js.native
trait PickImplfixed extends js.Object {
  
  var fixed: String = js.native
}
object PickImplfixed {
  
  @scala.inline
  def apply(fixed: String): PickImplfixed = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfixed]
  }
  
  @scala.inline
  implicit class PickImplfixedOps[Self <: PickImplfixed] (val x: Self) extends AnyVal {
    
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
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
  }
}
