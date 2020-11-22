package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxExpression
  extends Expression
     with JsxChild {
  
  val dotDotDotToken: js.UndefOr[Token[typingsSlinky.typescript.mod.SyntaxKind.DotDotDotToken]] = js.native
  
  val expression: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_JsxExpression: typingsSlinky.typescript.mod.SyntaxKind.JsxExpression = js.native
  
  @JSName("parent")
  val parent_JsxExpression: JsxElement | JsxAttributeLike = js.native
}
