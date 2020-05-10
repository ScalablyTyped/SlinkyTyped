package typingsSlinky.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesOptions extends js.Object {
  var apiPath: js.UndefOr[String] = js.native
  var rawFilesPath: js.UndefOr[String] = js.native
  var useBasePath: js.UndefOr[Boolean] = js.native
}

object FilesOptions {
  @scala.inline
  def apply(): FilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilesOptions]
  }
  @scala.inline
  implicit class FilesOptionsOps[Self <: FilesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRawFilesPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawFilesPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawFilesPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawFilesPath")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBasePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBasePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBasePath")(js.undefined)
        ret
    }
  }
  
}

