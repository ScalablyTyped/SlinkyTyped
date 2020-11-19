package typingsSlinky.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing a cell position within the viewport of the terminal.
  */
@js.native
trait IViewportRangePosition extends js.Object {
  
  /**
    * The x position of the cell. This is a 0-based index that refers to the
    * space in between columns, not the column itself. Index 0 refers to the
    * left side of the viewport, index `Terminal.cols` refers to the right side
    * of the viewport. This can be thought of as how a cursor is positioned in
    * a text editor.
    */
  var x: Double = js.native
  
  /**
    * The y position of the cell. This is a 0-based index that refers to a
    * specific row.
    */
  var y: Double = js.native
}
object IViewportRangePosition {
  
  @scala.inline
  def apply(x: Double, y: Double): IViewportRangePosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewportRangePosition]
  }
  
  @scala.inline
  implicit class IViewportRangePositionOps[Self <: IViewportRangePosition] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
