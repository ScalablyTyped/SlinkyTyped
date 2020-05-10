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

@js.native
trait UpdateInfo extends js.Object {
  /** Current version */
  val current: String = js.native
  /** Latest version */
  val latest: String = js.native
  /** Package name */
  var name: String = js.native
  /** Type of current update */
  val `type`: typingsSlinky.updateNotifier.updateNotifierStrings.latest | major | minor | patch | prerelease | build = js.native
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
  @scala.inline
  implicit class UpdateInfoOps[Self <: UpdateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: latest | major | minor | patch | prerelease | build): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

