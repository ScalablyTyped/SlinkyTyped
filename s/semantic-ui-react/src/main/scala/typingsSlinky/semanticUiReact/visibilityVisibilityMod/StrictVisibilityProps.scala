package typingsSlinky.semanticUiReact.visibilityVisibilityMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.semanticUiReactStrings.events
import typingsSlinky.semanticUiReact.semanticUiReactStrings.repaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictVisibilityProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Context which sticky element should stick to. */
  var context: js.UndefOr[js.Object] = js.native
  /**
    * When set to true a callback will occur anytime an element passes a condition not just immediately after the
    * threshold is met.
    */
  var continuous: js.UndefOr[Boolean] = js.native
  /** Fires callbacks immediately after mount. */
  var fireOnMount: js.UndefOr[Boolean] = js.native
  /**
    * Value that context should be adjusted in pixels. Useful for making content appear below content fixed to the
    * page.
    */
  var offset: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  /**
    * Element's bottom edge has passed top of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomPassed: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's bottom edge has not passed top of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomPassedReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's bottom edge has passed bottom of screen
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomVisible: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's bottom edge has not passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomVisibleReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element is not visible on the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onOffScreen: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element is visible on the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onOnScreen: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /** Element is not visible on the screen. */
  var onPassed: js.UndefOr[VisibilityOnPassed] = js.native
  /**
    * Any part of an element is visible on screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onPassing: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top has not passed top of screen but bottom has.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onPassingReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top edge has passed top of the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopPassed: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top edge has not passed top of the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopPassedReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top edge has passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopVisible: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top edge has not passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopVisibleReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top edge has passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUpdate: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /** When set to false a callback will occur each time an element passes the threshold for a condition. */
  var once: js.UndefOr[Boolean] = js.native
  /**
    * Allows to choose the mode of the position calculations:
    * - `events` - (default) update and fire callbacks only on scroll/resize events
    * - `repaint` - update and fire callbacks on browser repaint (animation frames)
    */
  var updateOn: js.UndefOr[events | repaint] = js.native
}

object StrictVisibilityProps {
  @scala.inline
  def apply(): StrictVisibilityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictVisibilityProps]
  }
  @scala.inline
  implicit class StrictVisibilityPropsOps[Self <: StrictVisibilityProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
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
    def withContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withContinuous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(js.undefined)
        ret
    }
    @scala.inline
    def withFireOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFireOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double | String | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBottomPassed(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomPassed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBottomPassed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomPassed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBottomPassedReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomPassedReverse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBottomPassedReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomPassedReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBottomVisible(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomVisible")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBottomVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBottomVisibleReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomVisibleReverse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBottomVisibleReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBottomVisibleReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOffScreen(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOffScreen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnOffScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOffScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOnScreen(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOnScreen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnOnScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOnScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPassed(value: VisibilityOnPassed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPassed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPassing(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPassing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPassingReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassingReverse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPassingReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPassingReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTopPassed(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopPassed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTopPassed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopPassed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTopPassedReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopPassedReverse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTopPassedReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopPassedReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTopVisible(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopVisible")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTopVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTopVisibleReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopVisibleReverse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTopVisibleReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTopVisibleReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOn(value: events | repaint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOn")(js.undefined)
        ret
    }
  }
  
}

