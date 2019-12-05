package typingsSlinky.tern.ternMod

import typingsSlinky.estree.estreeMod.Node
import typingsSlinky.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findPropRefs")
@js.native
object findPropRefs extends js.Object {
  def apply(
    ast: Program,
    scope: typingsSlinky.tern.libInferMod.Scope,
    objType: typingsSlinky.tern.libInferMod.Obj,
    propName: String,
    f: js.Function1[/* Node */ Node, Unit]
  ): Unit = js.native
}

