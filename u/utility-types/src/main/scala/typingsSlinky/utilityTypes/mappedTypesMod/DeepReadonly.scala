package typingsSlinky.utilityTypes.mappedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.utilityTypes.mappedTypesMod.DeepReadonlyObject[T]
  - typingsSlinky.utilityTypes.mappedTypesMod.DeepReadonlyArray[
/ * import warning: importer.ImportType#apply Failed type conversion: T[number] * / js.Any]
*/
trait DeepReadonly[T] extends js.Object

object DeepReadonly {
  @scala.inline
  implicit def apply[T](
    value: DeepReadonlyArray[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ): DeepReadonly[T] = value.asInstanceOf[DeepReadonly[T]]
  @scala.inline
  implicit def apply[T](value: DeepReadonlyObject[T]): DeepReadonly[T] = value.asInstanceOf[DeepReadonly[T]]
  @scala.inline
  implicit def apply[T](value: T): DeepReadonly[T] = value.asInstanceOf[DeepReadonly[T]]
}

