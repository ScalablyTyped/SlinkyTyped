package typingsSlinky.semanticDashUiDashReact.distCommonjsElementsListListContentMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsListListDescriptionMod.ListDescriptionProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsListListHeaderMod.ListHeaderProps
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContentProps
  extends StrictListContentProps
     with /* key */ StringDictionary[js.Any]

object ListContentProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[ListDescriptionProps] = null,
    floated: SemanticFLOATS = null,
    header: SemanticShorthandItem[ListHeaderProps] = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null
  ): ListContentProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContentProps]
  }
}

