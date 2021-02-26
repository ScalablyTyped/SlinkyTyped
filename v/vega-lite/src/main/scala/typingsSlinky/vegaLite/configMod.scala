package typingsSlinky.vegaLite

import typingsSlinky.std.Partial
import typingsSlinky.std.ReturnType
import typingsSlinky.vegaLite.anon.AxisConfigStyle
import typingsSlinky.vegaLite.anon.ConfigFrom
import typingsSlinky.vegaLite.channelMod.PositionScaleChannel
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcConfigMod.StyleConfigIndex
import typingsSlinky.vegaTypings.scaleMod.ScaleType
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfig")
  @js.native
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: String
  ): ConfigFrom = js.native
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfig")
  @js.native
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: String,
    axisConfigs: Partial[AxisConfigs]
  ): ConfigFrom = js.native
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfig")
  @js.native
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: js.Array[String]
  ): ConfigFrom = js.native
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfig")
  @js.native
  def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ js.Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: js.Array[String],
    axisConfigs: Partial[AxisConfigs]
  ): ConfigFrom = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfigStyle")
  @js.native
  def getAxisConfigStyle(axisConfigTypes: js.Array[String], config: Config[ExprRef | SignalRef]): js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfigs")
  @js.native
  def getAxisConfigs(
    channel: PositionScaleChannel,
    scaleType: ScaleType,
    orient: String,
    config: Config[ExprRef | SignalRef]
  ): AxisConfigStyle = js.native
  @JSImport("vega-lite/build/src/compile/axis/config", "getAxisConfigs")
  @js.native
  def getAxisConfigs(
    channel: PositionScaleChannel,
    scaleType: ScaleType,
    orient: SignalRef,
    config: Config[ExprRef | SignalRef]
  ): AxisConfigStyle = js.native
  
  type AxisConfigs = ReturnType[
    js.Function4[
      /* channel */ PositionScaleChannel, 
      /* scaleType */ ScaleType, 
      /* orient */ String | SignalRef, 
      /* config */ Config[ExprRef | SignalRef], 
      AxisConfigStyle
    ]
  ]
}
