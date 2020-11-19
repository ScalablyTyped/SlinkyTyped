package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "LocationLink")
@js.native
object LocationLink extends js.Object {
  
  /**
    * Creates a LocationLink literal.
    * @param targetUri The definition's uri.
    * @param targetRange The full range of the definition.
    * @param targetSelectionRange The span of the symbol definition at the target.
    * @param originSelectionRange The span of the symbol being defined in the originating source file.
    */
  def create(
    targetUri: DocumentUri,
    targetRange: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    targetSelectionRange: typingsSlinky.vscodeLanguageserverTypes.mod.Range
  ): typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink = js.native
  def create(
    targetUri: DocumentUri,
    targetRange: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    targetSelectionRange: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    originSelectionRange: typingsSlinky.vscodeLanguageserverTypes.mod.Range
  ): typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink = js.native
  
  /**
    * Checks whether the given literal conforms to the [LocationLink](#LocationLink) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.LocationLink */ Boolean = js.native
}
