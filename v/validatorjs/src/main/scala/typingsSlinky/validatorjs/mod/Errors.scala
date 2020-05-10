package typingsSlinky.validatorjs.mod

import typingsSlinky.validatorjs.validatorjsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends js.Object {
  var errors: ValidationErrors = js.native
  def add(attribute: String, message: String): Unit = js.native
  def all(): ValidationErrors = js.native
  def first(attribute: String): String | `false` = js.native
  def get(attribute: String): js.Array[String] = js.native
  def has(attribute: String): Boolean = js.native
}

object Errors {
  @scala.inline
  def apply(
    add: (String, String) => Unit,
    all: () => ValidationErrors,
    errors: ValidationErrors,
    first: String => String | `false`,
    get: String => js.Array[String],
    has: String => Boolean
  ): Errors = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), all = js.Any.fromFunction0(all), errors = errors.asInstanceOf[js.Any], first = js.Any.fromFunction1(first), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[Errors]
  }
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAll(value: () => ValidationErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withErrors(value: ValidationErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst(value: String => String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

