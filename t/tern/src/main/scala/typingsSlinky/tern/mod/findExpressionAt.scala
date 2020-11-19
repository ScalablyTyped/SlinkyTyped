package typingsSlinky.tern.mod

import typingsSlinky.estree.mod.Program
import typingsSlinky.tern.anon.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern", "findExpressionAt")
@js.native
object findExpressionAt extends js.Object {
  
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): Node | Null = js.native
  def apply(
    ast: Program,
    start: js.UndefOr[scala.Nothing],
    end: Double,
    scope: typingsSlinky.tern.inferMod.Scope
  ): Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double): Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double, scope: typingsSlinky.tern.inferMod.Scope): Node | Null = js.native
}
