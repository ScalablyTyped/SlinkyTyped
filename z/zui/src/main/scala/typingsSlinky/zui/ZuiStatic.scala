package typingsSlinky.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZuiStatic extends js.Object {
  var Color: ColorStatic = js.native
  var Messager: MessagerStatic = js.native
  var ModalTrigger: ModalTriggerStatic = js.native
  var colorset: ColorSet = js.native
  // $.zui.messager
  var messager: Messager = js.native
  var modalTrigger: ModalTrigger = js.native
  var store: StoreStatic = js.native
}

object ZuiStatic {
  @scala.inline
  def apply(
    Color: ColorStatic,
    Messager: MessagerStatic,
    ModalTrigger: ModalTriggerStatic,
    colorset: ColorSet,
    messager: Messager,
    modalTrigger: ModalTrigger,
    store: StoreStatic
  ): ZuiStatic = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Messager = Messager.asInstanceOf[js.Any], ModalTrigger = ModalTrigger.asInstanceOf[js.Any], colorset = colorset.asInstanceOf[js.Any], messager = messager.asInstanceOf[js.Any], modalTrigger = modalTrigger.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZuiStatic]
  }
  @scala.inline
  implicit class ZuiStaticOps[Self <: ZuiStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: ColorStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessager(value: MessagerStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModalTrigger(value: ModalTriggerStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModalTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorset(value: ColorSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore(value: StoreStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

