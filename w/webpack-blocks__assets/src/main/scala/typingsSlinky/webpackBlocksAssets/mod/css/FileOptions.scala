package typingsSlinky.webpackBlocksAssets.mod.css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileOptions extends js.Object {
  var context: js.UndefOr[String] = js.native
  var emitFile: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String | NameFunction] = js.native
  var outputPath: js.UndefOr[String | PathFunction] = js.native
  var postTransformPublicPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
  var publicPath: js.UndefOr[String | PathFunction] = js.native
  var regExp: js.UndefOr[js.RegExp] = js.native
}

object FileOptions {
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: String): Self = {
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
    def withEmitFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitFile")(js.undefined)
        ret
    }
    @scala.inline
    def withNameFunction1(value: /* file */ String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String | NameFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOutputPath(value: String | PathFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPostTransformPublicPath(value: /* p */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTransformPublicPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostTransformPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTransformPublicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPublicPath(value: String | PathFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(js.undefined)
        ret
    }
  }
  
}

