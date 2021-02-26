package typingsSlinky.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbAddUserOptions extends StObject {
  
  /**
    * Custom data associated with the user (only Mongodb 2.6 or higher).
    */
  var customData: js.UndefOr[js.Object] = js.native
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.native
  
  /**
    * Roles associated with the created user (only Mongodb 2.6 or higher).
    */
  var roles: js.UndefOr[js.Array[js.Object]] = js.native
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[String | scala.Double] = js.native
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.native
}
object DbAddUserOptions {
  
  @scala.inline
  def apply(): DbAddUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbAddUserOptions]
  }
  
  @scala.inline
  implicit class DbAddUserOptionsMutableBuilder[Self <: DbAddUserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    @scala.inline
    def setJ(value: Boolean): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJUndefined: Self = StObject.set(x, "j", js.undefined)
    
    @scala.inline
    def setRoles(value: js.Array[js.Object]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: js.Object*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    @scala.inline
    def setW(value: String | scala.Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: scala.Double): Self = StObject.set(x, "wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWtimeoutUndefined: Self = StObject.set(x, "wtimeout", js.undefined)
  }
}
