package typingsSlinky.tablesorter.widgetOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tablesorter.columnWidgetOptionsMod.ColumnOptions
import typingsSlinky.tablesorter.filterOptionsMod.FilterOptions
import typingsSlinky.tablesorter.pagerOptionsMod.PagerOptions
import typingsSlinky.tablesorter.resizingOptionsMod.ResizingOptions
import typingsSlinky.tablesorter.saveSortOptionsMod.SaveSortOptions
import typingsSlinky.tablesorter.stickyHeaderOptionsMod.StickyHeaderOptions
import typingsSlinky.tablesorter.zebraOptionsMod.ZebraOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetOptions[TElement]
  extends ColumnOptions
     with FilterOptions[TElement]
     with ResizingOptions
     with SaveSortOptions
     with StickyHeaderOptions
     with PagerOptions[TElement]
     with ZebraOptions
     with /* option */ StringDictionary[js.Any]
object WidgetOptions {
  
  @scala.inline
  def apply[TElement](): WidgetOptions[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetOptions[TElement]]
  }
}
