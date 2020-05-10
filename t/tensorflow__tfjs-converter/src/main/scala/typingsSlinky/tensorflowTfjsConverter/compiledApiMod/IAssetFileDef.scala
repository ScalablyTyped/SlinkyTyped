package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAssetFileDef extends js.Object {
  /** AssetFileDef filename */
  var filename: js.UndefOr[String | Null] = js.native
  /** AssetFileDef tensorInfo */
  var tensorInfo: js.UndefOr[ITensorInfo | Null] = js.native
}

object IAssetFileDef {
  @scala.inline
  def apply(): IAssetFileDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAssetFileDef]
  }
  @scala.inline
  implicit class IAssetFileDefOps[Self <: IAssetFileDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(null)
        ret
    }
    @scala.inline
    def withTensorInfo(value: ITensorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTensorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTensorInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensorInfo")(null)
        ret
    }
  }
  
}

