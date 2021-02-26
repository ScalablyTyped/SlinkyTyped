package typingsSlinky.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusMod {
  
  @js.native
  sealed trait Status extends StObject
  @JSImport("@sentry/types/dist/status", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Status with String] = js.native
    
    /** A server-side error ocurred during submission. */
    @js.native
    sealed trait Failed extends Status
    /* "failed" */ val Failed: typingsSlinky.sentryTypes.statusMod.Status.Failed with String = js.native
    
    /** The event could not be processed. */
    @js.native
    sealed trait Invalid extends Status
    /* "invalid" */ val Invalid: typingsSlinky.sentryTypes.statusMod.Status.Invalid with String = js.native
    
    /** The client is currently rate limited and will try again later. */
    @js.native
    sealed trait RateLimit extends Status
    /* "rate_limit" */ val RateLimit: typingsSlinky.sentryTypes.statusMod.Status.RateLimit with String = js.native
    
    /** The event was skipped due to configuration or callbacks. */
    @js.native
    sealed trait Skipped extends Status
    /* "skipped" */ val Skipped: typingsSlinky.sentryTypes.statusMod.Status.Skipped with String = js.native
    
    /** The event was sent to Sentry successfully. */
    @js.native
    sealed trait Success extends Status
    /* "success" */ val Success: typingsSlinky.sentryTypes.statusMod.Status.Success with String = js.native
    
    /** The status could not be determined. */
    @js.native
    sealed trait Unknown extends Status
    /* "unknown" */ val Unknown: typingsSlinky.sentryTypes.statusMod.Status.Unknown with String = js.native
    
    /**
      * Converts a HTTP status code into a {@link Status}.
      *
      * @param code The HTTP response status code.
      * @returns The send status or {@link Status.Unknown}.
      */
    def fromHttpCode(code: Double): Status = js.native
  }
}
