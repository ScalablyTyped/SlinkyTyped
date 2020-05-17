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
trait VictoryBrushContainerProps extends VictoryContainerProps {
  /**
    * The optional allowDrag prop accepts a boolean that enables dragging behavior
    * for the highlighted brush area. Resizing will still be enabled when the allowDrag
    * prop is set to false.
    * @default true
    */
  var allowDrag: js.UndefOr[Boolean] = js.native
  /**
    * The optional allowResize prop accepts a boolean that enables resizing the
    * highlighted brush area. Dragging will still be enabled when the allowResize
    * prop is set to false, but the dimensions of the brush area will be fixed.
    * @default true
    */
  var allowResize: js.UndefOr[Boolean] = js.native
  /**
    * The brushComponent prop specifies the component to be rendered for the
    * highlighted area. This component will be supplied with the following props: x, y,
    * width, height, and style. When this prop is not specified, a <rect/> will be rendered.
    * @default brushComponent={<rect/>}
    */
  var brushComponent: js.UndefOr[ReactElement] = js.native
  /**
    * When the brushDimension prop is set, brushing will only be specific to the to
    * the given dimension (either "x" or "y"), and the entire domain of the other
    * dimension will be highlighted. When this prop is not specified, highlighting will
    * occur along both dimensions.
    * @example brushDimension="x"
    */
  var brushDimension: js.UndefOr[x | y] = js.native
  /**
    * The optional brushDomain prop describes the highlighted state. This prop is an
    * object that specifies separate arrays for x and y. Each array is a tuple that
    * describes the minimum and maximum values to render. If this prop is not provided
    * initially, the chart will render with the entire domain highlighted. When this prop
    * changes, the chart will render with a new highlighted domain.
    * @example brushDomain={{ x: [50, 100], y: [0, 100] }}
    */
  var brushDomain: js.UndefOr[DomainPropType] = js.native
  /**
    * The brushStyle adds custom styles to the brushComponent. This prop
    * should be given as an object of SVG style attributes.
    * @default "brushStyle={{ stroke: "transparent", fill: "black", fillOpacity: 0.1 }}"
    */
  var brushStyle: js.UndefOr[CSSProperties] = js.native
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
    * The handleComponent prop specifies the component to be rendered for each
    * handle for the highlighted area. This component will be supplied with the following
    * props: x, y, width, height, cursor, and style. When this prop is not
    * specified, a <rect/> will be rendered.
    * @default handleComponent={<rect/>}
    */
  var handleComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The handleStyle adds custom styles to the handleComponents. This prop should be given as an object of SVG style attributes.
    *
    * Handles refer to the region on each highlighted area where the area may be
    * expanded. Only handles relevant to the given dimension will be rendered. For
    * example, when brushDimension="x" only "left" and "right" handles will be
    * rendered. Handles are automatically styled with cursors appropriate to their orientation.
    * @default "handleStyle={{ stroke: 'transparent', fill: 'transparent' }}"
    */
  var handleStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * The optional onBrushDomainChange prop accepts an function to be called on
    * each update to the highlighted domain. The function accepts the parameters of
    * domain (the updated domain), and props (the props used by VictoryBrushContainer).
    * @example onBrushDomainChange={(domain, props) => handleDomainChange(domain, props)}
    */
  var onBrushDomainChange: js.UndefOr[
    js.Function2[/* domain */ DomainPropType, /* props */ VictoryBrushContainerProps, Unit]
  ] = js.native
}

object VictoryBrushContainerProps {
  @scala.inline
  def apply(): VictoryBrushContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryBrushContainerProps]
  }
  @scala.inline
  implicit class VictoryBrushContainerPropsOps[Self <: VictoryBrushContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withBrushComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrushComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withBrushDimension(value: typingsSlinky.victory.victoryStrings.x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrushDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withBrushDomain(value: DomainPropType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrushDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brushDomain")(js.undefined)
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
    def withHandleComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBrushDomainChange(value: (/* domain */ DomainPropType, /* props */ VictoryBrushContainerProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBrushDomainChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBrushDomainChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBrushDomainChange")(js.undefined)
        ret
    }
  }
  
}

