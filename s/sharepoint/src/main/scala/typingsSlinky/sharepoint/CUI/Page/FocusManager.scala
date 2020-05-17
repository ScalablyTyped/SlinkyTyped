package typingsSlinky.sharepoint.CUI.Page

import typingsSlinky.sharepoint.CUI.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusManager
  extends CommandDispatcher
     with ICommandHandler {
  def getFocusedComponents(): js.Array[Component] = js.native
  def releaseAllFoci(): Boolean = js.native
  def releaseFocusFromComponent(component: Component): js.Any = js.native
  def requestFocusForComponent(component: Component): js.Any = js.native
}

object FocusManager {
  @scala.inline
  def apply(
    canHandleCommand: String => Boolean,
    executeCommand: (String, js.Any) => js.Any,
    getFocusedComponents: () => js.Array[Component],
    handleCommand: (String, js.Any, Double) => Boolean,
    releaseAllFoci: () => Boolean,
    releaseFocusFromComponent: Component => js.Any,
    requestFocusForComponent: Component => js.Any
  ): FocusManager = {
    val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), executeCommand = js.Any.fromFunction2(executeCommand), getFocusedComponents = js.Any.fromFunction0(getFocusedComponents), handleCommand = js.Any.fromFunction3(handleCommand), releaseAllFoci = js.Any.fromFunction0(releaseAllFoci), releaseFocusFromComponent = js.Any.fromFunction1(releaseFocusFromComponent), requestFocusForComponent = js.Any.fromFunction1(requestFocusForComponent))
    __obj.asInstanceOf[FocusManager]
  }
  @scala.inline
  implicit class FocusManagerOps[Self <: FocusManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFocusedComponents(value: () => js.Array[Component]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusedComponents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReleaseAllFoci(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseAllFoci")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReleaseFocusFromComponent(value: Component => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseFocusFromComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestFocusForComponent(value: Component => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFocusForComponent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

