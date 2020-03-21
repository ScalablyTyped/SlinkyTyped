package typingsSlinky.uirouterCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "PathNode")
@js.native
class PathNode protected ()
  extends typingsSlinky.uirouterCore.pathMod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: typingsSlinky.uirouterCore.pathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: typingsSlinky.uirouterCore.stateObjectMod.StateObject) = this()
}

/* static members */
@JSImport("@uirouter/core", "PathNode")
@js.native
object PathNode extends js.Object {
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  def clone(node: typingsSlinky.uirouterCore.pathNodeMod.PathNode): typingsSlinky.uirouterCore.pathNodeMod.PathNode = js.native
}

