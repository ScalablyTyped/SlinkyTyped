package typingsSlinky.standardVersion.mod

import org.scalajs.dom.experimental.URL
import typingsSlinky.conventionalChangelogConfigSpec.`210SchemaJsonMod`.Config
import typingsSlinky.node.Buffer
import typingsSlinky.standardVersion.mod.Options.Scripts
import typingsSlinky.standardVersion.mod.Options.Skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options_ extends Config {
  /**
    * @default
    * [
    *   'package-lock.json',
    *   'npm-shrinkwrap.json',
    *   'composer.lock'
    * ]
    */
  var bumpFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * Use a custom header when generating and updating changelog.
    *
    * @deprecated
    * This option will be removed in the next major version, please use `header`.
    */
  var changelogHeader: js.UndefOr[String] = js.native
  /**
    * Commit all staged changes, not just files affected by standard-version.
    *
    * @default
    * false
    */
  var commitAll: js.UndefOr[Boolean] = js.native
  /**
    * See the commands that running standard-version would run.
    *
    * @default
    * false
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * Is this the first release?
    *
    * @default
    * false
    */
  var firstRelease: js.UndefOr[Boolean] = js.native
  /**
    * Fallback to git tags for version, if no meta-information file is found (e.g.,
    * package.json).
    *
    * @default
    * true
    */
  var gitTagFallback: js.UndefOr[Boolean] = js.native
  /**
    * Read the CHANGELOG from this file.
    *
    * @default
    * 'CHANGELOG.md'
    */
  var infile: js.UndefOr[String | Buffer | URL | Double] = js.native
  /**
    * Commit message, replaces %s with new version.
    *
    * @deprecated
    * This option will be removed in the next major version, please use
    * `releaseCommitMessageFormat`.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Bypass pre-commit or commit-msg git hooks during the commit phase.
    *
    * @default
    * false
    */
  var noVerify: js.UndefOr[Boolean] = js.native
  /**
    * @default
    * [
    *   'package.json',
    *   'bower.json',
    *   'manifest.json',
    *   'composer.json'
    * ]
    */
  var packageFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only populate commits made under this path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Make a pre-release with optional option value to specify a tag id.
    */
  var prerelease: js.UndefOr[String] = js.native
  /**
    * Commit message guideline preset.
    *
    * @default
    * require.resolve('conventional-changelog-conventionalcommits')
    */
  var preset: js.UndefOr[String] = js.native
  /**
    * Specify the release type manually (like npm version <major|minor|patch>).
    */
  var releaseAs: js.UndefOr[String] = js.native
  /**
    * Provide scripts to execute for lifecycle events (prebump, precommit, etc.,).
    *
    * @default
    * {}
    */
  var scripts: js.UndefOr[Scripts] = js.native
  /**
    * Should the git commit and tag be signed?
    *
    * @default
    * false
    */
  var sign: js.UndefOr[Boolean] = js.native
  /**
    * Don't print logs and errors.
    *
    * @default
    * false
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Map of steps in the release process that should be skipped.
    *
    * @default
    * {}
    */
  var skip: js.UndefOr[Skip] = js.native
  /**
    * Set a custom prefix for the git tag to be created.
    *
    * @default
    * 'v'
    */
  var tagPrefix: js.UndefOr[String] = js.native
}

object Options_ {
  @scala.inline
  def apply(): Options_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_]
  }
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBumpFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBumpFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bumpFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withChangelogHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changelogHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangelogHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changelogHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitAll")(js.undefined)
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
    def withFirstRelease(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withGitTagFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitTagFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitTagFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gitTagFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withInfileURL(value: URL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfile(value: String | Buffer | URL | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infile")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withNoVerify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noVerify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noVerify")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageFiles")(js.undefined)
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
    @scala.inline
    def withPrerelease(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrerelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerelease")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseAs")(js.undefined)
        ret
    }
    @scala.inline
    def withScripts(value: Scripts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(js.undefined)
        ret
    }
    @scala.inline
    def withSign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Skip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withTagPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagPrefix")(js.undefined)
        ret
    }
  }
  
}

