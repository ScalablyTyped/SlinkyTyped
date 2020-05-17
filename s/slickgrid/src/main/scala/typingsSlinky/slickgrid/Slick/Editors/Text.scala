package typingsSlinky.slickgrid.Slick.Editors

import typingsSlinky.slickgrid.Slick.SlickData
import typingsSlinky.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text[T /* <: SlickData */] extends Editor[T] {
  def getValue(): String = js.native
  def setValue(`val`: String): Unit = js.native
}

object Text {
  @scala.inline
  def apply[T](
    applyValue: (T, String) => Unit,
    destroy: () => Unit,
    focus: () => Unit,
    getValue: () => String,
    init: () => Unit,
    isValueChanged: () => Boolean,
    loadValue: T => Unit,
    serializeValue: () => js.Any,
    setValue: String => Unit,
    validate: () => ValidateResults
  ): Text[T] = {
    val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), setValue = js.Any.fromFunction1(setValue), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[Text[T]]
  }
  @scala.inline
  implicit class TextOps[Self[t] <: Text[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetValue(value: () => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetValue(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

