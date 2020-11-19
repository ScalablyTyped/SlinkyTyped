package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a table row is clicked by the user.
  */
@js.native
trait TableViewRowClickEvent extends TableViewRowBaseEvent {
  
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
    * Dictionary containing the properties set on the row.
    */
  var rowData: Dictionary[TableViewRow] = js.native
  
  /**
    * Boolean to indicate if the table is in search mode.
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
object TableViewRowClickEvent {
  
  @scala.inline
  def apply(
    detail: Boolean,
    index: Double,
    row: TableViewRow,
    rowData: Dictionary[TableViewRow],
    searchMode: Boolean,
    section: TableViewSection,
    source: TableViewRow,
    x: Double,
    y: Double
  ): TableViewRowClickEvent = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], searchMode = searchMode.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewRowClickEvent]
  }
  
  @scala.inline
  implicit class TableViewRowClickEventOps[Self <: TableViewRowClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetail(value: Boolean): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: TableViewRow): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: Dictionary[TableViewRow]): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchMode(value: Boolean): Self = this.set("searchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: TableViewSection): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
