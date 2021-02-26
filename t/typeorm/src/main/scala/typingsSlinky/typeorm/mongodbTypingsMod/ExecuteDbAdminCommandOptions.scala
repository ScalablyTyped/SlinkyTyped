package typingsSlinky.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteDbAdminCommandOptions extends StObject {
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED,
    * ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.native
}
object ExecuteDbAdminCommandOptions {
  
  @scala.inline
  def apply(): ExecuteDbAdminCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteDbAdminCommandOptions]
  }
  
  @scala.inline
  implicit class ExecuteDbAdminCommandOptionsMutableBuilder[Self <: ExecuteDbAdminCommandOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
