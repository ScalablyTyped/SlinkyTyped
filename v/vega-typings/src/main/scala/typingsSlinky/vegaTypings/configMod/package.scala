package typingsSlinky.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object configMod {
  
  type ExcludeMappedValueRef[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Exclude<T[P], vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/config.KeepSignal<T[P]>}
    */ typingsSlinky.vegaTypings.vegaTypingsStrings.ExcludeMappedValueRef with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type KeepSignal[T] = typingsSlinky.vegaTypings.signalMod.SignalRef
}
