package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.victory.victoryStrings.all
import typingsSlinky.victory.victoryStrings.disable
import typingsSlinky.victory.victoryStrings.none
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryZoomContainerProps extends VictoryContainerProps {
  /**
    * The optional allowPan prop accepts a boolean that enables the panning
    * functionality. Zooming will still be enabled when the allowPan prop is set to false.
    * @default true
    */
  var allowPan: js.UndefOr[Boolean] = js.native
  /**
    * The optional allowZoom prop accepts a boolean that enables the zoom
    * functionality. Panning will still be enabled when the allowZoom prop is set to false.
    * @default true
    */
  var allowZoom: js.UndefOr[Boolean] = js.native
  /**
    * The brushStyle adds custom styles to the brushComponent. This prop
    * should be given as an object of SVG style attributes.
    * @default "brushStyle={{ stroke: 'transparent', fill: 'black', fillOpacity: 0.1 }}"
    */
  var brushStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * VictoryZoomContainer works by clipping data outside of a given domain.
    * VictoryZoomContainer uses VictoryClipContainer by default.
    * This prop should not be replaced with a custom component, but you may want to set
    * props on VictoryClipContainer, such as clipPadding.
    * @example clipContainerComponent={<VictoryClipContainer clipPadding={{top: 10, right: 10}}}/>}
    */
  var clipContainerComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The defaultBrushArea prop specifies how the container will behave when a
    * region outside the active brush is clicked without selecting a new area. When the
    * prop is set to "all", the entire domain will be selected. When the prop is set to "none",
    * no new region will be selected, and any existing active brush will be cleared. When
    * the prop is set to "disable" the new selected region will default to the current active brush.
    */
  var defaultBrushArea: js.UndefOr[all | none | disable] = js.native
  /**
    * When the disable prop is set to true, VictoryBrushContainer events will not fire.
    */
  var disable: js.UndefOr[Boolean] = js.native
  /**
    * When the disable prop is set to true, VictoryZoomContainer events will not fire.
    */
  var downsample: js.UndefOr[Double | Boolean] = js.native
  /**
    * The minimumZoom prop sets a minimum domain extent for the zoomed chart.
    * When the difference between the maximum and minimum of a zoomed domain is equal to the minimumZoom
    * in either dimension, the component will stop responding to events that would normally trigger zooming in.
    * Zooming out and panning will still be enabled. When this prop is not specified, the default minimum
    * zoom will cover 1 / 1000th of the original domain. This prop should be given as an object
    * with numeric values for x and y.
    * @example minimumZoom={{x: 1, y: 0.01}}
    */
  var minimumZoom: js.UndefOr[CursorData] = js.native
  /**
    * The optional onZoomDomainChange prop accepts an function to be called on each update to the visible domain.
    * The function accepts the parameters domain (the updated domain) and props (the props used by VictoryZoomContainer).
    * @example onZoomDomainChange={(domain, props) => handleDomainChange(domain, props)}
    */
  var onZoomDomainChange: js.UndefOr[
    js.Function2[/* domain */ DomainPropType, /* props */ VictoryZoomContainerProps, Unit]
  ] = js.native
  /**
    * When the zoomDimension prop is set, panning and zooming will be restricted to
    * the given dimension (either x or y), and the domain of the other dimension will
    * remain static. When this prop is not specified, both x and y dimensions will pan and zoom.
    * @example zoomDimension="x"
    */
  var zoomDimension: js.UndefOr[x | y] = js.native
  /**
    * The zoomDomain prop describes the zoomed state. This prop is an object that
    * specifies separate arrays for x and y. Each array is a tuple that describes the
    * minimum and maximum values to render. If this prop is not provided initially, the
    * chart will render without an initial zoom, displaying the entire dataset. Updates to
    * zoomDomain will trigger a re-render of the chart with the new domain.
    * @example zoomDomain={{x: [0, 100]}}
    */
  var zoomDomain: js.UndefOr[DomainPropType] = js.native
}

object VictoryZoomContainerProps {
  @scala.inline
  def apply(): VictoryZoomContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryZoomContainerProps]
  }
  @scala.inline
  implicit class VictoryZoomContainerPropsOps[Self <: VictoryZoomContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPan")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withBrushStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrushStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withClipContainerComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipContainerComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipContainerComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipContainerComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultBrushArea(value: all | none | disable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBrushArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBrushArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBrushArea")(js.undefined)
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
    def withDownsample(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downsample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownsample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downsample")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumZoom(value: CursorData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomDomainChange(value: (/* domain */ DomainPropType, /* props */ VictoryZoomContainerProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomDomainChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnZoomDomainChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomDomainChange")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomDimension(value: x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomDomain(value: DomainPropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDomain")(js.undefined)
        ret
    }
  }
  
}

