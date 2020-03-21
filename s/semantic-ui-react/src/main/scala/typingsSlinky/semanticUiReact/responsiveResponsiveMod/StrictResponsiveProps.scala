package typingsSlinky.semanticUiReact.responsiveResponsiveMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictResponsiveProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
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
      /* event */ SyntheticEvent[Event_, HTMLElement], 
      /* data */ ResponsiveOnUpdateData, 
      Unit
    ]
  ] = js.undefined
}

object StrictResponsiveProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: TagMod[Any] = null,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    getWidth: () => Double = null,
    maxWidth: Double | String = null,
    minWidth: Double | String = null,
    onUpdate: (/* event */ SyntheticEvent[Event_, HTMLElement], /* data */ ResponsiveOnUpdateData) => Unit = null
  ): StrictResponsiveProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount.asInstanceOf[js.Any])
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction0(getWidth))
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2(onUpdate))
    __obj.asInstanceOf[StrictResponsiveProps]
  }
}

