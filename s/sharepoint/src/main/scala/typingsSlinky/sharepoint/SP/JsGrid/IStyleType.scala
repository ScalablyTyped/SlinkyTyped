package typingsSlinky.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyleType extends StObject
object IStyleType {
  
  @js.native
  trait Cell extends IStyleType {
    
    /** -> CSS background-color */
    var backgroundColor: js.Any = js.native
    
    /** -> CSS font-family */
    var font: js.Any = js.native
    
    /** -> CSS font-size */
    var fontSize: js.Any = js.native
    
    /** -> CSS font-style */
    var fontStyle: js.Any = js.native
    
    /** -> CSS font-weight */
    var fontWeight: js.Any = js.native
    
    /** -> CSS text-align */
    var textAlign: js.Any = js.native
    
    /** -> CSS color */
    var textColor: js.Any = js.native
  }
  object Cell {
    
    @scala.inline
    def apply(
      backgroundColor: js.Any,
      font: js.Any,
      fontSize: js.Any,
      fontStyle: js.Any,
      fontWeight: js.Any,
      textAlign: js.Any,
      textColor: js.Any
    ): Cell = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cell]
    }
    
    @scala.inline
    implicit class CellMutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: js.Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont(value: js.Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: js.Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyle(value: js.Any): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(value: js.Any): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlign(value: js.Any): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColor(value: js.Any): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GridPane extends StObject {
    
    var backgroundColor: js.Any = js.native
    
    var changeHighlightCellBgColor: js.Any = js.native
    
    var columnDropIndicatorColor: js.Any = js.native
    
    var copyRectBackBorderColor: js.Any = js.native
    
    var copyRectForeBorderColor: js.Any = js.native
    
    var errorRectBorderColor: js.Any = js.native
    
    var fillRectBorderColor: js.Any = js.native
    
    var focusRectBorderColor: js.Any = js.native
    
    var horizontalBorderColor: js.Any = js.native
    
    var horizontalBorderStyle: js.Any = js.native
    
    var linkColor: js.Any = js.native
    
    var readonlySelectionRectBorderColor: js.Any = js.native
    
    var rowDropIndicatorColor: js.Any = js.native
    
    var selectedCellBgColor: js.Any = js.native
    
    var selectionRectBorderColor: js.Any = js.native
    
    var verticalBorderColor: js.Any = js.native
    
    var verticalBorderStyle: js.Any = js.native
    
    var visitedLinkColor: js.Any = js.native
  }
  object GridPane {
    
    @scala.inline
    def apply(
      backgroundColor: js.Any,
      changeHighlightCellBgColor: js.Any,
      columnDropIndicatorColor: js.Any,
      copyRectBackBorderColor: js.Any,
      copyRectForeBorderColor: js.Any,
      errorRectBorderColor: js.Any,
      fillRectBorderColor: js.Any,
      focusRectBorderColor: js.Any,
      horizontalBorderColor: js.Any,
      horizontalBorderStyle: js.Any,
      linkColor: js.Any,
      readonlySelectionRectBorderColor: js.Any,
      rowDropIndicatorColor: js.Any,
      selectedCellBgColor: js.Any,
      selectionRectBorderColor: js.Any,
      verticalBorderColor: js.Any,
      verticalBorderStyle: js.Any,
      visitedLinkColor: js.Any
    ): GridPane = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], changeHighlightCellBgColor = changeHighlightCellBgColor.asInstanceOf[js.Any], columnDropIndicatorColor = columnDropIndicatorColor.asInstanceOf[js.Any], copyRectBackBorderColor = copyRectBackBorderColor.asInstanceOf[js.Any], copyRectForeBorderColor = copyRectForeBorderColor.asInstanceOf[js.Any], errorRectBorderColor = errorRectBorderColor.asInstanceOf[js.Any], fillRectBorderColor = fillRectBorderColor.asInstanceOf[js.Any], focusRectBorderColor = focusRectBorderColor.asInstanceOf[js.Any], horizontalBorderColor = horizontalBorderColor.asInstanceOf[js.Any], horizontalBorderStyle = horizontalBorderStyle.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], readonlySelectionRectBorderColor = readonlySelectionRectBorderColor.asInstanceOf[js.Any], rowDropIndicatorColor = rowDropIndicatorColor.asInstanceOf[js.Any], selectedCellBgColor = selectedCellBgColor.asInstanceOf[js.Any], selectionRectBorderColor = selectionRectBorderColor.asInstanceOf[js.Any], verticalBorderColor = verticalBorderColor.asInstanceOf[js.Any], verticalBorderStyle = verticalBorderStyle.asInstanceOf[js.Any], visitedLinkColor = visitedLinkColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridPane]
    }
    
    @scala.inline
    implicit class GridPaneMutableBuilder[Self <: GridPane] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: js.Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeHighlightCellBgColor(value: js.Any): Self = StObject.set(x, "changeHighlightCellBgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnDropIndicatorColor(value: js.Any): Self = StObject.set(x, "columnDropIndicatorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyRectBackBorderColor(value: js.Any): Self = StObject.set(x, "copyRectBackBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyRectForeBorderColor(value: js.Any): Self = StObject.set(x, "copyRectForeBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorRectBorderColor(value: js.Any): Self = StObject.set(x, "errorRectBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRectBorderColor(value: js.Any): Self = StObject.set(x, "fillRectBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusRectBorderColor(value: js.Any): Self = StObject.set(x, "focusRectBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalBorderColor(value: js.Any): Self = StObject.set(x, "horizontalBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalBorderStyle(value: js.Any): Self = StObject.set(x, "horizontalBorderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkColor(value: js.Any): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlySelectionRectBorderColor(value: js.Any): Self = StObject.set(x, "readonlySelectionRectBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDropIndicatorColor(value: js.Any): Self = StObject.set(x, "rowDropIndicatorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedCellBgColor(value: js.Any): Self = StObject.set(x, "selectedCellBgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionRectBorderColor(value: js.Any): Self = StObject.set(x, "selectionRectBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalBorderColor(value: js.Any): Self = StObject.set(x, "verticalBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalBorderStyle(value: js.Any): Self = StObject.set(x, "verticalBorderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitedLinkColor(value: js.Any): Self = StObject.set(x, "visitedLinkColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Header extends StObject {
    
    var backgroundColor: js.Any = js.native
    
    var elementClickBorderColor: js.Any = js.native
    
    var elementClickColor: js.Any = js.native
    
    var eyeBrowBorderColor: js.Any = js.native
    
    var eyeBrowColor: js.Any = js.native
    
    var eyeBrowHoverBorderColor: js.Any = js.native
    
    var eyeBrowHoverColor: js.Any = js.native
    
    var font: js.Any = js.native
    
    var fontSize: js.Any = js.native
    
    var fontWeight: js.Any = js.native
    
    var innerBorderColor: js.Any = js.native
    
    var menuBorderColor: js.Any = js.native
    
    var menuColor: js.Any = js.native
    
    var menuHoverBorderColor: js.Any = js.native
    
    var menuHoverColor: js.Any = js.native
    
    var outerBorderColor: js.Any = js.native
    
    var resizeBorderColor: js.Any = js.native
    
    var resizeColor: js.Any = js.native
    
    var resizeHoverBorderColor: js.Any = js.native
    
    var resizeHoverColor: js.Any = js.native
    
    var textColor: js.Any = js.native
  }
  object Header {
    
    @scala.inline
    def apply(
      backgroundColor: js.Any,
      elementClickBorderColor: js.Any,
      elementClickColor: js.Any,
      eyeBrowBorderColor: js.Any,
      eyeBrowColor: js.Any,
      eyeBrowHoverBorderColor: js.Any,
      eyeBrowHoverColor: js.Any,
      font: js.Any,
      fontSize: js.Any,
      fontWeight: js.Any,
      innerBorderColor: js.Any,
      menuBorderColor: js.Any,
      menuColor: js.Any,
      menuHoverBorderColor: js.Any,
      menuHoverColor: js.Any,
      outerBorderColor: js.Any,
      resizeBorderColor: js.Any,
      resizeColor: js.Any,
      resizeHoverBorderColor: js.Any,
      resizeHoverColor: js.Any,
      textColor: js.Any
    ): Header = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], elementClickBorderColor = elementClickBorderColor.asInstanceOf[js.Any], elementClickColor = elementClickColor.asInstanceOf[js.Any], eyeBrowBorderColor = eyeBrowBorderColor.asInstanceOf[js.Any], eyeBrowColor = eyeBrowColor.asInstanceOf[js.Any], eyeBrowHoverBorderColor = eyeBrowHoverBorderColor.asInstanceOf[js.Any], eyeBrowHoverColor = eyeBrowHoverColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], menuBorderColor = menuBorderColor.asInstanceOf[js.Any], menuColor = menuColor.asInstanceOf[js.Any], menuHoverBorderColor = menuHoverBorderColor.asInstanceOf[js.Any], menuHoverColor = menuHoverColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any], resizeBorderColor = resizeBorderColor.asInstanceOf[js.Any], resizeColor = resizeColor.asInstanceOf[js.Any], resizeHoverBorderColor = resizeHoverBorderColor.asInstanceOf[js.Any], resizeHoverColor = resizeHoverColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: js.Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementClickBorderColor(value: js.Any): Self = StObject.set(x, "elementClickBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementClickColor(value: js.Any): Self = StObject.set(x, "elementClickColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeBrowBorderColor(value: js.Any): Self = StObject.set(x, "eyeBrowBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeBrowColor(value: js.Any): Self = StObject.set(x, "eyeBrowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeBrowHoverBorderColor(value: js.Any): Self = StObject.set(x, "eyeBrowHoverBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEyeBrowHoverColor(value: js.Any): Self = StObject.set(x, "eyeBrowHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont(value: js.Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: js.Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(value: js.Any): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerBorderColor(value: js.Any): Self = StObject.set(x, "innerBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuBorderColor(value: js.Any): Self = StObject.set(x, "menuBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuColor(value: js.Any): Self = StObject.set(x, "menuColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHoverBorderColor(value: js.Any): Self = StObject.set(x, "menuHoverBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHoverColor(value: js.Any): Self = StObject.set(x, "menuHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterBorderColor(value: js.Any): Self = StObject.set(x, "outerBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeBorderColor(value: js.Any): Self = StObject.set(x, "resizeBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeColor(value: js.Any): Self = StObject.set(x, "resizeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHoverBorderColor(value: js.Any): Self = StObject.set(x, "resizeHoverBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHoverColor(value: js.Any): Self = StObject.set(x, "resizeHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColor(value: js.Any): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RowHeaderStyle extends StObject {
    
    var backgroundColor: js.Any = js.native
    
    var innerBorderColor: js.Any = js.native
    
    var outerBorderColor: js.Any = js.native
  }
  object RowHeaderStyle {
    
    @scala.inline
    def apply(backgroundColor: js.Any, innerBorderColor: js.Any, outerBorderColor: js.Any): RowHeaderStyle = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowHeaderStyle]
    }
    
    @scala.inline
    implicit class RowHeaderStyleMutableBuilder[Self <: RowHeaderStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: js.Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerBorderColor(value: js.Any): Self = StObject.set(x, "innerBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterBorderColor(value: js.Any): Self = StObject.set(x, "outerBorderColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Splitter extends IStyleType {
    
    var backgroundColor: js.Any = js.native
    
    var innerBorderColor: js.Any = js.native
    
    var leftInnerBorderColor: js.Any = js.native
    
    var outerBorderColor: js.Any = js.native
  }
  object Splitter {
    
    @scala.inline
    def apply(
      backgroundColor: js.Any,
      innerBorderColor: js.Any,
      leftInnerBorderColor: js.Any,
      outerBorderColor: js.Any
    ): Splitter = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], leftInnerBorderColor = leftInnerBorderColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Splitter]
    }
    
    @scala.inline
    implicit class SplitterMutableBuilder[Self <: Splitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: js.Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerBorderColor(value: js.Any): Self = StObject.set(x, "innerBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftInnerBorderColor(value: js.Any): Self = StObject.set(x, "leftInnerBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterBorderColor(value: js.Any): Self = StObject.set(x, "outerBorderColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SplitterHandle extends IStyleType {
    
    var backgroundColor: js.Any = js.native
    
    var gripLowerColor: js.Any = js.native
    
    var gripUpperColor: js.Any = js.native
    
    var innerBorderColor: js.Any = js.native
    
    var leftInnerBorderColor: js.Any = js.native
    
    var outerBorderColor: js.Any = js.native
  }
  object SplitterHandle {
    
    @scala.inline
    def apply(
      backgroundColor: js.Any,
      gripLowerColor: js.Any,
      gripUpperColor: js.Any,
      innerBorderColor: js.Any,
      leftInnerBorderColor: js.Any,
      outerBorderColor: js.Any
    ): SplitterHandle = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], gripLowerColor = gripLowerColor.asInstanceOf[js.Any], gripUpperColor = gripUpperColor.asInstanceOf[js.Any], innerBorderColor = innerBorderColor.asInstanceOf[js.Any], leftInnerBorderColor = leftInnerBorderColor.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitterHandle]
    }
    
    @scala.inline
    implicit class SplitterHandleMutableBuilder[Self <: SplitterHandle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: js.Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGripLowerColor(value: js.Any): Self = StObject.set(x, "gripLowerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGripUpperColor(value: js.Any): Self = StObject.set(x, "gripUpperColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerBorderColor(value: js.Any): Self = StObject.set(x, "innerBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftInnerBorderColor(value: js.Any): Self = StObject.set(x, "leftInnerBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterBorderColor(value: js.Any): Self = StObject.set(x, "outerBorderColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TimescaleTier extends StObject {
    
    var backgroundColor: js.Any = js.native
    
    var font: js.Any = js.native
    
    var fontSize: js.Any = js.native
    
    var fontWeight: js.Any = js.native
    
    var horizontalBorderColor: js.Any = js.native
    
    var horizontalBorderStyle: js.Any = js.native
    
    var outerBorderColor: js.Any = js.native
    
    var textColor: js.Any = js.native
    
    var todayLineColor: js.Any = js.native
    
    var verticalBorderColor: js.Any = js.native
    
    var verticalBorderStyle: js.Any = js.native
  }
  object TimescaleTier {
    
    @scala.inline
    def apply(
      backgroundColor: js.Any,
      font: js.Any,
      fontSize: js.Any,
      fontWeight: js.Any,
      horizontalBorderColor: js.Any,
      horizontalBorderStyle: js.Any,
      outerBorderColor: js.Any,
      textColor: js.Any,
      todayLineColor: js.Any,
      verticalBorderColor: js.Any,
      verticalBorderStyle: js.Any
    ): TimescaleTier = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], horizontalBorderColor = horizontalBorderColor.asInstanceOf[js.Any], horizontalBorderStyle = horizontalBorderStyle.asInstanceOf[js.Any], outerBorderColor = outerBorderColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], todayLineColor = todayLineColor.asInstanceOf[js.Any], verticalBorderColor = verticalBorderColor.asInstanceOf[js.Any], verticalBorderStyle = verticalBorderStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimescaleTier]
    }
    
    @scala.inline
    implicit class TimescaleTierMutableBuilder[Self <: TimescaleTier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: js.Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont(value: js.Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: js.Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(value: js.Any): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalBorderColor(value: js.Any): Self = StObject.set(x, "horizontalBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalBorderStyle(value: js.Any): Self = StObject.set(x, "horizontalBorderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterBorderColor(value: js.Any): Self = StObject.set(x, "outerBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColor(value: js.Any): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayLineColor(value: js.Any): Self = StObject.set(x, "todayLineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalBorderColor(value: js.Any): Self = StObject.set(x, "verticalBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalBorderStyle(value: js.Any): Self = StObject.set(x, "verticalBorderStyle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Widget extends StObject {
    
    var backgroundColor: js.Any = js.native
    
    var borderColor: js.Any = js.native
  }
  object Widget {
    
    @scala.inline
    def apply(backgroundColor: js.Any, borderColor: js.Any): Widget = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Widget]
    }
    
    @scala.inline
    implicit class WidgetMutableBuilder[Self <: Widget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: js.Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColor(value: js.Any): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    }
  }
}
