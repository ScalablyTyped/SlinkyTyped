package typingsSlinky.wordpressComponents.anon

import slinky.core.TagMod
import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends _OptionCompletion {
  var action: `insert-at-caret`
  var value: TagMod[Any]
}

object Action {
  @scala.inline
  def apply(action: `insert-at-caret`, value: TagMod[Any] = null): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

