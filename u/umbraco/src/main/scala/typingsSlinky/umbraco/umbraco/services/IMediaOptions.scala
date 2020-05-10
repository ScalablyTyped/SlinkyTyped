package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media options
  */
@js.native
trait IMediaOptions extends js.Object {
  var imageOnly: Boolean = js.native
  var mediaModel: IMediaModel = js.native
}

object IMediaOptions {
  @scala.inline
  def apply(imageOnly: Boolean, mediaModel: IMediaModel): IMediaOptions = {
    val __obj = js.Dynamic.literal(imageOnly = imageOnly.asInstanceOf[js.Any], mediaModel = mediaModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaOptions]
  }
  @scala.inline
  implicit class IMediaOptionsOps[Self <: IMediaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaModel(value: IMediaModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaModel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

