package typingsSlinky.uifabricReactHooks

import typingsSlinky.std.Pick
import typingsSlinky.uifabricReactHooks.anon.Condition
import typingsSlinky.uifabricReactHooks.uifabricReactHooksStrings.defaultValueProp
import typingsSlinky.uifabricReactHooks.uifabricReactHooksStrings.onChangeProp
import typingsSlinky.uifabricReactHooks.uifabricReactHooksStrings.readOnlyProp
import typingsSlinky.uifabricReactHooks.uifabricReactHooksStrings.valueProp
import typingsSlinky.uifabricUtilities.warnControlledUsageMod.IWarnControlledUsageParams
import typingsSlinky.uifabricUtilities.warnWarnMod.ISettingsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useWarningsMod {
  
  @JSImport("@uifabric/react-hooks/lib/useWarnings", "useWarnings")
  @js.native
  def useWarnings[P](options: IWarningOptions[P]): Unit = js.native
  
  @js.native
  trait IWarningOptions[P] extends StObject {
    
    /** Warns when props are required if a condition is met */
    var conditionallyRequired: js.UndefOr[js.Array[Condition]] = js.native
    
    /**
      * Check for and warn on the following error conditions with a form component:
      * - A value prop is provided (indicated it's being used as controlled) without a change handler,
      *    and the component is not read-only
      * - Both the value and defaultValue props are provided
      * - The component is attempting to switch between controlled and uncontrolled
      *
      * The messages mimic the warnings React gives for these error conditions on input elements.
      * The warning will only be displayed once per component instance.
      */
    var controlledUsage: js.UndefOr[
        Pick[
          IWarnControlledUsageParams[P], 
          valueProp | defaultValueProp | onChangeProp | readOnlyProp
        ]
      ] = js.native
    
    /**
      * Warns when deprecated props are being used. Each key is a prop name and each value is
      * either undefined or a replacement prop name.
      */
    var deprecations: js.UndefOr[ISettingsMap[P]] = js.native
    
    /**
      * Warns when two props which are mutually exclusive are both being used.
      * The key is one prop name and the value is the other.
      */
    var mutuallyExclusive: js.UndefOr[ISettingsMap[P]] = js.native
    
    /** Name of the component */
    var name: String = js.native
    
    /** Generic messages */
    var other: js.UndefOr[js.Array[String]] = js.native
    
    /** Current component props */
    var props: P = js.native
  }
  object IWarningOptions {
    
    @scala.inline
    def apply[P](name: String, props: P): IWarningOptions[P] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWarningOptions[P]]
    }
    
    @scala.inline
    implicit class IWarningOptionsMutableBuilder[Self <: IWarningOptions[_], P] (val x: Self with IWarningOptions[P]) extends AnyVal {
      
      @scala.inline
      def setConditionallyRequired(value: js.Array[Condition]): Self = StObject.set(x, "conditionallyRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionallyRequiredUndefined: Self = StObject.set(x, "conditionallyRequired", js.undefined)
      
      @scala.inline
      def setConditionallyRequiredVarargs(value: Condition*): Self = StObject.set(x, "conditionallyRequired", js.Array(value :_*))
      
      @scala.inline
      def setControlledUsage(
        value: Pick[
              IWarnControlledUsageParams[P], 
              valueProp | defaultValueProp | onChangeProp | readOnlyProp
            ]
      ): Self = StObject.set(x, "controlledUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlledUsageUndefined: Self = StObject.set(x, "controlledUsage", js.undefined)
      
      @scala.inline
      def setDeprecations(value: ISettingsMap[P]): Self = StObject.set(x, "deprecations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecationsUndefined: Self = StObject.set(x, "deprecations", js.undefined)
      
      @scala.inline
      def setMutuallyExclusive(value: ISettingsMap[P]): Self = StObject.set(x, "mutuallyExclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutuallyExclusiveUndefined: Self = StObject.set(x, "mutuallyExclusive", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOther(value: js.Array[String]): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setOtherVarargs(value: String*): Self = StObject.set(x, "other", js.Array(value :_*))
      
      @scala.inline
      def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
