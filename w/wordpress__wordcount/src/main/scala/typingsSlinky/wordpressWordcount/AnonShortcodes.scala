package typingsSlinky.wordpressWordcount

import typingsSlinky.wordpressWordcount.mod.CountType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShortcodes extends js.Object {
  /** Array of known shortcode names */
  var shortcodes: js.UndefOr[js.Array[String]] = js.native
  var `type`: js.UndefOr[CountType] = js.native
}

object AnonShortcodes {
  @scala.inline
  def apply(): AnonShortcodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonShortcodes]
  }
  @scala.inline
  implicit class AnonShortcodesOps[Self <: AnonShortcodes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShortcodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcodes")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

