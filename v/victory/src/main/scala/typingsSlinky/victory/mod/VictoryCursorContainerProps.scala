package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryCursorContainerProps extends VictoryContainerProps {
  /**
    * The cursorComponent prop takes a component instance which will be used to render a cursor element.
    * The new element created will be supplied with x1, y1, x2 and y2 positioning props.
    * If a cursorComponent is not supplied, a new Line component will be rendered.
    * @default cursorComponent={<Line/>}
    */
  var cursorComponent: js.UndefOr[ReactElement] = js.native
  /**
    * When the cursorDimension prop is set, the cursor will be a line to inspect the given dimension (either "x" or "y").
    * When this prop is not specified, the cursor will be a 2-dimensional crosshair.
    * For example, if you would like to inspect the time of time-series data, set dimension={"x"};
    * the cursor will then be a vertical line that will inspect the time value of the current mouse position.
    * @example cursorDimension="x"
    */
  var cursorDimension: js.UndefOr[x | y] = js.native
  /**
    * The cursorLabel prop defines the label that will appear next to the cursor.
    * A label will only appear if cursorLabel is set. This prop should be given as a
    * function of a point (an Object with x and y properties).
    * @example cursorLabel={(point) => point.x}
    */
  var cursorLabel: js.UndefOr[js.Function1[/* point */ CursorData, Unit]] = js.native
  /**
    * The cursorLabelComponent prop takes a component instance which will be
    * used to render a label for the cursor. The new element created from the passed
    * cursorLabelComponent will be supplied with the following props: x, y,
    * active, text. If cursorLabelComponent is omitted, a new VictoryLabel will be created with the props described above.
    * @default cursorLabelComponent={<VictoryLabel/>}
    */
  var cursorLabelComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The cursorLabelOffset prop determines the pixel offset of the cursor label
    * from the cursor point. This prop should be an Object with x and y properties, or a
    * number to be used for both dimensions.
    * @default "{ x: 5, y: -10 }"
    */
  var cursorLabelOffset: js.UndefOr[Double | CursorData] = js.native
  /**
    * Whenever the mouse is not over the chart, the cursor will not be displayed.
    * If instead you would like to keep it displayed, use the defaultCursorValue prop to set the default value.
    * The prop should be a point (an Object with x and y properties) for 2-dimensional cursors, or a number for 1-dimensional cursors.
    * @example defaultCursorValue={{x: 1, y: 1}}, defaultCursorValue={0}}
    */
  var defaultCursorValue: js.UndefOr[Double | CursorData] = js.native
  /**
    * When the disable prop is set to true, VictoryCursorContainer events will not fire.
    */
  var disable: js.UndefOr[Boolean] = js.native
  /**
    * When the cursorDimension prop is set, the cursor will be a line to inspect the given dimension (either "x" or "y").
    * When this prop is not specified, the cursor will be a 2-dimensional crosshair.
    * For example, if you would like to inspect the time of time-series data, set dimension={"x"};
    * the cursor will then be a vertical line that will inspect the time value of the current mouse position.
    * @example onChange={(value, props) => this.setState({cursorValue: value})}
    */
  var onCursorChange: js.UndefOr[
    js.Function2[/* value */ CursorData, /* props */ VictoryCursorContainerProps, Unit]
  ] = js.native
}

object VictoryCursorContainerProps {
  @scala.inline
  def apply(): VictoryCursorContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryCursorContainerProps]
  }
  @scala.inline
  implicit class VictoryCursorContainerPropsOps[Self <: VictoryCursorContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursorComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorDimension(value: x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorLabel(value: /* point */ CursorData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCursorLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorLabelComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorLabelComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorLabelComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorLabelComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorLabelOffset(value: Double | CursorData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorLabelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorLabelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorLabelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCursorValue(value: Double | CursorData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCursorValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCursorValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCursorValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCursorChange(value: (/* value */ CursorData, /* props */ VictoryCursorContainerProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCursorChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCursorChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCursorChange")(js.undefined)
        ret
    }
  }
  
}

