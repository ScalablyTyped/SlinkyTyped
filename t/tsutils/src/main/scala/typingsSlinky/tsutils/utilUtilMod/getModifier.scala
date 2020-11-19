package typingsSlinky.tsutils.utilUtilMod

import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SyntaxKind.AbstractKeyword
import typingsSlinky.typescript.mod.SyntaxKind.AsyncKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ConstKeyword
import typingsSlinky.typescript.mod.SyntaxKind.DeclareKeyword
import typingsSlinky.typescript.mod.SyntaxKind.DefaultKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ExportKeyword
import typingsSlinky.typescript.mod.SyntaxKind.PrivateKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ProtectedKeyword
import typingsSlinky.typescript.mod.SyntaxKind.PublicKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ReadonlyKeyword
import typingsSlinky.typescript.mod.SyntaxKind.StaticKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsutils/util/util", "getModifier")
@js.native
object getModifier extends js.Object {
  
  def apply(node: Node, kind: AbstractKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: AsyncKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: ConstKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: DeclareKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: DefaultKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: ExportKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: PrivateKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: ProtectedKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: PublicKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: ReadonlyKeyword): js.UndefOr[Modifier] = js.native
  def apply(node: Node, kind: StaticKeyword): js.UndefOr[Modifier] = js.native
}
