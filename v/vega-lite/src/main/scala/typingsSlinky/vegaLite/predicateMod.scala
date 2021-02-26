package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.logicalMod.LogicalComposition
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.srcPredicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicateMod {
  
  @JSImport("vega-lite/build/src/compile/predicate", "expression")
  @js.native
  def expression(model: Model, filterOp: LogicalComposition[Predicate]): String = js.native
  @JSImport("vega-lite/build/src/compile/predicate", "expression")
  @js.native
  def expression(model: Model, filterOp: LogicalComposition[Predicate], node: DataFlowNode): String = js.native
}
