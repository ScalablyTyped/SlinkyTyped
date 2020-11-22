package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.FalseLiteral
import typingsSlinky.typescript.mod.LiteralExpression
import typingsSlinky.typescript.mod.LiteralTypeNode
import typingsSlinky.typescript.mod.NullLiteral
import typingsSlinky.typescript.mod.PrefixUnaryExpression
import typingsSlinky.typescript.mod.TrueLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createLiteralTypeNode")
@js.native
object createLiteralTypeNode extends js.Object {
  
  def apply(literal: FalseLiteral): LiteralTypeNode = js.native
  /** @deprecated Use `factory.createLiteralTypeNode` or the factory supplied by your transformation context instead. */
  def apply(literal: LiteralExpression): LiteralTypeNode = js.native
  def apply(literal: NullLiteral): LiteralTypeNode = js.native
  def apply(literal: PrefixUnaryExpression): LiteralTypeNode = js.native
  def apply(literal: TrueLiteral): LiteralTypeNode = js.native
}
