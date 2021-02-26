package typingsSlinky.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/types", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sentryTypes.loglevelMod.LogLevel with Double] = js.native
    
    /* 2 */ val Debug: typingsSlinky.sentryTypes.loglevelMod.LogLevel.Debug with Double = js.native
    
    /* 1 */ val Error: typingsSlinky.sentryTypes.loglevelMod.LogLevel.Error with Double = js.native
    
    /* 0 */ val None: typingsSlinky.sentryTypes.loglevelMod.LogLevel.None with Double = js.native
    
    /* 3 */ val Verbose: typingsSlinky.sentryTypes.loglevelMod.LogLevel.Verbose with Double = js.native
  }
  
  @JSImport("@sentry/types", "SessionStatus")
  @js.native
  object SessionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sentryTypes.sessionMod.SessionStatus with String] = js.native
    
    /* "abnormal" */ val Abnormal: typingsSlinky.sentryTypes.sessionMod.SessionStatus.Abnormal with String = js.native
    
    /* "crashed" */ val Crashed: typingsSlinky.sentryTypes.sessionMod.SessionStatus.Crashed with String = js.native
    
    /* "exited" */ val Exited: typingsSlinky.sentryTypes.sessionMod.SessionStatus.Exited with String = js.native
    
    /* "ok" */ val Ok: typingsSlinky.sentryTypes.sessionMod.SessionStatus.Ok with String = js.native
  }
  
  @JSImport("@sentry/types", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sentryTypes.severityMod.Severity with String] = js.native
    
    /* "critical" */ val Critical: typingsSlinky.sentryTypes.severityMod.Severity.Critical with String = js.native
    
    /* "debug" */ val Debug: typingsSlinky.sentryTypes.severityMod.Severity.Debug with String = js.native
    
    /* "error" */ val Error: typingsSlinky.sentryTypes.severityMod.Severity.Error with String = js.native
    
    /* "fatal" */ val Fatal: typingsSlinky.sentryTypes.severityMod.Severity.Fatal with String = js.native
    
    /* "info" */ val Info: typingsSlinky.sentryTypes.severityMod.Severity.Info with String = js.native
    
    /* "log" */ val Log: typingsSlinky.sentryTypes.severityMod.Severity.Log with String = js.native
    
    /* "warning" */ val Warning: typingsSlinky.sentryTypes.severityMod.Severity.Warning with String = js.native
    
    /**
      * Converts a string-based level into a {@link Severity}.
      *
      * @param level string representation of Severity
      * @returns Severity
      */
    def fromString(level: String): typingsSlinky.sentryTypes.severityMod.Severity = js.native
  }
  
  @JSImport("@sentry/types", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.sentryTypes.statusMod.Status with String] = js.native
    
    /* "failed" */ val Failed: typingsSlinky.sentryTypes.statusMod.Status.Failed with String = js.native
    
    /* "invalid" */ val Invalid: typingsSlinky.sentryTypes.statusMod.Status.Invalid with String = js.native
    
    /* "rate_limit" */ val RateLimit: typingsSlinky.sentryTypes.statusMod.Status.RateLimit with String = js.native
    
    /* "skipped" */ val Skipped: typingsSlinky.sentryTypes.statusMod.Status.Skipped with String = js.native
    
    /* "success" */ val Success: typingsSlinky.sentryTypes.statusMod.Status.Success with String = js.native
    
    /* "unknown" */ val Unknown: typingsSlinky.sentryTypes.statusMod.Status.Unknown with String = js.native
    
    /**
      * Converts a HTTP status code into a {@link Status}.
      *
      * @param code The HTTP response status code.
      * @returns The send status or {@link Status.Unknown}.
      */
    def fromHttpCode(code: Double): typingsSlinky.sentryTypes.statusMod.Status = js.native
  }
}
