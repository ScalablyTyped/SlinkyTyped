package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.channeldefMod.PositionFieldDef
import typingsSlinky.vegaLite.dataflowMod.DataFlowNode
import typingsSlinky.vegaLite.sortMod.SortFields
import typingsSlinky.vegaLite.srcStackMod.StackOffset
import typingsSlinky.vegaLite.transformMod.StackTransform
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaTypings.transformMod.Transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("vega-lite/build/src/compile/data/stack", "StackNode")
  @js.native
  class StackNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, stack: StackComponent) = this()
    
    var _stack: js.Any = js.native
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): js.Array[Transforms] = js.native
    
    var getGroupbyFields: js.Any = js.native
    
    def stack: StackComponent = js.native
  }
  /* static members */
  object StackNode {
    
    @JSImport("vega-lite/build/src/compile/data/stack", "StackNode.makeFromEncoding")
    @js.native
    def makeFromEncoding(parent: DataFlowNode, model: UnitModel): StackNode = js.native
    
    @JSImport("vega-lite/build/src/compile/data/stack", "StackNode.makeFromTransform")
    @js.native
    def makeFromTransform(parent: DataFlowNode, stackTransform: StackTransform): StackNode = js.native
  }
  
  @js.native
  trait StackComponent extends StObject {
    
    /**
      * Output field names of each stack field.
      */
    var as: js.Tuple2[FieldName, FieldName] = js.native
    
    var dimensionFieldDef: js.UndefOr[PositionFieldDef[String]] = js.native
    
    /**
      * Faceted field.
      */
    var facetby: js.Array[String] = js.native
    
    /**
      * The data fields to group by.
      */
    var groupby: js.UndefOr[js.Array[FieldName]] = js.native
    
    /**
      * Whether to impute the data before stacking. Used only in makeFromEncoding.
      */
    var impute: js.UndefOr[Boolean] = js.native
    
    /** Mode for stacking marks.
      */
    var offset: StackOffset = js.native
    
    /**
      * Field that determines order of levels in the stacked charts.
      * Used in both but optional in transform.
      */
    var sort: SortFields = js.native
    
    /**
      * Stack measure's field. Used in makeFromEncoding.
      */
    var stackField: String = js.native
    
    /**
      * Level of detail fields for each level in the stacked charts such as color or detail.
      * Used in makeFromEncoding.
      */
    var stackby: js.UndefOr[js.Array[String]] = js.native
  }
  object StackComponent {
    
    @scala.inline
    def apply(
      as: js.Tuple2[FieldName, FieldName],
      facetby: js.Array[String],
      offset: StackOffset,
      sort: SortFields,
      stackField: String
    ): StackComponent = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], facetby = facetby.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], stackField = stackField.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackComponent]
    }
    
    @scala.inline
    implicit class StackComponentMutableBuilder[Self <: StackComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Tuple2[FieldName, FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionFieldDef(value: PositionFieldDef[String]): Self = StObject.set(x, "dimensionFieldDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionFieldDefUndefined: Self = StObject.set(x, "dimensionFieldDef", js.undefined)
      
      @scala.inline
      def setFacetby(value: js.Array[String]): Self = StObject.set(x, "facetby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacetbyVarargs(value: String*): Self = StObject.set(x, "facetby", js.Array(value :_*))
      
      @scala.inline
      def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
      
      @scala.inline
      def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value :_*))
      
      @scala.inline
      def setImpute(value: Boolean): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImputeUndefined: Self = StObject.set(x, "impute", js.undefined)
      
      @scala.inline
      def setOffset(value: StackOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSort(value: SortFields): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackField(value: String): Self = StObject.set(x, "stackField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackby(value: js.Array[String]): Self = StObject.set(x, "stackby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackbyUndefined: Self = StObject.set(x, "stackby", js.undefined)
      
      @scala.inline
      def setStackbyVarargs(value: String*): Self = StObject.set(x, "stackby", js.Array(value :_*))
    }
  }
}
