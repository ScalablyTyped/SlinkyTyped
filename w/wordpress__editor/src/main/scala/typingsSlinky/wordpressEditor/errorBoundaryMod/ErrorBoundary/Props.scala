package typingsSlinky.wordpressEditor.errorBoundaryMod.ErrorBoundary

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  def onError(): Unit
}

object Props {
  @scala.inline
  def apply(onError: () => Unit, children: TagMod[Any] = null): Props = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction0(onError))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

