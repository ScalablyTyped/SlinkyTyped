package typingsSlinky.syslogDashClient.syslogDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Severity extends js.Object

@JSImport("syslog-client", "Severity")
@js.native
object Severity extends js.Object {
  @js.native
  sealed trait Alert extends Severity
  
  @js.native
  sealed trait Critical extends Severity
  
  @js.native
  sealed trait Debug extends Severity
  
  @js.native
  sealed trait Emergency extends Severity
  
  @js.native
  sealed trait Error extends Severity
  
  @js.native
  sealed trait Informational extends Severity
  
  @js.native
  sealed trait Notice extends Severity
  
  @js.native
  sealed trait Warning extends Severity
  
  /* 1 */ val Alert: typingsSlinky.syslogDashClient.syslogDashClientMod.Severity.Alert with Double = js.native
  /* 2 */ val Critical: typingsSlinky.syslogDashClient.syslogDashClientMod.Severity.Critical with Double = js.native
  /* 7 */ val Debug: typingsSlinky.syslogDashClient.syslogDashClientMod.Severity.Debug with Double = js.native
  /* 0 */ val Emergency: typingsSlinky.syslogDashClient.syslogDashClientMod.Severity.Emergency with Double = js.native
  /* 3 */ val Error: typingsSlinky.syslogDashClient.syslogDashClientMod.Severity.Error with Double = js.native
  /* 6 */ val Informational: typingsSlinky.syslogDashClient.syslogDashClientMod.Severity.Informational with Double = js.native
  /* 5 */ val Notice: typingsSlinky.syslogDashClient.syslogDashClientMod.Severity.Notice with Double = js.native
  /* 4 */ val Warning: typingsSlinky.syslogDashClient.syslogDashClientMod.Severity.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Severity with Double] = js.native
}

