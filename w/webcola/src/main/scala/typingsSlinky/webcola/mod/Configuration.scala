package typingsSlinky.webcola.mod

import typingsSlinky.webcola.powergraphMod.LinkTypeAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Configuration")
@js.native
class Configuration[Link] protected ()
  extends typingsSlinky.webcola.powergraphMod.Configuration[Link] {
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link]) = this()
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link], rootGroup: js.Array[_]) = this()
}

/* static members */
@JSImport("webcola", "Configuration")
@js.native
object Configuration extends js.Object {
  def getEdges(
    modules: typingsSlinky.webcola.powergraphMod.ModuleSet,
    es: js.Array[typingsSlinky.webcola.powergraphMod.PowerEdge]
  ): Unit = js.native
}

