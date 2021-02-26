package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.joinaggregateMod.JoinAggregateTransformNode
import typingsSlinky.vegaLite.specFacetMod.FacetFieldDef
import typingsSlinky.vegaLite.specFacetMod.FacetMapping
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinaggregatefacetMod {
  
  @JSImport("vega-lite/build/src/compile/data/joinaggregatefacet", "makeJoinAggregateFromFacet")
  @js.native
  def makeJoinAggregateFromFacet(parent: DataFlowNode, facet: FacetMapping[String, FacetFieldDef[String, ExprRef | SignalRef]]): JoinAggregateTransformNode = js.native
}
