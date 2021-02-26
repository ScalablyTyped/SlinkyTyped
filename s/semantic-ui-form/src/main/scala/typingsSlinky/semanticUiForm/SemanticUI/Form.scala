package typingsSlinky.semanticUiForm.SemanticUI

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery.TriggeredEvent
import typingsSlinky.semanticUiForm.JQuery
import typingsSlinky.semanticUiForm.SemanticUI.Form.ClassNameSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.ClassNameSettings.Param
import typingsSlinky.semanticUiForm.SemanticUI.Form.ErrorSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.Field
import typingsSlinky.semanticUiForm.SemanticUI.Form.Fields
import typingsSlinky.semanticUiForm.SemanticUI.Form.MetadataSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.PromptSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.Rule
import typingsSlinky.semanticUiForm.SemanticUI.Form.Rules
import typingsSlinky.semanticUiForm.SemanticUI.Form.SelectorSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.TemplatesSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.TextSettings
import typingsSlinky.semanticUiForm.anon.PartialPickImplkeyofImplActive
import typingsSlinky.semanticUiForm.anon.PartialPickImplkeyofImplChecked
import typingsSlinky.semanticUiForm.anon.PartialPickImplkeyofImplError
import typingsSlinky.semanticUiForm.anon.PartialPickImplkeyofImplField
import typingsSlinky.semanticUiForm.anon.PartialPickImplkeyofImplUnspecifiedField
import typingsSlinky.semanticUiForm.anon.PickImplactive
import typingsSlinky.semanticUiForm.anon.PickImplchecked
import typingsSlinky.semanticUiForm.anon.PickImplcontain
import typingsSlinky.semanticUiForm.anon.PickImplcontainExactly
import typingsSlinky.semanticUiForm.anon.PickImplcreditCard
import typingsSlinky.semanticUiForm.anon.PickImpldecimal
import typingsSlinky.semanticUiForm.anon.PickImpldifferent
import typingsSlinky.semanticUiForm.anon.PickImpldisabled
import typingsSlinky.semanticUiForm.anon.PickImpldoesntContain
import typingsSlinky.semanticUiForm.anon.PickImpldoesntContainExac
import typingsSlinky.semanticUiForm.anon.PickImplemail
import typingsSlinky.semanticUiForm.anon.PickImplempty
import typingsSlinky.semanticUiForm.anon.PickImplerrorError
import typingsSlinky.semanticUiForm.anon.PickImplexactCount
import typingsSlinky.semanticUiForm.anon.PickImplexactLength
import typingsSlinky.semanticUiForm.anon.PickImplfield
import typingsSlinky.semanticUiForm.anon.PickImplgroup
import typingsSlinky.semanticUiForm.anon.PickImplinput
import typingsSlinky.semanticUiForm.anon.PickImplinteger
import typingsSlinky.semanticUiForm.anon.PickImplis
import typingsSlinky.semanticUiForm.anon.PickImplisExactly
import typingsSlinky.semanticUiForm.anon.PickImpllength
import typingsSlinky.semanticUiForm.anon.PickImplmatch
import typingsSlinky.semanticUiForm.anon.PickImplmaxCount
import typingsSlinky.semanticUiForm.anon.PickImplmaxLength
import typingsSlinky.semanticUiForm.anon.PickImplmessage
import typingsSlinky.semanticUiForm.anon.PickImplminCount
import typingsSlinky.semanticUiForm.anon.PickImplminLength
import typingsSlinky.semanticUiForm.anon.PickImplnot
import typingsSlinky.semanticUiForm.anon.PickImplnotExactly
import typingsSlinky.semanticUiForm.anon.PickImplnumber
import typingsSlinky.semanticUiForm.anon.PickImplplaceholder
import typingsSlinky.semanticUiForm.anon.PickImplpromptPrompt
import typingsSlinky.semanticUiForm.anon.PickImplpromptPromptString
import typingsSlinky.semanticUiForm.anon.PickImplregExp
import typingsSlinky.semanticUiForm.anon.PickImplsubmit
import typingsSlinky.semanticUiForm.anon.PickImplunspecifiedField
import typingsSlinky.semanticUiForm.anon.PickImplunspecifiedRule
import typingsSlinky.semanticUiForm.anon.PickImplurl
import typingsSlinky.semanticUiForm.anon.PickImplvisible
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`add errors`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`add field`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`add fields`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`add prompt`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`add rule`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`get change event`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`get field`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`get validation`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`get value`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`get values`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`has field`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`inline`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`is valid`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`remove field`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`remove fields`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`remove rule`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`remove rules`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`set value`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`set values`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.`validate form`
import typingsSlinky.semanticUiForm.semanticUiFormStrings.blur
import typingsSlinky.semanticUiForm.semanticUiFormStrings.change
import typingsSlinky.semanticUiForm.semanticUiFormStrings.className
import typingsSlinky.semanticUiForm.semanticUiFormStrings.debug
import typingsSlinky.semanticUiForm.semanticUiFormStrings.defaults
import typingsSlinky.semanticUiForm.semanticUiFormStrings.delay
import typingsSlinky.semanticUiForm.semanticUiFormStrings.destroy
import typingsSlinky.semanticUiForm.semanticUiFormStrings.duration
import typingsSlinky.semanticUiForm.semanticUiFormStrings.error
import typingsSlinky.semanticUiForm.semanticUiFormStrings.fields
import typingsSlinky.semanticUiForm.semanticUiFormStrings.keyboardShortcuts
import typingsSlinky.semanticUiForm.semanticUiFormStrings.metadata
import typingsSlinky.semanticUiForm.semanticUiFormStrings.name
import typingsSlinky.semanticUiForm.semanticUiFormStrings.namespace
import typingsSlinky.semanticUiForm.semanticUiFormStrings.on
import typingsSlinky.semanticUiForm.semanticUiFormStrings.onFailure
import typingsSlinky.semanticUiForm.semanticUiFormStrings.onInvalid
import typingsSlinky.semanticUiForm.semanticUiFormStrings.onSuccess
import typingsSlinky.semanticUiForm.semanticUiFormStrings.onValid
import typingsSlinky.semanticUiForm.semanticUiFormStrings.performance
import typingsSlinky.semanticUiForm.semanticUiFormStrings.prompt
import typingsSlinky.semanticUiForm.semanticUiFormStrings.revalidate
import typingsSlinky.semanticUiForm.semanticUiFormStrings.rules
import typingsSlinky.semanticUiForm.semanticUiFormStrings.selector
import typingsSlinky.semanticUiForm.semanticUiFormStrings.setting
import typingsSlinky.semanticUiForm.semanticUiFormStrings.silent
import typingsSlinky.semanticUiForm.semanticUiFormStrings.submit
import typingsSlinky.semanticUiForm.semanticUiFormStrings.templates
import typingsSlinky.semanticUiForm.semanticUiFormStrings.text
import typingsSlinky.semanticUiForm.semanticUiFormStrings.transition
import typingsSlinky.semanticUiForm.semanticUiFormStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Form extends StObject {
  
  def apply(): JQuery = js.native
  /**
    * Adds errors to form, given an array errors
    */
  def apply(behavior: `add errors`, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  def apply(behavior: `add field`, field: String, rules: String): JQuery = js.native
  def apply(behavior: `add field`, field: String, rules: js.Array[String]): JQuery = js.native
  def apply(behavior: `add field`, field: String, rules: Rules): JQuery = js.native
  /**
    * Adds fields object to existing fields
    * @since 2.2.11
    */
  def apply(behavior: `add fields`, fields: Fields): JQuery = js.native
  /**
    * Adds error prompt to the field with the given identifier
    */
  def apply(behavior: `add prompt`, identifier: String, errors: String): JQuery = js.native
  def apply(behavior: `add prompt`, identifier: String, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  def apply(behavior: `add rule`, field: String, rules: String): JQuery = js.native
  def apply(behavior: `add rule`, field: String, rules: js.Array[String]): JQuery = js.native
  def apply(behavior: `add rule`, field: String, rules: Rules): JQuery = js.native
  /**
    * gets browser property change event
    */
  def apply(behavior: `get change event`): String = js.native
  /**
    * Returns element with matching name, id, or data-validate metadata to ID
    */
  def apply(behavior: `get field`, id: String): JQuery = js.native
  /**
    * Returns validation rules for a given jQuery-referenced input field
    */
  def apply(behavior: `get validation`, element: JQuery): js.Any = js.native
  /**
    * Returns value of element with id
    */
  def apply(behavior: `get value`, id: String): js.Any = js.native
  /**
    * Returns object of element values that match array of ids. If no IDS are passed will return all fields
    */
  def apply(behavior: `get values`): js.Any = js.native
  def apply(behavior: `get values`, ids: js.Array[String]): js.Any = js.native
  /**
    * Returns whether a field exists
    */
  def apply(behavior: `has field`, identifier: String): Boolean = js.native
  /**
    * Returns true/false whether a form passes its validation rules
    */
  def apply(behavior: `is valid`): Boolean = js.native
  /**
    * Returns true/false whether a field passes its validation rules
    */
  def apply(behavior: `is valid`, field: String): Boolean = js.native
  /**
    * Remove all validation for a field
    * @since 2.2.11
    */
  def apply(behavior: `remove field`, field: String): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `remove fields`, fields: js.Array[String]): JQuery = js.native
  /**
    * Removes specific rule from field leaving other rules
    * @since 2.2.11
    */
  def apply(behavior: `remove rule`, field: String, rule: Rule): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `remove rules`, fields: String, rules: js.Array[Rule]): JQuery = js.native
  def apply(behavior: `remove rules`, fields: js.Array[String], rules: js.Array[Rule]): JQuery = js.native
  /**
    * Sets value of element with id
    */
  def apply(behavior: `set value`, id: String): JQuery = js.native
  /**
    * Sets key/value pairs from passed values object to matching ids
    */
  def apply(behavior: `set values`, values: js.Any): JQuery = js.native
  /**
    * Validates form and calls onSuccess or onFailure
    */
  def apply(behavior: `validate form`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, name: `inline`, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: `inline`, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: defaults, value: js.UndefOr[scala.Nothing]): StringDictionary[Field] = js.native
  def apply(behavior: setting, name: defaults, value: StringDictionary[Field]): JQuery = js.native
  def apply(behavior: setting, name: delay, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: delay, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: fields, value: js.UndefOr[scala.Nothing]): StringDictionary[String | js.Array[String] | Field] = js.native
  def apply(behavior: setting, name: fields, value: StringDictionary[String | js.Array[String] | Field]): JQuery = js.native
  def apply(behavior: setting, name: keyboardShortcuts, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: keyboardShortcuts, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: metadata, value: js.UndefOr[scala.Nothing]): MetadataSettings = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onFailure, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit] = js.native
  def apply(
    behavior: setting,
    name: onFailure,
    value: js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onInvalid, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onInvalid, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onSuccess, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[
    /* this */ JQuery, 
    /* event */ TriggeredEvent[HTMLElement, _, _, _], 
    /* fields */ js.Any, 
    Unit
  ] = js.native
  def apply(
    behavior: setting,
    name: onSuccess,
    value: js.ThisFunction2[
      /* this */ JQuery, 
      /* event */ TriggeredEvent[HTMLElement, _, _, _], 
      /* fields */ js.Any, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: onValid, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onValid, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): submit | blur | change = js.native
  def apply(behavior: setting, name: on, value: blur): JQuery = js.native
  def apply(behavior: setting, name: on, value: change): JQuery = js.native
  def apply(behavior: setting, name: on, value: submit): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: prompt, value: PromptSettings): JQuery = js.native
  def apply(behavior: setting, name: revalidate, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: revalidate, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: rules, value: js.UndefOr[scala.Nothing]): StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]] = js.native
  def apply(
    behavior: setting,
    name: rules,
    value: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]
  ): JQuery = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  def apply(behavior: setting, name: text, value: TextSettings): JQuery = js.native
  def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: FormSettings): JQuery = js.native
  /**
    * Submits selected form
    */
  def apply(behavior: submit): JQuery = js.native
  def apply(settings: Fields): JQuery = js.native
  def apply(settings: FormSettings): JQuery = js.native
  
  var settings: FormSettings = js.native
}
object Form {
  
