package typingsSlinky.uifabricUtilities.customizerTypesMod

import slinky.core.facade.ReactRef
import typingsSlinky.uifabricUtilities.anon.ReadonlyICustomizerContex
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.customizationsMod.ISettings
import typingsSlinky.uifabricUtilities.customizationsMod.ISettingsFunction
import typingsSlinky.uifabricUtilities.customizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @uifabric/utilities.@uifabric/utilities/lib/BaseComponent.types.IBaseProps<any> & std.Partial<{  settings  :@uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettings | @uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettingsFunction,   scopedSettings  :@uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettings | @uifabric/utilities.@uifabric/utilities/lib/customizations/Customizations.ISettingsFunction}> & {contextTransform ? (context : std.Readonly<@uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext>): @uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext} */
@js.native
trait ICustomizerProps extends js.Object {
  var componentRef: js.UndefOr[IRefObject[_]] = js.native
  /**
    * Optional transform function for context. Any implementations should take care to return context without
    * mutating it.
    */
  var contextTransform: js.UndefOr[js.Function1[/* context */ ReadonlyICustomizerContex, ICustomizerContext]] = js.native
  var scopedSettings: js.UndefOr[ISettings | ISettingsFunction] = js.native
  var settings: js.UndefOr[ISettings | ISettingsFunction] = js.native
}

object ICustomizerProps {
  @scala.inline
  def apply(): ICustomizerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomizerProps]
  }
  @scala.inline
  implicit class ICustomizerPropsOps[Self <: ICustomizerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withContextTransform(value: /* context */ ReadonlyICustomizerContex => ICustomizerContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withScopedSettingsFunction1(value: /* settings */ ISettings => ISettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopedSettings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScopedSettings(value: ISettings | ISettingsFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopedSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopedSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopedSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsFunction1(value: /* settings */ ISettings => ISettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettings(value: ISettings | ISettingsFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
  }
  
}

