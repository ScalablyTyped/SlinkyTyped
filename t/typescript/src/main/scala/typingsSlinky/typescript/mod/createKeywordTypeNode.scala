package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.AnyKeyword
import typingsSlinky.typescript.mod.SyntaxKind.BigIntKeyword
import typingsSlinky.typescript.mod.SyntaxKind.BooleanKeyword
import typingsSlinky.typescript.mod.SyntaxKind.NeverKeyword
import typingsSlinky.typescript.mod.SyntaxKind.NullKeyword
import typingsSlinky.typescript.mod.SyntaxKind.NumberKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ObjectKeyword
import typingsSlinky.typescript.mod.SyntaxKind.StringKeyword
import typingsSlinky.typescript.mod.SyntaxKind.SymbolKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ThisKeyword
import typingsSlinky.typescript.mod.SyntaxKind.UndefinedKeyword
import typingsSlinky.typescript.mod.SyntaxKind.UnknownKeyword
import typingsSlinky.typescript.mod.SyntaxKind.VoidKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createKeywordTypeNode")
@js.native
object createKeywordTypeNode extends js.Object {
  def apply(
    kind: AnyKeyword | UnknownKeyword | NumberKeyword | BigIntKeyword | ObjectKeyword | BooleanKeyword | StringKeyword | SymbolKeyword | ThisKeyword | VoidKeyword | UndefinedKeyword | NullKeyword | NeverKeyword
  ): KeywordTypeNode = js.native
}

