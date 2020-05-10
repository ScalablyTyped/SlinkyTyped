package typingsSlinky.uifabricFoundation.controlledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControlledStateOptions[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */] extends js.Object {
  var defaultPropName: js.UndefOr[TDefaultProp] = js.native
  var defaultPropValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ] = js.native
}

object IControlledStateOptions {
  @scala.inline
  def apply[TProps, TProp, TDefaultProp](): IControlledStateOptions[TProps, TProp, TDefaultProp] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IControlledStateOptions[TProps, TProp, TDefaultProp]]
  }
  @scala.inline
  implicit class IControlledStateOptionsOps[Self[tprops, tprop, tdefaultprop] <: IControlledStateOptions[tprops, tprop, tdefaultprop], TProps, TProp, TDefaultProp] (val x: Self[TProps, TProp, TDefaultProp]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProps, TProp, TDefaultProp] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProps, TProp, TDefaultProp]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TProps, TProp, TDefaultProp]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TProps, TProp, TDefaultProp]) with Other]
    @scala.inline
    def withDefaultPropName(value: TDefaultProp): Self[TProps, TProp, TDefaultProp] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPropName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPropName: Self[TProps, TProp, TDefaultProp] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPropName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPropValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ): Self[TProps, TProp, TDefaultProp] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPropValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPropValue: Self[TProps, TProp, TDefaultProp] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPropValue")(js.undefined)
        ret
    }
  }
  
}

