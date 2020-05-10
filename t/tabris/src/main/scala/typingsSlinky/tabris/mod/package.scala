package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Attributes[T /* <: typingsSlinky.tabris.AnonJsxAttributes */] = /* import warning: importer.ImportType#apply Failed type conversion: T['jsxAttributes'] */ js.Any
  type BoxDimensions = scala.Double | java.lang.String | (js.Tuple4[
    scala.Double, 
    js.UndefOr[scala.Double], 
    js.UndefOr[scala.Double], 
    js.UndefOr[scala.Double]
  ]) | typingsSlinky.tabris.AnonBottom
  type ColorArray = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double])
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabris.mod.ColorLikeObject
    - typingsSlinky.tabris.mod.ColorArray
    - java.lang.String
    - typingsSlinky.tabris.tabrisStrings.initial
    - scala.Null
  */
  type ColorValue = typingsSlinky.tabris.mod._ColorValue | typingsSlinky.tabris.mod.ColorArray | java.lang.String | scala.Null
  type ConstraintArray = js.Tuple2[
    typingsSlinky.tabris.mod.SiblingReferenceValue | typingsSlinky.tabris.mod.PercentValue, 
    typingsSlinky.tabris.mod.Offset
  ]
  type ConstraintArrayValue = js.Tuple2[
    typingsSlinky.tabris.mod.SiblingReference | typingsSlinky.tabris.mod.PercentValue, 
    typingsSlinky.tabris.mod.Offset
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabris.mod.Constraint
    - typingsSlinky.tabris.mod.ConstraintArrayValue
    - typingsSlinky.tabris.mod.ConstraintLikeObject
    - typingsSlinky.tabris.mod.Offset
    - typingsSlinky.tabris.mod.PercentValue
    - typingsSlinky.tabris.mod.SiblingReferenceValue
    - typingsSlinky.tabris.tabrisBooleans.`true`
  */
  type ConstraintValue = typingsSlinky.tabris.mod._ConstraintValue | typingsSlinky.tabris.mod.ConstraintArrayValue | typingsSlinky.tabris.mod.Offset | typingsSlinky.tabris.mod.PercentValue | typingsSlinky.tabris.mod.SiblingReferenceValue
  type Diff[T, U] = T
  type Dimension = scala.Double
  type ExtendedEvent[EventData, Target] = typingsSlinky.tabris.mod.EventObject[Target] with EventData
  type Flatten[T] = js.UndefOr[T | js.Array[T]]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabris.mod.FontLikeObject
    - java.lang.String
    - typingsSlinky.tabris.tabrisStrings.initial
    - scala.Null
  */
  type FontValue = typingsSlinky.tabris.mod._FontValue | java.lang.String | scala.Null
  type IfEquals[X, Y, A, B] = B | A
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabris.mod.ImageLikeObject
    - typingsSlinky.tabris.mod.Image
    - java.lang.String
    - typingsSlinky.tabris.mod.ImageBitmap
    - typingsSlinky.tabris.Blob
    - scala.Null
  */
  type ImageValue = typingsSlinky.tabris.mod._ImageValue | java.lang.String | scala.Null
  type JSXAttributes[T /* <: typingsSlinky.tabris.AnonJsxAttributes */, U] = (typingsSlinky.tabris.mod.Properties[U, typingsSlinky.tabris.mod.Omit[U, typingsSlinky.tabris.tabrisStrings.set]]) with typingsSlinky.tabris.mod.ListenersMap[U] with typingsSlinky.tabris.mod.JSXShorthands[U]
  type JSXChildren[T /* <: typingsSlinky.tabris.mod.Widget */] = js.UndefOr[
    T | typingsSlinky.tabris.mod.WidgetCollection[T] | (js.Array[T | typingsSlinky.tabris.mod.WidgetCollection[T]])
  ]
  type JSXShorthands[T] = js.Object | typingsSlinky.tabris.AnonCenter
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tabris.mod.LinearGradientLikeObject
    - java.lang.String
    - typingsSlinky.tabris.tabrisStrings.initial
    - scala.Null
  */
  type LinearGradientValue = typingsSlinky.tabris.mod._LinearGradientValue | java.lang.String | scala.Null
  type Listener[T] = js.Function1[/* ev */ typingsSlinky.tabris.mod.ExtendedEvent[T, js.Object], js.Any]
  type ListenersKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends tabris.tabris.Listeners<any>? K : never}[keyof T] */ js.Any
  type ListenersMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in tabris.tabris.ListenersKeysOf<T> ]:? tabris.tabris.UnpackListeners<T[Key]>}
    */ typingsSlinky.tabris.tabrisStrings.ListenersMap with org.scalablytyped.runtime.TopLevel[T]
  type ListenersTriggerParam[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in tabris.tabris.Diff<keyof T, keyof tabris.tabris.EventObject<object>> ]: T[P]}
    */ typingsSlinky.tabris.tabrisStrings.ListenersTriggerParam with org.scalablytyped.runtime.TopLevel[T]
  type MethodKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  type ModuleLoader = js.Function5[
    /* module */ typingsSlinky.tabris.mod.Module, 
    /* exports */ js.Object, 
    /* require */ js.Function1[/* fn */ java.lang.String, js.Object], 
    /* __filename */ java.lang.String, 
    /* __dirname */ java.lang.String, 
    scala.Unit
  ]
  type NextString = typingsSlinky.tabris.tabrisStrings.nextLeftparenthesisRightparenthesis
  type Offset = scala.Double
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type ParamType[T /* <: js.Function1[/* arg */ js.Any, _] */] = js.Any
  type PercentValue = java.lang.String | typingsSlinky.tabris.mod.PercentLikeObject
  type PrevString = typingsSlinky.tabris.tabrisStrings.prevLeftparenthesisRightparenthesis
  type Properties[T /* <: typingsSlinky.tabris.AnonSet */, U] = (typingsSlinky.std.Partial[
    typingsSlinky.tabris.mod.Omit[
      U, 
      typingsSlinky.tabris.mod.MethodKeysOf[U] | typingsSlinky.tabris.mod.ReadOnlyKeysOf[U]
    ]
  ]) with js.Object
  type ReadOnly[T /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Partial[typingsSlinky.std.Record[T, scala.Nothing]]
  type ReadOnlyKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: tabris.tabris.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, never, P>}[keyof T] */ js.Any
  type SFC[T] = js.Function2[/* attributes */ js.Object | scala.Null, /* children */ js.Array[js.Any], T]
  type Selector[Candidate /* <: typingsSlinky.tabris.mod.Widget */, Result /* <: Candidate */] = typingsSlinky.tabris.mod.SelectorString | typingsSlinky.tabris.mod.SelectorFunction[Candidate] | typingsSlinky.tabris.mod.Constructor[Result] | typingsSlinky.tabris.mod.SFC[Result]
  type SelectorFunction[Candidate /* <: typingsSlinky.tabris.mod.Widget */] = js.Function3[
    /* widget */ Candidate, 
    /* index */ scala.Double, 
    /* collection */ typingsSlinky.tabris.mod.WidgetCollection[Candidate], 
    scala.Boolean
  ]
  type SelectorString = java.lang.String
  type SiblingReference = typingsSlinky.tabris.mod.Widget | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutData.next */ js.Any) | typingsSlinky.tabris.mod.SelectorString
  type SiblingReferenceValue = typingsSlinky.tabris.mod.Widget | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutData.next */ js.Any) | typingsSlinky.tabris.mod.SelectorString
  type TargetType[E /* <: js.Object */] = js.Any
  type UnpackListeners[T] = T | typingsSlinky.tabris.mod.Listener[js.Any]
}
