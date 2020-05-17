package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// class ClientResult {
//    get_value(): any;
//    setValue(value: any): void;
//    constructor();
// }
@js.native
trait ClientResult[T] extends js.Object {
  def get_value(): T = js.native
  def setValue(value: T): Unit = js.native
}

object ClientResult {
  @scala.inline
  def apply[T](get_value: () => T, setValue: T => Unit): ClientResult[T] = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[ClientResult[T]]
  }
  @scala.inline
  implicit class ClientResultOps[Self[t] <: ClientResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGet_value(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_value")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetValue(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

