package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.channelMod.ScaleChannel
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.scaleMod.Domain
import typingsSlinky.vegaLite.splitMod.Explicit
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaLiteStrings.`type`
import typingsSlinky.vegaLite.vegaLiteStrings.align
import typingsSlinky.vegaLite.vegaLiteStrings.base
import typingsSlinky.vegaLite.vegaLiteStrings.bins
import typingsSlinky.vegaLite.vegaLiteStrings.clamp
import typingsSlinky.vegaLite.vegaLiteStrings.constant
import typingsSlinky.vegaLite.vegaLiteStrings.domain
import typingsSlinky.vegaLite.vegaLiteStrings.domainMax
import typingsSlinky.vegaLite.vegaLiteStrings.domainMid
import typingsSlinky.vegaLite.vegaLiteStrings.domainMin
import typingsSlinky.vegaLite.vegaLiteStrings.exponent
import typingsSlinky.vegaLite.vegaLiteStrings.interpolate
import typingsSlinky.vegaLite.vegaLiteStrings.nice
import typingsSlinky.vegaLite.vegaLiteStrings.padding
import typingsSlinky.vegaLite.vegaLiteStrings.paddingInner
import typingsSlinky.vegaLite.vegaLiteStrings.paddingOuter
import typingsSlinky.vegaLite.vegaLiteStrings.quantile
import typingsSlinky.vegaLite.vegaLiteStrings.quantize
import typingsSlinky.vegaLite.vegaLiteStrings.range
import typingsSlinky.vegaLite.vegaLiteStrings.rangeMax
import typingsSlinky.vegaLite.vegaLiteStrings.rangeMin
import typingsSlinky.vegaLite.vegaLiteStrings.reverse
import typingsSlinky.vegaLite.vegaLiteStrings.round
import typingsSlinky.vegaLite.vegaLiteStrings.scheme
import typingsSlinky.vegaLite.vegaLiteStrings.threshold
import typingsSlinky.vegaLite.vegaLiteStrings.zero
import typingsSlinky.vegaLite.vegaSchemaMod.VgRange
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("vega-lite/build/src/compile/scale/range", "MAX_SIZE_RANGE_STEP_RATIO")
  @js.native
  val MAX_SIZE_RANGE_STEP_RATIO: /* 0.95 */ Double = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/range", "RANGE_PROPERTIES")
  @js.native
  val RANGE_PROPERTIES: js.Array[
    /* keyof vega-lite.vega-lite/build/src/scale.Scale<vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> */ `type` | domain | domainMid | domainMax | domainMin | reverse | range | rangeMax | rangeMin | scheme | align | bins | round | padding | paddingInner | paddingOuter | clamp | nice | base | exponent | constant | zero | interpolate
  ] = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/range", "defaultContinuousToDiscreteCount")
  @js.native
  def defaultContinuousToDiscreteCount_quantile(scaleType: quantile, config: Config[ExprRef | SignalRef], domain: Domain, channel: ScaleChannel): Double = js.native
  @JSImport("vega-lite/build/src/compile/scale/range", "defaultContinuousToDiscreteCount")
  @js.native
  def defaultContinuousToDiscreteCount_quantize(scaleType: quantize, config: Config[ExprRef | SignalRef], domain: Domain, channel: ScaleChannel): Double = js.native
  @JSImport("vega-lite/build/src/compile/scale/range", "defaultContinuousToDiscreteCount")
  @js.native
  def defaultContinuousToDiscreteCount_threshold(scaleType: threshold, config: Config[ExprRef | SignalRef], domain: Domain, channel: ScaleChannel): Double = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/range", "interpolateRange")
  @js.native
  def interpolateRange(rangeMin: Double, rangeMax: Double, cardinality: Double): SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/scale/range", "interpolateRange")
  @js.native
  def interpolateRange(rangeMin: Double, rangeMax: SignalRef, cardinality: Double): SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/scale/range", "interpolateRange")
  @js.native
  def interpolateRange(rangeMin: SignalRef, rangeMax: Double, cardinality: Double): SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/scale/range", "interpolateRange")
  @js.native
  def interpolateRange(rangeMin: SignalRef, rangeMax: SignalRef, cardinality: Double): SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/range", "parseRangeForChannel")
  @js.native
  def parseRangeForChannel(channel: ScaleChannel, model: UnitModel): Explicit[VgRange] = js.native
  
  @JSImport("vega-lite/build/src/compile/scale/range", "parseUnitScaleRange")
  @js.native
  def parseUnitScaleRange(model: UnitModel): Unit = js.native
}
