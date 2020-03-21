package typingsSlinky.socketclusterClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transportMod {
  type EventObjectCallback = js.Function2[
    /* error */ js.Error, 
    /* eventObject */ typingsSlinky.socketclusterClient.transportMod.EventObject, 
    scala.Unit
  ]
}
