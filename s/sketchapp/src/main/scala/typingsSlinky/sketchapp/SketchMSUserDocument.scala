package typingsSlinky.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSUserDocument extends js.Object {
  var document: AnonPageListCollapsed = js.native
}

object SketchMSUserDocument {
  @scala.inline
  def apply(document: AnonPageListCollapsed): SketchMSUserDocument = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSUserDocument]
  }
  @scala.inline
  implicit class SketchMSUserDocumentOps[Self <: SketchMSUserDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: AnonPageListCollapsed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

