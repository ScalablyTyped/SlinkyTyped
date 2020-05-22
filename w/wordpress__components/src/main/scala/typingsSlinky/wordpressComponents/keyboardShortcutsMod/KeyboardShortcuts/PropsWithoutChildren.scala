package typingsSlinky.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts

import typingsSlinky.std.Record
import typingsSlinky.wordpressComponents.wordpressComponentsBooleans.`true`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.keydown
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.keypress
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsWithoutChildren
  extends BaseProps
     with Props {
  @JSName("bindGlobal")
  var bindGlobal_PropsWithoutChildren: `true`
}

object PropsWithoutChildren {
  @scala.inline
  def apply(
    bindGlobal: `true`,
    shortcuts: Record[String, js.Function0[Unit]],
    eventName: keydown | keypress | keyup = null
  ): PropsWithoutChildren = {
    val __obj = js.Dynamic.literal(bindGlobal = bindGlobal.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithoutChildren]
  }
}

