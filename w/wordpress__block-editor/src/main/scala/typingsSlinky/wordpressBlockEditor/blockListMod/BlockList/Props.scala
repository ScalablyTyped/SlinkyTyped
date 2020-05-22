package typingsSlinky.wordpressBlockEditor.blockListMod.BlockList

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /**
    * A 'render prop' function that can be used to customize the block's appender.
    */
  var renderAppender: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  var rootClientId: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(className: String = null, renderAppender: () => ReactElement = null, rootClientId: String = null): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderAppender != null) __obj.updateDynamic("renderAppender")(js.Any.fromFunction0(renderAppender))
    if (rootClientId != null) __obj.updateDynamic("rootClientId")(rootClientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

