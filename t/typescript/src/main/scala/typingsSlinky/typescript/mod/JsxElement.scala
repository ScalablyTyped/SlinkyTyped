package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxElement
  extends PrimaryExpression
     with JsxChild {
  
  val children: NodeArray[JsxChild] = js.native
  
  val closingElement: JsxClosingElement = js.native
  
  @JSName("kind")
  val kind_JsxElement: typingsSlinky.typescript.mod.SyntaxKind.JsxElement = js.native
  
  val openingElement: JsxOpeningElement = js.native
}
