package typingsSlinky.vanillaModal.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VanillaModalConfig extends js.Object {
  var `class`: js.UndefOr[String] = js.native
  var clickOutside: js.UndefOr[Boolean] = js.native
  var close: js.UndefOr[String] = js.native
  var closeKeys: js.UndefOr[js.Array[js.UndefOr[Double]] | Boolean] = js.native
  var loadClass: js.UndefOr[String] = js.native
  var modal: js.UndefOr[String | HTMLElement] = js.native
  var modalContent: js.UndefOr[String] = js.native
  var modalInner: js.UndefOr[String] = js.native
  var onBeforeClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
  var onBeforeOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
  var onClose: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
  var onOpen: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
  var open: js.UndefOr[String] = js.native
  var page: js.UndefOr[String] = js.native
  var transitionEnd: js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]] = js.native
  var transitions: js.UndefOr[String] = js.native
}

object VanillaModalConfig {
  @scala.inline
  def apply(): VanillaModalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VanillaModalConfig]
  }
  @scala.inline
  implicit class VanillaModalConfigOps[Self <: VanillaModalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withClickOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseKeys(value: js.Array[js.UndefOr[Double]] | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadClass")(js.undefined)
        ret
    }
    @scala.inline
    def withModalHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModal(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withModalContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalContent")(js.undefined)
        ret
    }
    @scala.inline
    def withModalInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalInner")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeClose(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeOpen(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionEnd(value: () => js.UndefOr[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(js.undefined)
        ret
    }
  }
  
}

