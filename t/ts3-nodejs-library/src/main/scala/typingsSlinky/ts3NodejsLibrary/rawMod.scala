package typingsSlinky.ts3NodejsLibrary

import typingsSlinky.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.ConnectionParams
import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.QueryProtocolInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts3-nodejs-library/lib/transport/protocols/raw", JSImport.Namespace)
@js.native
object rawMod extends js.Object {
  
  @js.native
  class ProtocolRAW protected () extends QueryProtocolInterface {
    def this(config: ConnectionParams) = this()
    
    /**
      * called when the connection with the Socket gets closed
      */
    var handleClose: js.Any = js.native
    
    /**
      * Called after the Socket has been established
      */
    var handleConnect: js.Any = js.native
    
    /**
      * called when the Socket receives data
      * Splits the data with every newline
      */
    var handleData: js.Any = js.native
    
    /**
      * called when the Socket emits an error
      */
    var handleError: js.Any = js.native
    
    /**
      * Called after the socket was not able to connect within the given timeframe
      */
    var handleTimeout: js.Any = js.native
    
    var socket: js.Any = js.native
  }
}
