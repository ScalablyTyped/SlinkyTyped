package typingsSlinky.whyDidYouUpdate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var collapseComponentGroups: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[js.RegExp] = js.native
  var groupByComment: js.UndefOr[Boolean] = js.native
  var include: js.UndefOr[js.RegExp] = js.native
  var notifier: js.UndefOr[
    js.Function4[
      /* groupByComponent */ Boolean, 
      /* collapseComponentGroups */ Boolean, 
      /* displayName */ String, 
      /* diffs */ js.Array[Diffs], 
      Unit
    ]
  ] = js.native
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
    def withCollapseComponentGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseComponentGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseComponentGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseComponentGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByComment")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifier(
      value: (/* groupByComponent */ Boolean, /* collapseComponentGroups */ Boolean, /* displayName */ String, /* diffs */ js.Array[Diffs]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifier")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutNotifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifier")(js.undefined)
        ret
    }
  }
  
}

