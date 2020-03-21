package typingsSlinky.tern.mod

import typingsSlinky.estree.mod.Node
import typingsSlinky.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findPropRefs")
@js.native
object findPropRefs extends js.Object {
  def apply(
    ast: Program,
    scope: typingsSlinky.tern.inferMod.Scope,
    objType: typingsSlinky.tern.inferMod.Obj,
    propName: String,
    f: js.Function1[/* Node */ Node, Unit]
  ): Unit = js.native
}

