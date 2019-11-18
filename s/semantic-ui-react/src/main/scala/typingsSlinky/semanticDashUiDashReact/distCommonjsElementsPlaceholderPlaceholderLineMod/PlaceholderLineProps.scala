package typingsSlinky.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very long`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very short`
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.full
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.long
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderLineProps
  extends StrictPlaceholderLineProps
     with /* key */ StringDictionary[js.Any]

object PlaceholderLineProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: String = null,
    length: full | (`very long`) | long | medium | short | (`very short`) = null
  ): PlaceholderLineProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderLineProps]
  }
}

