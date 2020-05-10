package typingsSlinky.webpackBugsnagPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapUploaderOptions extends js.Object {
  /**
    * Your Bugsnag API key
    */
  var apiKey: String = js.native
  /**
    * The version of the application you are building
    */
  var appVersion: js.UndefOr[String] = js.native
  /**
    * Post the build payload to a URL other than the default
    *
    * @default https://upload.bugsnag.com
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * A list of bundle file extensions which shouldn't be uploaded
    *
    * @default ['.css']
    */
  var ignoredBundleExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether you want to overwrite previously uploaded sourcemaps
    */
  var overwrite: js.UndefOr[Boolean] = js.native
  /**
    * The path to your bundled assets (as the browser will see them).
    * This option must either be provided here, or as `output.publicPath` in
    * your Webpack config.
    *
    * @default output.publicPath
    */
  var publicPath: js.UndefOr[String] = js.native
}

object SourceMapUploaderOptions {
  @scala.inline
  def apply(apiKey: String): SourceMapUploaderOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapUploaderOptions]
  }
  @scala.inline
  implicit class SourceMapUploaderOptionsOps[Self <: SourceMapUploaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoredBundleExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredBundleExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoredBundleExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredBundleExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPath(value: String): Self = {
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
  }
  
}

