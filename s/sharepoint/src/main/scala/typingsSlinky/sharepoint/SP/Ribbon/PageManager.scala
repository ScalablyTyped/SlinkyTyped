package typingsSlinky.sharepoint.SP.Ribbon

import typingsSlinky.sharepoint.CUI.Component
import typingsSlinky.sharepoint.CUI.Page.CommandDispatcher
import typingsSlinky.sharepoint.CUI.Page.FocusManager
import typingsSlinky.sharepoint.CUI.Page.UndoManager
import typingsSlinky.sharepoint.CUI.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageManager
  extends typingsSlinky.sharepoint.CUI.Page.PageManager {
  def addPageComponent(component: Component): Unit = js.native
  def get_ribbon(): typingsSlinky.sharepoint.SP.Ribbon.Ribbon = js.native
  def isRootCommandEnabled(commandId: String, root: Root): Boolean = js.native
  def onRootRefreshed(root: Root): Unit = js.native
  def removePageComponent(component: Component): Unit = js.native
}

object PageManager {
  @scala.inline
  def apply(
    addPageComponent: Component => Unit,
    add_ribbonInited: js.Function0[Unit] => js.Any,
    canHandleCommand: String => Boolean,
    get_commandDispatcher: () => CommandDispatcher,
    get_focusManager: () => FocusManager,
    get_ribbon: () => typingsSlinky.sharepoint.SP.Ribbon.Ribbon,
    get_undoManager: () => UndoManager,
    handleCommand: (String, js.Any, Double) => Boolean,
    isRootCommandEnabled: (String, Root) => Boolean,
    onRootRefreshed: Root => Unit,
    removePageComponent: Component => Unit
  ): PageManager = {
    val __obj = js.Dynamic.literal(addPageComponent = js.Any.fromFunction1(addPageComponent), add_ribbonInited = js.Any.fromFunction1(add_ribbonInited), canHandleCommand = js.Any.fromFunction1(canHandleCommand), get_commandDispatcher = js.Any.fromFunction0(get_commandDispatcher), get_focusManager = js.Any.fromFunction0(get_focusManager), get_ribbon = js.Any.fromFunction0(get_ribbon), get_undoManager = js.Any.fromFunction0(get_undoManager), handleCommand = js.Any.fromFunction3(handleCommand), isRootCommandEnabled = js.Any.fromFunction2(isRootCommandEnabled), onRootRefreshed = js.Any.fromFunction1(onRootRefreshed), removePageComponent = js.Any.fromFunction1(removePageComponent))
    __obj.asInstanceOf[PageManager]
  }
  @scala.inline
  implicit class PageManagerOps[Self <: PageManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPageComponent(value: Component => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPageComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_ribbon(value: () => typingsSlinky.sharepoint.SP.Ribbon.Ribbon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_ribbon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRootCommandEnabled(value: (String, Root) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRootCommandEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnRootRefreshed(value: Root => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRootRefreshed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePageComponent(value: Component => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePageComponent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

