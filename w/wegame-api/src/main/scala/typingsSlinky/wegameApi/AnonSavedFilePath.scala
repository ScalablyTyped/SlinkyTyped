package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSavedFilePath extends js.Object {
  var savedFilePath: String = js.native
}

object AnonSavedFilePath {
  @scala.inline
  def apply(savedFilePath: String): AnonSavedFilePath = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSavedFilePath]
  }
  @scala.inline
  implicit class AnonSavedFilePathOps[Self <: AnonSavedFilePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSavedFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedFilePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