  object ClassNameSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 'active'
        */
      var active: String = js.native
      
      /**
        * @default 'disabled'
        */
      var disabled: String = js.native
      
      /**
        * @default 'default'
        */
      var placeholder: String = js.native
      
      /**
        * @default 'visible'
        */
      var visible: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(active: String, disabled: String, placeholder: String, visible: String): Impl = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplactive | PickImplplaceholder | PickImpldisabled | PickImplvisible) with PartialPickImplkeyofImplActive
  }
  type ClassNameSettings = Param
  
  /* Inlined semantic-ui-form.SemanticUI.Form.ErrorSettings.Param */
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
    
    /* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.ErrorSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.ErrorSettings._Impl>> */
    @js.native
    trait Param extends StObject {
      
      var method: String with js.UndefOr[String] = js.native
    }
    object Param {
      
      @scala.inline
      def apply(method: String with js.UndefOr[String]): typingsSlinky.semanticUiForm.SemanticUI.Form.ErrorSettings.Param = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.semanticUiForm.SemanticUI.Form.ErrorSettings.Param]
      }
      
      @scala.inline
      implicit class ParamMutableBuilder[Self <: typingsSlinky.semanticUiForm.SemanticUI.Form.ErrorSettings.Param] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethod(value: String with js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait Field extends StObject {
    
    var identifier: String = js.native
    
    var optional: js.UndefOr[Boolean] = js.native
    
    var rules: js.Array[Rule] = js.native
  }
  object Field {
    
    @scala.inline
    def apply(identifier: String, rules: js.Array[Rule]): Field = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
  
  type Fields = StringDictionary[String | js.Array[String]]
  
  /* Inlined semantic-ui-form.SemanticUI.Form.MetadataSettings.Param */
  @js.native
  trait MetadataSettings extends StObject {
    
    var validate: String with js.UndefOr[String] = js.native
  }
  object MetadataSettings {
    
    @scala.inline
    def apply(validate: String with js.UndefOr[String]): MetadataSettings = {
      val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataSettings]
    }
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 'validate'
        */
      var validate: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(validate: String): Impl = {
        val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValidate(value: String): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class MetadataSettingsMutableBuilder[Self <: MetadataSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidate(value: String with js.UndefOr[String]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
    
    /* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl, 'validate'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl>> */
    @js.native
    trait Param extends StObject {
      
      var validate: String with js.UndefOr[String] = js.native
    }
    object Param {
      
      @scala.inline
      def apply(validate: String with js.UndefOr[String]): typingsSlinky.semanticUiForm.SemanticUI.Form.MetadataSettings.Param = {
        val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.semanticUiForm.SemanticUI.Form.MetadataSettings.Param]
      }
      
      @scala.inline
      implicit class ParamMutableBuilder[Self <: typingsSlinky.semanticUiForm.SemanticUI.Form.MetadataSettings.Param] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValidate(value: String with js.UndefOr[String]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object PromptSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default '{name} must be checked'
        */
      var checked: String = js.native
      
      /**
        * @default '{name} cannot contain \'{ruleValue}\''
        */
      var contain: String = js.native
      
      /**
        * @default '{name} cannot contain exactly \'{ruleValue}\''
        */
      var containExactly: String = js.native
      
      /**
        * @default '{name} must be a valid credit card number'
        */
      var creditCard: String = js.native
      
      /**
        * @default '{name} must be a decimal number'
        */
      var decimal: String = js.native
      
      /**
        * @default '{name} must have a different value than {ruleValue} field'
        */
      var different: String = js.native
      
      /**
        * @default '{name} must contain  \'{ruleValue}\''
        */
      var doesntContain: String = js.native
      
      /**
        * @default '{name} must contain exactly \'{ruleValue}\''
        */
      var doesntContainExactly: String = js.native
      
      /**
        * @default '{name} must be a valid e-mail'
        */
      var email: String = js.native
      
      /**
        * @default '{name} must have a value'
        */
      var empty: String = js.native
      
      /**
        * @default '{name} must have exactly {ruleValue} choices'
        */
      var exactCount: String = js.native
      
      /**
        * @default '{name} must be exactly {ruleValue} characters'
        */
      var exactLength: String = js.native
      
      /**
        * @default '{name} must be an integer'
        */
      var integer: String = js.native
      
      /**
        * @default '{name} must be \'{ruleValue}\''
        */
      var is: String = js.native
      
      /**
        * @default '{name} must be exactly \'{ruleValue}\''
        */
      var isExactly: String = js.native
      
      /**
        * @default '{name} must be at least {ruleValue} characters'
        */
      var length: String = js.native
      
      /**
        * @default '{name} must match {ruleValue} field'
        */
      var `match`: String = js.native
      
      /**
        * @default '{name} must have {ruleValue} or less choices'
        */
      var maxCount: String = js.native
      
      /**
        * @default '{name} cannot be longer than {ruleValue} characters'
        */
      var maxLength: String = js.native
      
      /**
        * @default '{name} must have at least {ruleValue} choices'
        */
      var minCount: String = js.native
      
      /**
        * @default '{name} must be at least {ruleValue} characters'
        */
      var minLength: String = js.native
      
      /**
        * @default '{name} cannot be set to \'{ruleValue}\''
        */
      var not: String = js.native
      
      /**
        * @default '{name} cannot be set to exactly \'{ruleValue}\''
        */
      var notExactly: String = js.native
      
      /**
        * @default '{name} must be set to a number'
        */
      var number: String = js.native
      
      /**
        * @default '{name} is not formatted correctly'
        */
      var regExp: String = js.native
      
      /**
        * @default '{name} must be a valid url'
        */
      var url: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        checked: String,
        contain: String,
        containExactly: String,
        creditCard: String,
        decimal: String,
        different: String,
        doesntContain: String,
        doesntContainExactly: String,
        email: String,
        empty: String,
        exactCount: String,
        exactLength: String,
        integer: String,
        is: String,
        isExactly: String,
        length: String,
        `match`: String,
        maxCount: String,
        maxLength: String,
        minCount: String,
        minLength: String,
        not: String,
        notExactly: String,
        number: String,
        regExp: String,
        url: String
      ): Impl = {
        val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], contain = contain.asInstanceOf[js.Any], containExactly = containExactly.asInstanceOf[js.Any], creditCard = creditCard.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], different = different.asInstanceOf[js.Any], doesntContain = doesntContain.asInstanceOf[js.Any], doesntContainExactly = doesntContainExactly.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], exactCount = exactCount.asInstanceOf[js.Any], exactLength = exactLength.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], isExactly = isExactly.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minCount = minCount.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], notExactly = notExactly.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContain(value: String): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainExactly(value: String): Self = StObject.set(x, "containExactly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreditCard(value: String): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDifferent(value: String): Self = StObject.set(x, "different", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDoesntContain(value: String): Self = StObject.set(x, "doesntContain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDoesntContainExactly(value: String): Self = StObject.set(x, "doesntContainExactly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExactCount(value: String): Self = StObject.set(x, "exactCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExactLength(value: String): Self = StObject.set(x, "exactLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInteger(value: String): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsExactly(value: String): Self = StObject.set(x, "isExactly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxCount(value: String): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinCount(value: String): Self = StObject.set(x, "minCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinLength(value: String): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNot(value: String): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotExactly(value: String): Self = StObject.set(x, "notExactly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegExp(value: String): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplempty | PickImplchecked | PickImplemail | PickImplurl | PickImplregExp | PickImplinteger | PickImpldecimal | PickImplnumber | PickImplis | PickImplisExactly | PickImplnot | PickImplnotExactly | PickImplcontain | PickImplcontainExactly | PickImpldoesntContain | PickImpldoesntContainExac | PickImplminLength | PickImpllength | PickImplexactLength | PickImplmaxLength | PickImplmatch | PickImpldifferent | PickImplcreditCard | PickImplminCount | PickImplexactCount | PickImplmaxCount) with PartialPickImplkeyofImplChecked
  }
  type PromptSettings = typingsSlinky.semanticUiForm.SemanticUI.Form.PromptSettings.Param
  
  @js.native
  trait Rule extends StObject {
    
    var prompt: String = js.native
    
    var `type`: String = js.native
  }
  object Rule {
    
    @scala.inline
    def apply(prompt: String, `type`: String): Rule = {
      val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rules extends StObject {
    
    var rules: js.Array[Rule] = js.native
  }
  object Rules {
    
    @scala.inline
    def apply(rules: js.Array[Rule]): Rules = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rules]
    }
    
    @scala.inline
    implicit class RulesMutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
  
  object SelectorSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 'input, textarea, select'
        */
      var field: String = js.native
      
      /**
        * @default '.field'
        */
      var group: String = js.native
      
      /**
        * @default 'input'
        */
      var input: String = js.native
      
      /**
        * @default '.error.message'
        */
      var message: String = js.native
      
      /**
        * @default '.prompt'
        */
      var prompt: String = js.native
      
      /**
        * @default '.submit'
        */
      var submit: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(field: String, group: String, input: String, message: String, prompt: String, submit: String): Impl = {
        val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubmit(value: String): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplmessage | PickImplfield | PickImplgroup | PickImplinput | PickImplpromptPromptString | PickImplsubmit) with PartialPickImplkeyofImplField
  }
  type SelectorSettings = typingsSlinky.semanticUiForm.SemanticUI.Form.SelectorSettings.Param
  
  object TemplatesSettings {
    
    @js.native
    trait Impl extends StObject {
      
      def error(errors: js.Array[String]): JQuery = js.native
      
      def prompt(errors: js.Array[String]): JQuery = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(error: js.Array[String] => JQuery, prompt: js.Array[String] => JQuery): Impl = {
        val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), prompt = js.Any.fromFunction1(prompt))
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setError(value: js.Array[String] => JQuery): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPrompt(value: js.Array[String] => JQuery): Self = StObject.set(x, "prompt", js.Any.fromFunction1(value))
      }
    }
    
    type Param = (PickImplerrorError | PickImplpromptPrompt) with PartialPickImplkeyofImplError
  }
  type TemplatesSettings = typingsSlinky.semanticUiForm.SemanticUI.Form.TemplatesSettings.Param
  
  object TextSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 'This field'
        */
      var unspecifiedField: String = js.native
      
      /**
        * @default 'Please enter a valid value'
        */
      var unspecifiedRule: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(unspecifiedField: String, unspecifiedRule: String): Impl = {
        val __obj = js.Dynamic.literal(unspecifiedField = unspecifiedField.asInstanceOf[js.Any], unspecifiedRule = unspecifiedRule.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUnspecifiedField(value: String): Self = StObject.set(x, "unspecifiedField", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnspecifiedRule(value: String): Self = StObject.set(x, "unspecifiedRule", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplunspecifiedRule | PickImplunspecifiedField) with PartialPickImplkeyofImplUnspecifiedField
  }
  type TextSettings = typingsSlinky.semanticUiForm.SemanticUI.Form.TextSettings.Param
}
