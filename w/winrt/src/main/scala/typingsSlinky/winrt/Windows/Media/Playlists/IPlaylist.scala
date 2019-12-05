package typingsSlinky.winrt.Windows.Media.Playlists

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFolder
import typingsSlinky.winrt.Windows.Storage.NameCollisionOption
import typingsSlinky.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlaylist extends js.Object {
  var files: IVector[StorageFile] = js.native
  def saveAsAsync(saveLocation: IStorageFolder, desiredName: String, option: NameCollisionOption): IAsyncOperation[StorageFile] = js.native
  def saveAsAsync(
    saveLocation: IStorageFolder,
    desiredName: String,
    option: NameCollisionOption,
    playlistFormat: PlaylistFormat
  ): IAsyncOperation[StorageFile] = js.native
  def saveAsync(): IAsyncAction = js.native
}

