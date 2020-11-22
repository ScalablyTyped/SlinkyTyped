package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiteralTypeNode extends TypeNode {
  
  @JSName("kind")
  val kind_LiteralTypeNode: typingsSlinky.typescript.mod.SyntaxKind.LiteralType = js.native
  
  val literal: NullLiteral | BooleanLiteral | LiteralExpression | PrefixUnaryExpression = js.native
}
