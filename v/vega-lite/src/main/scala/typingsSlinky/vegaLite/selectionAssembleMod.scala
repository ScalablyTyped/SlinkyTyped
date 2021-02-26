package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.compileFacetMod.FacetModel
import typingsSlinky.vegaLite.layerMod.LayerModel
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.srcSelectionMod.SelectionExtent
import typingsSlinky.vegaLite.srcSelectionMod.SelectionInit
import typingsSlinky.vegaLite.srcSelectionMod.SelectionInitInterval
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaSchemaMod.VgData
import typingsSlinky.vegaTypings.signalMod.Signal
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleFacetSignals")
  @js.native
  def assembleFacetSignals(model: FacetModel, signals: js.Array[Signal]): js.Array[Signal] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleInit")
  @js.native
  def assembleInit(init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleInit")
  @js.native
  def assembleInit(
    init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval],
    isExpr: js.UndefOr[scala.Nothing],
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleInit")
  @js.native
  def assembleInit(init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval], isExpr: Boolean): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleInit")
  @js.native
  def assembleInit(
    init: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval],
    isExpr: Boolean,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleInit")
  @js.native
  def assembleInit(init: SelectionInit): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleInit")
  @js.native
  def assembleInit(
    init: SelectionInit,
    isExpr: js.UndefOr[scala.Nothing],
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleInit")
  @js.native
  def assembleInit(init: SelectionInit, isExpr: Boolean): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleInit")
  @js.native
  def assembleInit(
    init: SelectionInit,
    isExpr: Boolean,
    wrap: js.Function1[/* str */ String | Double, String | Double]
  ): js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleLayerSelectionMarks")
  @js.native
  def assembleLayerSelectionMarks(model: LayerModel, marks: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleSelectionScaleDomain")
  @js.native
  def assembleSelectionScaleDomain(model: Model, extent: SelectionExtent): SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleTopLevelSignals")
  @js.native
  def assembleTopLevelSignals(model: UnitModel, signals: js.Array[Signal]): js.Array[Signal] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleUnitSelectionData")
  @js.native
  def assembleUnitSelectionData(model: UnitModel, data: js.Array[VgData]): js.Array[VgData] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleUnitSelectionMarks")
  @js.native
  def assembleUnitSelectionMarks(model: UnitModel, marks: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/assemble", "assembleUnitSelectionSignals")
  @js.native
  def assembleUnitSelectionSignals(model: UnitModel, signals: js.Array[Signal]): js.Array[Signal] = js.native
}
