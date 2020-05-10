package typingsSlinky.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSData extends js.Object {
  var document: SketchMSDocument = js.native
  var meta: SketchMSMeta = js.native
  var pages: js.Array[SketchMSPageLayer] = js.native
  var previews: js.Array[SketchMSPreview] = js.native
  var user: SketchMSUser = js.native
}

object SketchMSData {
  @scala.inline
  def apply(
    document: SketchMSDocument,
    meta: SketchMSMeta,
    pages: js.Array[SketchMSPageLayer],
    previews: js.Array[SketchMSPreview],
    user: SketchMSUser
  ): SketchMSData = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSData]
  }
  @scala.inline
  implicit class SketchMSDataOps[Self <: SketchMSData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: SketchMSDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: SketchMSMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: js.Array[SketchMSPageLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviews(value: js.Array[SketchMSPreview]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: SketchMSUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

