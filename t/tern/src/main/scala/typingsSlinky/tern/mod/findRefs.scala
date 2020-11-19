package typingsSlinky.tern.mod

import typingsSlinky.estree.mod.Node
import typingsSlinky.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern", "findRefs")
@js.native
object findRefs extends js.Object {
  
  def apply(
    ast: Program,
    scope: typingsSlinky.tern.inferMod.Scope,
    name: String,
    refScope: typingsSlinky.tern.inferMod.Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ typingsSlinky.tern.inferMod.Scope, Unit]
  ): Unit = js.native
}
