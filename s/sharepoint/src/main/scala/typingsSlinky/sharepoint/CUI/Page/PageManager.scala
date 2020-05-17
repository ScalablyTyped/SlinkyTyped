package typingsSlinky.sharepoint.CUI.Page

import typingsSlinky.sharepoint.CUI.IRootBuildClient
import typingsSlinky.sharepoint.CUI.RootUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageManager
  extends RootUser
     with ICommandHandler
     with IRootBuildClient {
  def add_ribbonInited(value: js.Function0[Unit]): js.Any = js.native
  def get_commandDispatcher(): CommandDispatcher = js.native
  def get_focusManager(): FocusManager = js.native
  def get_undoManager(): UndoManager = js.native
}

object PageManager {
  @scala.inline
  def apply(
    add_ribbonInited: js.Function0[Unit] => js.Any,
    canHandleCommand: String => Boolean,
    get_commandDispatcher: () => CommandDispatcher,
    get_focusManager: () => FocusManager,
    get_undoManager: () => UndoManager,
    handleCommand: (String, js.Any, Double) => Boolean
  ): PageManager = {
    val __obj = js.Dynamic.literal(add_ribbonInited = js.Any.fromFunction1(add_ribbonInited), canHandleCommand = js.Any.fromFunction1(canHandleCommand), get_commandDispatcher = js.Any.fromFunction0(get_commandDispatcher), get_focusManager = js.Any.fromFunction0(get_focusManager), get_undoManager = js.Any.fromFunction0(get_undoManager), handleCommand = js.Any.fromFunction3(handleCommand))
    __obj.asInstanceOf[PageManager]
  }
  @scala.inline
  implicit class PageManagerOps[Self <: PageManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd_ribbonInited(value: js.Function0[Unit] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_ribbonInited")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_commandDispatcher(value: () => CommandDispatcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_commandDispatcher")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_focusManager(value: () => FocusManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_focusManager")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_undoManager(value: () => UndoManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_undoManager")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

