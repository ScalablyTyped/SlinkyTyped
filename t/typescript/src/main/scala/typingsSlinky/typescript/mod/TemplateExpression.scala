package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateExpression
  extends PrimaryExpression
     with TemplateLiteral {
  
  val head: TemplateHead = js.native
  
  @JSName("kind")
  val kind_TemplateExpression: typingsSlinky.typescript.mod.SyntaxKind.TemplateExpression = js.native
  
  val templateSpans: NodeArray[TemplateSpan] = js.native
}
