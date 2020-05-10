package typingsSlinky.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKnownFoldersStatics extends js.Object {
  var documentsLibrary: StorageFolder = js.native
  var homeGroup: StorageFolder = js.native
  var mediaServerDevices: StorageFolder = js.native
  var musicLibrary: StorageFolder = js.native
  var picturesLibrary: StorageFolder = js.native
  var removableDevices: StorageFolder = js.native
  var videosLibrary: StorageFolder = js.native
}

object IKnownFoldersStatics {
  @scala.inline
  def apply(
    documentsLibrary: StorageFolder,
    homeGroup: StorageFolder,
    mediaServerDevices: StorageFolder,
    musicLibrary: StorageFolder,
    picturesLibrary: StorageFolder,
    removableDevices: StorageFolder,
    videosLibrary: StorageFolder
  ): IKnownFoldersStatics = {
    val __obj = js.Dynamic.literal(documentsLibrary = documentsLibrary.asInstanceOf[js.Any], homeGroup = homeGroup.asInstanceOf[js.Any], mediaServerDevices = mediaServerDevices.asInstanceOf[js.Any], musicLibrary = musicLibrary.asInstanceOf[js.Any], picturesLibrary = picturesLibrary.asInstanceOf[js.Any], removableDevices = removableDevices.asInstanceOf[js.Any], videosLibrary = videosLibrary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnownFoldersStatics]
  }
  @scala.inline
  implicit class IKnownFoldersStaticsOps[Self <: IKnownFoldersStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentsLibrary(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentsLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomeGroup(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaServerDevices(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaServerDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMusicLibrary(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("musicLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPicturesLibrary(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picturesLibrary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovableDevices(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removableDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideosLibrary(value: StorageFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videosLibrary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

