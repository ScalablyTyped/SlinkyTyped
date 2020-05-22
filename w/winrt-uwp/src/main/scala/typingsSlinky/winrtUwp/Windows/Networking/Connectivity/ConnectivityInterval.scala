package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the start time and duration for an established or prior connection. */
trait ConnectivityInterval extends js.Object {
  /** Indicates the duration of connectivity. */
  var connectionDuration: Double
  /** Indicates when the connection was initially established. */
  var startTime: js.Date
}

object ConnectivityInterval {
  @scala.inline
  def apply(connectionDuration: Double, startTime: js.Date): ConnectivityInterval = {
    val __obj = js.Dynamic.literal(connectionDuration = connectionDuration.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectivityInterval]
  }
}

