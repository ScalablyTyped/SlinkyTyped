package typingsSlinky.tarn

import typingsSlinky.tarn.libPromiseInspectionMod.PromiseInspectionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error[T] extends PromiseInspectionArgs[T] {
  var error: js.UndefOr[js.Error] = js.undefined
  var value: T
}

object Anon_Error {
  @scala.inline
  def apply[T](value: T, error: js.Error = null): Anon_Error[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error[T]]
  }
}

