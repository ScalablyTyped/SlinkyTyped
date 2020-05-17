package typingsSlinky.vscodeLanguageserverProtocol.anon

import typingsSlinky.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentFormat extends js.Object {
  /**
    * Client supports the follow content formats for the content
    * property. The order describes the preferred format of the client.
    */
  var contentFormat: js.UndefOr[js.Array[MarkupKind]] = js.native
  /**
    * Whether hover supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}

object ContentFormat {
  @scala.inline
  def apply(): ContentFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentFormat]
  }
  @scala.inline
  implicit class ContentFormatOps[Self <: ContentFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentFormat(value: js.Array[MarkupKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFormat")(js.undefined)
        ret
    }
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
  }
  
}

