package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ArrayLiteralExpression
import typingsSlinky.typescript.mod.BinaryExpression
import typingsSlinky.typescript.mod.DestructuringAssignment
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createAssignment")
@js.native
object createAssignment extends js.Object {
  def apply(left: ArrayLiteralExpression, right: Expression): DestructuringAssignment = js.native
  def apply(left: Expression, right: Expression): BinaryExpression = js.native
  def apply(left: ObjectLiteralExpression, right: Expression): DestructuringAssignment = js.native
}

