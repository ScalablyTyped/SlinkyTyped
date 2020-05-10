package typingsSlinky.simpleMock.mod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action[T] extends js.Object {
  /**
    * arguments to call back with
    */
  var cbArgs: ArrayLike[_] = js.native
  var returnValue: T = js.native
  var throwError: js.Error = js.native
}

object Action {
  @scala.inline
  def apply[T](cbArgs: ArrayLike[_], returnValue: T, throwError: js.Error): Action[T] = {
    val __obj = js.Dynamic.literal(cbArgs = cbArgs.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], throwError = throwError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action[T]]
  }
  @scala.inline
  implicit class ActionOps[Self[t] <: Action[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCbArgs(value: ArrayLike[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrowError(value: js.Error): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

