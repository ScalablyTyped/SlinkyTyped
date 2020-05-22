package typingsSlinky.wordpressComponents.anon

import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends _OptionCompletion {
  var action: replace
  var value: typingsSlinky.wordpressRichText.mod.Value
}

object Value {
  @scala.inline
  def apply(action: replace, value: typingsSlinky.wordpressRichText.mod.Value): Value = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

