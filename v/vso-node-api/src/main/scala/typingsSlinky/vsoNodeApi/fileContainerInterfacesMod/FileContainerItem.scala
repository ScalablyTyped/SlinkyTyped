package typingsSlinky.vsoNodeApi.fileContainerInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileContainerItem extends js.Object {
  /**
    * Container Id.
    */
  var containerId: Double = js.native
  var contentId: js.Array[Double] = js.native
  /**
    * Download Url for the content of this item.
    */
  var contentLocation: String = js.native
  /**
    * Creator.
    */
  var createdBy: String = js.native
  /**
    * Creation date.
    */
  var dateCreated: js.Date = js.native
  /**
    * Last modified date.
    */
  var dateLastModified: js.Date = js.native
  /**
    * Encoding of the file. Zero if not a file.
    */
  var fileEncoding: Double = js.native
  /**
    * Hash value of the file. Null if not a file.
    */
  var fileHash: js.Array[Double] = js.native
  /**
    * Id of the file content.
    */
  var fileId: Double = js.native
  /**
    * Length of the file. Zero if not of a file.
    */
  var fileLength: Double = js.native
  /**
    * Type of the file. Zero if not a file.
    */
  var fileType: Double = js.native
  /**
    * Location of the item resource.
    */
  var itemLocation: String = js.native
  /**
    * Type of the item: Folder, File or String.
    */
  var itemType: ContainerItemType = js.native
  /**
    * Modifier.
    */
  var lastModifiedBy: String = js.native
  /**
    * Unique path that identifies the item.
    */
  var path: String = js.native
  /**
    * Project Id.
    */
  var scopeIdentifier: String = js.native
  /**
    * Status of the item: Created or Pending Upload.
    */
  var status: ContainerItemStatus = js.native
  var ticket: String = js.native
}

object FileContainerItem {
  @scala.inline
  def apply(
    containerId: Double,
    contentId: js.Array[Double],
    contentLocation: String,
    createdBy: String,
    dateCreated: js.Date,
    dateLastModified: js.Date,
    fileEncoding: Double,
    fileHash: js.Array[Double],
    fileId: Double,
    fileLength: Double,
    fileType: Double,
    itemLocation: String,
    itemType: ContainerItemType,
    lastModifiedBy: String,
    path: String,
    scopeIdentifier: String,
    status: ContainerItemStatus,
    ticket: String
  ): FileContainerItem = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], contentId = contentId.asInstanceOf[js.Any], contentLocation = contentLocation.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateLastModified = dateLastModified.asInstanceOf[js.Any], fileEncoding = fileEncoding.asInstanceOf[js.Any], fileHash = fileHash.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], fileLength = fileLength.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], itemLocation = itemLocation.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileContainerItem]
  }
  @scala.inline
  implicit class FileContainerItemOps[Self <: FileContainerItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateLastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileEncoding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileHash(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemType(value: ContainerItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ContainerItemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

