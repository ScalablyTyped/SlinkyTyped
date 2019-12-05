package typingsSlinky.tsutils.utilUtilMod

import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.SourceFile
import typingsSlinky.typescript.typescriptMod.SyntaxKind
import typingsSlinky.typescript.typescriptMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", "getChildOfKind")
@js.native
object getChildOfKind extends js.Object {
  def apply[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = js.native
  def apply[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = js.native
}

