package typingsSlinky.semanticRelease.mod

import typingsSlinky.semanticRelease.semanticReleaseStrings.major
import typingsSlinky.semanticRelease.semanticReleaseStrings.minor
import typingsSlinky.semanticRelease.semanticReleaseStrings.patch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Details of a release published by a publish plugin.
	 */
@js.native
trait Release extends js.Object {
  /**
  		 * The sha of the last commit being part of the release.
  		 */
  var gitHead: String = js.native
  /**
  		 * The Git tag associated with the release.
  		 */
  var gitTag: String = js.native
  /**
  		 * The release name, only if set by the corresponding publish plugin.
  		 */
  var name: js.UndefOr[String] = js.native
  /**
  		 * The release notes for the release.
  		 */
  var notes: String = js.native
  /**
  		 * The name of the plugin that published the release.
  		 */
  var pluginName: String = js.native
  /**
  		 * The semver type of the release.
  		 */
  var `type`: patch | minor | major = js.native
  /**
  		 * The release URL, only if set by the corresponding publish plugin.
  		 */
  var url: js.UndefOr[String] = js.native
  /**
  		 * The version of the release.
  		 */
  var version: String = js.native
}

object Release {
  @scala.inline
  def apply(
    gitHead: String,
    gitTag: String,
    notes: String,
    pluginName: String,
    `type`: patch | minor | major,
    version: String
  ): Release = {
    val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Release]
  }
  @scala.inline
  implicit class ReleaseOps[Self <: Release] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGitHead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitHead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: patch | minor | major): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

