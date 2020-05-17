package typingsSlinky.wegameApi.wx.types

import typingsSlinky.wegameApi.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RmdirParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var dirPath: String = js.native
  var fail: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.native
  var recursive: js.UndefOr[Boolean] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object RmdirParams {
  @scala.inline
  def apply(dirPath: String): RmdirParams = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmdirParams]
  }
  @scala.inline
  implicit class RmdirParamsOps[Self <: RmdirParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ ErrMsg => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
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

