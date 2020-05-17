package typingsSlinky.svgPanZoom.SvgPanZoom

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGMatrix
import typingsSlinky.svgPanZoom.svgPanZoomStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var beforePan: js.UndefOr[
    js.Function2[/* oldPan */ Point, /* newPan */ Point, Unit | Boolean | PointModifier]
  ] = js.native
   // (default 'auto')
  var beforeZoom: js.UndefOr[js.Function2[/* oldScale */ Double, /* newScale */ Double, Unit | Boolean]] = js.native
   // (default true)
  var center: js.UndefOr[Boolean] = js.native
   // enable or disable viewport fit in SVG (default true)
  var contain: js.UndefOr[Boolean] = js.native
  /**
    * insert icons to give user an option in addition to mouse events to control pan/zoom (default disabled)
    * @type {boolean}
    */
  var controlIconsEnabled: js.UndefOr[Boolean] = js.native
  var customEventsHandler: js.UndefOr[CustomEventHandler] = js.native
  /**
    * enable or disable zooming by double clicking (default enabled)
    * @type {boolean}
    */
  var dblClickZoomEnabled: js.UndefOr[Boolean] = js.native
   // (default null)
  var eventsListenerElement: js.UndefOr[SVGElement] = js.native
   // Maximum Zoom level  (Default 10)
  var fit: js.UndefOr[Boolean] = js.native
   // Minimum Zoom level (Default 0.5)
  var maxZoom: js.UndefOr[Double] = js.native
   // Zoom sensitivity (Default 0.2)
  var minZoom: js.UndefOr[Double] = js.native
  /**
    * enable or disable zooming by scrolling (default enabled)
    * @type {boolean}
    */
  var mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.native
  var onPan: js.UndefOr[js.Function1[/* newPan */ Point, Unit]] = js.native
  var onUpdatedCTM: js.UndefOr[js.Function1[/* newCTM */ SVGMatrix, Unit]] = js.native
  var onZoom: js.UndefOr[js.Function1[/* newScale */ Double, Unit]] = js.native
  /**
    * enable or disable panning (default enabled)
    * @type {boolean}
    */
  var panEnabled: js.UndefOr[Boolean] = js.native
  /**
    * prevent mouse events to bubble up (default enabled)
    * @type {boolean}
    */
  var preventMouseEventsDefault: js.UndefOr[Boolean] = js.native
   // enable or disable viewport centering in SVG (default true)
  var refreshRate: js.UndefOr[Double | auto] = js.native
  /**
    * can be querySelector string or SVGElement (default enabled)
    * @type {string|HTMLElement|SVGElement}
    */
  var viewportSelector: js.UndefOr[String | HTMLElement | SVGElement] = js.native
  /**
    * enable or disable zooming (default enabled)
    * @type {boolean}
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.native
  var zoomScaleSensitivity: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforePan(value: (/* oldPan */ Point, /* newPan */ Point) => Unit | Boolean | PointModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforePan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePan")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeZoom(value: (/* oldScale */ Double, /* newScale */ Double) => Unit | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeZoom")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withContain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(js.undefined)
        ret
    }
    @scala.inline
    def withControlIconsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlIconsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlIconsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlIconsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomEventsHandler(value: CustomEventHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEventsHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEventsHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEventsHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withDblClickZoomEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickZoomEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblClickZoomEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickZoomEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEventsListenerElement(value: SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsListenerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsListenerElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsListenerElement")(js.undefined)
        ret
    }
    @scala.inline
    def withFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheelZoomEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoomEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelZoomEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoomEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPan(value: /* newPan */ Point => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPan")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdatedCTM(value: /* newCTM */ SVGMatrix => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdatedCTM")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdatedCTM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdatedCTM")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoom(value: /* newScale */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withPanEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventMouseEventsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventMouseEventsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventMouseEventsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventMouseEventsDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshRate(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshRate")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportSelectorSVGElement(value: SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportSelectorHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportSelector(value: String | HTMLElement | SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomScaleSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScaleSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomScaleSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScaleSensitivity")(js.undefined)
        ret
    }
  }
  
}

