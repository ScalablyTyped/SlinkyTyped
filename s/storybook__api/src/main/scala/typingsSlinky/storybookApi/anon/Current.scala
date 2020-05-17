package typingsSlinky.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Current extends js.Object {
  var current: typingsSlinky.storybookApi.versionsMod.Version | Version = js.native
  var latest: js.UndefOr[typingsSlinky.storybookApi.versionsMod.Version] = js.native
  var next: js.UndefOr[typingsSlinky.storybookApi.versionsMod.Version] = js.native
}

object Current {
  @scala.inline
  def apply(current: typingsSlinky.storybookApi.versionsMod.Version | Version): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: typingsSlinky.storybookApi.versionsMod.Version | Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatest(value: typingsSlinky.storybookApi.versionsMod.Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: typingsSlinky.storybookApi.versionsMod.Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
  }
  
}

