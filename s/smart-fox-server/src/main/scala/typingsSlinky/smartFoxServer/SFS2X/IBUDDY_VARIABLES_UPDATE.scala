package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSBuddy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBUDDY_VARIABLES_UPDATE extends StObject {
  
  var buddy: SFSBuddy = js.native
  
  var changedVars: js.Array[String] = js.native
  
  var isItMe: Boolean = js.native
}
object IBUDDY_VARIABLES_UPDATE {
  
  @scala.inline
  def apply(buddy: SFSBuddy, changedVars: js.Array[String], isItMe: Boolean): IBUDDY_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any], changedVars = changedVars.asInstanceOf[js.Any], isItMe = isItMe.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_VARIABLES_UPDATE]
  }
  
  @scala.inline
  implicit class IBUDDY_VARIABLES_UPDATEMutableBuilder[Self <: IBUDDY_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuddy(value: SFSBuddy): Self = StObject.set(x, "buddy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedVars(value: js.Array[String]): Self = StObject.set(x, "changedVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedVarsVarargs(value: String*): Self = StObject.set(x, "changedVars", js.Array(value :_*))
    
    @scala.inline
    def setIsItMe(value: Boolean): Self = StObject.set(x, "isItMe", value.asInstanceOf[js.Any])
  }
}
