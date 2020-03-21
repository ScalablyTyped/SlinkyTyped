package typingsSlinky.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object socketMod {
  type CommandHandlers = org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* frame */ typingsSlinky.node.streamMod.Writable, 
      /* callback */ typingsSlinky.stompit.socketMod.commandHandler, 
      scala.Unit
    ]
  ]
  type Heartbeat = js.Array[scala.Double]
  type commandHandler = js.Function1[/* frame */ typingsSlinky.node.streamMod.Writable, scala.Unit]
}
