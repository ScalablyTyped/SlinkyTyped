package typingsSlinky.webcola.powergraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola/dist/src/powergraph", "Configuration")
@js.native
class Configuration[Link] protected () extends js.Object {
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link]) = this()
  def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link], rootGroup: js.Array[_]) = this()
  
  var R: Double = js.native
  
  def allEdges(): js.Array[PowerEdge] = js.native
  
  def getGroupHierarchy(retargetedEdges: js.Array[PowerEdge]): js.Array[_] = js.native
  
  def greedyMerge(): Boolean = js.native
  
  var initModulesFromGroup: js.Any = js.native
  
  var linkAccessor: js.Any = js.native
  
  def merge(a: Module, b: Module): Module = js.native
  def merge(a: Module, b: Module, k: Double): Module = js.native
  
  var modules: js.Array[Module] = js.native
  
  var nEdges: js.Any = js.native
  
  var rootMerges: js.Any = js.native
  
  var roots: js.Array[ModuleSet] = js.native
}
/* static members */
@JSImport("webcola/dist/src/powergraph", "Configuration")
@js.native
object Configuration extends js.Object {
  
  def getEdges(modules: ModuleSet, es: js.Array[PowerEdge]): Unit = js.native
}
