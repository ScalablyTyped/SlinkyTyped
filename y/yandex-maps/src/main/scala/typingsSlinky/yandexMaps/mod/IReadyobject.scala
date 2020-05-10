package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReadyobject extends js.Object {
  var context: js.UndefOr[js.Object] = js.native
  var errorCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var require: js.UndefOr[js.Array[String]] = js.native
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.native
}

object IReadyobject {
  @scala.inline
  def apply(): IReadyobject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadyobject]
  }
  @scala.inline
  implicit class IReadyobjectOps[Self <: IReadyobject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutErrorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSuccessCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCallback")(js.undefined)
        ret
    }
  }
  
}

