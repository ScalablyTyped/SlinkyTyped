package typingsSlinky.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, 'parent'> */
@js.native
trait PickImplparent extends js.Object {
  
  var parent: String = js.native
}
object PickImplparent {
  
  @scala.inline
  def apply(parent: String): PickImplparent = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplparent]
  }
  
  @scala.inline
  implicit class PickImplparentOps[Self <: PickImplparent] (val x: Self) extends AnyVal {
    
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
}
