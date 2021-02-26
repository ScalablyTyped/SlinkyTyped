package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUSER_EXIT_ROOM extends StObject {
  
  var room: SFSRoom = js.native
  
  var user: SFSUser = js.native
}
object IUSER_EXIT_ROOM {
  
  @scala.inline
  def apply(room: SFSRoom, user: SFSUser): IUSER_EXIT_ROOM = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_EXIT_ROOM]
  }
  
  @scala.inline
  implicit class IUSER_EXIT_ROOMMutableBuilder[Self <: IUSER_EXIT_ROOM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoom(value: SFSRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: SFSUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
