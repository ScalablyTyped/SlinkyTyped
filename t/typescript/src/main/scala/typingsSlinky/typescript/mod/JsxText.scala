package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxText
  extends LiteralLikeNode
     with JsxChild {
  
  var containsOnlyTriviaWhiteSpaces: Boolean = js.native
  
  @JSName("kind")
  var kind_JsxText: typingsSlinky.typescript.mod.SyntaxKind.JsxText = js.native
  
  @JSName("parent")
  var parent_JsxText: JsxElement = js.native
}
