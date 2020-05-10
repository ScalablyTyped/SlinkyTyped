package typingsSlinky.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeMenuOption extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[js.Array[TreeNode]] = js.native
  var initialState: js.UndefOr[String] = js.native
  var itemCreator: js.UndefOr[js.Function2[/* li */ JQuery | js.Object, /* item */ TreeNode, _]] = js.native
  var itemWrapper: js.UndefOr[Boolean] = js.native
}

object TreeMenuOption {
  @scala.inline
  def apply(): TreeMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMenuOption]
  }
  @scala.inline
  implicit class TreeMenuOptionOps[Self <: TreeMenuOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[TreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCreator(value: (/* li */ JQuery | js.Object, /* item */ TreeNode) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCreator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCreator")(js.undefined)
        ret
    }
    @scala.inline
    def withItemWrapper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemWrapper")(js.undefined)
        ret
    }
  }
  
}

