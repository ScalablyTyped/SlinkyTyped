package typingsSlinky.tern.ternMod

import typingsSlinky.estree.estreeMod.Program
import typingsSlinky.tern.Anon_Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findExpressionAt")
@js.native
object findExpressionAt extends js.Object {
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): Anon_Node | Null = js.native
  def apply(
    ast: Program,
    start: js.UndefOr[scala.Nothing],
    end: Double,
    scope: typingsSlinky.tern.libInferMod.Scope
  ): Anon_Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double): Anon_Node | Null = js.native
  def apply(ast: Program, start: Double, end: Double, scope: typingsSlinky.tern.libInferMod.Scope): Anon_Node | Null = js.native
}

