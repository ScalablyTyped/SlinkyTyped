package typingsSlinky.semanticUiReact.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.tabPaneMod.TabPaneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var menuItem: js.UndefOr[js.Any] = js.undefined
  var pane: js.UndefOr[SemanticShorthandItem[TabPaneProps]] = js.undefined
  var render: js.UndefOr[js.Function0[TagMod[Any]]] = js.undefined
}

object MenuItem {
  @scala.inline
  def apply(): MenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItem]
  }
  @scala.inline
  implicit class MenuItemOps[Self <: MenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMenuItem(value: js.Any): Self = this.set("menuItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItem: Self = this.set("menuItem", js.undefined)
    @scala.inline
    def setPaneReactElement(value: ReactElement): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaneFunction3(
      value: (/* component */ ReactType[TabPaneProps], TabPaneProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("pane", js.Any.fromFunction3(value))
    @scala.inline
    def setPane(value: SemanticShorthandItem[TabPaneProps]): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setRender(value: () => TagMod[Any]): Self = this.set("render", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

