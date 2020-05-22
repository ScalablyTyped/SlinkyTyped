package typingsSlinky.wordpressBlockEditor.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClick extends js.Object {
  var onClick: MouseEventHandler[HTMLButtonElement]
  var title: TagMod[Any]
}

object OnClick {
  @scala.inline
  def apply(onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit, title: TagMod[Any] = null): OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClick]
  }
}

