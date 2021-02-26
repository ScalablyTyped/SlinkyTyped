package typingsSlinky.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A range within a buffer.
  */
@js.native
trait IBufferRange extends StObject {
  
  /**
    * The end position of the range.
    */
  var end: IBufferCellPosition = js.native
  
  /**
    * The start position of the range.
    */
  var start: IBufferCellPosition = js.native
}
object IBufferRange {
  
  @scala.inline
  def apply(end: IBufferCellPosition, start: IBufferCellPosition): IBufferRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferRange]
  }
  
  @scala.inline
  implicit class IBufferRangeMutableBuilder[Self <: IBufferRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: IBufferCellPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: IBufferCellPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
