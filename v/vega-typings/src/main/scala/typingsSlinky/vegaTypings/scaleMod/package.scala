package typingsSlinky.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scaleMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.scaleMod.RangeEnum
    - typingsSlinky.vegaTypings.scaleMod.RangeRaw
    - typingsSlinky.vegaTypings.anon.Step
  */
  type RangeBand = typingsSlinky.vegaTypings.scaleMod._RangeBand | typingsSlinky.vegaTypings.scaleMod.RangeRaw
  type RangeRaw = js.Array[
    scala.Null | scala.Boolean | java.lang.String | scala.Double | typingsSlinky.vegaTypings.signalMod.SignalRef | typingsSlinky.vegaTypings.scaleMod.RangeRawArray
  ]
  type RangeRawArray = js.Array[scala.Double | typingsSlinky.vegaTypings.signalMod.SignalRef]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.scaleMod.RangeEnum
    - typingsSlinky.vegaTypings.scaleMod.RangeRaw
    - typingsSlinky.vegaTypings.signalMod.SignalRef
    - typingsSlinky.vegaTypings.anon.Extent
  */
  type RangeScheme = typingsSlinky.vegaTypings.scaleMod._RangeScheme | typingsSlinky.vegaTypings.scaleMod.RangeRaw
  /* Rewritten from type alias, can be one of: 
    - js.Array[scala.Double | typingsSlinky.vegaTypings.signalMod.SignalRef]
    - typingsSlinky.vegaTypings.signalMod.SignalRef
    - typingsSlinky.vegaTypings.scaleMod.ScaleBinParams
  */
  type ScaleBins = typingsSlinky.vegaTypings.scaleMod._ScaleBins | (js.Array[scala.Double | typingsSlinky.vegaTypings.signalMod.SignalRef])
  type ScaleData = (typingsSlinky.vegaTypings.scaleMod.ScaleDataRef | typingsSlinky.vegaTypings.scaleMod.ScaleMultiDataRef | typingsSlinky.vegaTypings.scaleMod.ScaleMultiFieldsRef) with typingsSlinky.vegaTypings.anon.Sort
  type ScaleField = java.lang.String | typingsSlinky.vegaTypings.signalMod.SignalRef
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.vegaTypings.anon.OrderSortOrder
    - typingsSlinky.vegaTypings.anon.Op
  */
  type SortField = typingsSlinky.vegaTypings.scaleMod._SortField | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.vegaTypings.anon.OpOrder
    - typingsSlinky.vegaTypings.anon.FieldOp
  */
  type UnionSortField = typingsSlinky.vegaTypings.scaleMod._UnionSortField | scala.Boolean
}
