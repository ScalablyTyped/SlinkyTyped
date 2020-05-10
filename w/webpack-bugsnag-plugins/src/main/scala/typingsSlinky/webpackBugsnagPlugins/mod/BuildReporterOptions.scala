package typingsSlinky.webpackBugsnagPlugins.mod

import typingsSlinky.webpackBugsnagPlugins.AnonDebug
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.debug
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.error
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.info
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildReporterOptions extends js.Object {
  /**
    * Post the build payload to a specified URL
    *
    * @default https://build.bugsnag.com
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * The minimum severity of log to output
    *
    * @default warn
    */
  var logLevel: js.UndefOr[debug | info | warn | error] = js.native
  /**
    * Provide a different logger object
    */
  var logger: js.UndefOr[AnonDebug] = js.native
  /**
    * The path to search for source control info
    *
    * @default process.cwd()
    */
  var path: js.UndefOr[String] = js.native
}

object BuildReporterOptions {
  @scala.inline
  def apply(): BuildReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildReporterOptions]
  }
  @scala.inline
  implicit class BuildReporterOptionsOps[Self <: BuildReporterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLogLevel(value: debug | info | warn | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: AnonDebug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
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
  }
  
}

