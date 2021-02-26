package typingsSlinky.simperium.mod

import typingsSlinky.simperium.simperiumStrings.M
import typingsSlinky.simperium.simperiumStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.simperium.mod.ModificationChange[T]
  - typingsSlinky.simperium.mod.RemovalChange
*/
trait Change[T] extends StObject
object Change {
  
  @scala.inline
  def ModificationChange[T](ccid: String, id: String, o: M, v: JSONDiff[T]): typingsSlinky.simperium.mod.ModificationChange[T] = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.mod.ModificationChange[T]]
  }
  
  @scala.inline
  def RemovalChange(ccid: String, id: String, o: `-_`): typingsSlinky.simperium.mod.RemovalChange = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.mod.RemovalChange]
  }
}
