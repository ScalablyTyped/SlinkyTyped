package typingsSlinky.typescript.mod

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
import scala.scalajs.js.annotation._

@JSImport("typescript", "createModifier")
@js.native
object createModifier extends js.Object {
  def apply[T /* <: AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | PublicKeyword | PrivateKeyword | ProtectedKeyword | ReadonlyKeyword | StaticKeyword */](kind: T): Token[T] = js.native
}

