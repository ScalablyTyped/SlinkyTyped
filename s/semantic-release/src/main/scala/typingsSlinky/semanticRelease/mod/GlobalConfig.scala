package typingsSlinky.semanticRelease.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * semantic-release options, after normalization and defaults have been
	 * applied.
	 */
@js.native
trait GlobalConfig extends Options {
  /**
  		 * The branch on which releases should happen.
  		 */
  @JSName("branch")
  var branch_GlobalConfig: String = js.native
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
  @JSName("plugins")
  var plugins_GlobalConfig: js.Array[PluginSpec] = js.native
  /**
  		 * The Git repository URL, in any supported format.
  		 */
  @JSName("repositoryUrl")
  var repositoryUrl_GlobalConfig: String = js.native
  /**
  		 * The Git tag format used by semantic-release to identify releases.
  		 */
  @JSName("tagFormat")
  var tagFormat_GlobalConfig: String = js.native
}

object GlobalConfig {
  @scala.inline
  def apply(branch: String, plugins: js.Array[PluginSpec], repositoryUrl: String, tagFormat: String): GlobalConfig = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], repositoryUrl = repositoryUrl.asInstanceOf[js.Any], tagFormat = tagFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
  @scala.inline
  implicit class GlobalConfigOps[Self <: GlobalConfig] (val x: Self) extends AnyVal {
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
    def withPlugins(value: js.Array[PluginSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

