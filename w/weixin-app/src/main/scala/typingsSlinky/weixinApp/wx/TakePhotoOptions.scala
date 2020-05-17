package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.anon.TempImagePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TakePhotoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 成像质量，值为high, normal, low，默认normal */
  var quality: js.UndefOr[String] = js.native
  @JSName("success")
  var success_TakePhotoOptions: js.UndefOr[js.Function1[/* res */ TempImagePath, Unit]] = js.native
}

object TakePhotoOptions {
  @scala.inline
  def apply(): TakePhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakePhotoOptions]
  }
  @scala.inline
  implicit class TakePhotoOptionsOps[Self <: TakePhotoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ TempImagePath => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

