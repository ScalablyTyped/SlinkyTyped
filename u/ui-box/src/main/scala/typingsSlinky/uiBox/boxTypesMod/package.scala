package typingsSlinky.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object boxTypesMod {
  type BoxProps[T /* <: typingsSlinky.uiBox.boxTypesMod.Is[_] */] = typingsSlinky.uiBox.boxTypesMod.InheritedProps[T] with typingsSlinky.uiBox.typesEnhancersMod.EnhancerProps with typingsSlinky.uiBox.anon.InnerRef[T]
  /**
    * Grab components passed to the `is` prop and return their props
    * @template T Component type
    */
  type InheritedProps[T /* <: typingsSlinky.uiBox.boxTypesMod.Is[_] */] = typingsSlinky.uiBox.boxTypesMod.WithoutBoxProps[typingsSlinky.react.mod.ComponentPropsWithoutRef[T]]
  type Is[P] = slinky.core.facade.ReactElement
  type RefType[T] = /* import warning: importer.ImportType#apply Failed type conversion: T['prototype'] */ js.Any
  type Without[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  /**
    * Remove box props from object `T` if they're present
    * @template T Object
    */
  type WithoutBoxProps[T] = typingsSlinky.uiBox.boxTypesMod.Without[T, typingsSlinky.uiBox.uiBoxStrings.is | typingsSlinky.uiBox.uiBoxStrings.innerRef]
}
