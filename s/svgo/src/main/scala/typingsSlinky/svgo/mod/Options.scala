package typingsSlinky.svgo.mod

import typingsSlinky.svgo.svgoStrings.base64
import typingsSlinky.svgo.svgoStrings.enc
import typingsSlinky.svgo.svgoStrings.unenc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Output as Data URI string. */
  var datauri: js.UndefOr[base64 | enc | unenc] = js.native
  /** Precision of floating point numbers. Will be passed to each plugin that suppors this param. */
  var floatPrecision: js.UndefOr[Double] = js.native
  /** Use full set of plugins. */
  var full: js.UndefOr[Boolean] = js.native
  /** Options for rendering optimized SVG from AST. */
  var js2svg: js.UndefOr[Js2SvgOptions] = js.native
  /**
    * Individual plugin configurations.
    * For specific options, see plugin source in https://github.com/svg/svgo/tree/master/plugins.
    */
  var plugins: js.UndefOr[js.Array[PluginConfig]] = js.native
  /** Options for parsing original SVG into AST. */
  var svg2js: js.UndefOr[Svg2JsOptions] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatauri(value: base64 | enc | unenc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datauri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatauri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datauri")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(js.undefined)
        ret
    }
    @scala.inline
    def withJs2svg(value: Js2SvgOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js2svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJs2svg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("js2svg")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[PluginConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withSvg2js(value: Svg2JsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg2js")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvg2js: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg2js")(js.undefined)
        ret
    }
  }
  
}

