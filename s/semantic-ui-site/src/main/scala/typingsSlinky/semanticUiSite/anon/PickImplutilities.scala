package typingsSlinky.semanticUiSite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, 'utilities'> */
@js.native
trait PickImplutilities extends js.Object {
  
  var utilities: js.Any = js.native
}
object PickImplutilities {
  
  @scala.inline
  def apply(utilities: js.Any): PickImplutilities = {
    val __obj = js.Dynamic.literal(utilities = utilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplutilities]
  }
  
  @scala.inline
  implicit class PickImplutilitiesOps[Self <: PickImplutilities] (val x: Self) extends AnyVal {
    
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
    def setUtilities(value: js.Any): Self = this.set("utilities", value.asInstanceOf[js.Any])
  }
}
