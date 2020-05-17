package typingsSlinky.slickgrid.Slick.Editors

import org.scalajs.dom.raw.Event
import typingsSlinky.slickgrid.Slick.Position
import typingsSlinky.slickgrid.Slick.SlickData
import typingsSlinky.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongText[T /* <: SlickData */] extends Editor[T] {
  def cancel(): Unit = js.native
  def handleKeyDown(e: Event): Unit = js.native
  def hide(): Unit = js.native
  def position(position: Position): Unit = js.native
  def save(): Unit = js.native
  def show(): Unit = js.native
}

object LongText {
  @scala.inline
  def apply[T](
    applyValue: (T, String) => Unit,
    cancel: () => Unit,
    destroy: () => Unit,
    focus: () => Unit,
    handleKeyDown: Event => Unit,
    hide: () => Unit,
    init: () => Unit,
    isValueChanged: () => Boolean,
    loadValue: T => Unit,
    position: Position => Unit,
    save: () => Unit,
    serializeValue: () => js.Any,
    show: () => Unit,
    validate: () => ValidateResults
  ): LongText[T] = {
    val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), handleKeyDown = js.Any.fromFunction1(handleKeyDown), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), position = js.Any.fromFunction1(position), save = js.Any.fromFunction0(save), serializeValue = js.Any.fromFunction0(serializeValue), show = js.Any.fromFunction0(show), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[LongText[T]]
  }
  @scala.inline
  implicit class LongTextOps[Self[t] <: LongText[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandleKeyDown(value: Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPosition(value: Position => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

