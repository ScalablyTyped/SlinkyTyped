package typingsSlinky.storybookAddonLinks.linkMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var kind: String
  var story: String
}

object Props {
  @scala.inline
  def apply(children: TagMod[Any], kind: String, story: String): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}

