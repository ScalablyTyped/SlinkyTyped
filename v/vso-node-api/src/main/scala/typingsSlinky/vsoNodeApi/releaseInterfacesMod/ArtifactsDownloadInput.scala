package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactsDownloadInput extends js.Object {
  var downloadInputs: js.Array[ArtifactDownloadInputBase] = js.native
}

object ArtifactsDownloadInput {
  @scala.inline
  def apply(downloadInputs: js.Array[ArtifactDownloadInputBase]): ArtifactsDownloadInput = {
    val __obj = js.Dynamic.literal(downloadInputs = downloadInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactsDownloadInput]
  }
  @scala.inline
  implicit class ArtifactsDownloadInputOps[Self <: ArtifactsDownloadInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadInputs(value: js.Array[ArtifactDownloadInputBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadInputs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

