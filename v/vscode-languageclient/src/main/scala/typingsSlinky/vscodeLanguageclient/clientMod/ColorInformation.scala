package typingsSlinky.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorInformation {
  
  /**
    * Creates a new ColorInformation literal.
    */
  @JSImport("vscode-languageclient/lib/client", "ColorInformation.create")
  @js.native
  def create(
    range: typingsSlinky.vscodeLanguageserverTypes.mod.Range,
    color: typingsSlinky.vscodeLanguageserverTypes.mod.Color
  ): typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation = js.native
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  @JSImport("vscode-languageclient/lib/client", "ColorInformation.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean = js.native
}
