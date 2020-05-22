package typingsSlinky.wordpressComponents.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@wordpress/components.@wordpress/components/slot-fill/fill.default.Props, 'name'> */
trait OmitPropsname extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
}

object OmitPropsname {
  @scala.inline
  def apply(children: TagMod[Any] = null): OmitPropsname = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitPropsname]
  }
}

