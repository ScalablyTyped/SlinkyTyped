package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import typingsSlinky.victory.anon.Left
import typingsSlinky.victory.anon.Name
import typingsSlinky.victory.anon.OmitBlockPropsleftright
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.horizontal
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import typingsSlinky.victory.victoryStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryLegendProps
  extends VictorySingleLabableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  
  /**
    * The borderComponent prop takes a component instance which will be responsible
    * for rendering a border around the legend. The new element created from the passed
    * borderComponent will be provided with the following properties calculated by
    * VictoryLegend: x, y, width, height, and style. Any of these props may be
    * overridden by passing in props to the supplied component, or modified or ignored
    * within the custom component itself. If a borderComponent
    * is not provided, VictoryLegend will use its default Border component.
    * Please note that the default width and height calculated
    * for the border component is based on approximated
    * text measurements, and may need to be adjusted.
    * @default <Border/>
    */
  var borderComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The borderPadding specifies the amount of padding that should
    * be added between the legend items and the border. This prop may be given as
    * a number, or asanobject with values specified for top, bottom, left, and right.
    * Please note that the default width and height calculated for the border
    * component is based on approximated text measurements, so padding may need to be adjusted.
    */
  var borderPadding: js.UndefOr[PaddingProps] = js.native
  
  /**
    * The centerTitle boolean prop specifies whether a legend title should be centered.
    */
  var centerTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * The colorScale prop defines a color scale to be applied to each data
    * symbol in VictoryLegend. This prop should be given as an array of CSS
    * colors, or as a string corresponding to one of the built in color
    * scales: "grayscale", "qualitative", "heatmap", "warm", "cool", "red",
    * "green", "blue". VictoryLegend will assign a color to each symbol by
    * index, unless they are explicitly specified in the data object.
    * Colors will repeat when there are more symbols than colors in the
    * provided colorScale.
    */
  var colorScale: js.UndefOr[ColorScalePropType] = js.native
  
  /**
    * Specify data via the data prop. VictoryLegend expects data as an
    * array of objects with name (required), symbol, and labels properties.
    * The data prop must be given as an array.
    */
  @JSName("data")
  var data_VictoryLegendProps: js.UndefOr[js.Array[Name]] = js.native
  
  /**
    * VictoryLegend uses the standard eventKey prop to specify how event targets
    * are addressed. This prop is not commonly used.
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback | js.Array[String]] = js.native
  
  /**
    * VictoryLegend uses the standard events prop.
    */
  var events: js.UndefOr[
    js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]
  ] = js.native
  
  /**
    * VictoryLegend uses the standard externalEventMutations prop.
    */
  var externalEventMutations: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The gutter prop defines the number of pixels between legend rows or
    * columns, depending on orientation. When orientation is horizontal,
    * gutters are between columns. When orientation is vertical, gutters
    * are the space between rows.
    */
  var gutter: js.UndefOr[Double | Left] = js.native
  
  /**
    * The itemsPerRow prop determines how many items to render in each row
    * of a horizontal legend, or in each column of a vertical legend. This
    * prop should be given as an integer. When this prop is not given,
    * legend items will be rendered in a single row or column.
    */
  var itemsPerRow: js.UndefOr[Double] = js.native
  
  /**
    * The orientation prop takes a string that defines whether legend data
    * are displayed in a row or column. When orientation is "horizontal",
    * legend items will be displayed in a single row. When orientation is
    * "vertical", legend items will be displayed in a single column. Line
    * and text-wrapping is not currently supported, so "vertical"
    * orientation is both the default setting and recommended for
    * displaying many series of data.
    * @default 'vertical'
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  
  /**
    * The rowGutter prop defines the number of pixels between legend rows.
    * This prop may be given as a number, or as an object with values
    * specified for “top” and “bottom” gutters. To set spacing between columns,
    * use the gutter prop.
    */
  var rowGutter: js.UndefOr[Double | OmitBlockPropsleftright] = js.native
  
  /**
    * The style prop defines the style of the VictoryLegend component.
    * The style prop should be given as an object with styles defined for data, labels and
    * parent. Any valid svg styles are supported, but width, height, and
    * padding should be specified via props as they determine relative
    * layout for components in VictoryLegend.
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.native
  
  /**
    * The symbolSpacer prop defines the number of pixels between data
    * components and label components.
    */
  var symbolSpacer: js.UndefOr[Double] = js.native
  
  /**
    * The title prop specifies a title to render with the legend.
    * This prop should be given as a string, or an array of strings for multi-line titles.
    */
  var title: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * The titleComponent prop takes a component instance which will be used to render
    * a title for the component. The new element created from the passed
    * labelComponent will be supplied with the following properties: x, y, index, data,
    * datum, verticalAnchor, textAnchor, style, text, and events. Any of these props
    * may be overridden by passing in props to the supplied component, or modified
    * or ignored within the custom component itself. If labelComponent is omitted,
    * a new VictoryLabel will be created with the props described above.
    */
  var titleComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The titleOrientation prop specifies where the a title should be rendered
    * in relation to the rest of the legend. Possible values
    * for this prop are “top”, “bottom”, “left”, and “right”.
    * @default (provided by default theme): titleOrientation="top"
    */
  var titleOrientation: js.UndefOr[OrientationTypes] = js.native
  
  /**
    * The x and y props define the base position of the legend element.
    */
  @JSName("x")
  var x_VictoryLegendProps: js.UndefOr[Double] = js.native
  
  @JSName("y")
  var y_VictoryLegendProps: js.UndefOr[Double] = js.native
}
object VictoryLegendProps {
  
