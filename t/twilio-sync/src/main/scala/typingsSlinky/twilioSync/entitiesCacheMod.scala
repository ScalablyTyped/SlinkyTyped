package typingsSlinky.twilioSync

import typingsSlinky.twilioSync.entityMod.SyncEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitiesCacheMod {
  
  @JSImport("twilio-sync/lib/entitiesCache", "EntitiesCache")
  @js.native
  class EntitiesCache () extends StObject {
    
    val entities: js.Any = js.native
    
    def get(id: String, `type`: String): SyncEntity = js.native
    
    /* protected */ def getResolved(id: String, `type`: String): SyncEntity = js.native
    
    val names: js.Any = js.native
    
    def remove(sid: String): Unit = js.native
    
    def store[T /* <: SyncEntity */](entity: T): T = js.native
  }
}
