package typingsSlinky.storybookAddonKnobs.selectMod

import typingsSlinky.std.Extract
import typingsSlinky.std.PropertyKey
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Record[
(typingsSlinky.std.Extract[T, typingsSlinky.std.PropertyKey]) | typingsSlinky.std.PropertyKey, 
(/ * import warning: importer.ImportType#apply Failed type conversion: T[keyof T] * / js.Any) | T]
  - js.Array[typingsSlinky.std.Extract[T, typingsSlinky.std.PropertyKey]]
*/
trait SelectTypeOptionsProp[T /* <: SelectTypeKnobValue */] extends js.Object

object SelectTypeOptionsProp {
  @scala.inline
  implicit def apply[T](value: js.Array[Extract[T, PropertyKey]]): SelectTypeOptionsProp[T] = value.asInstanceOf[SelectTypeOptionsProp[T]]
  @scala.inline
  implicit def apply[T](
    value: Record[
      (Extract[T, PropertyKey]) | PropertyKey, 
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): SelectTypeOptionsProp[T] = value.asInstanceOf[SelectTypeOptionsProp[T]]
}

