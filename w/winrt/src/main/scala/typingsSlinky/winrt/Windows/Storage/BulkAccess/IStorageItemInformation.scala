package typingsSlinky.winrt.Windows.Storage.BulkAccess

import typingsSlinky.winrt.Windows.Storage.FileProperties.BasicProperties
import typingsSlinky.winrt.Windows.Storage.FileProperties.DocumentProperties
import typingsSlinky.winrt.Windows.Storage.FileProperties.ImageProperties
import typingsSlinky.winrt.Windows.Storage.FileProperties.MusicProperties
import typingsSlinky.winrt.Windows.Storage.FileProperties.StorageItemThumbnail
import typingsSlinky.winrt.Windows.Storage.FileProperties.VideoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemInformation extends js.Object {
  var basicProperties: BasicProperties = js.native
  var documentProperties: DocumentProperties = js.native
  var imageProperties: ImageProperties = js.native
  var musicProperties: MusicProperties = js.native
  var onpropertiesupdated: js.Any = js.native
  var onthumbnailupdated: js.Any = js.native
  var thumbnail: StorageItemThumbnail = js.native
  var videoProperties: VideoProperties = js.native
}

object IStorageItemInformation {
  @scala.inline
  def apply(
    basicProperties: BasicProperties,
    documentProperties: DocumentProperties,
    imageProperties: ImageProperties,
    musicProperties: MusicProperties,
    onpropertiesupdated: js.Any,
    onthumbnailupdated: js.Any,
    thumbnail: StorageItemThumbnail,
    videoProperties: VideoProperties
  ): IStorageItemInformation = {
    val __obj = js.Dynamic.literal(basicProperties = basicProperties.asInstanceOf[js.Any], documentProperties = documentProperties.asInstanceOf[js.Any], imageProperties = imageProperties.asInstanceOf[js.Any], musicProperties = musicProperties.asInstanceOf[js.Any], onpropertiesupdated = onpropertiesupdated.asInstanceOf[js.Any], onthumbnailupdated = onthumbnailupdated.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], videoProperties = videoProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageItemInformation]
  }
  @scala.inline
  implicit class IStorageItemInformationOps[Self <: IStorageItemInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasicProperties(value: BasicProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentProperties(value: DocumentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageProperties(value: ImageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMusicProperties(value: MusicProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("musicProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnpropertiesupdated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onpropertiesupdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnthumbnailupdated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onthumbnailupdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: StorageItemThumbnail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoProperties(value: VideoProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

