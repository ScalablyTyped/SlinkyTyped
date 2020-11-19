package typingsSlinky.styledComponents.styledComponentsMod

import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemedStyledFunctionBase[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: /* keyof any */ String */] extends js.Object {
  
  def apply(first: TemplateStringsArray): StyledComponent[C, T, O, A] = js.native
  def apply(
    first: TemplateStringsArray,
    rest: (Interpolation[ThemedStyledProps[StyledComponentPropsWithRef[C] with O, T]])*
  ): StyledComponent[C, T, O, A] = js.native
  def apply(
    first: CSSObject,
    rest: (Interpolation[ThemedStyledProps[StyledComponentPropsWithRef[C] with O, T]])*
  ): StyledComponent[C, T, O, A] = js.native
  def apply(
    first: InterpolationFunction[ThemedStyledProps[StyledComponentPropsWithRef[C] with O, T]],
    rest: (Interpolation[ThemedStyledProps[StyledComponentPropsWithRef[C] with O, T]])*
  ): StyledComponent[C, T, O, A] = js.native
}
