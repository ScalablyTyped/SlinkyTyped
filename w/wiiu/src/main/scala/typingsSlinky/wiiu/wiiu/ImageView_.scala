package typingsSlinky.wiiu.wiiu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageView_ extends js.Object {
  var viewMode: Double = js.native
  def end(): Boolean = js.native
  def getErrorCode(): Double = js.native
}

object ImageView_ {
  @scala.inline
  def apply(end: () => Boolean, getErrorCode: () => Double, viewMode: Double): ImageView_ = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), getErrorCode = js.Any.fromFunction0(getErrorCode), viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageView_]
  }
  @scala.inline
  implicit class ImageView_Ops[Self <: ImageView_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetErrorCode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrorCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withViewMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

