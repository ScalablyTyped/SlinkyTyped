package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.Invitation.SFSInvitation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IINVITATION extends StObject {
  
  var invitation: SFSInvitation = js.native
}
object IINVITATION {
  
  @scala.inline
  def apply(invitation: SFSInvitation): IINVITATION = {
    val __obj = js.Dynamic.literal(invitation = invitation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IINVITATION]
  }
  
  @scala.inline
  implicit class IINVITATIONMutableBuilder[Self <: IINVITATION] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitation(value: SFSInvitation): Self = StObject.set(x, "invitation", value.asInstanceOf[js.Any])
  }
}
