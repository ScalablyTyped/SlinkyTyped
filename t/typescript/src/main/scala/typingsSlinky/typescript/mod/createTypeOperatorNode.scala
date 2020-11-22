package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.KeyOfKeyword
import typingsSlinky.typescript.mod.SyntaxKind.UniqueKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTypeOperatorNode")
@js.native
object createTypeOperatorNode extends js.Object {
  
  /** @deprecated Use `factory.createTypeOperatorNode` or the factory supplied by your transformation context instead. */
  def apply(operator: KeyOfKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(operator: typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def apply(operator: UniqueKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  /** @deprecated Use `factory.createTypeOperatorNode` or the factory supplied by your transformation context instead. */
  def apply(`type`: TypeNode): TypeOperatorNode = js.native
}
