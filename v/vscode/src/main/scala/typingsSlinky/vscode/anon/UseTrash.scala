package typingsSlinky.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTrash extends StObject {
  
  var recursive: js.UndefOr[Boolean] = js.native
  
  var useTrash: js.UndefOr[Boolean] = js.native
}
object UseTrash {
  
  @scala.inline
  def apply(): UseTrash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseTrash]
  }
  
  @scala.inline
  implicit class UseTrashMutableBuilder[Self <: UseTrash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setUseTrash(value: Boolean): Self = StObject.set(x, "useTrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTrashUndefined: Self = StObject.set(x, "useTrash", js.undefined)
  }
}
