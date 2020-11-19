package typingsSlinky.tern.inferMod

import typingsSlinky.estree.mod.Program
import typingsSlinky.tern.anon.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern/lib/infer", "findClosestExpression")
@js.native
object findClosestExpression extends js.Object {
  
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): Node | Null = js.native
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: Scope): Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double): Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double, scope: Scope): Node | Null = js.native
}
