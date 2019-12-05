package typingsSlinky.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions", JSImport.Namespace)
@js.native
object libApiExceptionsMod extends js.Object {
  @js.native
  class ContentTypeUnsupportedError ()
    extends typingsSlinky.sipDotJs.libApiExceptionsContentDashTypeDashUnsupportedMod.ContentTypeUnsupportedError {
    def this(message: String) = this()
  }
  
  @js.native
  /** @internal */
  class RequestPendingError ()
    extends typingsSlinky.sipDotJs.libApiExceptionsRequestDashPendingMod.RequestPendingError {
    def this(message: String) = this()
  }
  
  @js.native
  class SessionDescriptionHandlerError ()
    extends typingsSlinky.sipDotJs.libApiExceptionsSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerError {
    def this(message: String) = this()
  }
  
  @js.native
  class SessionTerminatedError ()
    extends typingsSlinky.sipDotJs.libApiExceptionsSessionDashTerminatedMod.SessionTerminatedError
  
  @js.native
  class StateTransitionError ()
    extends typingsSlinky.sipDotJs.libApiExceptionsStateDashTransitionMod.StateTransitionError {
    def this(message: String) = this()
  }
  
}

