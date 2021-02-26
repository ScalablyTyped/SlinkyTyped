package typingsSlinky.uirouterAngularjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "PathNode")
@js.native
class PathNode protected ()
  extends typingsSlinky.uirouterCore.mod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: typingsSlinky.uirouterCore.pathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: typingsSlinky.uirouterCore.stateObjectMod.StateObject) = this()
}
/* static members */
object PathNode {
  
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  @JSImport("@uirouter/angularjs", "PathNode.clone")
  @js.native
  def clone(node: typingsSlinky.uirouterCore.pathNodeMod.PathNode): typingsSlinky.uirouterCore.pathNodeMod.PathNode = js.native
}
