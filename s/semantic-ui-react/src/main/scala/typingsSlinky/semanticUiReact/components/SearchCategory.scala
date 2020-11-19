package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.searchCategoryMod.SearchCategoryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchCategory {
  
  @JSImport("semantic-ui-react", "SearchCategory")
  @js.native
  object component extends js.Object
  
  def withProps(p: SearchCategoryProps): SharedBuilder_SearchCategoryProps1350341774 = new SharedBuilder_SearchCategoryProps1350341774(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SearchCategory.type): SharedBuilder_SearchCategoryProps1350341774 = new SharedBuilder_SearchCategoryProps1350341774(js.Array(this.component, js.Dictionary.empty))()
}
