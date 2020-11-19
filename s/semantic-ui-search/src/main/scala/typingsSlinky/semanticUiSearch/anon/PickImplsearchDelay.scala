package typingsSlinky.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'searchDelay'> */
@js.native
trait PickImplsearchDelay extends js.Object {
  
  var searchDelay: Double = js.native
}
object PickImplsearchDelay {
  
  @scala.inline
  def apply(searchDelay: Double): PickImplsearchDelay = {
    val __obj = js.Dynamic.literal(searchDelay = searchDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchDelay]
  }
  
  @scala.inline
  implicit class PickImplsearchDelayOps[Self <: PickImplsearchDelay] (val x: Self) extends AnyVal {
    
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
    def setSearchDelay(value: Double): Self = this.set("searchDelay", value.asInstanceOf[js.Any])
  }
}
