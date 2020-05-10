package typingsSlinky.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnityLauncher extends js.Object {
  def addAction(name: String, onActionInvoked: js.Function): js.Any = js.native
  def clearCount(): js.Any = js.native
  def clearProgress(): js.Any = js.native
  def removeAction(name: String): js.Any = js.native
  def removeActions(): js.Any = js.native
  def setCount(count: Double): js.Any = js.native
  def setProgress(progress: Double): js.Any = js.native
  def setUrgent(urgent: Boolean): js.Any = js.native
}

object UnityLauncher {
  @scala.inline
  def apply(
    addAction: (String, js.Function) => js.Any,
    clearCount: () => js.Any,
    clearProgress: () => js.Any,
    removeAction: String => js.Any,
    removeActions: () => js.Any,
    setCount: Double => js.Any,
    setProgress: Double => js.Any,
    setUrgent: Boolean => js.Any
  ): UnityLauncher = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction2(addAction), clearCount = js.Any.fromFunction0(clearCount), clearProgress = js.Any.fromFunction0(clearProgress), removeAction = js.Any.fromFunction1(removeAction), removeActions = js.Any.fromFunction0(removeActions), setCount = js.Any.fromFunction1(setCount), setProgress = js.Any.fromFunction1(setProgress), setUrgent = js.Any.fromFunction1(setUrgent))
    __obj.asInstanceOf[UnityLauncher]
  }
  @scala.inline
  implicit class UnityLauncherOps[Self <: UnityLauncher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAction(value: (String, js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClearCount(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearProgress(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearProgress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAction(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveActions(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeActions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCount(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetProgress(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUrgent(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrgent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

