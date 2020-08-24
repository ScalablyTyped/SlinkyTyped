package typingsSlinky.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "SymbolInformation")
@js.native
object SymbolInformation extends js.Object {
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the location of the symbol.
    * @param uri The resource of the location of symbol, defaults to the current document.
    * @param containerName The name of the symbol containing the symbol.
    */
  def create(
    name: String,
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation = js.native
  def create(
    name: String,
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    uri: js.UndefOr[scala.Nothing],
    containerName: String
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation = js.native
  def create(
    name: String,
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    uri: String
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation = js.native
  def create(
    name: String,
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    uri: String,
    containerName: String
  ): typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation = js.native
}

