package typingsSlinky.uiBox

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentPropsWithoutRef
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.uiBox.typesEnhancersMod.EnhancerProps
import typingsSlinky.uiBox.uiBoxStrings.innerRef
import typingsSlinky.uiBox.uiBoxStrings.is
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ui-box/dist/types/box-types", JSImport.Namespace)
@js.native
object boxTypesMod extends js.Object {
  @js.native
  trait BoxComponent extends js.Object {
    var defaultProps: js.UndefOr[Partial[js.Object]] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMap[js.Object]] = js.native
    def apply[T /* <: Is[_] */](props: BoxProps[T]): ReactElement | Null = js.native
  }
  
  type BoxProps[T /* <: Is[_] */] = InheritedProps[T] with EnhancerProps with AnonInnerRef[T]
  /**
    * Grab components passed to the `is` prop and return their props
    * @template T Component type
    */
  type InheritedProps[T /* <: Is[_] */] = WithoutBoxProps[ComponentPropsWithoutRef[T]]
  type Is[P] = ReactElement
  type RefType[T] = /* import warning: importer.ImportType#apply Failed type conversion: T['prototype'] */ js.Any
  type Without[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  /**
    * Remove box props from object `T` if they're present
    * @template T Object
    */
  type WithoutBoxProps[T] = Without[T, is | innerRef]
}

