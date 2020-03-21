package typingsSlinky.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configMod {
  type ExcludeMappedValueRef[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: vega-typings.vega-typings/types/spec/config.ExcludeValueRefKeepSignal<T[P]>}
    */ typingsSlinky.vegaTypings.vegaTypingsStrings.ExcludeMappedValueRef with T
  type ExcludeValueRefKeepSignal[T] = (typingsSlinky.std.Exclude[
    T, 
    typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[js.Any] | typingsSlinky.vegaTypings.encodeMod.NumericValueRef | typingsSlinky.vegaTypings.encodeMod.ColorValueRef
  ]) | typingsSlinky.vegaTypings.configMod.KeepSignal[T]
  type KeepSignal[T] = typingsSlinky.vegaTypings.signalMod.SignalRef
  type MarkConfigKeys = typingsSlinky.vegaTypings.vegaTypingsStrings.mark | (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/mark.Mark['type'] */ js.Any)
}
