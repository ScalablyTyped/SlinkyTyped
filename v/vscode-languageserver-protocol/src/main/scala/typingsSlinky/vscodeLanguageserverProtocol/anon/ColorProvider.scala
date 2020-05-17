package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorProvider extends js.Object {
  /**
    * Capabilities specific to the colorProvider
    */
  var colorProvider: js.UndefOr[DynamicRegistration] = js.native
}

object ColorProvider {
  @scala.inline
  def apply(): ColorProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProvider]
  }
  @scala.inline
  implicit class ColorProviderOps[Self <: ColorProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorProvider(value: DynamicRegistration): Self = {
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

