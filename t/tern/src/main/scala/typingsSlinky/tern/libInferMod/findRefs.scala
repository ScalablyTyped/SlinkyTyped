package typingsSlinky.tern.libInferMod

import typingsSlinky.estree.estreeMod.Node
import typingsSlinky.estree.estreeMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "findRefs")
@js.native
object findRefs extends js.Object {
  def apply(
    ast: Program,
    scope: Scope,
    name: String,
    refScope: Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ Scope, Unit]
  ): Unit = js.native
}

