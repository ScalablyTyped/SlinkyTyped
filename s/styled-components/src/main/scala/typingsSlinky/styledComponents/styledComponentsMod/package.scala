package typingsSlinky.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledComponentsMod {
  type AnyIfEmpty[T /* <: js.Object */] = T
  type AnyStyledComponent = typingsSlinky.styledComponents.styledComponentsMod.StyledComponent[js.Any, js.Any, js.Any, js.Any | scala.Nothing]
  type BaseThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = slinky.core.ReactComponentClass[typingsSlinky.styledComponents.styledComponentsMod.ThemeProviderProps[T, U]]
  type BaseWithThemeFnInterface[T /* <: js.Object */] = js.Function1[
    /* component */ slinky.core.ReactComponentClass[js.Any], 
    typingsSlinky.react.mod.ForwardRefExoticComponent[
      typingsSlinky.styledComponents.styledComponentsMod.WithOptionalTheme[
        typingsSlinky.react.mod.ComponentPropsWithRef[slinky.core.ReactComponentClass[js.Any]], 
        T
      ]
    ]
  ]
  type CSSKeyframes = js.Object with org.scalablytyped.runtime.StringDictionary[typingsSlinky.styledComponents.styledComponentsMod.CSSObject]
  type CSSProperties = typingsSlinky.csstype.mod.Properties[java.lang.String | scala.Double]
  type GlobalStyleComponent[P, T] = slinky.core.ReactComponentClass[
    typingsSlinky.styledComponents.styledComponentsMod.ThemedGlobalStyledClassProps[P, T]
  ]
  // Helper type operators
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  // extracts React defaultProps
  type ReactDefaultProps[C] = js.Any
  type StyledComponent[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: /* keyof any */ java.lang.String */] = (// the "string" allows this to be used as an object key
  // I really want to avoid this if possible but it's the only way to use nesting with object styles...
  java.lang.String) with (typingsSlinky.styledComponents.styledComponentsMod.StyledComponentBase[C, T, O, A]) with (typingsSlinky.hoistNonReactStatics.mod.NonReactStatics[C, js.Object])
  type StyledComponentInnerAttrs[C /* <: typingsSlinky.styledComponents.styledComponentsMod.AnyStyledComponent */] = js.Any
  type StyledComponentInnerComponent[C /* <: slinky.core.ReactComponentClass[_] */] = C
  type StyledComponentInnerOtherProps[C /* <: typingsSlinky.styledComponents.styledComponentsMod.AnyStyledComponent */] = js.Any
  type StyledComponentProps[// The Component from whose props are derived
  C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, // The Theme from the current context
  T /* <: js.Object */, // The other props added by the template
  O /* <: js.Object */, // The props that are made optional by .attrs
  A /* <: /* keyof any */ java.lang.String */] = (typingsSlinky.styledComponents.styledComponentsMod.WithOptionalTheme[
    (typingsSlinky.styledComponents.styledComponentsMod.Omit[
      (typingsSlinky.styledComponents.styledComponentsMod.ReactDefaultizedProps[C, typingsSlinky.react.mod.ComponentPropsWithRef[C]]) with O, 
      A
    ]) with (typingsSlinky.std.Partial[
      typingsSlinky.std.Pick[typingsSlinky.react.mod.ComponentPropsWithRef[C] with O, A]
    ]), 
    T
  ]) with typingsSlinky.styledComponents.styledComponentsMod.WithChildrenIfReactComponentClass[C]
  type StyledComponentPropsWithAs[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: /* keyof any */ java.lang.String */] = (typingsSlinky.styledComponents.styledComponentsMod.StyledComponentProps[C, T, O, A]) with typingsSlinky.styledComponents.anon.ForwardedAs[C]
  type StyledComponentPropsWithRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = typingsSlinky.react.mod.ComponentPropsWithRef[
    C | typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInnerComponent[C]
  ]
  type StyledFunction[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledFunction[C, js.Any, js.Object, scala.Nothing]
  type StyledProps[P] = typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledProps[
    P, 
    typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme]
  ]
  type StylisPlugin = js.Function7[
    /* context */ scala.Double, 
    /* selector */ js.Array[java.lang.String], 
    /* parent */ js.Array[java.lang.String], 
    /* content */ java.lang.String, 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    /* length */ scala.Double, 
    java.lang.String | scala.Unit
  ]
  type ThemeProviderComponent[T /* <: js.Object */, U /* <: js.Object */] = slinky.core.ReactComponentClass[
    typingsSlinky.styledComponents.styledComponentsMod.ThemeProviderProps[
      typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T], 
      typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[U]
    ]
  ]
  type ThemedCssFunction[T /* <: js.Object */] = typingsSlinky.styledComponents.styledComponentsMod.BaseThemedCssFunction[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T]]
  type ThemedGlobalStyledClassProps[P, T] = (typingsSlinky.styledComponents.styledComponentsMod.WithOptionalTheme[P, T]) with typingsSlinky.styledComponents.anon.SuppressMultiMountWarning
  type ThemedStyledInterface[T /* <: js.Object */] = typingsSlinky.styledComponents.styledComponentsMod.ThemedBaseStyledInterface[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T]]
  type ThemedStyledProps[P, T] = P with typingsSlinky.styledComponents.styledComponentsMod.ThemeProps[T]
  type WithOptionalTheme[P /* <: typingsSlinky.styledComponents.anon.ThemeT[T] */, T] = P with typingsSlinky.styledComponents.anon.ThemeT[T]
  type WithThemeFnInterface[T /* <: js.Object */] = typingsSlinky.styledComponents.styledComponentsMod.BaseWithThemeFnInterface[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T]]
}
