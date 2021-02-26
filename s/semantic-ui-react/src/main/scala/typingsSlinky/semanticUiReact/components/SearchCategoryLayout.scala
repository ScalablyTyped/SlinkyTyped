package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.semanticUiReact.searchCategoryLayoutMod.SearchCategoryLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchCategoryLayout {
  
  @scala.inline
  def apply(categoryContent: ReactElement, resultsContent: ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[SearchCategoryLayoutProps]))
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategoryLayout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SearchCategoryLayoutProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
