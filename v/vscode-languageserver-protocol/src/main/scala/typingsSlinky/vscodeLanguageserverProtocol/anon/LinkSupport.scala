package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkSupport extends js.Object {
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * The client supports additional metadata in the form of definition links.
    */
  var linkSupport: js.UndefOr[Boolean] = js.native
}

object LinkSupport {
  @scala.inline
  def apply(): LinkSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkSupport]
  }
  @scala.inline
  implicit class LinkSupportOps[Self <: LinkSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicRegistration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkSupport")(js.undefined)
        ret
    }
  }
  
}

