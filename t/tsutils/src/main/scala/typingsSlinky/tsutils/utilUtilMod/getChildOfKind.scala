package typingsSlinky.tsutils.utilUtilMod

import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.SyntaxKind
import typingsSlinky.typescript.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsutils/util/util", "getChildOfKind")
@js.native
object getChildOfKind extends js.Object {
  
  def apply[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = js.native
  def apply[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = js.native
}
