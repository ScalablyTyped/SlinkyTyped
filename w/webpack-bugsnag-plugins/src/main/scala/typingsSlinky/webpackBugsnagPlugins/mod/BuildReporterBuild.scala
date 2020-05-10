package typingsSlinky.webpackBugsnagPlugins.mod

import typingsSlinky.webpackBugsnagPlugins.AnonProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildReporterBuild extends js.Object {
  /**
    * Your Bugsnag API key
    */
  var apiKey: String = js.native
  /**
    * The version of the application you are building (this should match the
    * `appVersion` configured in your notifier)
    */
  var appVersion: String = js.native
  /**
    * Automatically associate this build with any new error events and sessions
    * that are received for the releaseStage until a subsequent build
    * notification is received. If this is set to true and no `releaseStage`
    * is provided the build will be applied to 'production'. You should only use
    * this option if you aren’t able to set an `appVersion` in your notifier.
    */
  var autoAssignRelease: js.UndefOr[Boolean] = js.native
  /**
    * The name of the person/machine that created this build (defaults to the
    * result of the `whoami` command)
    */
  var builderName: js.UndefOr[String] = js.native
  /**
    * 'production', 'staging' etc. (leave blank if this build can be released to
    * different releaseStages)
    */
  var releaseStage: js.UndefOr[String] = js.native
  /**
    * An object describing the source control of the build (if not specified,
    * the module will attempt to detect source control information from .git, .
    * hg and the nearest package.json)
    */
  var sourceControl: js.UndefOr[AnonProvider] = js.native
}

object BuildReporterBuild {
  @scala.inline
  def apply(apiKey: String, appVersion: String): BuildReporterBuild = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildReporterBuild]
  }
  @scala.inline
  implicit class BuildReporterBuildOps[Self <: BuildReporterBuild] (val x: Self) extends AnyVal {
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
    def withAutoAssignRelease(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAssignRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAssignRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAssignRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builderName")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseStage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseStage")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceControl(value: AnonProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceControl")(js.undefined)
        ret
    }
  }
  
}

