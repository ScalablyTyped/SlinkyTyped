package typingsSlinky.tern.inferMod

import typingsSlinky.estree.mod.Node
import typingsSlinky.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern/lib/infer", "findPropRefs")
@js.native
object findPropRefs extends js.Object {
  
  def apply(ast: Program, scope: Scope, objType: Obj, propName: String, f: js.Function1[/* Node */ Node, Unit]): Unit = js.native
}
