package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import typingsSlinky.victory.AnonLeft
import typingsSlinky.victory.AnonName
import typingsSlinky.victory.OmitBlockPropsleftright
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.horizontal
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import typingsSlinky.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var data_VictoryLegendProps: js.UndefOr[js.Array[AnonName]] = js.native
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
  var gutter: js.UndefOr[Double | AnonLeft] = js.native
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
  implicit class VictoryLegendPropsOps[Self <: VictoryLegendProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderPadding(value: PaddingProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withColorScale(value: ColorScalePropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEventKeyFunction1(value: /* args */ CallbackArgs => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEventKey(value: StringOrNumberOrCallback | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalEventMutations(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalEventMutations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalEventMutations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalEventMutations")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: Double | AnonLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsPerRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsPerRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withRowGutter(value: Double | OmitBlockPropsleftright): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: VictoryStyleInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSpacer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSpacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSpacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSpacer")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleOrientation(value: OrientationTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

