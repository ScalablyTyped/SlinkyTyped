package typingsSlinky.semanticDashUiDashReact.distCommonjsModulesModalModalHeaderMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalHeaderProps
  extends StrictModalHeaderProps
     with /* key */ StringDictionary[js.Any]

object ModalHeaderProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null
  ): ModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalHeaderProps]
  }
}

