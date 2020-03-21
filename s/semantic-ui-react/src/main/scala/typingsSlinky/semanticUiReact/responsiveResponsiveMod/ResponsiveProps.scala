package typingsSlinky.semanticUiReact.responsiveResponsiveMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveProps
  extends StrictResponsiveProps
     with /* key */ StringDictionary[js.Any]

object ResponsiveProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: TagMod[Any] = null,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    getWidth: () => Double = null,
    maxWidth: Double | String = null,
    minWidth: Double | String = null,
    onUpdate: (/* event */ SyntheticEvent[Event_, HTMLElement], /* data */ ResponsiveOnUpdateData) => Unit = null
  ): ResponsiveProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount.asInstanceOf[js.Any])
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction0(getWidth))
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2(onUpdate))
    __obj.asInstanceOf[ResponsiveProps]
  }
}

