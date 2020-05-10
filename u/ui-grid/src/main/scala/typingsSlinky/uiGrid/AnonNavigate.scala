package typingsSlinky.uiGrid

import typingsSlinky.angular.mod.IScope
import typingsSlinky.uiGrid.mod.cellNav.navigateHandler
import typingsSlinky.uiGrid.mod.cellNav.viewportKeyDownHandler
import typingsSlinky.uiGrid.mod.cellNav.viewportKeyPressHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNavigate[TEntity] extends js.Object {
  /**
    * raised when the active cell is changed
    * @param {ng.IScope} scope The grid scope
    * @param {navigateHandler} handler Callback
    */
  def navigate(scope: IScope, handler: navigateHandler[TEntity]): Unit = js.native
  /**
    * viewPortKeyDown is raised when the viewPort receives a keyDown event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keydown event on a cell.
    * @param {ng.IScope} scope The grid scope
    * @param {viewportKeyDownHandler} handler Callback
    */
  def viewPortKeyDown(scope: IScope, handler: viewportKeyDownHandler[TEntity]): Unit = js.native
  /**
    * viewPortKeyPress is raised when the viewPort receives a keyPress event.
    * Cells never get focus in uiGrid due to the difficulties of setting focus on a cell that is
    * not visible in the viewport. Use this event whenever you need a keypress event on a cell.
    * @param {ng.IScope} scope The grid scope
    * @param {viewportKeyPressHandler} handler Callback
    */
  def viewPortKeyPress(scope: IScope, handler: viewportKeyPressHandler[TEntity]): Unit = js.native
}

object AnonNavigate {
  @scala.inline
  def apply[TEntity](
    navigate: (IScope, navigateHandler[TEntity]) => Unit,
    viewPortKeyDown: (IScope, viewportKeyDownHandler[TEntity]) => Unit,
    viewPortKeyPress: (IScope, viewportKeyPressHandler[TEntity]) => Unit
  ): AnonNavigate[TEntity] = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction2(navigate), viewPortKeyDown = js.Any.fromFunction2(viewPortKeyDown), viewPortKeyPress = js.Any.fromFunction2(viewPortKeyPress))
    __obj.asInstanceOf[AnonNavigate[TEntity]]
  }
  @scala.inline
  implicit class AnonNavigateOps[Self[tentity] <: AnonNavigate[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withNavigate(value: (IScope, navigateHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withViewPortKeyDown(value: (IScope, viewportKeyDownHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPortKeyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withViewPortKeyPress(value: (IScope, viewportKeyPressHandler[TEntity]) => Unit): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPortKeyPress")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

