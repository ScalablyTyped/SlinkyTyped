package typingsSlinky.weappApi.mod.wx

import typingsSlinky.weappApi.anon.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScaleOptions extends CommonCallbackOptions {
  @JSName("success")
  var success_GetScaleOptions: js.UndefOr[js.Function1[/* callback */ js.Function1[/* res */ Scale, Unit], Unit]] = js.native
}

object GetScaleOptions {
  @scala.inline
  def apply(): GetScaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetScaleOptions]
  }
  @scala.inline
  implicit class GetScaleOptionsOps[Self <: GetScaleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* callback */ js.Function1[/* res */ Scale, Unit] => Unit): Self = {
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

