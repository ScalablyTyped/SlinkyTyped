package typingsSlinky.slickgrid.Slick.Editors

import typingsSlinky.slickgrid.Slick.SlickData
import typingsSlinky.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor[T /* <: SlickData */] extends js.Object {
  def applyValue(item: T, state: String): Unit = js.native
  def destroy(): Unit = js.native
  def focus(): Unit = js.native
  def init(): Unit = js.native
  def isValueChanged(): Boolean = js.native
  def loadValue(item: T): Unit = js.native
  def serializeValue(): js.Any = js.native
  def validate(): ValidateResults = js.native
}

object Editor {
  @scala.inline
  def apply[T](
    applyValue: (T, String) => Unit,
    destroy: () => Unit,
    focus: () => Unit,
    init: () => Unit,
    isValueChanged: () => Boolean,
    loadValue: T => Unit,
    serializeValue: () => js.Any,
    validate: () => ValidateResults
  ): Editor[T] = {
    val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[Editor[T]]
  }
  @scala.inline
  implicit class EditorOps[Self[t] <: Editor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withApplyValue(value: (T, String) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValueChanged(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValueChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadValue(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSerializeValue(value: () => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidate(value: () => ValidateResults): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

