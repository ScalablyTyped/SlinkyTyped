package typingsSlinky.winjs.winjsMod.UI

import typingsSlinky.winjs.WinJS.UI.IItem
import typingsSlinky.winjs.WinJS.UI.IListDataSource
import typingsSlinky.winjs.WinJS.UI.ISelectionRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("winjs", "UI.getItemsFromRanges")
@js.native
object getItemsFromRanges extends js.Object {
  /**
    * Retrieves the items in the specified index range.
    * @param dataSource The data source that contains the items to retrieve.
    * @param ranges An array of ISelectionRange objects that have firstIndex and lastIndex values.
    * @returns A Promise that contains an array of the requested IItem objects.
    **/
  def apply[U](dataSource: IListDataSource[U], ranges: js.Array[ISelectionRange]): typingsSlinky.winjs.WinJS.Promise[IItem[U]] = js.native
}

