package typingsSlinky.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'searchFullText'> */
@js.native
trait PickImplsearchFullText extends js.Object {
  
  var searchFullText: Boolean = js.native
}
object PickImplsearchFullText {
  
  @scala.inline
  def apply(searchFullText: Boolean): PickImplsearchFullText = {
    val __obj = js.Dynamic.literal(searchFullText = searchFullText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchFullText]
  }
  
  @scala.inline
  implicit class PickImplsearchFullTextOps[Self <: PickImplsearchFullText] (val x: Self) extends AnyVal {
    
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
    def setSearchFullText(value: Boolean): Self = this.set("searchFullText", value.asInstanceOf[js.Any])
  }
}
