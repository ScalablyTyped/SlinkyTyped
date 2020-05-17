package typingsSlinky.tarn.promiseInspectionMod

import typingsSlinky.tarn.anon.Error
import typingsSlinky.tarn.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tarn.anon.Error[T]
  - typingsSlinky.tarn.anon.Value[T]
*/
trait PromiseInspectionArgs[T] extends js.Object

object PromiseInspectionArgs {
  @scala.inline
  implicit def apply[T](value: Error[T]): PromiseInspectionArgs[T] = value.asInstanceOf[PromiseInspectionArgs[T]]
  @scala.inline
  implicit def apply[T](value: Value[T]): PromiseInspectionArgs[T] = value.asInstanceOf[PromiseInspectionArgs[T]]
}

