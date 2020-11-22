package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostfixUnaryExpression extends UpdateExpression {
  
  @JSName("kind")
  val kind_PostfixUnaryExpression: typingsSlinky.typescript.mod.SyntaxKind.PostfixUnaryExpression = js.native
  
  val operand: LeftHandSideExpression = js.native
  
  val operator: PostfixUnaryOperator = js.native
}
