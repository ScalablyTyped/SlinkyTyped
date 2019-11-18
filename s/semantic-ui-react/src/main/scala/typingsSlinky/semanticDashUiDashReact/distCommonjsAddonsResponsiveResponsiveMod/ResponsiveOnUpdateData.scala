package typingsSlinky.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveOnUpdateData extends ResponsiveProps {
  var width: Double
}

object ResponsiveOnUpdateData {
  @scala.inline
  def apply(
    width: Double,
    as: js.Any = null,
    children: TagMod[Any] = null,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    getWidth: () => Double = null,
    maxWidth: Double | String = null,
    minWidth: Double | String = null,
    onUpdate: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ ResponsiveOnUpdateData) => Unit = null
  ): ResponsiveOnUpdateData = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount.asInstanceOf[js.Any])
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction0(getWidth))
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2(onUpdate))
    __obj.asInstanceOf[ResponsiveOnUpdateData]
  }
}

