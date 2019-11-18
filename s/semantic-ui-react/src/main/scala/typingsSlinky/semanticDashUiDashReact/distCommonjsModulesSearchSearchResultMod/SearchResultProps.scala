package typingsSlinky.semanticDashUiDashReact.distCommonjsModulesSearchSearchResultMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultProps
  extends StrictSearchResultProps
     with /* key */ StringDictionary[js.Any]

object SearchResultProps {
  @scala.inline
  def apply(
    title: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    description: String = null,
    id: Double | String = null,
    image: String = null,
    onClick: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ SearchResultProps) => Unit = null,
    price: String = null,
    renderer: /* props */ SearchResultProps => js.Array[ReactElement] = null
  ): SearchResultProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[SearchResultProps]
  }
}

