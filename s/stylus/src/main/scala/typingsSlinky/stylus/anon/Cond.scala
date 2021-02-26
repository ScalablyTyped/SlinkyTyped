package typingsSlinky.stylus.anon

import typingsSlinky.stylus.mod.Stylus.Nodes.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cond extends StObject {
  
  var __type: String = js.native
  
  var block: typingsSlinky.stylus.mod.Stylus.Nodes.Block = js.native
  
  var column: Double = js.native
  
  var cond: Expression = js.native
  
  var elses: js.Array[Expression] = js.native
  
  var filename: String = js.native
  
  var lineno: Double = js.native
  
  var negate: Boolean = js.native
}
object Cond {
  
  @scala.inline
  def apply(
    __type: String,
    block: typingsSlinky.stylus.mod.Stylus.Nodes.Block,
    column: Double,
    cond: Expression,
    elses: js.Array[Expression],
    filename: String,
    lineno: Double,
    negate: Boolean
  ): Cond = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], elses = elses.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cond]
  }
  
  @scala.inline
  implicit class CondMutableBuilder[Self <: Cond] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: typingsSlinky.stylus.mod.Stylus.Nodes.Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCond(value: Expression): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElses(value: js.Array[Expression]): Self = StObject.set(x, "elses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElsesVarargs(value: Expression*): Self = StObject.set(x, "elses", js.Array(value :_*))
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
