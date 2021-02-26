package typingsSlinky.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionsMod {
  
  @JSImport("sip.js/lib/api/exceptions", "ContentTypeUnsupportedError")
  @js.native
  class ContentTypeUnsupportedError ()
    extends typingsSlinky.sipJs.contentTypeUnsupportedMod.ContentTypeUnsupportedError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api/exceptions", "RequestPendingError")
  @js.native
  /** @internal */
  class RequestPendingError ()
    extends typingsSlinky.sipJs.requestPendingMod.RequestPendingError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api/exceptions", "SessionDescriptionHandlerError")
  @js.native
  class SessionDescriptionHandlerError ()
    extends typingsSlinky.sipJs.sessionDescriptionHandlerMod.SessionDescriptionHandlerError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api/exceptions", "SessionTerminatedError")
  @js.native
  class SessionTerminatedError ()
    extends typingsSlinky.sipJs.sessionTerminatedMod.SessionTerminatedError
  
  @JSImport("sip.js/lib/api/exceptions", "StateTransitionError")
  @js.native
  class StateTransitionError ()
    extends typingsSlinky.sipJs.stateTransitionMod.StateTransitionError {
    def this(message: String) = this()
  }
}
