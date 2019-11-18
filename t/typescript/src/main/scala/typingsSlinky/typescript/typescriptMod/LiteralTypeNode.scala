package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralTypeNode extends TypeNode {
  @JSName("kind")
  var kind_LiteralTypeNode: typingsSlinky.typescript.typescriptMod.SyntaxKind.LiteralType = js.native
  var literal: BooleanLiteral | LiteralExpression | PrefixUnaryExpression = js.native
}

