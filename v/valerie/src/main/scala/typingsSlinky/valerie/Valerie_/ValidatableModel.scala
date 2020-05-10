package typingsSlinky.valerie.Valerie_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatableModel[T] extends js.Object {
  // return original observableArray
  def end(): T = js.native
  def name(value: String): PropertyValidationState[T] = js.native
}

object ValidatableModel {
  @scala.inline
  def apply[T](end: () => T, name: String => PropertyValidationState[T]): ValidatableModel[T] = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), name = js.Any.fromFunction1(name))
    __obj.asInstanceOf[ValidatableModel[T]]
  }
  @scala.inline
  implicit class ValidatableModelOps[Self[t] <: ValidatableModel[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEnd(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String => PropertyValidationState[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

