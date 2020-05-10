package typingsSlinky.stripe.mod.files

import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.stripeStrings.file
import typingsSlinky.stripe.stripeStrings.jpg
import typingsSlinky.stripe.stripeStrings.pdf
import typingsSlinky.stripe.stripeStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileUpdate extends IResourceObject {
  var created: Double = js.native
  /**
    * Value is "file"
    */
  @JSName("object")
  var object_IFileUpdate: file = js.native
  /**
    * The purpose of the uploaded file. Possible values are "business_logo",
    * "dispute_evidence", "identity_document", "incorporation_article",
    * "incorporation_document".
    */
  var purpose: IPurpose = js.native
  /**
    * The size in bytes of the file object.
    */
  var size: Double = js.native
  /**
    * The type of the file returned. Returns one of the following:
    * pdf, jpg, png.
    */
  var `type`: pdf | jpg | png = js.native
  /**
    * A read-only URL where the uploaded file can be accessed. Will be nil
    * unless the uploaded file has one of the following purposes:
    *  business_logo, dispute_evidence, incorporation_document.
    * Also nil if retrieved with the publishable API key.
    */
  var url: String = js.native
}

object IFileUpdate {
  @scala.inline
  def apply(
    created: Double,
    id: String,
    `object`: file,
    purpose: IPurpose,
    size: Double,
    `type`: pdf | jpg | png,
    url: String
  ): IFileUpdate = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUpdate]
  }
  @scala.inline
  implicit class IFileUpdateOps[Self <: IFileUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: file): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurpose(value: IPurpose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: pdf | jpg | png): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

