package typingsSlinky.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selectMod {
  
  type SelectTypeKnobValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | scala.Null | js.Array[typingsSlinky.std.PropertyKey]
  ]
  
  type SelectTypeOptionsProp[T /* <: typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeKnobValue */] = (typingsSlinky.std.Record[
    (typingsSlinky.std.Extract[T, typingsSlinky.std.PropertyKey]) | typingsSlinky.std.PropertyKey, 
    (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
  ]) | js.Array[T]
}
