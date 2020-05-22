package typingsSlinky.storybookChannelPostmessage.mod

import typingsSlinky.storybookChannelPostmessage.storybookChannelPostmessageStrings.manager
import typingsSlinky.storybookChannelPostmessage.storybookChannelPostmessageStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var page: manager | preview
}

object Config {
  @scala.inline
  def apply(page: manager | preview): Config = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

