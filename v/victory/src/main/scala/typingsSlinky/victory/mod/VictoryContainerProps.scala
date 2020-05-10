package typingsSlinky.victory.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryContainerProps extends js.Object {
  /**
    * The desc prop specifies the description of the chart/SVG to assist with
    * accessibility for screen readers. The more info about the chart provided in
    * the description, the more usable it will be for people using screen readers.
    * This prop defaults to an empty string.
    * @example "Golden retreivers make up 30%, Labs make up 25%, and other dog breeds are
    * not represented above 5% each."
    * @default ""
    */
  var desc: js.UndefOr[String] = js.native
  /**
    * The events prop attaches arbitrary event handlers to the container component.
    * Event handlers passed from other Victory components are called with their
    * corresponding events as well as scale, style, width, height, and data when
    * applicable. Use the invert method to convert event coordinate information to
    * data. `scale.x.invert(evt.offsetX)`.
    * @examples {{ onClick: (evt) => alert(`x: ${evt.clientX}, y: ${evt.clientY}`)}}
    */
  var events: js.UndefOr[DOMAttributes[_]] = js.native
  /**
    * The height props specifies the height the svg viewBox of the container.
    * This value should be given as a number of pixels. If no height prop
    * is given, the height prop from the child component passed will be used.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The responsive prop specifies whether the rendered container should be a responsive container
    * with a viewBox attribute, or a static container with absolute width and height.
    * @default true
    */
  var responsive: js.UndefOr[Boolean] = js.native
  /**
    * The style prop specifies styles for your VictoryContainer. Any valid inline style properties
    * will be applied. Height and width should be specified via the height
    * and width props, as they are used to calculate the alignment of
    * components within the container. Styles from the child component will
    * also be passed, if any exist.
    * @examples {border: 1px solid red}
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * The title prop specifies the title to be applied to the SVG to assist
    * accessibility for screen readers. The more descriptive this title is, the more
    * useful it will be. If no title prop is passed, it will default to Victory Chart.
    * @example "Popularity of Dog Breeds by Percentage"
    * @default "Victory Chart"
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The width props specifies the width of the svg viewBox of the container
    * This value should be given as a number of pixels. If no width prop
    * is given, the width prop from the child component passed will be used.
    */
  var width: js.UndefOr[Double] = js.native
}

object VictoryContainerProps {
  @scala.inline
  def apply(): VictoryContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryContainerProps]
  }
  @scala.inline
  implicit class VictoryContainerPropsOps[Self <: VictoryContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
    def withTitle(value: String): Self = {
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

