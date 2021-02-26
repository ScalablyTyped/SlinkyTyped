package typingsSlinky.ts3NodejsLibrary

import typingsSlinky.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.ConnectionParams
import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.QueryProtocolInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sshMod {
  
  @JSImport("ts3-nodejs-library/lib/transport/protocols/ssh", "ProtocolSSH")
  @js.native
  class ProtocolSSH protected () extends QueryProtocolInterface {
    def this(config: ConnectionParams) = this()
    
    var client: js.Any = js.native
    
    /**
      * Called when the connection with the Socket gets closed
      */
    var handleClose: js.Any = js.native
    
    /**
      * called when the Socket receives data
      */
    var handleData: js.Any = js.native
    
    /**
      * Called when the Socket emits an error
      */
    var handleError: js.Any = js.native
    
    /**
      * Called after the Socket has been established
      */
    var handleReady: js.Any = js.native
    
    var stream: js.Any = js.native
  }
}
