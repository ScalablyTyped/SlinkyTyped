package typingsSlinky.uifabricUtilities.warnControlledUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWarnControlledUsageParams[P] extends js.Object {
  /** ID of the component instance. Used to prevent showing warnings repeatedly. */
  var componentId: String = js.native
  /** Name of the component class. */
  var componentName: String = js.native
  /** Name of the prop for the uncontrolled initial value. */
  var defaultValueProp: /* keyof P */ String = js.native
  /** Previous props to evaluate (undefined if called in the constructor). */
  var oldProps: js.UndefOr[P] = js.native
  /** Name of the change handler prop. */
  var onChangeProp: /* keyof P */ String = js.native
  /** Current props to evaluate. */
  var props: P = js.native
  /** Name of the read-only prop. */
  var readOnlyProp: js.UndefOr[/* keyof P */ String] = js.native
  /** Name of the prop for the controlled value. */
  var valueProp: /* keyof P */ String = js.native
}

object IWarnControlledUsageParams {
  @scala.inline
  def apply[P](
    componentId: String,
    componentName: String,
    defaultValueProp: /* keyof P */ String,
    onChangeProp: /* keyof P */ String,
    props: P,
    valueProp: /* keyof P */ String
  ): IWarnControlledUsageParams[P] = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], defaultValueProp = defaultValueProp.asInstanceOf[js.Any], onChangeProp = onChangeProp.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueProp = valueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWarnControlledUsageParams[P]]
  }
  @scala.inline
  implicit class IWarnControlledUsageParamsOps[Self[p] <: IWarnControlledUsageParams[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withComponentId(value: String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentName(value: String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValueProp(value: /* keyof P */ String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValueProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChangeProp(value: /* keyof P */ String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueProp(value: /* keyof P */ String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldProps(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldProps: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldProps")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnlyProp(value: /* keyof P */ String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnlyProp: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyProp")(js.undefined)
        ret
    }
  }
  
}

