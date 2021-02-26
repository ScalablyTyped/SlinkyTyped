package typingsSlinky.tern.ternMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameQueryResult extends StObject {
  
  /** Array of changes that must be performed to apply the rename. The client is responsible for doing the actual modification. */
  var changes: js.Array[typingsSlinky.tern.anon.File] = js.native
}
object RenameQueryResult {
  
  @scala.inline
  def apply(changes: js.Array[typingsSlinky.tern.anon.File]): RenameQueryResult = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameQueryResult]
  }
  
  @scala.inline
  implicit class RenameQueryResultMutableBuilder[Self <: RenameQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[typingsSlinky.tern.anon.File]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: typingsSlinky.tern.anon.File*): Self = StObject.set(x, "changes", js.Array(value :_*))
  }
}
