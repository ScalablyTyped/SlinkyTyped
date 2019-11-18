package typingsSlinky.typescript.typescriptMod

import typingsSlinky.typescript.typescriptMod.SyntaxKind.KeyOfKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.ReadonlyKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.UniqueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createTypeOperatorNode")
@js.native
object createTypeOperatorNode extends js.Object {
  def apply(operator: KeyOfKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(operator: ReadonlyKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(operator: UniqueKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(`type`: TypeNode): TypeOperatorNode = js.native
}

