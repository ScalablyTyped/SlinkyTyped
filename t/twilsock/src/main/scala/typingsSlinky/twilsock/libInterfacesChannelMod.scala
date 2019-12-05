package typingsSlinky.twilsock

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/interfaces/channel", JSImport.Namespace)
@js.native
object libInterfacesChannelMod extends js.Object {
  @js.native
  trait Channel extends EventEmitter {
    var isConnected: Boolean = js.native
    def send(message: scala.scalajs.js.typedarray.ArrayBuffer): Unit = js.native
  }
  
}

