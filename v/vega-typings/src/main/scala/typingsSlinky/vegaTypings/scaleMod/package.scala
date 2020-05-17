package typingsSlinky.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scaleMod {
  type RangeRaw = js.Array[
    scala.Null | scala.Boolean | java.lang.String | scala.Double | typingsSlinky.vegaTypings.signalMod.SignalRef | typingsSlinky.vegaTypings.scaleMod.RangeRawArray
  ]
  type RangeRawArray = js.Array[scala.Double | typingsSlinky.vegaTypings.signalMod.SignalRef]
  type ScaleData = (typingsSlinky.vegaTypings.scaleMod.ScaleDataRef | typingsSlinky.vegaTypings.scaleMod.ScaleMultiDataRef | typingsSlinky.vegaTypings.scaleMod.ScaleMultiFieldsRef) with typingsSlinky.vegaTypings.anon.Sort
}
