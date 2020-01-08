package typingsSlinky.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecConfigMod {
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Record
  import typingsSlinky.vegaDashTypings.typesSpecAxisMod.BaseAxis
  import typingsSlinky.vegaDashTypings.typesSpecEncodeMod.ColorValueRef
  import typingsSlinky.vegaDashTypings.typesSpecEncodeMod.NumericValueRef
  import typingsSlinky.vegaDashTypings.typesSpecEncodeMod.ScaledValueRef
  import typingsSlinky.vegaDashTypings.typesSpecProjectionMod.BaseProjection
  import typingsSlinky.vegaDashTypings.typesSpecSignalMod.SignalRef
  import typingsSlinky.vegaDashTypings.typesSpecStreamMod.EventType
  import typingsSlinky.vegaDashTypings.typesSpecTitleMod.BaseTitle
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.allow
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.mark
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.prevent

  type AxisConfig = ExcludeMappedValueRef[BaseAxis]
  type DefaultsConfig = Record[prevent | allow, Boolean | js.Array[EventType]]
  type ExcludeMappedValueRef[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: vega-typings.vega-typings/types/spec/config.ExcludeValueRefKeepSignal<T[P]>}
    */ typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.ExcludeMappedValueRef with T
  type ExcludeValueRefKeepSignal[T] = (Exclude[T, ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | KeepSignal[T]
  type KeepSignal[T] = SignalRef
  type MarkConfigKeys = mark | (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/mark.Mark['type'] */ js.Any)
  type ProjectionConfig = ExcludeMappedValueRef[BaseProjection]
  type TitleConfig = ExcludeMappedValueRef[BaseTitle]
}
