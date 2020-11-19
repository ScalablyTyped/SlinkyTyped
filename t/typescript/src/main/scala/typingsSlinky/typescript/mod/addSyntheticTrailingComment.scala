package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.MultiLineCommentTrivia
import typingsSlinky.typescript.mod.SyntaxKind.SingleLineCommentTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "addSyntheticTrailingComment")
@js.native
object addSyntheticTrailingComment extends js.Object {
  
  def apply[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: java.lang.String): T = js.native
  def apply[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: java.lang.String, hasTrailingNewLine: Boolean): T = js.native
  def apply[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: java.lang.String): T = js.native
  def apply[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: java.lang.String, hasTrailingNewLine: Boolean): T = js.native
}