  @scala.inline
  def apply(): VictoryLegendProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryLegendProps]
  }
  
  @scala.inline
  implicit class VictoryLegendPropsMutableBuilder[Self <: VictoryLegendProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderComponent(value: ReactElement): Self = StObject.set(x, "borderComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderComponentUndefined: Self = StObject.set(x, "borderComponent", js.undefined)
    
    @scala.inline
    def setBorderPadding(value: PaddingProps): Self = StObject.set(x, "borderPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderPaddingUndefined: Self = StObject.set(x, "borderPadding", js.undefined)
    
    @scala.inline
    def setCenterTitle(value: Boolean): Self = StObject.set(x, "centerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterTitleUndefined: Self = StObject.set(x, "centerTitle", js.undefined)
    
    @scala.inline
    def setColorScale(value: ColorScalePropType): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    @scala.inline
    def setColorScaleVarargs(value: String*): Self = StObject.set(x, "colorScale", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Name]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: Name*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setEventKey(value: StringOrNumberOrCallback | js.Array[String]): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "eventKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    @scala.inline
    def setEventKeyVarargs(value: String*): Self = StObject.set(x, "eventKey", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: (EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback])*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setExternalEventMutations(value: js.Array[_]): Self = StObject.set(x, "externalEventMutations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalEventMutationsUndefined: Self = StObject.set(x, "externalEventMutations", js.undefined)
    
    @scala.inline
    def setExternalEventMutationsVarargs(value: js.Any*): Self = StObject.set(x, "externalEventMutations", js.Array(value :_*))
    
    @scala.inline
    def setGutter(value: Double | Left): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    
    @scala.inline
    def setItemsPerRow(value: Double): Self = StObject.set(x, "itemsPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsPerRowUndefined: Self = StObject.set(x, "itemsPerRow", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setRowGutter(value: Double | OmitBlockPropsleftright): Self = StObject.set(x, "rowGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowGutterUndefined: Self = StObject.set(x, "rowGutter", js.undefined)
    
    @scala.inline
    def setStyle(value: VictoryStyleInterface): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSymbolSpacer(value: Double): Self = StObject.set(x, "symbolSpacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolSpacerUndefined: Self = StObject.set(x, "symbolSpacer", js.undefined)
    
    @scala.inline
    def setTitle(value: String | js.Array[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleComponent(value: ReactElement): Self = StObject.set(x, "titleComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleComponentUndefined: Self = StObject.set(x, "titleComponent", js.undefined)
    
    @scala.inline
    def setTitleOrientation(value: OrientationTypes): Self = StObject.set(x, "titleOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleOrientationUndefined: Self = StObject.set(x, "titleOrientation", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
