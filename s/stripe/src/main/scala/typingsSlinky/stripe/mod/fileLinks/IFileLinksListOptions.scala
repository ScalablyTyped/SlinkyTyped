package typingsSlinky.stripe.mod.fileLinks

import typingsSlinky.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileLinksListOptions extends IListOptionsCreated {
  /**
    * Filter links by their expiration status. By default, all links are returned.
    */
  var expired: js.UndefOr[Boolean] = js.native
  /**
    * Only return links for the given file.
    */
  var file: js.UndefOr[String] = js.native
}

object IFileLinksListOptions {
  @scala.inline
  def apply(): IFileLinksListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileLinksListOptions]
  }
  @scala.inline
  implicit class IFileLinksListOptionsOps[Self <: IFileLinksListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
  }
  
}

