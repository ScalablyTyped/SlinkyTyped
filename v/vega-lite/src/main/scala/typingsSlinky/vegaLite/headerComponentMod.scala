package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.Signal
import typingsSlinky.vegaLite.specFacetMod.FacetFieldDef
import typingsSlinky.vegaTypings.axisMod.Axis
import typingsSlinky.vegaTypings.encodeMod.Text
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerComponentMod {
  
  @JSImport("vega-lite/build/src/compile/header/component", "HEADER_CHANNELS")
  @js.native
  val HEADER_CHANNELS: js.Array[HeaderChannel] = js.native
  
  @JSImport("vega-lite/build/src/compile/header/component", "HEADER_TYPES")
  @js.native
  val HEADER_TYPES: js.Array[HeaderType] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.row
    - typingsSlinky.vegaLite.vegaLiteStrings.column
  */
  trait HeaderChannel extends StObject
  object HeaderChannel {
    
    @scala.inline
    def column: typingsSlinky.vegaLite.vegaLiteStrings.column = "column".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.column]
    
    @scala.inline
    def row: typingsSlinky.vegaLite.vegaLiteStrings.row = "row".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.row]
  }
  
  @js.native
  trait HeaderComponent extends StObject {
    
    var axes: js.Array[Axis] = js.native
    
    var labels: Boolean = js.native
    
    var sizeSignal: Signal = js.native
  }
  object HeaderComponent {
    
    @scala.inline
    def apply(axes: js.Array[Axis], labels: Boolean, sizeSignal: Signal): HeaderComponent = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], sizeSignal = sizeSignal.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderComponent]
    }
    
    @scala.inline
    implicit class HeaderComponentMutableBuilder[Self <: HeaderComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: js.Array[Axis]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesVarargs(value: Axis*): Self = StObject.set(x, "axes", js.Array(value :_*))
      
      @scala.inline
      def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSignal(value: Signal): Self = StObject.set(x, "sizeSignal", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.header
    - typingsSlinky.vegaLite.vegaLiteStrings.footer
  */
  trait HeaderType extends StObject
  object HeaderType {
    
    @scala.inline
    def footer: typingsSlinky.vegaLite.vegaLiteStrings.footer = "footer".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.footer]
    
    @scala.inline
    def header: typingsSlinky.vegaLite.vegaLiteStrings.header = "header".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.header]
  }
  
  @js.native
  trait LayoutHeaderComponent extends StObject {
    
    var facetFieldDef: js.UndefOr[FacetFieldDef[String, SignalRef]] = js.native
    
    /**
      * An array of header components for footers.
      * For facet, there should be only one header component, which is data-driven.
      * For concat, there can be multiple header components that explicitly list different axes.
      */
    var footer: js.UndefOr[js.Array[HeaderComponent]] = js.native
    
    /**
      * An array of header components for headers.
      * For facet, there should be only one header component, which is data-driven.
      * For concat, there can be multiple header components that explicitly list different axes.
      */
    var header: js.UndefOr[js.Array[HeaderComponent]] = js.native
    
    var title: js.UndefOr[Text | SignalRef] = js.native
  }
  object LayoutHeaderComponent {
    
    @scala.inline
    def apply(): LayoutHeaderComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutHeaderComponent]
    }
    
    @scala.inline
    implicit class LayoutHeaderComponentMutableBuilder[Self <: LayoutHeaderComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFacetFieldDef(value: FacetFieldDef[String, SignalRef]): Self = StObject.set(x, "facetFieldDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacetFieldDefUndefined: Self = StObject.set(x, "facetFieldDef", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Array[HeaderComponent]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFooterVarargs(value: HeaderComponent*): Self = StObject.set(x, "footer", js.Array(value :_*))
      
      @scala.inline
      def setHeader(value: js.Array[HeaderComponent]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeaderVarargs(value: HeaderComponent*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LayoutHeaderComponentIndex extends StObject {
    
    var column: js.UndefOr[LayoutHeaderComponent] = js.native
    
    var facet: js.UndefOr[LayoutHeaderComponent] = js.native
    
    var row: js.UndefOr[LayoutHeaderComponent] = js.native
  }
  object LayoutHeaderComponentIndex {
    
    @scala.inline
    def apply(): LayoutHeaderComponentIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutHeaderComponentIndex]
    }
    
    @scala.inline
    implicit class LayoutHeaderComponentIndexMutableBuilder[Self <: LayoutHeaderComponentIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: LayoutHeaderComponent): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setFacet(value: LayoutHeaderComponent): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacetUndefined: Self = StObject.set(x, "facet", js.undefined)
      
      @scala.inline
      def setRow(value: LayoutHeaderComponent): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
