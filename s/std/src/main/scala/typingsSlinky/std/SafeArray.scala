package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an Automation SAFEARRAY
  */
@js.native
trait SafeArray[T] extends js.Object {
  var SafeArray_typekey: SafeArray[T] = js.native
}

object SafeArray {
  @scala.inline
  def apply[T](SafeArray_typekey: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal(SafeArray_typekey = SafeArray_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeArray[T]]
  }
  @scala.inline
  implicit class SafeArrayOps[Self[t] <: SafeArray[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSafeArray_typekey(value: SafeArray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SafeArray_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

