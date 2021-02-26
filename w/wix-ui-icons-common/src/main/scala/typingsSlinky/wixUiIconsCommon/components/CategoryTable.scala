package typingsSlinky.wixUiIconsCommon.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wixUiIconsCommon.categoryTableCategoryTableMod.CategoryTableProps
import typingsSlinky.wixUiIconsCommon.storiesTypesMod.CategoryTableRow
import typingsSlinky.wixUiIconsCommon.typesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CategoryTable {
  
  @scala.inline
  def apply(
    iconsMetadata: js.Array[IconMetadata],
    mapIconToRow: IconMetadata => CategoryTableRow,
    tableHeaderTitles: js.Array[String],
    title: String
  ): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], mapIconToRow = js.Any.fromFunction1(mapIconToRow), tableHeaderTitles = tableHeaderTitles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[CategoryTableProps]))
  }
  
  @JSImport("wix-ui-icons-common/dist/stories/components/category-table", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CategoryTableProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
