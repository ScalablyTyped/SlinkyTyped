package typingsSlinky.wordpressEditor.postTypeSupportCheckMod.PostTypeSupportCheck

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var supportKeys: String | js.Array[String]
}

object Props {
  @scala.inline
  def apply(supportKeys: String | js.Array[String], children: TagMod[Any] = null): Props = {
    val __obj = js.Dynamic.literal(supportKeys = supportKeys.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

