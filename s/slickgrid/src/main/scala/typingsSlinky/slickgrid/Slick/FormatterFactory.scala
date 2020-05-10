package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatterFactory[T /* <: SlickData */] extends js.Object {
  def getFormatter(column: Column[T]): Formatter[_] = js.native
}

object FormatterFactory {
  @scala.inline
  def apply[T](getFormatter: Column[T] => Formatter[_]): FormatterFactory[T] = {
    val __obj = js.Dynamic.literal(getFormatter = js.Any.fromFunction1(getFormatter))
    __obj.asInstanceOf[FormatterFactory[T]]
  }
  @scala.inline
  implicit class FormatterFactoryOps[Self[t] <: FormatterFactory[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetFormatter(value: Column[T] => Formatter[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormatter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

