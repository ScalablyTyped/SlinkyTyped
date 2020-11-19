package typingsSlinky.webscopeioReactTextareaAutocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.start
    - typingsSlinky.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.end
    - typingsSlinky.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.next
    - scala.Double
  */
  type CaretPositionType = typingsSlinky.webscopeioReactTextareaAutocomplete.mod._CaretPositionType | scala.Double
  
  type DataProviderType[TItem] = js.Function1[/* token */ java.lang.String, js.Promise[js.Array[TItem]] | js.Array[TItem]]
  
  type TriggerType[TItem] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.webscopeioReactTextareaAutocomplete.mod.SettingType[TItem]]
}
