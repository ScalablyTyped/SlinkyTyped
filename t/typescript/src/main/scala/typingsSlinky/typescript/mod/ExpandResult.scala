package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandResult extends js.Object {
  var fileNames: js.Array[java.lang.String] = js.native
  var wildcardDirectories: MapLike[WatchDirectoryFlags] = js.native
}

object ExpandResult {
  @scala.inline
  def apply(fileNames: js.Array[java.lang.String], wildcardDirectories: MapLike[WatchDirectoryFlags]): ExpandResult = {
    val __obj = js.Dynamic.literal(fileNames = fileNames.asInstanceOf[js.Any], wildcardDirectories = wildcardDirectories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandResult]
  }
  @scala.inline
  implicit class ExpandResultOps[Self <: ExpandResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileNames(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWildcardDirectories(value: MapLike[WatchDirectoryFlags]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcardDirectories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

