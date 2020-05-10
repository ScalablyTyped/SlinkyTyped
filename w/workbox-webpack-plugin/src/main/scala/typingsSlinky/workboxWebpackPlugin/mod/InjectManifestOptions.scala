package typingsSlinky.workboxWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectManifestOptions extends CommonOptions {
  /**
  	 * When true (the default), the swSrc file will be compiled by webpack.
  	 * When false, compilation will not occur (and webpackCompilationPlugins can't be used.)
  	 * Set to false if you want to inject the manifest into, e.g., a JSON file
  	 * @default true
  	 */
  var compileSrc: js.UndefOr[Boolean] = js.native
  /**
  	 * The path to the source service worker file that can contain your own customized code, in addition to containing a match for `injectionPointRegexp`.
  	 *
  	 * Your service worker file should reference the `self.__precacheManifest` variable to obtain a list of
  	 * [`ManifestEntrys`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-build#.ManifestEntry) obtained as part of the compilation:
  	 * `workbox.precaching.precacheAndRoute(self.__precacheManifest)`.
  	 *
  	 * @example swSrc: path.join('src', 'sw.js')
  	 */
  var swSrc: String = js.native
  /**
  	 * Optional webpack plugins that will be used when compiling the swSrc input file
  	 */
  var webpackCompilationPlugins: js.UndefOr[js.Array[_]] = js.native
}

object InjectManifestOptions {
  @scala.inline
  def apply(swSrc: String): InjectManifestOptions = {
    val __obj = js.Dynamic.literal(swSrc = swSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectManifestOptions]
  }
  @scala.inline
  implicit class InjectManifestOptionsOps[Self <: InjectManifestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSwSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompileSrc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompileSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withWebpackCompilationPlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpackCompilationPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebpackCompilationPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpackCompilationPlugins")(js.undefined)
        ret
    }
  }
  
}

