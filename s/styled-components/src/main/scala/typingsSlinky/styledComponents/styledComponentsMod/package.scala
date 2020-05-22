package typingsSlinky.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledComponentsMod {
  type AnyIfEmpty[T /* <: js.Object */] = T
  type AnyStyledComponent = typingsSlinky.styledComponents.styledComponentsMod.StyledComponent[js.Any, js.Any, js.Any, js.Any | scala.Nothing]
  type Attrs[P, A /* <: typingsSlinky.std.Partial[P] */, T] = (js.Function1[
    /* props */ typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledProps[P, T], 
    A
  ]) | A
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
  type CSSProp[T] = java.lang.String | typingsSlinky.styledComponents.styledComponentsMod.CSSObject | typingsSlinky.styledComponents.styledComponentsMod.FlattenInterpolation[typingsSlinky.styledComponents.styledComponentsMod.ThemeProps[T]]
  type CSSProperties = typingsSlinky.csstype.mod.Properties[java.lang.String | scala.Double]
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((typingsSlinky.std.Pick[
    P, 
    typingsSlinky.std.Exclude[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
  ]) with (typingsSlinky.std.Partial[
    typingsSlinky.std.Pick[
      P, 
      typingsSlinky.std.Extract[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
    ]
  ]) with (typingsSlinky.std.Partial[
    typingsSlinky.std.Pick[
      D, 
      typingsSlinky.std.Exclude[/* keyof D */ java.lang.String, /* keyof P */ java.lang.String]
    ]
  ])) | P
  type FalseyValue = js.UndefOr[scala.Null | typingsSlinky.styledComponents.styledComponentsBooleans.`false`]
  type GlobalStyleComponent[P, T] = slinky.core.ReactComponentClass[
    typingsSlinky.styledComponents.styledComponentsMod.ThemedGlobalStyledClassProps[P, T]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.styledComponents.styledComponentsMod.InterpolationValue
    - typingsSlinky.styledComponents.styledComponentsMod.FlattenInterpolation[P]
    - typingsSlinky.styledComponents.styledComponentsMod.InterpolationFunction[P]
  */
  type Interpolation[P] = typingsSlinky.styledComponents.styledComponentsMod._Interpolation[P] | java.lang.String | scala.Double | typingsSlinky.styledComponents.styledComponentsMod.FalseyValue
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typingsSlinky.styledComponents.styledComponentsMod.FalseyValue
    - typingsSlinky.styledComponents.styledComponentsMod.Keyframes_
    - typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInterpolation
    - typingsSlinky.styledComponents.styledComponentsMod.CSSObject
  */
  type InterpolationValue = typingsSlinky.styledComponents.styledComponentsMod._InterpolationValue | java.lang.String | scala.Double | typingsSlinky.styledComponents.styledComponentsMod.FalseyValue
  // Helper type operators
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  // extracts React defaultProps
  type ReactDefaultProps[C] = js.Any
  type ReactDefaultizedProps[C, P] = P | (typingsSlinky.styledComponents.styledComponentsMod.Defaultize[P, js.Any])
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.styledComponents.styledComponentsMod.InterpolationValue
    - typingsSlinky.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
  */
  type SimpleInterpolation = typingsSlinky.styledComponents.styledComponentsMod._SimpleInterpolation | java.lang.String | scala.Double | typingsSlinky.styledComponents.styledComponentsMod.FalseyValue
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
  // Because of React typing quirks, when getting props from a React.ComponentClass,
  // we need to manually add a `children` field.
  // See https://github.com/DefinitelyTyped/DefinitelyTyped/pull/31945
  // and https://github.com/DefinitelyTyped/DefinitelyTyped/pull/32843
  type WithChildrenIfReactComponentClass[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = js.Object | typingsSlinky.styledComponents.anon.Children
  type WithOptionalTheme[P /* <: typingsSlinky.styledComponents.anon.ThemeT[T] */, T] = P with typingsSlinky.styledComponents.anon.ThemeT[T]
  type WithThemeFnInterface[T /* <: js.Object */] = typingsSlinky.styledComponents.styledComponentsMod.BaseWithThemeFnInterface[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[T]]
}
