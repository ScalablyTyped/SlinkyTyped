package typingsSlinky.smartFoxServer.SFS2X.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomPermissions extends StObject {
  
  /** @type {boolean} Sets whether changing the Room name after its creation is allowed or not. */
  var allowNameChange: Boolean = js.native
  
  /** @type {boolean} Sets whether changing (or removing) the Room password after its creation is allowed or not. */
  var allowPasswordStateChange: Boolean = js.native
  
  /** @type {boolean} Sets whether users inside the Room are allowed to send public messages or not. */
  var allowPublicMessages: Boolean = js.native
  
  /** @type {boolean} Sets whether the Room capacity can be changed after its creation or not. */
  var aloowResizing: Boolean = js.native
}
object RoomPermissions {
  
  @scala.inline
  def apply(
    allowNameChange: Boolean,
    allowPasswordStateChange: Boolean,
    allowPublicMessages: Boolean,
    aloowResizing: Boolean
  ): RoomPermissions = {
    val __obj = js.Dynamic.literal(allowNameChange = allowNameChange.asInstanceOf[js.Any], allowPasswordStateChange = allowPasswordStateChange.asInstanceOf[js.Any], allowPublicMessages = allowPublicMessages.asInstanceOf[js.Any], aloowResizing = aloowResizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomPermissions]
  }
  
  @scala.inline
  implicit class RoomPermissionsMutableBuilder[Self <: RoomPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNameChange(value: Boolean): Self = StObject.set(x, "allowNameChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPasswordStateChange(value: Boolean): Self = StObject.set(x, "allowPasswordStateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPublicMessages(value: Boolean): Self = StObject.set(x, "allowPublicMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAloowResizing(value: Boolean): Self = StObject.set(x, "aloowResizing", value.asInstanceOf[js.Any])
  }
}
