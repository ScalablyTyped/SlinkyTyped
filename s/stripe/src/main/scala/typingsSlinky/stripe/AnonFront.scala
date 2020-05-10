package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFront extends js.Object {
  /**
    * The back of a document returned by a file upload with a purpose value of identity_document.
    */
  var back: String = js.native
  /**
    * The front of a document returned by a file upload with a purpose value of identity_document.
    */
  var front: String = js.native
}

object AnonFront {
  @scala.inline
  def apply(back: String, front: String): AnonFront = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFront]
  }
  @scala.inline
  implicit class AnonFrontOps[Self <: AnonFront] (val x: Self) extends AnyVal {
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
    def withFront(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

