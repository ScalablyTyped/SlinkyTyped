package typingsSlinky.tern.inferMod

import typingsSlinky.estree.mod.Program
import typingsSlinky.tern.anon.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "findExpressionAround")
@js.native
object findExpressionAround extends js.Object {
  def apply(ast: Program, start: js.UndefOr[Double], end: Double): Node | Null = js.native
  def apply(ast: Program, start: js.UndefOr[Double], end: Double, scope: Scope): Node | Null = js.native
}

