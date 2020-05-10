package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStorageInfoSuccess extends js.Object {
  /**
    * 当前占用的空间大小, 单位 kb
    */
  var currentSize: js.UndefOr[Double] = js.native
  /**
    * 当前storage中所有的 key
    */
  var keys: js.UndefOr[js.Array[String]] = js.native
  /**
    * 限制的空间大小，单位kb
    */
  var limitSize: js.UndefOr[Double] = js.native
}

object GetStorageInfoSuccess {
  @scala.inline
  def apply(): GetStorageInfoSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStorageInfoSuccess]
  }
  @scala.inline
  implicit class GetStorageInfoSuccessOps[Self <: GetStorageInfoSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSize")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitSize")(js.undefined)
        ret
    }
  }
  
}

