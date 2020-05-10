package typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String = js.native
  /**
    * @default 'animating'
    */
  var animating: String = js.native
  /**
    * @default 'bottom'
    */
  var bottom: String = js.native
  /**
    * @default 'dimmed'
    */
  var dimmed: String = js.native
  /**
    * @default 'ios'
    */
  var ios: String = js.native
  /**
    * @default 'left'
    */
  var left: String = js.native
  /**
    * @default 'pushable'
    */
  var pushable: String = js.native
  /**
    * @default 'pushed'
    */
  var pushed: String = js.native
  /**
    * @default 'right'
    */
  var right: String = js.native
  /**
    * @default 'top'
    */
  var top: String = js.native
  /**
    * @default 'visible'
    */
  var visible: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    active: String,
    animating: String,
    bottom: String,
    dimmed: String,
    ios: String,
    left: String,
    pushable: String,
    pushed: String,
    right: String,
    top: String,
    visible: String
  ): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], dimmed = dimmed.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pushable = pushable.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimmed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

