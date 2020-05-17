package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryClipContainerProps extends js.Object {
  /**
    * `VictoryClipContainer` renders a single child, or an array of children in group element.
    */
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  /**
    * The `circleComponent` specifies the element to use when a `VictoryClipContainer` renders
    * a circular clip path. By default, `VictoryClipContainer` uses the `Circle` component.
    * @default circleComponent={<Circle/>}
    */
  var circleComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The `className` prop specifies a class name that will be applied to the rendered element.
    * @example: className="myClipPath"
    */
  var className: js.UndefOr[String] = js.native
  /**
    * The `clipHeight` prop determines the base height of the rectangular clip path. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the height and padding
    * of the parent chart.
    */
  var clipHeight: js.UndefOr[Double] = js.native
  /**
    * The `clipId` prop may be used to set a deterministic id for the container.
    * When a `clipId` is not manually set, a unique id will be generated.
    * It is usually necessary to set deterministic ids for automated testing.
    */
  var clipId: js.UndefOr[Double | String] = js.native
  /**
    * The `clipPadding` prop is used when the clipped area should be larger than the range of a chart.
    * This prop should be given as an object with `top`, `bottom`, `left`, and `right` properties. Set
    * the `clipPadding` prop is useful for extending the visible area of a chart in some dimension so
    * that data or labels are not cut off.
    */
  var clipPadding: js.UndefOr[BlockProps] = js.native
  /**
    * The `clipPathComponent` prop specifies the clip path to apply to the rendered group when appropriate.
    * By default, `VictoryClipContainer` uses the `ClipPath` component.
    * @default clipPathComponent={<ClipPath/>}
    */
  var clipPathComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The `clipWidth` prop determines the base width of the rectangular clip path. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the width and padding
    * of the parent chart.
    */
  var clipWidth: js.UndefOr[Double] = js.native
  /**
    * The `events` prop attaches arbitrary event handlers to the group element.
    * This prop should be given as an object of event names and corresponding event handlers.
    * When events are provided via Victory's event system, event handlers will be called with
    * the event, the props of the component it is attached to, and an `eventKey` when applicable.
    * @example events={{onClick: (evt) => alert("x: " + evt.clientX)}}
    */
  var events: js.UndefOr[DOMAttributes[_]] = js.native
  /**
    * `VictoryClipContainer` uses the standard `groupComponent` prop.
    * @default groupComponent={<g/>}
    */
  var groupComponent: js.UndefOr[ReactElement] = js.native
  /**
    * Victory components will pass an `origin` prop is to define the center point in svg coordinates for polar charts.
    * **This prop should not be set manually.**
    */
  var origin: js.UndefOr[Y] = js.native
  /**
    * Victory components can pass a boolean `polar` prop to specify whether a label is part of a polar chart.
    * **This prop should not be set manually.**
    */
  var polar: js.UndefOr[Boolean] = js.native
  /**
    * The `radius` prop determines the radius of the circular clip path used for polar charts. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the dimensions and padding
    * of the parent chart.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * The `rectComponent` specifies the element to use when a `VictoryClipContainer` renders a rectangular clip path.
    * By default, `VictoryClipContainer` uses the `Rect` component.
    * @default rectComponent={<Rect/>}
    */
  var rectComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The `translateX` prop determines the offset of the clip path from the base x coordinate. This prop
    * should be given as a number. If this prop is not given, it will be calculated based on the padding
    * of the parent chart.
    */
  var translateX: js.UndefOr[Double] = js.native
  /**
    * The `translateY` prop determines the offset of the clip path from the base y coordinate. This prop
    * should be given as a number. If this prop is not given, it will be calculated based on the padding
    * of the parent chart.
    */
  var translateY: js.UndefOr[Double] = js.native
}

object VictoryClipContainerProps {
  @scala.inline
  def apply(): VictoryClipContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryClipContainerProps]
  }
  @scala.inline
  implicit class VictoryClipContainerPropsOps[Self <: VictoryClipContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: ReactElement | js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClipHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withClipId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipId")(js.undefined)
        ret
    }
    @scala.inline
    def withClipPadding(value: BlockProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withClipPathComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPathComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipPathComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPathComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withClipWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: DOMAttributes[_]): Self = {
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
    def withGroupComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: Y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPolar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polar")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRectComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateX")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslateY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateY")(js.undefined)
        ret
    }
  }
  
}

