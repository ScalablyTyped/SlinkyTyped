package typingsSlinky.uglifyJs.mod

import typingsSlinky.uglifyJs.uglifyJsBooleans.`false`
import typingsSlinky.uglifyJs.uglifyJsStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinifyOptions extends js.Object {
  /**
    * Pass `false` to skip compressing entirely.
    * Pass an object to specify custom compress options.
    * @default {}
    */
  var compress: js.UndefOr[`false` | CompressOptions] = js.native
  /**
    * Set to true to support IE8
    * @default false
    */
  var ie8: js.UndefOr[Boolean] = js.native
  /**
    * Pass true to prevent discarding or mangling of function names.
    * Useful for code relying on Function.prototype.name.
    * @default false
    */
  var keep_fnames: js.UndefOr[Boolean] = js.native
  /**
    * Pass `false` to skip mangling names,
    * or pass an object to specify mangle options (see below).
    * @default true
    */
  var mangle: js.UndefOr[Boolean | MangleOptions] = js.native
  /**
    * Pass an empty object {} or a previously used nameCache object
    * if you wish to cache mangled variable and property names across multiple invocations of minify().
    * Note: this is a read/write property. `minify()` will read the name cache state of this object
    * and update it during minification so that it may be reused or externally persisted by the user
    */
  var nameCache: js.UndefOr[js.Object] = js.native
  /**
    * Pass an object if you wish to specify additional output options.
    * The defaults are optimized for best compression
    */
  var output: js.UndefOr[OutputOptions] = js.native
  /**
    * Pass an object if you wish to specify some additional parse options.
    */
  var parse: js.UndefOr[ParseOptions] = js.native
  /**
    * Pass an object if you wish to specify source map options.
    * @default false
    */
  var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.native
  /**
    * Set to `true` if you wish to enable top level variable and function name mangling
    * and to drop unused variables and functions.
    * @default false
    */
  var toplevel: js.UndefOr[Boolean] = js.native
  /**
    * Pass `true` to return compressor warnings in result.warnings.
    * Use the value `verbose` for more detailed warnings.
    * @default false
    */
  var warnings: js.UndefOr[Boolean | verbose] = js.native
}

object MinifyOptions {
  @scala.inline
  def apply(): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinifyOptions]
  }
  @scala.inline
  implicit class MinifyOptionsOps[Self <: MinifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompress(value: `false` | CompressOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withIe8(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIe8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie8")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_fnames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_fnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_fnames")(js.undefined)
        ret
    }
    @scala.inline
    def withMangle(value: Boolean | MangleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mangle")(js.undefined)
        ret
    }
    @scala.inline
    def withNameCache(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameCache")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: OutputOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: ParseOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMap(value: Boolean | SourceMapOptions): Self = {
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
    def withToplevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toplevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToplevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toplevel")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: Boolean | verbose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

