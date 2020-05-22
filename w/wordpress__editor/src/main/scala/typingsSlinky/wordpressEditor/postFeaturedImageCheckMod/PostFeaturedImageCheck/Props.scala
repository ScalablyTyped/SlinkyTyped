package typingsSlinky.wordpressEditor.postFeaturedImageCheckMod.PostFeaturedImageCheck

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var supportKeys: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: TagMod[Any] = null, supportKeys: String | js.Array[String] = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (supportKeys != null) __obj.updateDynamic("supportKeys")(supportKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

