package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcItem extends ItemModel {
  var changeDate: js.Date = js.native
  var deletionId: Double = js.native
  /**
    * MD5 hash as a base 64 string, applies to files only.
    */
  var hashValue: String = js.native
  var isBranch: Boolean = js.native
  var isPendingChange: Boolean = js.native
  /**
    * The size of the file, if applicable.
    */
  var size: Double = js.native
  var version: Double = js.native
}

object TfvcItem {
  @scala.inline
  def apply(
    _links: js.Any,
    changeDate: js.Date,
    contentMetadata: FileContentMetadata,
    deletionId: Double,
    hashValue: String,
    isBranch: Boolean,
    isFolder: Boolean,
    isPendingChange: Boolean,
    isSymLink: Boolean,
    path: String,
    size: Double,
    url: String,
    version: Double
  ): TfvcItem = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], changeDate = changeDate.asInstanceOf[js.Any], contentMetadata = contentMetadata.asInstanceOf[js.Any], deletionId = deletionId.asInstanceOf[js.Any], hashValue = hashValue.asInstanceOf[js.Any], isBranch = isBranch.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isPendingChange = isPendingChange.asInstanceOf[js.Any], isSymLink = isSymLink.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcItem]
  }
  @scala.inline
  implicit class TfvcItemOps[Self <: TfvcItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBranch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPendingChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPendingChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

