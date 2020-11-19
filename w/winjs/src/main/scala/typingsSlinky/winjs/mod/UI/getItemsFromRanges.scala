package typingsSlinky.winjs.mod.UI

import typingsSlinky.winjs.WinJS.Promise
import typingsSlinky.winjs.WinJS.UI.IItem
import typingsSlinky.winjs.WinJS.UI.IListDataSource
import typingsSlinky.winjs.WinJS.UI.ISelectionRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("winjs", "UI.getItemsFromRanges")
@js.native
object getItemsFromRanges extends js.Object {
  
  /**
    * Retrieves the items in the specified index range.
    * @param dataSource The data source that contains the items to retrieve.
    * @param ranges An array of ISelectionRange objects that have firstIndex and lastIndex values.
    * @returns A Promise that contains an array of the requested IItem objects.
    **/
  def apply[U](dataSource: IListDataSource[U], ranges: js.Array[ISelectionRange]): Promise[IItem[U]] = js.native
}
