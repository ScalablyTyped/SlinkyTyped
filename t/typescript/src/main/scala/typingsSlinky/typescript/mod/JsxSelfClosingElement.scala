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
  
  var attributes: JsxAttributes = js.native
  
  @JSName("kind")
  var kind_JsxSelfClosingElement: typingsSlinky.typescript.mod.SyntaxKind.JsxSelfClosingElement = js.native
  
  var tagName: JsxTagNameExpression = js.native
  
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}
