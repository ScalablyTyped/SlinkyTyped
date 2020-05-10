package typingsSlinky.semanticRelease.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * semantic-release options.
	 *
	 * Can be used to set any core option or plugin options.
	 * Each option will take precedence over options configured in the
	 * configuration file and shareable configurations.
	 */
@js.native
trait Options
  extends /**
		 * Any other options supported by plugins.
		 */
/* name */ StringDictionary[js.Any] {
  /**
  		 * The branch on which releases should happen.
  		 */
  var branch: js.UndefOr[String] = js.native
  /**
  		 * Set to false to skip Continuous Integration environment verifications.
  		 * This allows for making releases from a local machine.
  		 */
  var ci: js.UndefOr[Boolean] = js.native
  /**
  		 * Dry-run mode, skip publishing, print next version and release notes.
  		 */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
  		 * Specifies the list of plugins to use. Plugins will run in series, in
  		 * the order specified.
  		 *
  		 * If this option is not specified, then semantic-release will use a
  		 * default list of plugins.
  		 *
  		 * Configuration options for each plugin can be defined by wrapping the
  		 * name and an options object in an array.
  		 */
  var plugins: js.UndefOr[js.Array[PluginSpec]] = js.native
  /**
  		 * The Git repository URL, in any supported format.
  		 */
  var repositoryUrl: js.UndefOr[String] = js.native
  /**
  		 * The Git tag format used by semantic-release to identify releases.
  		 */
  var tagFormat: js.UndefOr[String] = js.native
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
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(js.undefined)
        ret
    }
    @scala.inline
    def withCi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ci")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[PluginSpec]): Self = {
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
    def withRepositoryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTagFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFormat")(js.undefined)
        ret
    }
  }
  
}

