package typingsSlinky.wixUiIconsCommon.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wixUiIconsCommon.categoryListCategoryListMod.CategoryListProps
import typingsSlinky.wixUiIconsCommon.storiesTypesMod.CategoryTableRow
import typingsSlinky.wixUiIconsCommon.typesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CategoryList {
  
  @scala.inline
  def apply(
    iconsMetadata: js.Array[IconMetadata],
    mapIconToRow: IconMetadata => CategoryTableRow,
    searchKeys: js.Array[String],
    tableHeaderTitles: js.Array[String]
  ): Builder = {
    val __props = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], mapIconToRow = js.Any.fromFunction1(mapIconToRow), searchKeys = searchKeys.asInstanceOf[js.Any], tableHeaderTitles = tableHeaderTitles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CategoryListProps]))
  }
  
  @JSImport("wix-ui-icons-common/dist/stories/components/category-list", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CategoryListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
