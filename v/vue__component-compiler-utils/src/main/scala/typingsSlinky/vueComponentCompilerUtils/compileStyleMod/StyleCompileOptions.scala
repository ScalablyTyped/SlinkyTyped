package typingsSlinky.vueComponentCompilerUtils.compileStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleCompileOptions extends js.Object {
  var filename: String = js.native
  var id: String = js.native
  var map: js.UndefOr[js.Any] = js.native
  var postcssOptions: js.UndefOr[js.Any] = js.native
  var postcssPlugins: js.UndefOr[js.Array[_]] = js.native
  var preprocessLang: js.UndefOr[String] = js.native
  var preprocessOptions: js.UndefOr[js.Any] = js.native
  var scoped: js.UndefOr[Boolean] = js.native
  var source: String = js.native
  var trim: js.UndefOr[Boolean] = js.native
}

object StyleCompileOptions {
  @scala.inline
  def apply(filename: String, id: String, source: String): StyleCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleCompileOptions]
  }
  @scala.inline
  implicit class StyleCompileOptionsOps[Self <: StyleCompileOptions] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withPostcssOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcssOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostcssOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcssOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPostcssPlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcssPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostcssPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcssPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocessLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessLang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreprocessLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessLang")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocessOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreprocessOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocessOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withScoped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScoped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoped")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

