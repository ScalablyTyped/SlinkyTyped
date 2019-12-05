package typingsSlinky.atStorybookAddonDashKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distComponentsTypesSelectMod {
  import typingsSlinky.std.Extract
  import typingsSlinky.std.PropertyKey
  import typingsSlinky.std.Record

  type SelectTypeKnobValue = js.UndefOr[String | Double | Null | js.Array[PropertyKey]]
  type SelectTypeOptionsProp[T /* <: SelectTypeKnobValue */] = (Record[
    (Extract[T, PropertyKey]) | PropertyKey, 
    (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
  ]) | (js.Array[Extract[T, PropertyKey]])
}
