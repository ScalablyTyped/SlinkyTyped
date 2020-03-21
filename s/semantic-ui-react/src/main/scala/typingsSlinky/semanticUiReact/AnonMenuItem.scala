package typingsSlinky.semanticUiReact

import slinky.core.TagMod
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.tabPaneMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMenuItem extends js.Object {
  var menuItem: js.UndefOr[js.Any] = js.undefined
  var pane: js.UndefOr[SemanticShorthandItem[TabPaneProps]] = js.undefined
  var render: js.UndefOr[js.Function0[TagMod[Any]]] = js.undefined
}

object AnonMenuItem {
  @scala.inline
  def apply(
    menuItem: js.Any = null,
    pane: SemanticShorthandItem[TabPaneProps] = null,
    render: () => TagMod[Any] = null
  ): AnonMenuItem = {
    val __obj = js.Dynamic.literal()
    if (menuItem != null) __obj.updateDynamic("menuItem")(menuItem.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[AnonMenuItem]
  }
}

