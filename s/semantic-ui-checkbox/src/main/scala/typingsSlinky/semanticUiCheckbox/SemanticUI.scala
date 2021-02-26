package typingsSlinky.semanticUiCheckbox

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings.Param
import typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typingsSlinky.semanticUiCheckbox.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiCheckbox.anon.PartialPickImplkeyofImplChecked
import typingsSlinky.semanticUiCheckbox.anon.PartialPickImplkeyofImplInput
import typingsSlinky.semanticUiCheckbox.anon.PickImplbeforeChecked
import typingsSlinky.semanticUiCheckbox.anon.PickImplbeforeDeterminate
import typingsSlinky.semanticUiCheckbox.anon.PickImplbeforeIndetermina
import typingsSlinky.semanticUiCheckbox.anon.PickImplbeforeUnchecked
import typingsSlinky.semanticUiCheckbox.anon.PickImplchecked
import typingsSlinky.semanticUiCheckbox.anon.PickImplclassName
import typingsSlinky.semanticUiCheckbox.anon.PickImpldebug
import typingsSlinky.semanticUiCheckbox.anon.PickImpldisabled
import typingsSlinky.semanticUiCheckbox.anon.PickImplerror
import typingsSlinky.semanticUiCheckbox.anon.PickImplfireOnInit
import typingsSlinky.semanticUiCheckbox.anon.PickImplinput
import typingsSlinky.semanticUiCheckbox.anon.PickImpllabel
import typingsSlinky.semanticUiCheckbox.anon.PickImplname
import typingsSlinky.semanticUiCheckbox.anon.PickImplnamespace
import typingsSlinky.semanticUiCheckbox.anon.PickImplonChange
import typingsSlinky.semanticUiCheckbox.anon.PickImplonChecked
import typingsSlinky.semanticUiCheckbox.anon.PickImplonDeterminate
import typingsSlinky.semanticUiCheckbox.anon.PickImplonDisable
import typingsSlinky.semanticUiCheckbox.anon.PickImplonDisabled
import typingsSlinky.semanticUiCheckbox.anon.PickImplonEnable
import typingsSlinky.semanticUiCheckbox.anon.PickImplonEnabled
import typingsSlinky.semanticUiCheckbox.anon.PickImplonIndeterminate
import typingsSlinky.semanticUiCheckbox.anon.PickImplonUnchecked
import typingsSlinky.semanticUiCheckbox.anon.PickImplperformance
import typingsSlinky.semanticUiCheckbox.anon.PickImplradio
import typingsSlinky.semanticUiCheckbox.anon.PickImplreadOnly
import typingsSlinky.semanticUiCheckbox.anon.PickImplselector
import typingsSlinky.semanticUiCheckbox.anon.PickImplsilent
import typingsSlinky.semanticUiCheckbox.anon.PickImpluncheckable
import typingsSlinky.semanticUiCheckbox.anon.PickImplverbose
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`attach events`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`can change`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`can uncheck`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`is checked`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`is radio`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`is unchecked`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`set checked`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`set determinate`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`set disabled`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`set enabled`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`set indeterminate`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`set unchecked`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow check`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow determinate`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow indeterminate`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow uncheck`
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.beforeChecked
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.beforeDeterminate
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.beforeIndeterminate
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.beforeUnchecked
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.check
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.className
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.debug
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.destroy
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.determinate
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.enable
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.error
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.fireOnInit
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.indeterminate
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.name
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.namespace
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.onChange
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.onChecked
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.onDeterminate
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.onDisable
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.onDisabled
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.onEnable
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.onEnabled
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.onIndeterminate
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.onUnchecked
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.performance
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.selector
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.setting
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.silent
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.toggle
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.uncheck
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.uncheckable
import typingsSlinky.semanticUiCheckbox.semanticUiCheckboxStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Checkbox extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Attach checkbox events to another element
      */
    def apply(behavior: `attach events`, selector: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
    /**
      * Returns whether element is able to be changed
      */
    def apply(behavior: `can change`): Boolean = js.native
    /**
      * Returns whether element is able to be unchecked
      */
    def apply(behavior: `can uncheck`): Boolean = js.native
    /**
      * Returns whether element is currently checked
      */
    def apply(behavior: `is checked`): Boolean = js.native
    /**
      * Returns whether element is radio selection
      */
    def apply(behavior: `is radio`): Boolean = js.native
    /**
      * Returns whether element is not checked
      */
    def apply(behavior: `is unchecked`): Boolean = js.native
    /**
      * Set a checkbox state to checked without callbacks
      */
    def apply(behavior: `set checked`): JQuery = js.native
    /**
      * Set as determinate checkbox without callbacks
      */
    def apply(behavior: `set determinate`): JQuery = js.native
    /**
      * Disable interaction with a checkbox without callbacks
      */
    def apply(behavior: `set disabled`): JQuery = js.native
    /**
      * Enable interaction with a checkbox without callbacks
      */
    def apply(behavior: `set enabled`): JQuery = js.native
    /**
      * Set as indeterminate checkbox without callbacks
      */
    def apply(behavior: `set indeterminate`): JQuery = js.native
    /**
      * Set a checkbox state to unchecked without callbacks
      */
    def apply(behavior: `set unchecked`): JQuery = js.native
    /**
      * Returns whether element can be checked (checking if already checked or `beforeChecked` would cancel)
      */
    def apply(behavior: `should allow check`): Boolean = js.native
    /**
      * Returns whether element can be determinate (checking if already determinate or `beforeDeterminate` would cancel)
      */
    def apply(behavior: `should allow determinate`): Boolean = js.native
    /**
      * Returns whether element can be indeterminate (checking if already indeterminate or `beforeIndeterminate` would cancel)
      */
    def apply(behavior: `should allow indeterminate`): Boolean = js.native
    /**
      * Returns whether element can be unchecked (checking if already unchecked or `beforeUnchecked` would cancel)
      */
    def apply(behavior: `should allow uncheck`): Boolean = js.native
    /**
      * Set a checkbox state to checked
      */
    def apply(behavior: check): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Set as determinate checkbox
      */
    def apply(behavior: determinate): JQuery = js.native
    /**
      * Enable interaction with a checkbox
      */
    def apply(behavior: enable): JQuery = js.native
    /**
      * Set as indeterminate checkbox
      */
    def apply(behavior: indeterminate): JQuery = js.native
    def apply(behavior: setting, name: beforeChecked, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
    def apply(
      behavior: setting,
      name: beforeChecked,
      value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
    ): JQuery = js.native
    def apply(behavior: setting, name: beforeDeterminate, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
    def apply(
      behavior: setting,
      name: beforeDeterminate,
      value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
    ): JQuery = js.native
    def apply(behavior: setting, name: beforeIndeterminate, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
    def apply(
      behavior: setting,
      name: beforeIndeterminate,
      value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
    ): JQuery = js.native
    def apply(behavior: setting, name: beforeUnchecked, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`] = js.native
    def apply(
      behavior: setting,
      name: beforeUnchecked,
      value: js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]
    ): JQuery = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: fireOnInit, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: fireOnInit, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
    def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onChecked, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
    def apply(behavior: setting, name: onChecked, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onDeterminate, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
    def apply(behavior: setting, name: onDeterminate, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onDisabled, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
    def apply(behavior: setting, name: onDisabled, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onDisable, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
    def apply(behavior: setting, name: onDisable, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onEnabled, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
    def apply(behavior: setting, name: onEnabled, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onEnable, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
    def apply(behavior: setting, name: onEnable, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onIndeterminate, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
    def apply(
      behavior: setting,
      name: onIndeterminate,
      value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onUnchecked, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ HTMLInputElement, Unit] = js.native
    def apply(behavior: setting, name: onUnchecked, value: js.ThisFunction0[/* this */ HTMLInputElement, Unit]): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: uncheckable, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
    def apply(behavior: setting, name: uncheckable, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: uncheckable, value: auto): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: CheckboxSettings): JQuery = js.native
    /**
      * Switches a checkbox from current state
      */
    def apply(behavior: toggle): JQuery = js.native
    /**
      * Set a checkbox state to unchecked
      */
    def apply(behavior: uncheck): JQuery = js.native
    def apply(settings: CheckboxSettings): JQuery = js.native
    
    var settings: CheckboxSettings = js.native
  }
  object Checkbox {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'checked'
          */
        var checked: String = js.native
        
        /**
          * @default 'disabled'
          */
        var disabled: String = js.native
        
        /**
          * @default 'radio'
          */
        var radio: String = js.native
        
        /**
          * @default 'read-only'
          */
        var readOnly: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(checked: String, disabled: String, radio: String, readOnly: String): Impl = {
          val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReadOnly(value: String): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplchecked | PickImpldisabled | PickImplradio | PickImplreadOnly) with PartialPickImplkeyofImplChecked
    }
    type ClassNameSettings = Param
    
    /* Inlined semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings.Param */
    @js.native
    trait ErrorSettings extends StObject {
      
      var method: String with js.UndefOr[String] = js.native
    }
    object ErrorSettings {
      
      @scala.inline
      def apply(method: String with js.UndefOr[String]): ErrorSettings = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrorSettings]
      }
      
      @scala.inline
      implicit class ErrorSettingsMutableBuilder[Self <: ErrorSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethod(value: String with js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(method: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        var method: String with js.UndefOr[String] = js.native
      }
      object Param {
        
        @scala.inline
        def apply(method: String with js.UndefOr[String]): typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings.Param = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings.Param]
        }
        
        @scala.inline
        implicit class ParamMutableBuilder[Self <: typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings.Param] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String with js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object SelectorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'input[type=checkbox], input[type=radio]'
          */
        var input: String = js.native
        
        /**
          * @default 'label'
          */
        var label: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(input: String, label: String): Impl = {
          val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplinput | PickImpllabel) with PartialPickImplkeyofImplInput
    }
    type SelectorSettings = typingsSlinky.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings.Param
  }
  
  object CheckboxSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * Callback before a checkbox is checked. Can cancel change by returning false
        */
      def beforeChecked(): Unit | `false` = js.native
      
      /**
        * Callback before a checkbox is set to determinate. Can cancel change by returning false
        */
      def beforeDeterminate(): Unit | `false` = js.native
      
      /**
        * Callback before a checkbox is set to undeterminate. Can cancel change by returning false
        */
      def beforeIndeterminate(): Unit | `false` = js.native
      
      /**
        * Callback before a checkbox is unchecked. Can cancel change by returning false
        */
      def beforeUnchecked(): Unit | `false` = js.native
      
      /**
        * Class names used to determine element state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * Whether callbacks for checked status should be fired on init as well as change
        *
        * @default false
        */
      var fireOnInit: Boolean = js.native
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String = js.native
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String = js.native
      
      // endregion
      // region Callbacks
      /**
        * Callback after a checkbox is either checked or unchecked.
        */
      def onChange(): Unit = js.native
      
      /**
        * Callback after a checkbox is checked.
        */
      def onChecked(): Unit = js.native
      
      /**
        * Callback after a checkbox is set to determinate.
        */
      def onDeterminate(): Unit = js.native
      
      /**
        * Callback after a checkbox is disabled.
        */
      def onDisable(): Unit = js.native
      
      /**
        * Callback after a checkbox is disabled.
        *
        * @deprecated
        */
      def onDisabled(): Unit = js.native
      
      /**
        * Callback after a checkbox is enabled.
        */
      def onEnable(): Unit = js.native
      
      /**
        * Callback after a checkbox is enabled.
        *
        * @deprecated
        */
      def onEnabled(): Unit = js.native
      
      /**
        * Callback after a checkbox is set to undeterminate.
        */
      def onIndeterminate(): Unit = js.native
      
      /**
        * Callback after a checkbox is unchecked.
        */
      def onUnchecked(): Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      // endregion
      // region DOM Settings
      /**
        * Selectors used to find parts of a module
        */
      var selector: SelectorSettings = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      // region Behavior
      /**
        * Setting to true/false will determine whether an input will allow no selection. Auto will set disallow this behavior only for radio boxes
        *
        * @default 'auto'
        */
      var uncheckable: auto | Boolean = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        beforeChecked: () => Unit | `false`,
        beforeDeterminate: () => Unit | `false`,
        beforeIndeterminate: () => Unit | `false`,
        beforeUnchecked: () => Unit | `false`,
        className: ClassNameSettings,
        debug: Boolean,
        error: ErrorSettings,
        fireOnInit: Boolean,
        name: String,
        namespace: String,
        onChange: () => Unit,
        onChecked: () => Unit,
        onDeterminate: () => Unit,
        onDisable: () => Unit,
        onDisabled: () => Unit,
        onEnable: () => Unit,
        onEnabled: () => Unit,
        onIndeterminate: () => Unit,
        onUnchecked: () => Unit,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        uncheckable: auto | Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(beforeChecked = js.Any.fromFunction0(beforeChecked), beforeDeterminate = js.Any.fromFunction0(beforeDeterminate), beforeIndeterminate = js.Any.fromFunction0(beforeIndeterminate), beforeUnchecked = js.Any.fromFunction0(beforeUnchecked), className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fireOnInit = fireOnInit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onChecked = js.Any.fromFunction0(onChecked), onDeterminate = js.Any.fromFunction0(onDeterminate), onDisable = js.Any.fromFunction0(onDisable), onDisabled = js.Any.fromFunction0(onDisabled), onEnable = js.Any.fromFunction0(onEnable), onEnabled = js.Any.fromFunction0(onEnabled), onIndeterminate = js.Any.fromFunction0(onIndeterminate), onUnchecked = js.Any.fromFunction0(onUnchecked), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], uncheckable = uncheckable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBeforeChecked(value: () => Unit | `false`): Self = StObject.set(x, "beforeChecked", js.Any.fromFunction0(value))
        
        @scala.inline
        def setBeforeDeterminate(value: () => Unit | `false`): Self = StObject.set(x, "beforeDeterminate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setBeforeIndeterminate(value: () => Unit | `false`): Self = StObject.set(x, "beforeIndeterminate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setBeforeUnchecked(value: () => Unit | `false`): Self = StObject.set(x, "beforeUnchecked", js.Any.fromFunction0(value))
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFireOnInit(value: Boolean): Self = StObject.set(x, "fireOnInit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnChecked(value: () => Unit): Self = StObject.set(x, "onChecked", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnDeterminate(value: () => Unit): Self = StObject.set(x, "onDeterminate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnDisable(value: () => Unit): Self = StObject.set(x, "onDisable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnDisabled(value: () => Unit): Self = StObject.set(x, "onDisabled", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnEnable(value: () => Unit): Self = StObject.set(x, "onEnable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnEnabled(value: () => Unit): Self = StObject.set(x, "onEnabled", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnIndeterminate(value: () => Unit): Self = StObject.set(x, "onIndeterminate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnUnchecked(value: () => Unit): Self = StObject.set(x, "onUnchecked", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUncheckable(value: auto | Boolean): Self = StObject.set(x, "uncheckable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImpluncheckable | PickImplfireOnInit | PickImplonChange | PickImplonChecked | PickImplonIndeterminate | PickImplonDeterminate | PickImplonUnchecked | PickImplbeforeChecked | PickImplbeforeIndetermina | PickImplbeforeDeterminate | PickImplbeforeUnchecked | PickImplonEnable | PickImplonDisable | PickImplonEnabled | PickImplonDisabled | PickImplselector | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/checkbox.html#/settings}
    */
  type CheckboxSettings = typingsSlinky.semanticUiCheckbox.SemanticUI.CheckboxSettings.Param
}
