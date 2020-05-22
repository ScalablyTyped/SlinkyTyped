package typingsSlinky.updateNotifier.mod

import typingsSlinky.updateNotifier.updateNotifierStrings.build
import typingsSlinky.updateNotifier.updateNotifierStrings.latest
import typingsSlinky.updateNotifier.updateNotifierStrings.major
import typingsSlinky.updateNotifier.updateNotifierStrings.minor
import typingsSlinky.updateNotifier.updateNotifierStrings.patch
import typingsSlinky.updateNotifier.updateNotifierStrings.prerelease
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfo extends js.Object {
  /** Current version */
  val current: String
  /** Latest version */
  val latest: String
  /** Package name */
  var name: String
  /** Type of current update */
  val `type`: typingsSlinky.updateNotifier.updateNotifierStrings.latest | major | minor | patch | prerelease | build
}

object UpdateInfo {
  @scala.inline
  def apply(
    current: String,
    latest: String,
    name: String,
    `type`: latest | major | minor | patch | prerelease | build
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
}

