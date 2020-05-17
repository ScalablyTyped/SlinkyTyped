package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Attributes[T /* <: typingsSlinky.tabris.anon.JsxAttributes */] = /* import warning: importer.ImportType#apply Failed type conversion: T['jsxAttributes'] */ js.Any
  type ConstraintArray = js.Tuple2[
    typingsSlinky.tabris.mod.SiblingReferenceValue | typingsSlinky.tabris.mod.PercentValue, 
    typingsSlinky.tabris.mod.Offset
  ]
  type ConstraintArrayValue = js.Tuple2[
    typingsSlinky.tabris.mod.SiblingReference | typingsSlinky.tabris.mod.PercentValue, 
    typingsSlinky.tabris.mod.Offset
  ]
  type Diff[T, U] = T
  type Dimension = scala.Double
  type ExtendedEvent[EventData, Target] = typingsSlinky.tabris.mod.EventObject[Target] with EventData
  type JSXAttributes[T /* <: typingsSlinky.tabris.anon.JsxAttributes */, U] = (typingsSlinky.tabris.mod.Properties[U, typingsSlinky.tabris.mod.Omit[U, typingsSlinky.tabris.tabrisStrings.set]]) with typingsSlinky.tabris.mod.ListenersMap[U] with typingsSlinky.tabris.mod.JSXShorthands[U]
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
  type PrevString = typingsSlinky.tabris.tabrisStrings.prevLeftparenthesisRightparenthesis
  type Properties[T /* <: typingsSlinky.tabris.anon.Set */, U] = (typingsSlinky.std.Partial[
    typingsSlinky.tabris.mod.Omit[
      U, 
      typingsSlinky.tabris.mod.MethodKeysOf[U] | typingsSlinky.tabris.mod.ReadOnlyKeysOf[U]
    ]
  ]) with js.Object
  type ReadOnly[T /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Partial[typingsSlinky.std.Record[T, scala.Nothing]]
  type ReadOnlyKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: tabris.tabris.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, never, P>}[keyof T] */ js.Any
  type SFC[T] = js.Function2[/* attributes */ js.Object | scala.Null, /* children */ js.Array[js.Any], T]
  type SelectorFunction[Candidate /* <: typingsSlinky.tabris.mod.Widget */] = js.Function3[
    /* widget */ Candidate, 
    /* index */ scala.Double, 
    /* collection */ typingsSlinky.tabris.mod.WidgetCollection[Candidate], 
    scala.Boolean
  ]
  type SelectorString = java.lang.String
  type TargetType[E /* <: js.Object */] = js.Any
}
