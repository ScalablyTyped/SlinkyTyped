package typingsSlinky.semanticDashUiDashReact

import slinky.core.TagMod
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesTabTabPaneMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MenuItem extends js.Object {
  var menuItem: js.UndefOr[js.Any] = js.undefined
  var pane: js.UndefOr[SemanticShorthandItem[TabPaneProps]] = js.undefined
  var render: js.UndefOr[js.Function0[TagMod[Any]]] = js.undefined
}

object Anon_MenuItem {
  @scala.inline
  def apply(
    menuItem: js.Any = null,
    pane: SemanticShorthandItem[TabPaneProps] = null,
    render: () => TagMod[Any] = null
  ): Anon_MenuItem = {
    val __obj = js.Dynamic.literal()
    if (menuItem != null) __obj.updateDynamic("menuItem")(menuItem.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[Anon_MenuItem]
  }
}

