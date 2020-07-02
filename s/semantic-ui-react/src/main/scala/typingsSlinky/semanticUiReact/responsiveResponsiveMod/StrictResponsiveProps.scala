package typingsSlinky.semanticUiReact.responsiveResponsiveMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictResponsiveProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.undefined
  /** Fires callbacks immediately after mount. */
  var fireOnMount: js.UndefOr[Boolean] = js.undefined
  /**
    * Called to get width of screen. Defaults to using `window.innerWidth` when in a browser;
    * otherwise, assumes a width of 0.
    */
  var getWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** The maximum width at which content will be displayed. */
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  /** The minimum width at which content will be displayed. */
  var minWidth: js.UndefOr[Double | String] = js.undefined
  /**
    * Called on update.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onUpdate: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[Event, HTMLElement], 
      /* data */ ResponsiveOnUpdateData, 
      Unit
    ]
  ] = js.undefined
}

object StrictResponsiveProps {
  @scala.inline
  def apply(): StrictResponsiveProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictResponsiveProps]
  }
  @scala.inline
  implicit class StrictResponsivePropsOps[Self <: StrictResponsiveProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFireOnMount(value: Boolean): Self = this.set("fireOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFireOnMount: Self = this.set("fireOnMount", js.undefined)
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOnUpdate(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ ResponsiveOnUpdateData) => Unit): Self = this.set("onUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
  }
  
}

