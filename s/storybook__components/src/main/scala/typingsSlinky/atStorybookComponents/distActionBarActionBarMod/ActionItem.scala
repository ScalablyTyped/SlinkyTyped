package typingsSlinky.atStorybookComponents.distActionBarActionBarMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionItem extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var title: String | Element
  def onClick(e: SyntheticMouseEvent[HTMLButtonElement]): Unit
}

object ActionItem {
  @scala.inline
  def apply(
    onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit,
    title: String | Element,
    disabled: js.UndefOr[Boolean] = js.undefined
  ): ActionItem = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionItem]
  }
}

