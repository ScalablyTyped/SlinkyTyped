package typingsSlinky.sipDotJs.libApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "SessionState")
@js.native
object SessionState extends js.Object {
  /* "Established" */ val Established: typingsSlinky.sipDotJs.libApiSessionDashStateMod.SessionState.Established with String = js.native
  /* "Establishing" */ val Establishing: typingsSlinky.sipDotJs.libApiSessionDashStateMod.SessionState.Establishing with String = js.native
  /* "Initial" */ val Initial: typingsSlinky.sipDotJs.libApiSessionDashStateMod.SessionState.Initial with String = js.native
  /* "Terminated" */ val Terminated: typingsSlinky.sipDotJs.libApiSessionDashStateMod.SessionState.Terminated with String = js.native
  /* "Terminating" */ val Terminating: typingsSlinky.sipDotJs.libApiSessionDashStateMod.SessionState.Terminating with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.sipDotJs.libApiSessionDashStateMod.SessionState with String] = js.native
}

