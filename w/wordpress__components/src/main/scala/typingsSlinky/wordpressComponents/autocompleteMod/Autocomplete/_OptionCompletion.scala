package typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete

import slinky.core.TagMod
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _OptionCompletion extends js.Object

object _OptionCompletion {
  @scala.inline
  def Action(action: `insert-at-caret`, value: TagMod[Any] = null): _OptionCompletion = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_OptionCompletion]
  }
  @scala.inline
  def Value(action: replace, value: typingsSlinky.wordpressRichText.mod.Value): _OptionCompletion = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_OptionCompletion]
  }
}

