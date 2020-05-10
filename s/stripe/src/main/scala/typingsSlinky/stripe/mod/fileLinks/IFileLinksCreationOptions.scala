package typingsSlinky.stripe.mod.fileLinks

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileLinksCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A future timestamp after which the link will no longer be usable.
    */
  var expires_at: js.UndefOr[Double] = js.native
  /**
    * The ID of the file
    */
  var file: String = js.native
}

object IFileLinksCreationOptions {
  @scala.inline
  def apply(file: String): IFileLinksCreationOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileLinksCreationOptions]
  }
  @scala.inline
  implicit class IFileLinksCreationOptionsOps[Self <: IFileLinksCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(js.undefined)
        ret
    }
  }
  
}

