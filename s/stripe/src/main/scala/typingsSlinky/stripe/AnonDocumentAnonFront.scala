package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDocumentAnonFront extends js.Object {
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: AnonFront = js.native
}

object AnonDocumentAnonFront {
  @scala.inline
  def apply(document: AnonFront): AnonDocumentAnonFront = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocumentAnonFront]
  }
  @scala.inline
  implicit class AnonDocumentAnonFrontOps[Self <: AnonDocumentAnonFront] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: AnonFront): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

