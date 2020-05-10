package typingsSlinky.uifabricFoundation.libIslotsMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlotOptions[TProps] extends js.Object {
  var component: js.UndefOr[ReactElement] = js.native
  var render: js.UndefOr[ISlotRender[TProps]] = js.native
}

object ISlotOptions {
  @scala.inline
  def apply[TProps](): ISlotOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlotOptions[TProps]]
  }
  @scala.inline
  implicit class ISlotOptionsOps[Self[tprops] <: ISlotOptions[tprops], TProps] (val x: Self[TProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TProps] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TProps] with Other]
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[TProps]): Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[TProps]): Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactElement): Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: (/* props */ PropsWithChildren[TProps], /* defaultComponent */ ReactComponentClass[TProps]) => ReturnType[ReactComponentClass[TProps]]
    ): Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRender: Self[TProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

