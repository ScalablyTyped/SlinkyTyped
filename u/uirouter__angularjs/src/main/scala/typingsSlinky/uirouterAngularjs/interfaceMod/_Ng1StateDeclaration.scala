package typingsSlinky.uirouterAngularjs.interfaceMod

import typingsSlinky.uirouterCore.stateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Ng1StateDeclaration extends StateDeclaration {
  @JSName("onEnter")
  var onEnter__Ng1StateDeclaration: js.UndefOr[js.Any] = js.native
  @JSName("onExit")
  var onExit__Ng1StateDeclaration: js.UndefOr[js.Any] = js.native
  @JSName("onRetain")
  var onRetain__Ng1StateDeclaration: js.UndefOr[js.Any] = js.native
  @JSName("views")
  var views__Ng1StateDeclaration: js.UndefOr[js.Any] = js.native
}

object _Ng1StateDeclaration {
  @scala.inline
  def apply(): _Ng1StateDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Ng1StateDeclaration]
  }
  @scala.inline
  implicit class _Ng1StateDeclarationOps[Self <: _Ng1StateDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnEnter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRetain(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRetain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRetain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRetain")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

