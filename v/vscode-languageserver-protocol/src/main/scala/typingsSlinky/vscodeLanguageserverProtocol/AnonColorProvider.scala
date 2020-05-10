package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColorProvider extends js.Object {
  /**
    * Capabilities specific to the colorProvider
    */
  var colorProvider: js.UndefOr[AnonDynamicRegistration] = js.native
}

object AnonColorProvider {
  @scala.inline
  def apply(): AnonColorProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonColorProvider]
  }
  @scala.inline
  implicit class AnonColorProviderOps[Self <: AnonColorProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorProvider(value: AnonDynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorProvider")(js.undefined)
        ret
    }
  }
  
}

