package typingsSlinky.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImageEncodingPropertiesStatics extends js.Object {
  def createJpeg(): ImageEncodingProperties = js.native
  def createJpegXR(): ImageEncodingProperties = js.native
  def createPng(): ImageEncodingProperties = js.native
}

object IImageEncodingPropertiesStatics {
  @scala.inline
  def apply(
    createJpeg: () => ImageEncodingProperties,
    createJpegXR: () => ImageEncodingProperties,
    createPng: () => ImageEncodingProperties
  ): IImageEncodingPropertiesStatics = {
    val __obj = js.Dynamic.literal(createJpeg = js.Any.fromFunction0(createJpeg), createJpegXR = js.Any.fromFunction0(createJpegXR), createPng = js.Any.fromFunction0(createPng))
    __obj.asInstanceOf[IImageEncodingPropertiesStatics]
  }
  @scala.inline
  implicit class IImageEncodingPropertiesStaticsOps[Self <: IImageEncodingPropertiesStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateJpeg(value: () => ImageEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createJpeg")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateJpegXR(value: () => ImageEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createJpegXR")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreatePng(value: () => ImageEncodingProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPng")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

