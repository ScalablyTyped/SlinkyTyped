package typingsSlinky.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageCutter extends js.Object {
  def getData(): ImageData = js.native
  def resetImage(img: String): js.Any = js.native
}

object ImageCutter {
  @scala.inline
  def apply(getData: () => ImageData, resetImage: String => js.Any): ImageCutter = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), resetImage = js.Any.fromFunction1(resetImage))
    __obj.asInstanceOf[ImageCutter]
  }
  @scala.inline
  implicit class ImageCutterOps[Self <: ImageCutter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetData(value: () => ImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetImage(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetImage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

