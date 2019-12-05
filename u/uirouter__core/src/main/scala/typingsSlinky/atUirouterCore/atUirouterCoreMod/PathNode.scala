package typingsSlinky.atUirouterCore.atUirouterCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "PathNode")
@js.native
class PathNode protected ()
  extends typingsSlinky.atUirouterCore.libPathMod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: typingsSlinky.atUirouterCore.libPathPathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: typingsSlinky.atUirouterCore.libStateStateObjectMod.StateObject) = this()
}

/* static members */
@JSImport("@uirouter/core", "PathNode")
@js.native
object PathNode extends js.Object {
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  def clone(node: typingsSlinky.atUirouterCore.libPathPathNodeMod.PathNode): typingsSlinky.atUirouterCore.libPathPathNodeMod.PathNode = js.native
}

