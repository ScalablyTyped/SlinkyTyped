package typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings

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
    * @default 'dimmable'
    */
  var dimmable: String = js.native
  /**
    * @default 'dimmed'
    */
  var dimmed: String = js.native
  /**
    * @default 'disabled'
    */
  var disabled: String = js.native
  /**
    * @default 'hide'
    */
  var hide: String = js.native
  /**
    * @default 'page'
    */
  var pageDimmer: String = js.native
  /**
    * @default 'show'
    */
  var show: String = js.native
  /**
    * @default 'transition'
    */
  var transition: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    active: String,
    dimmable: String,
    dimmed: String,
    disabled: String,
    hide: String,
    pageDimmer: String,
    show: String,
    transition: String
  ): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], dimmable = dimmable.asInstanceOf[js.Any], dimmed = dimmed.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], pageDimmer = pageDimmer.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
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
    def withDimmable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimmed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageDimmer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageDimmer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

