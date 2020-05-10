package typingsSlinky.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFileName extends js.Object {
  var fileName: String = js.native
  var kind: String = js.native
  var stories: js.Array[AnonName] = js.native
}

object AnonFileName {
  @scala.inline
  def apply(fileName: String, kind: String, stories: js.Array[AnonName]): AnonFileName = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileName]
  }
  @scala.inline
  implicit class AnonFileNameOps[Self <: AnonFileName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStories(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

