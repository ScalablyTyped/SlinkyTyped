package typingsSlinky.standardVersion.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scripts extends js.Object {
  /**
    * Executed after the version is bumped.
    */
  var postbump: js.UndefOr[String] = js.native
  /**
    * Executes after the CHANGELOG is generated.
    */
  var postchangelog: js.UndefOr[String] = js.native
  /**
    * Called after the commit step.
    */
  var postcommit: js.UndefOr[String] = js.native
  /**
    * Called after the tagging step.
    */
  var posttag: js.UndefOr[String] = js.native
  /**
    * Executed before the version is bumped. If the `prebump` script returns a
    * version #, it will be used rather than the version calculated by
    * `standard-version`.
    */
  var prebump: js.UndefOr[String] = js.native
  /**
    * Executes before the CHANGELOG is generated.
    */
  var prechangelog: js.UndefOr[String] = js.native
  /**
    * Called before the commit step.
    */
  var precommit: js.UndefOr[String] = js.native
  /**
    * Executed before anything happens. If the `prerelease` script returns a
    * non-zero exit code, versioning will be aborted, but it has no other effect on
    * the process.
    */
  var prerelease: js.UndefOr[String] = js.native
  /**
    * Called before the tagging step.
    */
  var pretag: js.UndefOr[String] = js.native
}

object Scripts {
  @scala.inline
  def apply(): Scripts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scripts]
  }
  @scala.inline
  implicit class ScriptsOps[Self <: Scripts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostbump(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postbump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostbump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postbump")(js.undefined)
        ret
    }
    @scala.inline
    def withPostchangelog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postchangelog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostchangelog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postchangelog")(js.undefined)
        ret
    }
    @scala.inline
    def withPostcommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostcommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postcommit")(js.undefined)
        ret
    }
    @scala.inline
    def withPosttag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posttag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosttag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posttag")(js.undefined)
        ret
    }
    @scala.inline
    def withPrebump(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prebump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrebump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prebump")(js.undefined)
        ret
    }
    @scala.inline
    def withPrechangelog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prechangelog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrechangelog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prechangelog")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precommit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precommit")(js.undefined)
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
    def withPretag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretag")(js.undefined)
        ret
    }
  }
  
}

