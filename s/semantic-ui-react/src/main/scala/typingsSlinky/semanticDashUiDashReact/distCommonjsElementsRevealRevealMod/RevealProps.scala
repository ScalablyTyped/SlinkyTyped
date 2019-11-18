package typingsSlinky.semanticDashUiDashReact.distCommonjsElementsRevealRevealMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`move down`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`move right`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`move up`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`rotate left`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small fade`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.fade
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.move
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.rotate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevealProps
  extends StrictRevealProps
     with /* key */ StringDictionary[js.Any]

object RevealProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    animated: fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`) = null,
    as: js.Any = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    instant: js.UndefOr[Boolean] = js.undefined
  ): RevealProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(instant)) __obj.updateDynamic("instant")(instant.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevealProps]
  }
}

