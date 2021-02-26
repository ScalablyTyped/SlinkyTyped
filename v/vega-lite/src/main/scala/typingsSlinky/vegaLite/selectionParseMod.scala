package typingsSlinky.vegaLite

import typingsSlinky.std.Record
import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.dataflowMod.OutputNode
import typingsSlinky.vegaLite.logicalMod.LogicalComposition
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.selectionMod.SelectionComponent
import typingsSlinky.vegaLite.srcSelectionMod.SelectionDef
import typingsSlinky.vegaLite.srcSelectionMod.SelectionExtent
import typingsSlinky.vegaLite.srcSelectionMod.SelectionType
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.utilMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionParseMod {
  
  @JSImport("vega-lite/build/src/compile/selection/parse", "materializeSelections")
  @js.native
  def materializeSelections(model: UnitModel, main: OutputNode): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseSelectionBinExtent")
  @js.native
  def parseSelectionBinExtent(selCmpt: SelectionComponent[SelectionType], extent: SelectionExtent): String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseSelectionPredicate")
  @js.native
  def parseSelectionPredicate(model: Model, selections: LogicalComposition[String]): String = js.native
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseSelectionPredicate")
  @js.native
  def parseSelectionPredicate(
    model: Model,
    selections: LogicalComposition[String],
    dfnode: js.UndefOr[scala.Nothing],
    datum: String
  ): String = js.native
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseSelectionPredicate")
  @js.native
  def parseSelectionPredicate(model: Model, selections: LogicalComposition[String], dfnode: DataFlowNode): String = js.native
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseSelectionPredicate")
  @js.native
  def parseSelectionPredicate(model: Model, selections: LogicalComposition[String], dfnode: DataFlowNode, datum: String): String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/parse", "parseUnitSelection")
  @js.native
  def parseUnitSelection(model: UnitModel, selDefs: Dict[SelectionDef]): Record[String, SelectionComponent[_]] = js.native
}
