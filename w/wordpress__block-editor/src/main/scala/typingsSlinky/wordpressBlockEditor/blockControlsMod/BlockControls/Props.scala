package typingsSlinky.wordpressBlockEditor.blockControlsMod.BlockControls

import slinky.core.TagMod
import typingsSlinky.wordpressComponents.toolbarMod.Toolbar.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@wordpress/components.@wordpress/components.Toolbar.Props, 'controls'> */
trait Props extends js.Object {
  var children: TagMod[Any]
  var controls: js.UndefOr[js.Array[js.Array[Control] | Control]] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: TagMod[Any] = null, controls: js.Array[js.Array[Control] | Control] = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

