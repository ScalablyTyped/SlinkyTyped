package typingsSlinky.wordpressEditor

import typingsSlinky.wordpressApiFetch.mod.Schema.User
import typingsSlinky.wordpressBlockEditor.mod.EditorInserterItem
import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typingsSlinky.wordpressEditor.wordpressEditorStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompletersMod {
  
  @JSImport("@wordpress/editor/components/autocompleters", "blockAutocompleter")
  @js.native
  val blockAutocompleter: Completer[EditorInserterItem] = js.native
  
  @JSImport("@wordpress/editor/components/autocompleters", "userAutocompleter")
  @js.native
  val userAutocompleter: Completer[User[view]] = js.native
}
