package typingsSlinky.webpackConcatPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uglifyJs.mod.MinifyOptions
import typingsSlinky.webpackConcatPlugin.webpackConcatPluginStrings.append
import typingsSlinky.webpackConcatPlugin.webpackConcatPluginStrings.none
import typingsSlinky.webpackConcatPlugin.webpackConcatPluginStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** if set, will be used as the extra attributes of the script tag. */
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** if set, will be used as the output fileName */
  var fileName: js.UndefOr[String] = js.native
  /**
    * supported path patterns:
    * - normal path
    * - npm packages
    * - glob
    */
  var filesToConcat: js.Array[String | js.Array[String]] = js.native
  /**
    * how to auto inject to html-webpack-plugin
    * (only if html-webpack-plugin set inject option not to be false)
    */
  var injectType: js.UndefOr[prepend | append | none] = js.native
  /** it's useful when you want to inject to html-webpack-plugin manully */
  var name: js.UndefOr[String] = js.native
  /** if set, will be used as the output directory of the file. */
  var outputPath: js.UndefOr[String] = js.native
  /**
    * if set, will be used as the public path of the script tag.
    * if set to false, will use relativePath.
    */
  var publicPath: js.UndefOr[String | Boolean] = js.native
  /** if true, will output sourcemap */
  var sourceMap: js.UndefOr[Boolean] = js.native
  /**
    * if true the output file will be uglified
    * or set uglifyjs options to customize the output
    */
  var uglify: js.UndefOr[Boolean | MinifyOptions] = js.native
}

object Options {
  @scala.inline
  def apply(filesToConcat: js.Array[String | js.Array[String]]): Options = {
    val __obj = js.Dynamic.literal(filesToConcat = filesToConcat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilesToConcat(value: js.Array[String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesToConcat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectType(value: prepend | append | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withOutputPath(value: String): Self = {
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
    def withPublicPath(value: String | Boolean): Self = {
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
    def withSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withUglify(value: Boolean | MinifyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uglify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUglify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uglify")(js.undefined)
        ret
    }
  }
  
}

