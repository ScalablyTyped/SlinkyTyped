package typingsSlinky.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "DocumentSymbol")
@js.native
object DocumentSymbol extends js.Object {
  
  def create(
    name: String,
    detail: js.UndefOr[scala.Nothing],
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    selectionRange: typingsSlinky.vscodeLanguageserverTypes.mod.Range
  ): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol = js.native
  def create(
    name: String,
    detail: js.UndefOr[scala.Nothing],
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    selectionRange: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    children: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol = js.native
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param detail The detail of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the symbol.
    * @param selectionRange The selectionRange of the symbol.
    * @param children Children of the symbol.
    */
  def create(
    name: String,
    detail: String,
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    selectionRange: typingsSlinky.vscodeLanguageserverTypes.mod.Range
  ): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol = js.native
  def create(
    name: String,
    detail: String,
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind,
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    selectionRange: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    children: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol = js.native
  
  /**
    * Checks whether the given literal conforms to the [DocumentSymbol](#DocumentSymbol) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentSymbol */ Boolean = js.native
}
