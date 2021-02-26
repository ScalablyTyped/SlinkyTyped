package typingsSlinky.textBuffer.mod.global.TextBuffer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface that should be implemented for all "point-compatible" objects. */
@js.native
trait PointLike extends StObject {
  
  /** A zero-indexed number representing the column of the Point. */
  var column: Double = js.native
  
  /** A zero-indexed number representing the row of the Point. */
  var row: Double = js.native
}
object PointLike {
  
  @scala.inline
  def apply(column: Double, row: Double): PointLike = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointLike]
  }
  
  @scala.inline
  implicit class PointLikeMutableBuilder[Self <: PointLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
