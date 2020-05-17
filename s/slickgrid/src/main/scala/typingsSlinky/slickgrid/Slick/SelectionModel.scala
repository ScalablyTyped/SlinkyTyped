package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionModel[T /* <: SlickData */, E] extends js.Object {
  var onSelectedRangesChanged: Event[E] = js.native
  /**
  		* A destructor function that will be called whenever a selection model is unregistered from the grid by a call to setSelectionModel with another selection model or whenever a grid with this selection model is destroyed. The selection model can use this destructor to unsubscribe from grid events and release all resources (remove DOM nodes, event listeners, etc.).
  		**/
  def destroy(): Unit = js.native
  /**
  		* An initializer function that will be called with an instance of the grid whenever a selection model is registered with setSelectionModel. The selection model can use this to initialize its state and subscribe to grid events.
  		**/
  def init(grid: Grid[T]): Unit = js.native
}

object SelectionModel {
  @scala.inline
  def apply[T, E](destroy: () => Unit, init: Grid[T] => Unit, onSelectedRangesChanged: Event[E]): SelectionModel[T, E] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init), onSelectedRangesChanged = onSelectedRangesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionModel[T, E]]
  }
  @scala.inline
  implicit class SelectionModelOps[Self[t, e] <: SelectionModel[t, e], T, E] (val x: Self[T, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, E]) with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: Grid[T] => Unit): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSelectedRangesChanged(value: Event[E]): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectedRangesChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

