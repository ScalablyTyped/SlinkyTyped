package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.TypeAssertionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAssertion
  extends UnaryExpression
     with AssertionExpression {
  
  val expression: UnaryExpression = js.native
  
  @JSName("kind")
  val kind_TypeAssertion: TypeAssertionExpression = js.native
  
  val `type`: TypeNode = js.native
}
