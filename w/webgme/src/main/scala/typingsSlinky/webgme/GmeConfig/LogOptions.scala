package typingsSlinky.webgme.GmeConfig

import typingsSlinky.webgme.anon.LevelString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogOptions extends js.Object {
  var log: LevelString
}

object LogOptions {
  @scala.inline
  def apply(log: LevelString): LogOptions = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogOptions]
  }
}

