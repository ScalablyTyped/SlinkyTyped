package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentLinkOptions extends js.Object {
  /**
    * Document links have a resolve provider as well.
    */
  var resolveProvider: js.UndefOr[Boolean] = js.native
}

object DocumentLinkOptions {
  @scala.inline
  def apply(): DocumentLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLinkOptions]
  }
  @scala.inline
  implicit class DocumentLinkOptionsOps[Self <: DocumentLinkOptions] (val x: Self) extends AnyVal {
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

