package typingsSlinky.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseQueryWithFile extends BaseQuery {
  /** may hold either a filename, or a string in the form "#N", where N should be an integer referring to one of the files included in the request */
  var file: String = js.native
}

object BaseQueryWithFile {
  @scala.inline
  def apply(file: String, `type`: String): BaseQueryWithFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQueryWithFile]
  }
  @scala.inline
  implicit class BaseQueryWithFileOps[Self <: BaseQueryWithFile] (val x: Self) extends AnyVal {
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
  }
  
}

