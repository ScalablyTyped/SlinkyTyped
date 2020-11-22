package typingsSlinky.uiBox

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import typingsSlinky.uiBox.anon.AllowUnsafeHref
import typingsSlinky.uiBox.typesEnhancersMod.EnhancerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ui-box/dist/src/types/box-types", JSImport.Namespace)
@js.native
object boxTypesMod extends js.Object {
  
  type BoxComponent[P, D /* <: ReactElement */] = js.Function1[/* props */ PolymorphicBoxProps[D, P], ReactElement]
  
  type BoxOwnProps[E /* <: ReactElement */, P] = (Without[EnhancerProps, /* keyof P */ String]) with AllowUnsafeHref[E]
  
  type BoxProps[E /* <: ReactElement */] = (BoxOwnProps[E, js.Object]) with (Without[
    PropsOf[E], 
    /* keyof ui-box.anon.BoxOwnPropsElementTypeany */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 145 */ js.Any
  ])
  
  type PolymorphicBoxProps[E /* <: ReactElement */, P] = (BoxOwnProps[E, P]) with (Without[
    PropsOf[E], 
    /* keyof ui-box.anon.BoxOwnPropsElementTypeany & P */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 145 */ js.Any
  ]) with P
  
  type PropsOf[E /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = LibraryManagedAttributes[E, ComponentPropsWithRef[E]]
  
  type Without[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
