package typingsSlinky.typescript.typescriptMod

import typingsSlinky.typescript.typescriptMod.SyntaxKind.AnyKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.BigIntKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.BooleanKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.NeverKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.NullKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.NumberKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.ObjectKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.StringKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.SymbolKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.ThisKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.UndefinedKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.UnknownKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.VoidKeyword
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

