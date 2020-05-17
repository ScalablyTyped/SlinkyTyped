package typingsSlinky.wxServerSdk.anon

import typingsSlinky.node.Buffer
import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudPath extends js.Object {
  var cloudPath: String = js.native
  var fileContent: Buffer | ReadStream = js.native
}

object CloudPath {
  @scala.inline
  def apply(cloudPath: String, fileContent: Buffer | ReadStream): CloudPath = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudPath]
  }
  @scala.inline
  implicit class CloudPathOps[Self <: CloudPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileContent(value: Buffer | ReadStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

