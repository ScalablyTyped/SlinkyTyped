package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPathAction extends js.Object {
  var action: GitPathActions = js.native
  var base64Content: String = js.native
  var path: String = js.native
  var rawTextContent: String = js.native
  var targetPath: String = js.native
}

object GitPathAction {
  @scala.inline
  def apply(
    action: GitPathActions,
    base64Content: String,
    path: String,
    rawTextContent: String,
    targetPath: String
  ): GitPathAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], base64Content = base64Content.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rawTextContent = rawTextContent.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPathAction]
  }
  @scala.inline
  implicit class GitPathActionOps[Self <: GitPathAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: GitPathActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase64Content(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawTextContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawTextContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

