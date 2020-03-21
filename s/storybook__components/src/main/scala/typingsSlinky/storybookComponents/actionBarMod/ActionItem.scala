package typingsSlinky.storybookComponents.actionBarMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionItem extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var title: String | ReactElement = js.native
  def onClick(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
}

object ActionItem {
  @scala.inline
  def apply(
    onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    title: String | ReactElement,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): ActionItem = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionItem]
  }
}

