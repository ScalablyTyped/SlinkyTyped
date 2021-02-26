package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channelMod.Channel
import typingsSlinky.vegaLite.channeldefMod.DatumDef
import typingsSlinky.vegaLite.channeldefMod.PrimitiveValue
import typingsSlinky.vegaLite.channeldefMod.TypedFieldDef
import typingsSlinky.vegaLite.datetimeMod.DateTime
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.scaleMod.Scale
import typingsSlinky.vegaLite.scaleMod.ScaleType
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("vega-lite/build/src/compile/scale/type", "scaleType")
  @js.native
  def scaleType(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: Channel,
    fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    mark: Mark
  ): ScaleType = js.native
  @JSImport("vega-lite/build/src/compile/scale/type", "scaleType")
  @js.native
  def scaleType_binned(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: Channel,
    fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null],
    mark: Mark
  ): ScaleType = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.continuous
    - typingsSlinky.vegaLite.vegaLiteStrings.discrete
    - typingsSlinky.vegaLite.vegaLiteStrings.flexible
    - js.UndefOr[scala.Nothing]
  */
  type RangeType = js.UndefOr[_RangeType]
  
  trait _RangeType extends StObject
}
