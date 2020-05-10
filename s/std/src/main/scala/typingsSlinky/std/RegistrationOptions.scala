package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationOptions extends js.Object {
  var scope: js.UndefOr[java.lang.String] = js.native
  var `type`: js.UndefOr[WorkerType] = js.native
  var updateViaCache: js.UndefOr[ServiceWorkerUpdateViaCache] = js.native
}

object RegistrationOptions {
  @scala.inline
  def apply(): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationOptions]
  }
  @scala.inline
  implicit class RegistrationOptionsOps[Self <: RegistrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: WorkerType): Self = {
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
    @scala.inline
    def withUpdateViaCache(value: ServiceWorkerUpdateViaCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateViaCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateViaCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateViaCache")(js.undefined)
        ret
    }
  }
  
}

