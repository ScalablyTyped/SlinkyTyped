package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeLensOptions extends js.Object {
  /**
    * Code lens has a resolve provider as well.
    */
  var resolveProvider: js.UndefOr[Boolean] = js.native
}

object CodeLensOptions {
  @scala.inline
  def apply(): CodeLensOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeLensOptions]
  }
  @scala.inline
  implicit class CodeLensOptionsOps[Self <: CodeLensOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolveProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveProvider")(js.undefined)
        ret
    }
  }
  
}

