package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementAccessExpression
  extends MemberExpression
     with AccessExpression
     with BindingOrAssignmentElementTarget
     with DeclarationName
     with _ArrayBindingOrAssignmentElement {
  
  val argumentExpression: Expression = js.native
  
  val expression: LeftHandSideExpression = js.native
  
  @JSName("kind")
  val kind_ElementAccessExpression: typingsSlinky.typescript.mod.SyntaxKind.ElementAccessExpression = js.native
  
  val questionDotToken: js.UndefOr[QuestionDotToken] = js.native
}
