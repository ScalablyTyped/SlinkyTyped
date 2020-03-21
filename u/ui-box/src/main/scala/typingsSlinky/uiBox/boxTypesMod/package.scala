package typingsSlinky.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object boxTypesMod {
  type Is[P] = slinky.core.facade.ReactElement
  type RefType[T] = /* import warning: importer.ImportType#apply Failed type conversion: T['prototype'] */ js.Any
  type Without[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
  /**
    * Remove box props from object `T` if they're present
    * @template T Object
    */
  type WithoutBoxProps[T] = typingsSlinky.uiBox.boxTypesMod.Without[T, typingsSlinky.uiBox.uiBoxStrings.is | typingsSlinky.uiBox.uiBoxStrings.innerRef]
}
