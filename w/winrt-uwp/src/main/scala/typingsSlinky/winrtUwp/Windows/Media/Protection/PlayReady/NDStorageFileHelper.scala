package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages PlayReady-ND storage files. */
trait NDStorageFileHelper extends js.Object {
  /**
    * Gets transmitter settings from the URLs associated with a StorageFile object if the URLs contain PlayReady-ND metadata.
    * @param file A storage file object that a media server has discovered.
    * @return The transmitter settings found in the storage file.
    */
  def getFileURLs(file: IStorageFile): IVector[String]
}

object NDStorageFileHelper {
  @scala.inline
  def apply(getFileURLs: IStorageFile => IVector[String]): NDStorageFileHelper = {
    val __obj = js.Dynamic.literal(getFileURLs = js.Any.fromFunction1(getFileURLs))
    __obj.asInstanceOf[NDStorageFileHelper]
  }
}

