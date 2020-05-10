package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBeaconsRes extends js.Object {
  /**
    * 接口调用成功的回调函数
    */
  var beacons: js.UndefOr[js.Array[Beacon]] = js.native
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
}

object GetBeaconsRes {
  @scala.inline
  def apply(): GetBeaconsRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBeaconsRes]
  }
  @scala.inline
  implicit class GetBeaconsResOps[Self <: GetBeaconsRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeacons(value: js.Array[Beacon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeacons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacons")(js.undefined)
        ret
    }
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(js.undefined)
        ret
    }
  }
  
}

