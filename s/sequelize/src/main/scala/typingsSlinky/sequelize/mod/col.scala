package typingsSlinky.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait col extends StObject {
  
  var col: String = js.native
}
object col {
  
  @scala.inline
  def apply(col: String): col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any])
    __obj.asInstanceOf[col]
  }
  
  @scala.inline
  implicit class colMutableBuilder[Self <: col] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: String): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
  }
}
