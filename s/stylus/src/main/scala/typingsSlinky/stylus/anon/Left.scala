package typingsSlinky.stylus.anon

import typingsSlinky.stylus.mod.Stylus.Nodes.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Left extends StObject {
  
  var __type: String = js.native
  
  var column: Double = js.native
  
  var filename: String = js.native
  
  var left: Expression = js.native
  
  var lineno: Double = js.native
  
  var op: String = js.native
  
  var right: Expression = js.native
}
object Left {
  
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    left: Expression,
    lineno: Double,
    op: String,
    right: Expression
  ): Left = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  
  @scala.inline
  implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
