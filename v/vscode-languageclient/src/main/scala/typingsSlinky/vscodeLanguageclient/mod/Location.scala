package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Location {
  
  /**
    * Creates a Location literal.
    * @param uri The location's uri.
    * @param range The location's range.
    */
  @JSImport("vscode-languageclient", "Location.create")
  @js.native
  def create(uri: DocumentUri, range: typingsSlinky.vscodeLanguageserverTypes.mod.Range): typingsSlinky.vscodeLanguageserverTypes.mod.Location = js.native
  
  /**
    * Checks whether the given literal conforms to the [Location](#Location) interface.
    */
  @JSImport("vscode-languageclient", "Location.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Location */ Boolean = js.native
}
