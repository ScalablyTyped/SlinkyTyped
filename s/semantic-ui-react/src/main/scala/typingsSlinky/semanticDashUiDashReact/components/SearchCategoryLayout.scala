package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesSearchSearchCategoryLayoutMod.SearchCategoryLayoutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchCategoryLayout
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategoryLayout", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    categoryContent: ReactElement,
    resultsContent: ReactElement,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SearchCategoryLayoutProps
}

