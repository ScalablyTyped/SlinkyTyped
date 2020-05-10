package typingsSlinky.winrt.Windows.Media.MediaProperties

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaEncodingProfileStatics extends js.Object {
  def createFromFileAsync(file: IStorageFile): IAsyncOperation[MediaEncodingProfile] = js.native
  def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[MediaEncodingProfile] = js.native
  def createM4a(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  def createMp3(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  def createMp4(quality: VideoEncodingQuality): MediaEncodingProfile = js.native
  def createWma(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  def createWmv(quality: VideoEncodingQuality): MediaEncodingProfile = js.native
}

object IMediaEncodingProfileStatics {
  @scala.inline
  def apply(
    createFromFileAsync: IStorageFile => IAsyncOperation[MediaEncodingProfile],
    createFromStreamAsync: IRandomAccessStream => IAsyncOperation[MediaEncodingProfile],
    createM4a: AudioEncodingQuality => MediaEncodingProfile,
    createMp3: AudioEncodingQuality => MediaEncodingProfile,
    createMp4: VideoEncodingQuality => MediaEncodingProfile,
    createWma: AudioEncodingQuality => MediaEncodingProfile,
    createWmv: VideoEncodingQuality => MediaEncodingProfile
  ): IMediaEncodingProfileStatics = {
    val __obj = js.Dynamic.literal(createFromFileAsync = js.Any.fromFunction1(createFromFileAsync), createFromStreamAsync = js.Any.fromFunction1(createFromStreamAsync), createM4a = js.Any.fromFunction1(createM4a), createMp3 = js.Any.fromFunction1(createMp3), createMp4 = js.Any.fromFunction1(createMp4), createWma = js.Any.fromFunction1(createWma), createWmv = js.Any.fromFunction1(createWmv))
    __obj.asInstanceOf[IMediaEncodingProfileStatics]
  }
  @scala.inline
  implicit class IMediaEncodingProfileStaticsOps[Self <: IMediaEncodingProfileStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateFromFileAsync(value: IStorageFile => IAsyncOperation[MediaEncodingProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromFileAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateFromStreamAsync(value: IRandomAccessStream => IAsyncOperation[MediaEncodingProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromStreamAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateM4a(value: AudioEncodingQuality => MediaEncodingProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createM4a")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateMp3(value: AudioEncodingQuality => MediaEncodingProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMp3")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateMp4(value: VideoEncodingQuality => MediaEncodingProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMp4")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateWma(value: AudioEncodingQuality => MediaEncodingProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWma")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateWmv(value: VideoEncodingQuality => MediaEncodingProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWmv")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

