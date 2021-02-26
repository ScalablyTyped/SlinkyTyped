package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSBuddy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBUDDY_REMOVE extends StObject {
  
  var buddy: SFSBuddy = js.native
}
object IBUDDY_REMOVE {
  
  @scala.inline
  def apply(buddy: SFSBuddy): IBUDDY_REMOVE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_REMOVE]
  }
  
  @scala.inline
  implicit class IBUDDY_REMOVEMutableBuilder[Self <: IBUDDY_REMOVE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuddy(value: SFSBuddy): Self = StObject.set(x, "buddy", value.asInstanceOf[js.Any])
  }
}
