package typingsSlinky.slickgrid.Slick.Plugins

import typingsSlinky.slickgrid.Slick.Event
import typingsSlinky.slickgrid.Slick.Grid
import typingsSlinky.slickgrid.Slick.OnCommandEventArgs
import typingsSlinky.slickgrid.Slick.Plugin
import typingsSlinky.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderButtons[T /* <: SlickData */] extends Plugin[T] {
  var onCommand: Event[OnCommandEventArgs[T]] = js.native
}

object HeaderButtons {
  @scala.inline
  def apply[T](destroy: () => Unit, init: Grid[T] => Unit, onCommand: Event[OnCommandEventArgs[T]]): HeaderButtons[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init), onCommand = onCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderButtons[T]]
  }
  @scala.inline
  implicit class HeaderButtonsOps[Self[t] <: HeaderButtons[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnCommand(value: Event[OnCommandEventArgs[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCommand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

