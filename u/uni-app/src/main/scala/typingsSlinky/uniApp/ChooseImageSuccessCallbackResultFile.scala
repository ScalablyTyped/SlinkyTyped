package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseImageSuccessCallbackResultFile extends js.Object {
  /**
    * 本地文件路径
    */
  var path: js.UndefOr[String] = js.native
  /**
    * 本地文件大小，单位：B
    */
  var size: js.UndefOr[Double] = js.native
}

object ChooseImageSuccessCallbackResultFile {
  @scala.inline
  def apply(): ChooseImageSuccessCallbackResultFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageSuccessCallbackResultFile]
  }
  @scala.inline
  implicit class ChooseImageSuccessCallbackResultFileOps[Self <: ChooseImageSuccessCallbackResultFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

