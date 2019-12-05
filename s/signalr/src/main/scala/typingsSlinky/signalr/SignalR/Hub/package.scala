package typingsSlinky.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Hub {
  type HubCreator = js.Function2[
    /* url */ js.UndefOr[String], 
    /* options */ js.UndefOr[Options], 
    typingsSlinky.signalr.SignalR.Hub.Connection
  ]
}
