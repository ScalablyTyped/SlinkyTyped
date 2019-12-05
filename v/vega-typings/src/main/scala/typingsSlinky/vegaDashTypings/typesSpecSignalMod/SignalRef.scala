package typingsSlinky.vegaDashTypings.typesSpecSignalMod

import typingsSlinky.vegaDashTypings.typesSpecAxisMod._TickCount
import typingsSlinky.vegaDashTypings.typesSpecEncodeMod.BaseValueRef
import typingsSlinky.vegaDashTypings.typesSpecEncodeMod._Field
import typingsSlinky.vegaDashTypings.typesSpecLayoutMod.Layout
import typingsSlinky.vegaDashTypings.typesSpecLayoutMod.LayoutBounds
import typingsSlinky.vegaDashTypings.typesSpecLayoutMod._LayoutOffset
import typingsSlinky.vegaDashTypings.typesSpecOnDashEventsMod._EventListener
import typingsSlinky.vegaDashTypings.typesSpecOnDashEventsMod._Update
import typingsSlinky.vegaDashTypings.typesSpecScaleMod.ScaleInterpolate
import typingsSlinky.vegaDashTypings.typesSpecScaleMod.SortOrder
import typingsSlinky.vegaDashTypings.typesSpecScaleMod._RangeScheme
import typingsSlinky.vegaDashTypings.typesSpecScaleMod._ScaleBins
import typingsSlinky.vegaDashTypings.typesSpecTransformMod.TransformField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalRef
  extends BaseValueRef[js.Any]
     with Layout
     with LayoutBounds
     with ScaleInterpolate
     with SortOrder
     with TransformField
     with _EventListener
     with _Field
     with _LayoutOffset
     with _RangeScheme
     with _ScaleBins
     with _TickCount
     with _Update {
  var signal: String
}

object SignalRef {
  @scala.inline
  def apply(signal: String): SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignalRef]
  }
}

