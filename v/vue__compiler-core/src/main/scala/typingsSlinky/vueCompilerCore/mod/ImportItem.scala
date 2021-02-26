package typingsSlinky.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportItem extends StObject {
  
  var exp: String | ExpressionNode = js.native
  
  var path: String = js.native
}
object ImportItem {
  
  @scala.inline
  def apply(exp: String | ExpressionNode, path: String): ImportItem = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportItem]
  }
  
  @scala.inline
  implicit class ImportItemMutableBuilder[Self <: ImportItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExp(value: String | ExpressionNode): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
