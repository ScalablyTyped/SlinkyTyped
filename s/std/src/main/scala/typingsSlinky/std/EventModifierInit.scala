package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventModifierInit extends UIEventInit {
  var altKey: js.UndefOr[scala.Boolean] = js.native
  var ctrlKey: js.UndefOr[scala.Boolean] = js.native
  var metaKey: js.UndefOr[scala.Boolean] = js.native
  var modifierAltGraph: js.UndefOr[scala.Boolean] = js.native
  var modifierCapsLock: js.UndefOr[scala.Boolean] = js.native
  var modifierFn: js.UndefOr[scala.Boolean] = js.native
  var modifierFnLock: js.UndefOr[scala.Boolean] = js.native
  var modifierHyper: js.UndefOr[scala.Boolean] = js.native
  var modifierNumLock: js.UndefOr[scala.Boolean] = js.native
  var modifierScrollLock: js.UndefOr[scala.Boolean] = js.native
  var modifierSuper: js.UndefOr[scala.Boolean] = js.native
  var modifierSymbol: js.UndefOr[scala.Boolean] = js.native
  var modifierSymbolLock: js.UndefOr[scala.Boolean] = js.native
  var shiftKey: js.UndefOr[scala.Boolean] = js.native
}

object EventModifierInit {
  @scala.inline
  def apply(): EventModifierInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventModifierInit]
  }
  @scala.inline
  implicit class EventModifierInitOps[Self <: EventModifierInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltKey(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCtrlKey(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaKey(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKey")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierAltGraph(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierAltGraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierAltGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierAltGraph")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierCapsLock(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierCapsLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierCapsLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierCapsLock")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierFn(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierFn")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierFnLock(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierFnLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierFnLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierFnLock")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierHyper(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierHyper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierHyper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierHyper")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierNumLock(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierNumLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierNumLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierNumLock")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierScrollLock(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierScrollLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierScrollLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierScrollLock")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierSuper(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierSuper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierSuper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierSuper")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierSymbol(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withModifierSymbolLock(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierSymbolLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifierSymbolLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifierSymbolLock")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftKey(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftKey")(js.undefined)
        ret
    }
  }
  
}

