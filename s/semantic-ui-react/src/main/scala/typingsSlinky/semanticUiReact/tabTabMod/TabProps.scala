package typingsSlinky.semanticUiReact.tabTabMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticUiReact.AnonMenuItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends StrictTabProps
     with /* key */ StringDictionary[js.Any]

object TabProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activeIndex: Double | String = null,
    as: js.Any = null,
    defaultActiveIndex: Double | String = null,
    grid: js.Any = null,
    menu: js.Any = null,
    menuPosition: left | right = null,
    onTabChange: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ TabProps) => Unit = null,
    panes: js.Array[AnonMenuItem] = null,
    renderActiveOnly: js.UndefOr[Boolean] = js.undefined
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction2(onTabChange))
    if (panes != null) __obj.updateDynamic("panes")(panes.asInstanceOf[js.Any])
    if (!js.isUndefined(renderActiveOnly)) __obj.updateDynamic("renderActiveOnly")(renderActiveOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

