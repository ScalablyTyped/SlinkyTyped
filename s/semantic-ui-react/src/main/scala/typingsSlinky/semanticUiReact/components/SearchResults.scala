package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.searchResultsMod.SearchResultsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchResults {
  
  @JSImport("semantic-ui-react", "SearchResults")
  @js.native
  object component extends js.Object
  
  def withProps(p: SearchResultsProps): SharedBuilder_SearchResultsProps_397260772 = new SharedBuilder_SearchResultsProps_397260772(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SearchResults.type): SharedBuilder_SearchResultsProps_397260772 = new SharedBuilder_SearchResultsProps_397260772(js.Array(this.component, js.Dictionary.empty))()
}
