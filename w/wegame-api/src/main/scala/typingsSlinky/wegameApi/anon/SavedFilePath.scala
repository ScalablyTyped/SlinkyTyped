package typingsSlinky.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedFilePath extends js.Object {
  var savedFilePath: String = js.native
}

object SavedFilePath {
  @scala.inline
  def apply(savedFilePath: String): SavedFilePath = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFilePath]
  }
  @scala.inline
  implicit class SavedFilePathOps[Self <: SavedFilePath] (val x: Self) extends AnyVal {
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

