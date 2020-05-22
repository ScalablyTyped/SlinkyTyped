package typingsSlinky.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the start time and duration for an established or prior connection. */
@JSGlobal("Windows.Networking.Connectivity.ConnectivityInterval")
@js.native
abstract class ConnectivityInterval ()
  extends typingsSlinky.winrtUwp.Windows.Networking.Connectivity.ConnectivityInterval {
  /** Indicates the duration of connectivity. */
  /* CompleteClass */
  override var connectionDuration: Double = js.native
  /** Indicates when the connection was initially established. */
  /* CompleteClass */
  override var startTime: js.Date = js.native
}

