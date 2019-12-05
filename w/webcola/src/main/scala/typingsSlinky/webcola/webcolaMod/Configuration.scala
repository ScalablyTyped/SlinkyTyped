package typingsSlinky.webcola.webcolaMod

import typingsSlinky.webcola.distSrcPowergraphMod.LinkTypeAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Configuration")
@js.native
class Configuration[Link] protected ()
  extends typingsSlinky.webcola.distSrcPowergraphMod.Configuration[Link] {
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link]) = this()
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link], rootGroup: js.Array[_]) = this()
}

/* static members */
@JSImport("webcola", "Configuration")
@js.native
object Configuration extends js.Object {
  def getEdges(
    modules: typingsSlinky.webcola.distSrcPowergraphMod.ModuleSet,
    es: js.Array[typingsSlinky.webcola.distSrcPowergraphMod.PowerEdge]
  ): Unit = js.native
}

