package typingsSlinky.tern.mod

import typingsSlinky.estree.mod.Program
import typingsSlinky.tern.AnonNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "findExpressionAround")
@js.native
object findExpressionAround extends js.Object {
  def apply(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): AnonNode | Null = js.native
  def apply(
    ast: Program,
    start: js.UndefOr[scala.Nothing],
    end: Double,
    scope: typingsSlinky.tern.inferMod.Scope
  ): AnonNode | Null = js.native
  def apply(ast: Program, start: Double, end: Double): AnonNode | Null = js.native
  def apply(ast: Program, start: Double, end: Double, scope: typingsSlinky.tern.inferMod.Scope): AnonNode | Null = js.native
}

