package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IROOM_REMOVE extends js.Object {
  
  var room: SFSRoom = js.native
}
object IROOM_REMOVE {
  
  @scala.inline
  def apply(room: SFSRoom): IROOM_REMOVE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_REMOVE]
  }
  
  @scala.inline
  implicit class IROOM_REMOVEOps[Self <: IROOM_REMOVE] (val x: Self) extends AnyVal {
    
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
    def setRoom(value: SFSRoom): Self = this.set("room", value.asInstanceOf[js.Any])
  }
}
