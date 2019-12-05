package typingsSlinky.stoppable

import typingsSlinky.node.httpMod.Server
import typingsSlinky.stoppable.stoppableMod.StoppableServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stoppable", JSImport.Namespace)
@js.native
object stoppableMod extends js.Object {
  @js.native
  trait StoppableServer extends Server {
    def stop(): Unit = js.native
    def stop(callback: js.Function2[/* e */ js.Error, /* gracefully */ Boolean, Unit]): Unit = js.native
  }
  
  def apply(server: Server): StoppableServer = js.native
  def apply(server: Server, grace: Double): StoppableServer = js.native
}

