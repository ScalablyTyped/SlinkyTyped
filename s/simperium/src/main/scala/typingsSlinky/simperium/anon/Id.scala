package typingsSlinky.simperium.anon

import typingsSlinky.simperium.mod.EntityId
import typingsSlinky.simperium.mod.LocalQueuedChange
import typingsSlinky.simperium.simperiumStrings.modify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id[T] extends LocalQueuedChange[T] {
  
  var id: EntityId = js.native
  
  var `object`: T = js.native
  
  var `type`: modify = js.native
}
object Id {
  
  @scala.inline
  def apply[T](id: EntityId, `object`: T, `type`: modify): Id[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[T]]
  }
  
  @scala.inline
  implicit class IdOps[Self <: Id[_], T] (val x: Self with Id[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: EntityId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: T): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: modify): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
