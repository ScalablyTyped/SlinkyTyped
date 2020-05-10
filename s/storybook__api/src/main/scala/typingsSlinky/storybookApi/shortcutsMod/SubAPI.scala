package typingsSlinky.storybookApi.shortcutsMod

import typingsSlinky.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubAPI extends js.Object {
  def getShortcutKeys(): Shortcuts = js.native
  def handleKeydownEvent(api: API, event: Event): Unit = js.native
  def handleShortcutFeature(api: API, feature: Action): Unit = js.native
  def restoreAllDefaultShortcuts(): js.Promise[Shortcuts] = js.native
  def restoreDefaultShortcut(action: Action): js.Promise[KeyCollection] = js.native
  def setShortcut(action: Action, value: KeyCollection): js.Promise[KeyCollection] = js.native
  def setShortcuts(shortcuts: Shortcuts): js.Promise[Shortcuts] = js.native
}

object SubAPI {
  @scala.inline
  def apply(
    getShortcutKeys: () => Shortcuts,
    handleKeydownEvent: (API, Event) => Unit,
    handleShortcutFeature: (API, Action) => Unit,
    restoreAllDefaultShortcuts: () => js.Promise[Shortcuts],
    restoreDefaultShortcut: Action => js.Promise[KeyCollection],
    setShortcut: (Action, KeyCollection) => js.Promise[KeyCollection],
    setShortcuts: Shortcuts => js.Promise[Shortcuts]
  ): SubAPI = {
    val __obj = js.Dynamic.literal(getShortcutKeys = js.Any.fromFunction0(getShortcutKeys), handleKeydownEvent = js.Any.fromFunction2(handleKeydownEvent), handleShortcutFeature = js.Any.fromFunction2(handleShortcutFeature), restoreAllDefaultShortcuts = js.Any.fromFunction0(restoreAllDefaultShortcuts), restoreDefaultShortcut = js.Any.fromFunction1(restoreDefaultShortcut), setShortcut = js.Any.fromFunction2(setShortcut), setShortcuts = js.Any.fromFunction1(setShortcuts))
    __obj.asInstanceOf[SubAPI]
  }
  @scala.inline
  implicit class SubAPIOps[Self <: SubAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetShortcutKeys(value: () => Shortcuts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShortcutKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandleKeydownEvent(value: (API, Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeydownEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleShortcutFeature(value: (API, Action) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleShortcutFeature")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRestoreAllDefaultShortcuts(value: () => js.Promise[Shortcuts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreAllDefaultShortcuts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRestoreDefaultShortcut(value: Action => js.Promise[KeyCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreDefaultShortcut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetShortcut(value: (Action, KeyCollection) => js.Promise[KeyCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShortcut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetShortcuts(value: Shortcuts => js.Promise[Shortcuts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShortcuts")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

