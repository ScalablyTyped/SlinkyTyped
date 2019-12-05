package typingsSlinky.atStorybookComponents.distTabsTabsMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabWrapperProps extends js.Object {
  var active: Boolean
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var render: js.UndefOr[js.Function0[Element]] = js.undefined
}

object TabWrapperProps {
  @scala.inline
  def apply(active: Boolean, children: TagMod[Any] = null, render: () => Element = null): TabWrapperProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[TabWrapperProps]
  }
}

