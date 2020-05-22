package typingsSlinky.tarn.anon

import typingsSlinky.tarn.promiseInspectionMod.PromiseInspectionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[T] extends PromiseInspectionArgs[T] {
  var error: js.Error
  var value: js.UndefOr[T] = js.undefined
}

object Value {
  @scala.inline
  def apply[T](error: js.Error, value: T = null): Value[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T]]
  }
}

