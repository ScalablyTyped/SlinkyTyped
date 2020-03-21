package typingsSlinky.tarn

import typingsSlinky.tarn.promiseInspectionMod.PromiseInspectionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError[T] extends PromiseInspectionArgs[T] {
  var error: js.UndefOr[js.Error] = js.undefined
  var value: T
}

object AnonError {
  @scala.inline
  def apply[T](value: T, error: js.Error = null): AnonError[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError[T]]
  }
}

