package typingsSlinky.winrt.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitmapDecoder extends js.Object {
  var bitmapContainerProperties: BitmapPropertiesView = js.native
  var decoderInformation: BitmapCodecInformation = js.native
  var frameCount: Double = js.native
  def getFrameAsync(frameIndex: Double): IAsyncOperation[BitmapFrame] = js.native
  def getPreviewAsync(): IAsyncOperation[ImageStream] = js.native
}

object IBitmapDecoder {
  @scala.inline
  def apply(
    bitmapContainerProperties: BitmapPropertiesView,
    decoderInformation: BitmapCodecInformation,
    frameCount: Double,
    getFrameAsync: Double => IAsyncOperation[BitmapFrame],
    getPreviewAsync: () => IAsyncOperation[ImageStream]
  ): IBitmapDecoder = {
    val __obj = js.Dynamic.literal(bitmapContainerProperties = bitmapContainerProperties.asInstanceOf[js.Any], decoderInformation = decoderInformation.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], getFrameAsync = js.Any.fromFunction1(getFrameAsync), getPreviewAsync = js.Any.fromFunction0(getPreviewAsync))
    __obj.asInstanceOf[IBitmapDecoder]
  }
  @scala.inline
  implicit class IBitmapDecoderOps[Self <: IBitmapDecoder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitmapContainerProperties(value: BitmapPropertiesView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmapContainerProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoderInformation(value: BitmapCodecInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoderInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFrameAsync(value: Double => IAsyncOperation[BitmapFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrameAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPreviewAsync(value: () => IAsyncOperation[ImageStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviewAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

