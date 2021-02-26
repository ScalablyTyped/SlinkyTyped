package typingsSlinky.simperium.mod

import typingsSlinky.simperium.simperiumStrings.full
import typingsSlinky.simperium.simperiumStrings.modify
import typingsSlinky.simperium.simperiumStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.simperium.anon.Id[T]
  - typingsSlinky.simperium.anon.Object[T]
  - typingsSlinky.simperium.anon.Type
*/
trait LocalQueuedChange[T] extends StObject
object LocalQueuedChange {
  
  @scala.inline
  def Id[T](id: EntityId, `object`: T, `type`: modify): typingsSlinky.simperium.anon.Id[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.anon.Id[T]]
  }
  
  @scala.inline
  def Object[T](`object`: T, originalChange: Change[T], `type`: full): typingsSlinky.simperium.anon.Object[T] = {
    val __obj = js.Dynamic.literal(originalChange = originalChange.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.anon.Object[T]]
  }
  
  @scala.inline
  def Type(id: EntityId, `type`: remove): typingsSlinky.simperium.anon.Type = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.simperium.anon.Type]
  }
}
