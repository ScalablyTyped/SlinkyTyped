package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxSelfClosingElement
  extends PrimaryExpression
     with HasTypeArguments
     with JsxChild
     with JsxOpeningLikeElement {
  
  val attributes: JsxAttributes = js.native
  
  @JSName("kind")
  val kind_JsxSelfClosingElement: typingsSlinky.typescript.mod.SyntaxKind.JsxSelfClosingElement = js.native
  
  val tagName: JsxTagNameExpression = js.native
  
  val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}
