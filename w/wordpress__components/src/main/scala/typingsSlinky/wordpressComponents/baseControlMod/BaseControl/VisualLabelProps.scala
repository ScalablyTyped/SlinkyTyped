package typingsSlinky.wordpressComponents.baseControlMod.BaseControl

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualLabelProps extends js.Object {
  var children: TagMod[Any]
  var className: js.UndefOr[String] = js.undefined
}

object VisualLabelProps {
  @scala.inline
  def apply(children: TagMod[Any] = null, className: String = null): VisualLabelProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualLabelProps]
  }
}

