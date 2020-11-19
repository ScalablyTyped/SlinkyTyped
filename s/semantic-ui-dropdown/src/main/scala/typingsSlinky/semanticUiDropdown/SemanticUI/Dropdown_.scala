package typingsSlinky.semanticUiDropdown.SemanticUI

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiDropdown.JQuery
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.ClassNameSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.KeySettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings
import typingsSlinky.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`bind intent`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`bind mouse events`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`bind touch events`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`determine intent`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`determine select action`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`get default text`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`get item`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`get placeholder text`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`get text`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`get value`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`hide others`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`is animated`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`is hidden`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`is selection`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`is visible`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`match`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`remove active`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`remove selected`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`remove visible`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`restore default text`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`restore default value`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`restore defaults`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`restore placeholder text`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`save defaults`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`set active`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`set exactly`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`set selected`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`set text`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`set value`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`set visible`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`setup menu`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.`unbind intent`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.action
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.activate
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.allowAdditions
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.allowCategorySelection
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.allowReselection
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.allowTab
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.apiSettings
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.auto
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.both
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.className
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.clear
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.combo
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.context
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.debug
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.delay
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.destroy
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.direction
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.downward
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.duration
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.error
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.exact
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.fields
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.filterRemoteData
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.forceSelection
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.fullTextSearch
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.glyphWidth
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.hide
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.hideAdditions
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.keepOnScreen
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.keys
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.label
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.maxSelections
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.message
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.metadata
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.minCharacters
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.name
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.namespace
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.on
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.onAdd
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.onChange
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.onHide
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.onLabelCreate
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.onLabelRemove
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.onLabelSelect
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.onNoResults
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.onRemove
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.onShow
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.performance
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.placeholder
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.preserveHTML
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.refresh
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.regExp
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.saveRemoteData
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.select
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.selectOnKeydown
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.selector
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.setting
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.show
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.showOnFocus
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.silent
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.sortSelect
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.text
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.toggle
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.transition
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.upward
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.useLabels
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.value
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.values
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: Should 'value'/'values' parameters be of type 'string' instead of 'any'?
@js.native
trait Dropdown_ extends js.Object {
  
