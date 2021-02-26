package typingsSlinky.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPresentation {
  
  /**
    * Creates a new ColorInformation literal.
    */
  @JSImport("vscode-languageserver", "ColorPresentation.create")
  @js.native
  def create(label: String): typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  @JSImport("vscode-languageserver", "ColorPresentation.create")
  @js.native
  def create(
    label: String,
    textEdit: js.UndefOr[scala.Nothing],
    additionalTextEdits: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  @JSImport("vscode-languageserver", "ColorPresentation.create")
  @js.native
  def create(label: String, textEdit: typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit): typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  @JSImport("vscode-languageserver", "ColorPresentation.create")
  @js.native
  def create(
    label: String,
    textEdit: typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit,
    additionalTextEdits: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  @JSImport("vscode-languageserver", "ColorPresentation.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = js.native
}
