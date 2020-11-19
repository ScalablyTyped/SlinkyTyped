package typingsSlinky.semanticUiForm.SemanticUI

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery.TriggeredEvent
import typingsSlinky.semanticUiForm.JQuery
import typingsSlinky.semanticUiForm.SemanticUI.Form.ClassNameSettings
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Form_ extends js.Object {
  
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
