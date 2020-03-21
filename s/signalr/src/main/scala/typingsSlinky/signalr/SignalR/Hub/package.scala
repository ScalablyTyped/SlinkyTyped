package typingsSlinky.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Hub {
  type HubCreator = js.Function2[
    /* url */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[typingsSlinky.signalr.SignalR.Hub.Options], 
    typingsSlinky.signalr.SignalR.Hub.Connection
  ]
}
