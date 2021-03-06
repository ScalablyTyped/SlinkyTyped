package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a table row is clicked by the user.
  */
@js.native
trait TableViewClickEvent extends TableViewBaseEvent {
  
  /**
    * Indicates whether the detail button was clicked. Only `true` if `row.hasDetail` is
    * `true` and the detail button was clicked.
    */
  var detail: Boolean = js.native
  
  /**
    * Row index.
    */
  var index: Double = js.native
  
  /**
    * Table view row object.
    */
  var row: TableViewRow = js.native
  
  /**
    * Properties of the row.
    * When the row is created implicitly using a JavaScript dictionary object,
    * use this property rather than `row` to access any custom row properties.
    * Here's an example of creating a row implicitly, which is not the recommended way.
    * ``` js
    * var data = [{title:'Row 1', hasChild:true, color:'red', selectedColor:'#fff', special:'special 1'},];
    * var table = Ti.UI.createTableView({data: data});
    * ```
    */
  var rowData: Dictionary[TableViewRow] = js.native
  
  /**
    * Indicates whether the table is in search mode.
    */
  var searchMode: Boolean = js.native
  
  /**
    * Table view section object, if the clicked row is contained in a section.
    */
  var section: TableViewSection = js.native
  
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double = js.native
}
object TableViewClickEvent {
  
  @scala.inline
  def apply(
    detail: Boolean,
    index: Double,
    row: TableViewRow,
    rowData: Dictionary[TableViewRow],
    searchMode: Boolean,
    section: TableViewSection,
    source: TableView,
    x: Double,
    y: Double
  ): TableViewClickEvent = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], searchMode = searchMode.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewClickEvent]
  }
  
  @scala.inline
  implicit class TableViewClickEventMutableBuilder[Self <: TableViewClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: Boolean): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: TableViewRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: Dictionary[TableViewRow]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchMode(value: Boolean): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: TableViewSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
