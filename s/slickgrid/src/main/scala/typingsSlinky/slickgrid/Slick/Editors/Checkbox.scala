package typingsSlinky.slickgrid.Slick.Editors

import typingsSlinky.slickgrid.Slick.SlickData
import typingsSlinky.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkbox[T /* <: SlickData */] extends Editor[T]

object Checkbox {
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
  ): Checkbox[T] = {
    val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[Checkbox[T]]
  }
}

