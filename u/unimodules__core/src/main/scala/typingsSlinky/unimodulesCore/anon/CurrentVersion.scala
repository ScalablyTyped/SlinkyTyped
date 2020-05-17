package typingsSlinky.unimodulesCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentVersion extends js.Object {
  var currentVersion: js.UndefOr[String] = js.native
  var replacement: js.UndefOr[String] = js.native
  var versionToRemove: js.UndefOr[String] = js.native
}

object CurrentVersion {
  @scala.inline
  def apply(): CurrentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentVersion]
  }
  @scala.inline
  implicit class CurrentVersionOps[Self <: CurrentVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionToRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionToRemove")(js.undefined)
        ret
    }
  }
  
}

