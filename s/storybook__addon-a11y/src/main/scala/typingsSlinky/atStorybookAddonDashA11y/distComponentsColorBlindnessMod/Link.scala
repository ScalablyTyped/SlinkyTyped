package typingsSlinky.atStorybookAddonDashA11y.distComponentsColorBlindnessMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var active: Boolean
  var id: String
  var right: js.UndefOr[TagMod[Any]] = js.undefined
  var title: TagMod[Any]
  def onClick(): Unit
}

object Link {
  @scala.inline
  def apply(active: Boolean, id: String, onClick: () => Unit, title: TagMod[Any], right: TagMod[Any] = null): Link = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

