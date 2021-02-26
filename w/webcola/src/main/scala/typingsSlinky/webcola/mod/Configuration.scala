package typingsSlinky.webcola.mod

import typingsSlinky.webcola.powergraphMod.LinkTypeAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Configuration")
@js.native
class Configuration[Link] protected ()
  extends typingsSlinky.webcola.powergraphMod.Configuration[Link] {
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link]) = this()
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link], rootGroup: js.Array[_]) = this()
}
/* static members */
object Configuration {
  
  @JSImport("webcola", "Configuration.getEdges")
  @js.native
  def getEdges(
    modules: typingsSlinky.webcola.powergraphMod.ModuleSet,
    es: js.Array[typingsSlinky.webcola.powergraphMod.PowerEdge]
  ): Unit = js.native
}
