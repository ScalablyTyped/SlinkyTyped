package typingsSlinky.semanticUiReact.responsiveResponsiveMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictResponsiveProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.native
  /** Fires callbacks immediately after mount. */
  var fireOnMount: js.UndefOr[Boolean] = js.native
  /**
    * Called to get width of screen. Defaults to using `window.innerWidth` when in a browser;
    * otherwise, assumes a width of 0.
    */
  var getWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** The maximum width at which content will be displayed. */
  var maxWidth: js.UndefOr[Double | String] = js.native
  /** The minimum width at which content will be displayed. */
  var minWidth: js.UndefOr[Double | String] = js.native
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
  ] = js.native
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
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ ResponsiveOnUpdateData) => Unit): Self = {
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
  }
  
}

