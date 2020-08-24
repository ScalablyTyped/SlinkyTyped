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
  implicit class ISlotOptionsOps[Self <: ISlotOptions[_], TProps] (val x: Self with ISlotOptions[TProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[TProps]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[TProps]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: ReactElement): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setRender(
      value: (/* props */ PropsWithChildren[TProps], /* defaultComponent */ ReactComponentClass[TProps]) => ReturnType[ReactComponentClass[TProps]]
    ): Self = this.set("render", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

