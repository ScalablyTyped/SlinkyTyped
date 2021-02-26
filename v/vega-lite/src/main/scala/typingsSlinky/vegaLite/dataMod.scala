package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataflowMod.OutputNode
import typingsSlinky.vegaLite.facetMod.FacetNode
import typingsSlinky.vegaLite.sourceMod.SourceNode
import typingsSlinky.vegaLite.splitMod.Split
import typingsSlinky.vegaLite.srcDataMod.Parse
import typingsSlinky.vegaLite.utilMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("vega-lite/build/src/compile/data", "AncestorParse")
  @js.native
  class AncestorParse () extends Split[Parse] {
    def this(explicit: js.Object) = this()
    def this(explicit: js.UndefOr[scala.Nothing], `implicit`: js.Object) = this()
    def this(explicit: js.Object, `implicit`: js.Object) = this()
    def this(explicit: js.UndefOr[scala.Nothing], `implicit`: js.UndefOr[scala.Nothing], parseNothing: Boolean) = this()
    def this(explicit: js.UndefOr[scala.Nothing], `implicit`: js.Object, parseNothing: Boolean) = this()
    def this(explicit: js.Object, `implicit`: js.UndefOr[scala.Nothing], parseNothing: Boolean) = this()
    def this(explicit: js.Object, `implicit`: js.Object, parseNothing: Boolean) = this()
    
    var parseNothing: Boolean = js.native
  }
  
  @js.native
  trait DataComponent extends StObject {
    
    /**
      * Parse properties passed down from ancestors. Helps us to keep track of what has been parsed or is derived.
      */
    var ancestorParse: js.UndefOr[AncestorParse] = js.native
    
    /**
      * For facets, we store the reference to the root node.
      */
    var facetRoot: js.UndefOr[FacetNode] = js.native
    
    /**
      * True if the data for this model is faceted.
      * A dataset is faceted if a parent model is a facet and no new dataset is
      * defined (which would make the data unfaceted again).
      */
    var isFaceted: Boolean = js.native
    
    /**
      * The main output node.
      */
    var main: js.UndefOr[OutputNode] = js.native
    
    /**
      * How often is an output node used. If it is not used, we don't need to
      * instantiate it in the assemble step.
      */
    var outputNodeRefCounts: Dict[Double] = js.native
    
    /**
      * Registry of output nodes.
      */
    var outputNodes: Dict[OutputNode | FacetNode] = js.native
    
    /**
      * The output node before aggregation.
      */
    var raw: js.UndefOr[OutputNode] = js.native
    
    /**
      * A list of unique sources.
      */
    var sources: js.Array[SourceNode] = js.native
  }
  object DataComponent {
    
    @scala.inline
    def apply(
      isFaceted: Boolean,
      outputNodeRefCounts: Dict[Double],
      outputNodes: Dict[OutputNode | FacetNode],
      sources: js.Array[SourceNode]
    ): DataComponent = {
      val __obj = js.Dynamic.literal(isFaceted = isFaceted.asInstanceOf[js.Any], outputNodeRefCounts = outputNodeRefCounts.asInstanceOf[js.Any], outputNodes = outputNodes.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataComponent]
    }
    
    @scala.inline
    implicit class DataComponentMutableBuilder[Self <: DataComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAncestorParse(value: AncestorParse): Self = StObject.set(x, "ancestorParse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAncestorParseUndefined: Self = StObject.set(x, "ancestorParse", js.undefined)
      
      @scala.inline
      def setFacetRoot(value: FacetNode): Self = StObject.set(x, "facetRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacetRootUndefined: Self = StObject.set(x, "facetRoot", js.undefined)
      
      @scala.inline
      def setIsFaceted(value: Boolean): Self = StObject.set(x, "isFaceted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMain(value: OutputNode): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setOutputNodeRefCounts(value: Dict[Double]): Self = StObject.set(x, "outputNodeRefCounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputNodes(value: Dict[OutputNode | FacetNode]): Self = StObject.set(x, "outputNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: OutputNode): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setSources(value: js.Array[SourceNode]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesVarargs(value: SourceNode*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
}
