package typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * There are currently two supported actions:
  *   - `insert-at-caret` (default): Insert the `value` into the text.
  *   - `replace`: Replace the current block with the block specified in
  *      the `value` property.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
  - typingsSlinky.wordpressComponents.wordpressComponentsStrings.replace
*/
trait Action extends js.Object
object Action {
  
  @scala.inline
  def `insert-at-caret`: typingsSlinky.wordpressComponents.wordpressComponentsStrings.`insert-at-caret` = "insert-at-caret".asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`]
  
  @scala.inline
  def replace: typingsSlinky.wordpressComponents.wordpressComponentsStrings.replace = "replace".asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.replace]
}
