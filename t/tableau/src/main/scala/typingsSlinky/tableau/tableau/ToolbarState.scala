package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarState extends js.Object {
  /** Gets the Viz object associated with the toolbar. */
  def getViz(): Viz = js.native
  /**
    * Gets a value indicating whether the specified toolbar button is enabled.
    * The supported buttons are defined in the ToobarButtonName enum.
    * Currently, only Undo and Redo are supported.
    * Checking this property with a toolbar button that is not supported causes an InvalidToolbarButtonName error.
    */
  def isButtonEnabled(toolbarButtonName: ToolbarButtonName): Boolean = js.native
}

object ToolbarState {
  @scala.inline
  def apply(getViz: () => Viz, isButtonEnabled: ToolbarButtonName => Boolean): ToolbarState = {
    val __obj = js.Dynamic.literal(getViz = js.Any.fromFunction0(getViz), isButtonEnabled = js.Any.fromFunction1(isButtonEnabled))
    __obj.asInstanceOf[ToolbarState]
  }
  @scala.inline
  implicit class ToolbarStateOps[Self <: ToolbarState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetViz(value: () => Viz): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViz")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsButtonEnabled(value: ToolbarButtonName => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isButtonEnabled")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

