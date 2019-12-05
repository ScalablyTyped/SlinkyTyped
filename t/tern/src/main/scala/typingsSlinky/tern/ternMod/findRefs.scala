package typingsSlinky.tern.ternMod

import typingsSlinky.estree.estreeMod.Node
import typingsSlinky.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findRefs")
@js.native
object findRefs extends js.Object {
  def apply(
    ast: Program,
    scope: typingsSlinky.tern.libInferMod.Scope,
    name: String,
    refScope: typingsSlinky.tern.libInferMod.Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ typingsSlinky.tern.libInferMod.Scope, Unit]
  ): Unit = js.native
}

