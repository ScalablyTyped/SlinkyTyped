package typingsSlinky.styletronReact.mod

import slinky.core.ReactComponentClass
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyletronComponentInjectedProps[P /* <: js.Object */] extends js.Object {
  @JSName("$as")
  var $as: js.UndefOr[StyletronBase] = js.native
  @JSName("$style")
  var $style: js.UndefOr[StyleProp[P]] = js.native
}

object StyletronComponentInjectedProps {
  @scala.inline
  def apply[P](): StyletronComponentInjectedProps[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyletronComponentInjectedProps[P]]
  }
  @scala.inline
  implicit class StyletronComponentInjectedPropsOps[Self[p] <: StyletronComponentInjectedProps[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def with$asFunctionComponent(value: ReactComponentClass[js.Any]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$asComponentClass(value: ReactComponentClass[js.Any]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$as(value: StyletronBase): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$as: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$as")(js.undefined)
        ret
    }
    @scala.inline
    def with$styleFunction1(value: P => StyleObject): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with$style(value: StyleProp[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$style: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$style")(js.undefined)
        ret
    }
  }
  
}