  def apply(): JQuery = js.native
  /**
    * Binds a click to document to determine if you click away from a dropdown
    */
  def apply(behavior: `bind intent`): JQuery = js.native
  /**
    * Adds mouse events to element
    */
  def apply(behavior: `bind mouse events`): JQuery = js.native
  /**
    * Adds touch events to element
    */
  def apply(behavior: `bind touch events`): JQuery = js.native
  /**
    * Returns whether event occurred inside dropdown
    */
  def apply(behavior: `determine intent`): Boolean = js.native
  /**
    * Triggers preset item selection action based on settings passing text/value
    */
  def apply(behavior: `determine select action`, text: String, value: js.Any): JQuery = js.native
  /**
    * Returns dropdown value as set on page load
    */
  def apply(behavior: `get default text`): String = js.native
  /**
    * Returns DOM element that matches a given input value
    */
  def apply(behavior: `get item`, value: js.Any): JQuery = js.native
  /**
    * Returns placeholder text
    */
  def apply(behavior: `get placeholder text`): String = js.native
  /**
    * Returns current dropdown text
    */
  def apply(behavior: `get text`): String = js.native
  /**
    * Returns current dropdown input value
    */
  def apply(behavior: `get value`): js.Any = js.native
  /**
    * Hides all other dropdowns that is not current dropdown
    */
  def apply(behavior: `hide others`): JQuery = js.native
  /**
    * Returns whether dropdown is animated
    */
  def apply(behavior: `is animated`): Boolean = js.native
  /**
    * Returns whether dropdown is hidden
    */
  def apply(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether dropdown is a selection dropdown
    */
  def apply(behavior: `is selection`): Boolean = js.native
  /**
    * Returns whether dropdown is visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Removes dropdown active state
    */
  def apply(behavior: `remove active`): JQuery = js.native
  /**
    * Remove value from selected
    */
  def apply(behavior: `remove selected`, value: js.Any): JQuery = js.native
  /**
    * Removes dropdown visible state
    */
  def apply(behavior: `remove visible`): JQuery = js.native
  /**
    * Restores dropdown text to its value on page load
    */
  def apply(behavior: `restore default text`): JQuery = js.native
  /**
    * Restores dropdown value to its value on page load
    */
  def apply(behavior: `restore default value`): JQuery = js.native
  /**
    * Restores dropdown text and value to its value on page load
    */
  def apply(behavior: `restore defaults`): JQuery = js.native
  /**
    * Restores dropdown text to its prompt, placeholder text
    */
  def apply(behavior: `restore placeholder text`): JQuery = js.native
  /**
    * Saves current text and value as new defaults (for use with restore)
    */
  def apply(behavior: `save defaults`): JQuery = js.native
  /**
    * Sets dropdown to active state
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Sets selected values to exactly specified values, removing current selection
    */
  def apply(behavior: `set exactly`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets value as selected
    */
  def apply(behavior: `set selected`, value: js.Any): JQuery = js.native
  /**
    * Adds a group of values as selected
    */
  def apply(behavior: `set selected`, values: js.Array[_]): JQuery = js.native
  /**
    * Sets dropdown text to a value
    */
  def apply(behavior: `set text`, text: String): JQuery = js.native
  /**
    * Sets dropdown input to value (does not update display state)
    */
  def apply(behavior: `set value`, value: js.Any): JQuery = js.native
  /**
    * Sets dropdown to visible state
    */
  def apply(behavior: `set visible`): JQuery = js.native
  /**
    * Recreates dropdown menu from select option values.
    */
  def apply(behavior: `setup menu`): JQuery = js.native
  /**
    * Unbinds document intent click
    */
  def apply(behavior: `unbind intent`): JQuery = js.native
  /**
    * Clears dropdown of selection
    */
  def apply(behavior: clear): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides dropdown
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Refreshes all cached selectors and data
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, name: `match`, value: js.UndefOr[scala.Nothing]): both | value | text = js.native
  def apply(behavior: setting, name: `match`, value: both): JQuery = js.native
  def apply(behavior: setting, name: `match`, value: text): JQuery = js.native
  def apply(behavior: setting, name: `match`, value: value): JQuery = js.native
  def apply(behavior: setting, name: action, value: js.UndefOr[scala.Nothing]): activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ]) = js.native
  def apply(
    behavior: setting,
    name: action,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: action, value: activate): JQuery = js.native
  def apply(behavior: setting, name: action, value: combo): JQuery = js.native
  def apply(behavior: setting, name: action, value: hide): JQuery = js.native
  def apply(behavior: setting, name: action, value: nothing): JQuery = js.native
  def apply(behavior: setting, name: action, value: select): JQuery = js.native
  def apply(behavior: setting, name: allowAdditions, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: allowAdditions, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: allowCategorySelection, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: allowCategorySelection, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: allowReselection, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: allowReselection, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: allowTab, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: allowTab, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: apiSettings, value: js.UndefOr[scala.Nothing]): `false` | ApiSettings = js.native
  def apply(behavior: setting, name: apiSettings, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: delay, value: js.UndefOr[scala.Nothing]): DelaySettings = js.native
  def apply(behavior: setting, name: direction, value: js.UndefOr[scala.Nothing]): auto | upward | downward = js.native
  def apply(behavior: setting, name: direction, value: auto): JQuery = js.native
  def apply(behavior: setting, name: direction, value: downward): JQuery = js.native
  def apply(behavior: setting, name: direction, value: upward): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: fields, value: js.UndefOr[scala.Nothing]): FieldsSettings = js.native
  def apply(behavior: setting, name: filterRemoteData, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: filterRemoteData, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: forceSelection, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: forceSelection, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: fullTextSearch, value: js.UndefOr[scala.Nothing]): Boolean | exact = js.native
  def apply(behavior: setting, name: fullTextSearch, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: fullTextSearch, value: exact): JQuery = js.native
  def apply(behavior: setting, name: glyphWidth, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: glyphWidth, value: Double): JQuery = js.native
  def apply(behavior: setting, name: hideAdditions, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: hideAdditions, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: keepOnScreen, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: keepOnScreen, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: keys, value: js.UndefOr[scala.Nothing]): KeySettings = js.native
  def apply(behavior: setting, name: label, value: LabelSettings): JQuery = js.native
  def apply(behavior: setting, name: maxSelections, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
  def apply(behavior: setting, name: maxSelections, value: Double): JQuery = js.native
  def apply(behavior: setting, name: maxSelections, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: message, value: js.UndefOr[scala.Nothing]): MessageSettings = js.native
  def apply(behavior: setting, name: metadata, value: js.UndefOr[scala.Nothing]): MetadataSettings = js.native
  def apply(behavior: setting, name: minCharacters, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: minCharacters, value: Double): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onAdd, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[
    /* this */ JQuery, 
    /* addedValue */ js.Any, 
    /* addedText */ String, 
    /* $addedChoice */ JQuery, 
    Unit
  ] = js.native
  def apply(
    behavior: setting,
    name: onAdd,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* addedValue */ js.Any, 
      /* addedText */ String, 
      /* $addedChoice */ JQuery, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onChange,
    value: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, `false` | Unit] = js.native
  def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): JQuery = js.native
  def apply(behavior: setting, name: onLabelCreate, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery] = js.native
  def apply(
    behavior: setting,
    name: onLabelCreate,
    value: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]
  ): JQuery = js.native
  def apply(behavior: setting, name: onLabelRemove, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit] = js.native
  def apply(
    behavior: setting,
    name: onLabelRemove,
    value: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onLabelSelect, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit] = js.native
  def apply(
    behavior: setting,
    name: onLabelSelect,
    value: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onNoResults, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit] = js.native
  def apply(
    behavior: setting,
    name: onNoResults,
    value: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onRemove, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[
    /* this */ JQuery, 
    /* removedValue */ js.Any, 
    /* removedText */ String, 
    /* $removedChoice */ JQuery, 
    Unit
  ] = js.native
  def apply(
    behavior: setting,
    name: onRemove,
    value: js.ThisFunction3[
      /* this */ JQuery, 
      /* removedValue */ js.Any, 
      /* removedText */ String, 
      /* $removedChoice */ JQuery, 
      Unit
    ]
  ): JQuery = js.native
  def apply(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, `false` | Unit] = js.native
  def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): JQuery = js.native
  def apply(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: on, value: String): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: placeholder, value: js.UndefOr[scala.Nothing]): auto | value | `false` = js.native
  def apply(behavior: setting, name: placeholder, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: placeholder, value: auto): JQuery = js.native
  def apply(behavior: setting, name: placeholder, value: value): JQuery = js.native
  def apply(behavior: setting, name: preserveHTML, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: preserveHTML, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: regExp, value: js.UndefOr[scala.Nothing]): RegExpSettings = js.native
  def apply(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
  def apply(behavior: setting, name: saveRemoteData, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: saveRemoteData, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selectOnKeydown, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: selectOnKeydown, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: showOnFocus, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: showOnFocus, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: sortSelect, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: sortSelect, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): auto | String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: transition, value: auto): JQuery = js.native
  def apply(behavior: setting, name: useLabels, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: useLabels, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: values, value: js.UndefOr[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl['values'] */ js.Any = js.native
  def apply(
    behavior: setting,
    name: values,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl['values'] */ js.Any
  ): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: DropdownSettings): JQuery = js.native
  /**
    * Shows dropdown
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles current visibility of dropdown
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: DropdownSettings): JQuery = js.native
  
  var settings: DropdownSettings = js.native
}
