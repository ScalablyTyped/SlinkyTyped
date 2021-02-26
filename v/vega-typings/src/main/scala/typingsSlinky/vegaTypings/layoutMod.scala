package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.signalMod.SignalRef
    - typingsSlinky.vegaTypings.layoutMod.LayoutParams
  */
  trait Layout extends StObject
  object Layout {
    
    @scala.inline
    def LayoutParams(): typingsSlinky.vegaTypings.layoutMod.LayoutParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.vegaTypings.layoutMod.LayoutParams]
    }
    
    @scala.inline
    def SignalRef(signal: String): typingsSlinky.vegaTypings.signalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.signalMod.SignalRef]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.all
    - typingsSlinky.vegaTypings.vegaTypingsStrings.each
    - typingsSlinky.vegaTypings.vegaTypingsStrings.none
  */
  trait LayoutAlign extends StObject
  object LayoutAlign {
    
    @scala.inline
    def all: typingsSlinky.vegaTypings.vegaTypingsStrings.all = "all".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.all]
    
    @scala.inline
    def each: typingsSlinky.vegaTypings.vegaTypingsStrings.each = "each".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.each]
    
    @scala.inline
    def none: typingsSlinky.vegaTypings.vegaTypingsStrings.none = "none".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.full
    - typingsSlinky.vegaTypings.vegaTypingsStrings.flush
    - typingsSlinky.vegaTypings.signalMod.SignalRef
  */
  trait LayoutBounds extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.vegaTypings.signalMod.SignalRef
    - typingsSlinky.vegaTypings.anon.ColumnFooter
  */
  type LayoutOffset = _LayoutOffset | Double
  
  @js.native
  trait LayoutParams extends Layout {
    
    var align: js.UndefOr[LayoutAlign | SignalRef | RowColumn[LayoutAlign]] = js.native
    
    var bounds: js.UndefOr[LayoutBounds] = js.native
    
    var columns: js.UndefOr[Double | SignalRef] = js.native
    
    var footerBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
    
    var headerBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
    
    var offset: js.UndefOr[LayoutOffset] = js.native
    
    var padding: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
    
    var titleAnchor: js.UndefOr[LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor]] = js.native
    
    var titleBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.native
  }
  object LayoutParams {
    
    @scala.inline
    def apply(): LayoutParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutParams]
    }
    
    @scala.inline
    implicit class LayoutParamsMutableBuilder[Self <: LayoutParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: LayoutAlign | SignalRef | RowColumn[LayoutAlign]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBounds(value: LayoutBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setColumns(value: Double | SignalRef): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setFooterBand(value: Double | SignalRef | RowColumn[Double]): Self = StObject.set(x, "footerBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterBandUndefined: Self = StObject.set(x, "footerBand", js.undefined)
      
      @scala.inline
      def setHeaderBand(value: Double | SignalRef | RowColumn[Double]): Self = StObject.set(x, "headerBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderBandUndefined: Self = StObject.set(x, "headerBand", js.undefined)
      
      @scala.inline
      def setOffset(value: LayoutOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | SignalRef | RowColumn[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setTitleAnchor(value: LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor]): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      @scala.inline
      def setTitleBand(value: Double | SignalRef | RowColumn[Double]): Self = StObject.set(x, "titleBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBandUndefined: Self = StObject.set(x, "titleBand", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.start
    - typingsSlinky.vegaTypings.vegaTypingsStrings.end
  */
  trait LayoutTitleAnchor extends StObject
  object LayoutTitleAnchor {
    
    @scala.inline
    def end: typingsSlinky.vegaTypings.vegaTypingsStrings.end = "end".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.end]
    
    @scala.inline
    def start: typingsSlinky.vegaTypings.vegaTypingsStrings.start = "start".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.start]
  }
  
  @js.native
  trait RowColumn[T] extends StObject {
    
    var column: js.UndefOr[T | SignalRef] = js.native
    
    var row: js.UndefOr[T | SignalRef] = js.native
  }
  object RowColumn {
    
    @scala.inline
    def apply[T](): RowColumn[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowColumn[T]]
    }
    
    @scala.inline
    implicit class RowColumnMutableBuilder[Self <: RowColumn[_], T] (val x: Self with RowColumn[T]) extends AnyVal {
      
      @scala.inline
      def setColumn(value: T | SignalRef): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setRow(value: T | SignalRef): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait _LayoutOffset extends StObject
  object _LayoutOffset {
    
    @scala.inline
    def ColumnFooter(): typingsSlinky.vegaTypings.anon.ColumnFooter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.ColumnFooter]
    }
    
    @scala.inline
    def SignalRef(signal: String): typingsSlinky.vegaTypings.signalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.signalMod.SignalRef]
    }
  }
}
