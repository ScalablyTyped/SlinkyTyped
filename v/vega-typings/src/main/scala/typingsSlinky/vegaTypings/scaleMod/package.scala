package typingsSlinky.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scaleMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.scaleMod.RangeEnum
    - typingsSlinky.vegaTypings.scaleMod.RangeRaw
    - typingsSlinky.vegaTypings.AnonStep
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
    - typingsSlinky.vegaTypings.AnonExtent
  */
  type RangeScheme = typingsSlinky.vegaTypings.scaleMod._RangeScheme | typingsSlinky.vegaTypings.scaleMod.RangeRaw
  /* Rewritten from type alias, can be one of: 
    - js.Array[scala.Double | typingsSlinky.vegaTypings.signalMod.SignalRef]
    - typingsSlinky.vegaTypings.signalMod.SignalRef
    - typingsSlinky.vegaTypings.AnonStart
  */
  type ScaleBins = typingsSlinky.vegaTypings.scaleMod._ScaleBins | (js.Array[scala.Double | typingsSlinky.vegaTypings.signalMod.SignalRef])
  type ScaleData = typingsSlinky.vegaTypings.DataRefsortSortField | (typingsSlinky.vegaTypings.scaleMod.MultiDataRef with typingsSlinky.vegaTypings.AnonSort)
  type ScaleField = java.lang.String | typingsSlinky.vegaTypings.signalMod.SignalRef
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.vegaTypings.AnonOrderSortOrder
    - typingsSlinky.vegaTypings.AnonOp
  */
  type SortField = typingsSlinky.vegaTypings.scaleMod._SortField | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.vegaTypings.AnonOpOrder
    - typingsSlinky.vegaTypings.AnonFieldOp
  */
  type UnionSortField = typingsSlinky.vegaTypings.scaleMod._UnionSortField | scala.Boolean
}
