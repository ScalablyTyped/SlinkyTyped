package typingsSlinky.tarn

import typingsSlinky.tarn.promiseInspectionMod.PromiseInspectionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[T] extends PromiseInspectionArgs[T] {
  var error: js.Error
  var value: js.UndefOr[T] = js.undefined
}

object AnonValue {
  @scala.inline
  def apply[T](error: js.Error, value: T = null): AnonValue[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue[T]]
  }
}

