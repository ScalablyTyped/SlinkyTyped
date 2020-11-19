package typingsSlinky.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "ColorInformation")
@js.native
object ColorInformation extends js.Object {
  
  /**
    * Creates a new ColorInformation literal.
    */
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    color: typingsSlinky.vscodeLanguageserverTypes.mod.Color
  ): typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation = js.native
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean = js.native
}
