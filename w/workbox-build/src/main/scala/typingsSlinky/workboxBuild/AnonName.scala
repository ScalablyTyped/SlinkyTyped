package typingsSlinky.workboxBuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonName extends js.Object {
  /**
    * The `name` property to use when creating the
    * [`BackgroundSyncPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-background-sync.BackgroundSyncPlugin).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The `options` property to use when creating the
    * [`BackgroundSyncPlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-background-sync.BackgroundSyncPlugin).
    */
  var options: js.UndefOr[js.Object] = js.native
}

object AnonName {
  @scala.inline
  def apply(): AnonName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonName]
  }
  @scala.inline
  implicit class AnonNameOps[Self <: AnonName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

