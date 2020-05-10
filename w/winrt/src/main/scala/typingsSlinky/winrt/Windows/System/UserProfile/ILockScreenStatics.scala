package typingsSlinky.winrt.Windows.System.UserProfile

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockScreenStatics extends js.Object {
  var originalImageFile: Uri = js.native
  def getImageStream(): IRandomAccessStream = js.native
  def setImageFileAsync(value: IStorageFile): IAsyncAction = js.native
  def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction = js.native
}

object ILockScreenStatics {
  @scala.inline
  def apply(
    getImageStream: () => IRandomAccessStream,
    originalImageFile: Uri,
    setImageFileAsync: IStorageFile => IAsyncAction,
    setImageStreamAsync: IRandomAccessStream => IAsyncAction
  ): ILockScreenStatics = {
    val __obj = js.Dynamic.literal(getImageStream = js.Any.fromFunction0(getImageStream), originalImageFile = originalImageFile.asInstanceOf[js.Any], setImageFileAsync = js.Any.fromFunction1(setImageFileAsync), setImageStreamAsync = js.Any.fromFunction1(setImageStreamAsync))
    __obj.asInstanceOf[ILockScreenStatics]
  }
  @scala.inline
  implicit class ILockScreenStaticsOps[Self <: ILockScreenStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetImageStream(value: () => IRandomAccessStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOriginalImageFile(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalImageFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetImageFileAsync(value: IStorageFile => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageFileAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImageStreamAsync(value: IRandomAccessStream => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageStreamAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

