package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaTypings.exprMod.ExprRef
import typingsSlinky.vegaTypings.transformMod.GeoJSONTransform
import typingsSlinky.vegaTypings.utilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geojsonMod {
  
  @JSImport("vega-lite/build/src/compile/data/geojson", "GeoJSONNode")
  @js.native
  class GeoJSONNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef]) = this()
    def this(parent: DataFlowNode, fields: js.UndefOr[scala.Nothing], geojson: String) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef], geojson: String) = this()
    def this(
      parent: DataFlowNode,
      fields: js.UndefOr[scala.Nothing],
      geojson: js.UndefOr[scala.Nothing],
      signal: String
    ) = this()
    def this(parent: DataFlowNode, fields: js.UndefOr[scala.Nothing], geojson: String, signal: String) = this()
    def this(
      parent: DataFlowNode,
      fields: Vector2[String | ExprRef],
      geojson: js.UndefOr[scala.Nothing],
      signal: String
    ) = this()
    def this(parent: DataFlowNode, fields: Vector2[String | ExprRef], geojson: String, signal: String) = this()
    
    def assemble(): GeoJSONTransform = js.native
    
    var fields: js.Any = js.native
    
    var geojson: js.Any = js.native
    
    var signal: js.Any = js.native
  }
  /* static members */
  object GeoJSONNode {
    
    @JSImport("vega-lite/build/src/compile/data/geojson", "GeoJSONNode.parseAll")
    @js.native
    def parseAll(parent: DataFlowNode, model: UnitModel): DataFlowNode = js.native
  }
}
