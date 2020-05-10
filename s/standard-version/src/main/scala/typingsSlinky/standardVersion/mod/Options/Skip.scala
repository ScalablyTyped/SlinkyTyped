package typingsSlinky.standardVersion.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<'bump' | 'changelog' | 'commit' | 'tag', boolean>> */
@js.native
trait Skip extends js.Object {
  var bump: js.UndefOr[Boolean] = js.native
  var changelog: js.UndefOr[Boolean] = js.native
  var commit: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[Boolean] = js.native
}

object Skip {
  @scala.inline
  def apply(): Skip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Skip]
  }
  @scala.inline
  implicit class SkipOps[Self <: Skip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBump(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBump: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bump")(js.undefined)
        ret
    }
    @scala.inline
    def withChangelog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changelog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangelog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changelog")(js.undefined)
        ret
    }
    @scala.inline
    def withCommit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

