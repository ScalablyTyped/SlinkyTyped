package typingsSlinky.twilioSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-sync/lib/configuration", JSImport.Namespace)
@js.native
object configurationMod extends js.Object {
  
  @js.native
  /**
    * @param {Object} options
    */
  class Configuration () extends js.Object {
    def this(options: js.Any) = this()
    
    def backoffConfig: js.Any = js.native
    
    def documentsUri: String = js.native
    
    def insightsUri: String = js.native
    
    def listsUri: String = js.native
    
    def mapsUri: String = js.native
    
    def sessionStorageEnabled: Boolean = js.native
    
    var settings: js.Any = js.native
    
    def streamsUri: String = js.native
    
    def subscriptionsUri: String = js.native
  }
}
