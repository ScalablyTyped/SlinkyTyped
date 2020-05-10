package typingsSlinky.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonDocumentCreateUpdateOptions extends js.Object {
  /**
    * The back of an ID returned by a file upload with a purpose value of identity_document.
    * The uploaded file needs to be a color image (smaller than 8,000px by 8,000px),
    * in JPG or PNG format, and less than 10 MB in size.
    */
  var back: js.UndefOr[String] = js.native
  /**
    * The front of an ID returned by a file upload with a purpose value of identity_document.
    * The uploaded file needs to be a color image (smaller than 8,000px by 8,000px),
    * in JPG or PNG format, and less than 10 MB in size.
    */
  var front: js.UndefOr[String] = js.native
}

object IPersonDocumentCreateUpdateOptions {
  @scala.inline
  def apply(): IPersonDocumentCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonDocumentCreateUpdateOptions]
  }
  @scala.inline
  implicit class IPersonDocumentCreateUpdateOptionsOps[Self <: IPersonDocumentCreateUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(js.undefined)
        ret
    }
    @scala.inline
    def withFront(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(js.undefined)
        ret
    }
  }
  
}

