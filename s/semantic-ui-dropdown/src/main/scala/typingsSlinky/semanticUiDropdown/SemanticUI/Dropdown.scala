package typingsSlinky.semanticUiDropdown.SemanticUI

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiDropdown.JQuery
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.ClassNameSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.ClassNameSettings.Param
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.KeySettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings
import typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings
import typingsSlinky.semanticUiDropdown.anon.PartialPickImplkeyofImplAction
import typingsSlinky.semanticUiDropdown.anon.PartialPickImplkeyofImplActive
import typingsSlinky.semanticUiDropdown.anon.PartialPickImplkeyofImplAddResult
import typingsSlinky.semanticUiDropdown.anon.PartialPickImplkeyofImplAddition
import typingsSlinky.semanticUiDropdown.anon.PartialPickImplkeyofImplBackspace
import typingsSlinky.semanticUiDropdown.anon.PartialPickImplkeyofImplDefaultText
import typingsSlinky.semanticUiDropdown.anon.PartialPickImplkeyofImplDuration
import typingsSlinky.semanticUiDropdown.anon.PartialPickImplkeyofImplHide
import typingsSlinky.semanticUiDropdown.anon.PartialPickImplkeyofImplName
import typingsSlinky.semanticUiDropdown.anon.PickImplactionAction
import typingsSlinky.semanticUiDropdown.anon.PickImplactive
import typingsSlinky.semanticUiDropdown.anon.PickImpladdResult
import typingsSlinky.semanticUiDropdown.anon.PickImpladdition
import typingsSlinky.semanticUiDropdown.anon.PickImplalreadySetup
import typingsSlinky.semanticUiDropdown.anon.PickImplanimating
import typingsSlinky.semanticUiDropdown.anon.PickImplbackspace
import typingsSlinky.semanticUiDropdown.anon.PickImplcount
import typingsSlinky.semanticUiDropdown.anon.PickImpldefaultText
import typingsSlinky.semanticUiDropdown.anon.PickImpldefaultValue
import typingsSlinky.semanticUiDropdown.anon.PickImpldeleteKey
import typingsSlinky.semanticUiDropdown.anon.PickImpldelimiter
import typingsSlinky.semanticUiDropdown.anon.PickImpldisabled
import typingsSlinky.semanticUiDropdown.anon.PickImpldownArrow
import typingsSlinky.semanticUiDropdown.anon.PickImpldropdown
import typingsSlinky.semanticUiDropdown.anon.PickImplduration
import typingsSlinky.semanticUiDropdown.anon.PickImplenter
import typingsSlinky.semanticUiDropdown.anon.PickImplescape
import typingsSlinky.semanticUiDropdown.anon.PickImplfiltered
import typingsSlinky.semanticUiDropdown.anon.PickImplhidden
import typingsSlinky.semanticUiDropdown.anon.PickImplhide
import typingsSlinky.semanticUiDropdown.anon.PickImplicon
import typingsSlinky.semanticUiDropdown.anon.PickImplinput
import typingsSlinky.semanticUiDropdown.anon.PickImplitem
import typingsSlinky.semanticUiDropdown.anon.PickImpllabelLabel
import typingsSlinky.semanticUiDropdown.anon.PickImpllabels
import typingsSlinky.semanticUiDropdown.anon.PickImplleftArrow
import typingsSlinky.semanticUiDropdown.anon.PickImplloading
import typingsSlinky.semanticUiDropdown.anon.PickImplmaxSelectionsMaxSelections
import typingsSlinky.semanticUiDropdown.anon.PickImplmenu
import typingsSlinky.semanticUiDropdown.anon.PickImplmenuIcon
import typingsSlinky.semanticUiDropdown.anon.PickImplmessageMessage
import typingsSlinky.semanticUiDropdown.anon.PickImplmethod
import typingsSlinky.semanticUiDropdown.anon.PickImplmultiple
import typingsSlinky.semanticUiDropdown.anon.PickImplname
import typingsSlinky.semanticUiDropdown.anon.PickImplnoResults
import typingsSlinky.semanticUiDropdown.anon.PickImplnoTransition
import typingsSlinky.semanticUiDropdown.anon.PickImplpageDown
import typingsSlinky.semanticUiDropdown.anon.PickImplpageUp
import typingsSlinky.semanticUiDropdown.anon.PickImplplaceholderPlaceholder
import typingsSlinky.semanticUiDropdown.anon.PickImplplaceholderText
import typingsSlinky.semanticUiDropdown.anon.PickImplremoteValues
import typingsSlinky.semanticUiDropdown.anon.PickImplremove
import typingsSlinky.semanticUiDropdown.anon.PickImplrightArrow
import typingsSlinky.semanticUiDropdown.anon.PickImplsearch
import typingsSlinky.semanticUiDropdown.anon.PickImplsearchSearch
import typingsSlinky.semanticUiDropdown.anon.PickImplselected
import typingsSlinky.semanticUiDropdown.anon.PickImplselection
import typingsSlinky.semanticUiDropdown.anon.PickImplshow
import typingsSlinky.semanticUiDropdown.anon.PickImplsiblingLabel
import typingsSlinky.semanticUiDropdown.anon.PickImpltext
import typingsSlinky.semanticUiDropdown.anon.PickImpltouch
import typingsSlinky.semanticUiDropdown.anon.PickImpltransitionTransition
import typingsSlinky.semanticUiDropdown.anon.PickImplupArrow
import typingsSlinky.semanticUiDropdown.anon.PickImplupward
import typingsSlinky.semanticUiDropdown.anon.PickImplvalue
import typingsSlinky.semanticUiDropdown.anon.PickImplvaluesValues
import typingsSlinky.semanticUiDropdown.anon.PickImplvariation
import typingsSlinky.semanticUiDropdown.anon.PickImplvisible
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: Should 'value'/'values' parameters be of type 'string' instead of 'any'?
@js.native
trait Dropdown extends StObject {
  
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
object Dropdown {
  
  object ClassNameSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 'active'
        */
      var active: String = js.native
      
      /**
        * @default 'addition'
        */
      var addition: String = js.native
      
      /**
        * @default 'animating'
        */
      var animating: String = js.native
      
      /**
        * @default 'disabled'
        */
      var disabled: String = js.native
      
      /**
        * @default 'ui dropdown'
        */
      var dropdown: String = js.native
      
      /**
        * @default 'filtered'
        */
      var filtered: String = js.native
      
      /**
        * @default 'hidden transition'
        */
      var hidden: String = js.native
      
      /**
        * @default 'item'
        */
      var item: String = js.native
      
      /**
        * @default 'ui label'
        */
      var label: String = js.native
      
      /**
        * @default 'loading'
        */
      var loading: String = js.native
      
      /**
        * @default 'menu'
        */
      var menu: String = js.native
      
      /**
        * @default 'message'
        */
      var message: String = js.native
      
      /**
        * @default 'multiple'
        */
      var multiple: String = js.native
      
      /**
        * @default 'default'
        */
      var placeholder: String = js.native
      
      /**
        * @default 'search'
        */
      var search: String = js.native
      
      /**
        * @default 'selected'
        */
      var selected: String = js.native
      
      /**
        * @default 'selection'
        */
      var selection: String = js.native
      
      /**
        * @default 'upward'
        */
      var upward: String = js.native
      
      /**
        * @default 'visible'
        */
      var visible: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        active: String,
        addition: String,
        animating: String,
        disabled: String,
        dropdown: String,
        filtered: String,
        hidden: String,
        item: String,
        label: String,
        loading: String,
        menu: String,
        message: String,
        multiple: String,
        placeholder: String,
        search: String,
        selected: String,
        selection: String,
        upward: String,
        visible: String
      ): Impl = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addition = addition.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], upward = upward.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddition(value: String): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFiltered(value: String): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpward(value: String): Self = StObject.set(x, "upward", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplactive | PickImpladdition | PickImplanimating | PickImpldisabled | PickImpldropdown | PickImplfiltered | PickImplhidden | PickImplitem | PickImpllabelLabel | PickImplloading | PickImplmenu | PickImplmessageMessage | PickImplmultiple | PickImplplaceholderPlaceholder | PickImplsearchSearch | PickImplselected | PickImplselection | PickImplupward | PickImplvisible) with PartialPickImplkeyofImplActive
  }
  type ClassNameSettings = Param
  
  object DelaySettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 300
        */
      var hide: Double = js.native
      
      /**
        * @default 50
        */
      var search: Double = js.native
      
      /**
        * @default 200
        */
      var show: Double = js.native
      
      /**
        * @default 50
        */
      var touch: Double = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(hide: Double, search: Double, show: Double, touch: Double): Impl = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearch(value: Double): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTouch(value: Double): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplhide | PickImplshow | PickImplsearch | PickImpltouch) with PartialPickImplkeyofImplHide
  }
  type DelaySettings = typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings.Param
  
  object ErrorSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 'You called a dropdown action that was not defined'
        */
      var action: String = js.native
      
      /**
        * @default 'Once a select has been initialized behaviors must be called on the created ui dropdown'
        */
      var alreadySetup: String = js.native
      
      /**
        * @default 'Allowing user additions currently requires the use of labels.'
        */
      var labels: String = js.native
      
      /**
        * @default 'The method you called is not defined.'
        */
      var method: String = js.native
      
      /**
        * @default 'This module requires ui transitions <https: github.com="" semantic-org="" ui-transition="">'
        */
      var noTransition: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(action: String, alreadySetup: String, labels: String, method: String, noTransition: String): Impl = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], alreadySetup = alreadySetup.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noTransition = noTransition.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlreadySetup(value: String): Self = StObject.set(x, "alreadySetup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoTransition(value: String): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplactionAction | PickImplalreadySetup | PickImpllabels | PickImplmethod | PickImplnoTransition) with PartialPickImplkeyofImplAction
  }
  type ErrorSettings = typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings.Param
  
  object FieldsSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * displayed dropdown text
        *
        * @default 'name'
        */
      var name: String = js.native
      
      /**
        * grouping for api results
        *
        * @default 'results'
        */
      var remoteValues: String = js.native
      
      /**
        * actual dropdown value
        *
        * @default 'value'
        */
      var value: String = js.native
      
      /**
        * grouping for all dropdown values
        *
        * @default 'values'
        */
      var values: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(name: String, remoteValues: String, value: String, values: String): Impl = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], remoteValues = remoteValues.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemoteValues(value: String): Self = StObject.set(x, "remoteValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplremoteValues | PickImplvaluesValues | PickImplname | PickImplvalue) with PartialPickImplkeyofImplName
  }
  type FieldsSettings = typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings.Param
  
  object KeySettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 8
        */
      var backspace: Double = js.native
      
      /**
        * @default 46
        */
      var deleteKey: Double = js.native
      
      /**
        * @default 188
        */
      var delimiter: Double | `false` = js.native
      
      /**
        * @default 40
        */
      var downArrow: Double = js.native
      
      /**
        * @default 13
        */
      var enter: Double = js.native
      
      /**
        * @default 27
        */
      var escape: Double = js.native
      
      /**
        * @default 37
        */
      var leftArrow: Double = js.native
      
      /**
        * @default 34
        */
      var pageDown: Double = js.native
      
      /**
        * @default 33
        */
      var pageUp: Double = js.native
      
      /**
        * @default 39
        */
      var rightArrow: Double = js.native
      
      /**
        * @default 38
        */
      var upArrow: Double = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        backspace: Double,
        deleteKey: Double,
        delimiter: Double | `false`,
        downArrow: Double,
        enter: Double,
        escape: Double,
        leftArrow: Double,
        pageDown: Double,
        pageUp: Double,
        rightArrow: Double,
        upArrow: Double
      ): Impl = {
        val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any], deleteKey = deleteKey.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], downArrow = downArrow.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], leftArrow = leftArrow.asInstanceOf[js.Any], pageDown = pageDown.asInstanceOf[js.Any], pageUp = pageUp.asInstanceOf[js.Any], rightArrow = rightArrow.asInstanceOf[js.Any], upArrow = upArrow.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackspace(value: Double): Self = StObject.set(x, "backspace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteKey(value: Double): Self = StObject.set(x, "deleteKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiter(value: Double | `false`): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDownArrow(value: Double): Self = StObject.set(x, "downArrow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEscape(value: Double): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftArrow(value: Double): Self = StObject.set(x, "leftArrow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageDown(value: Double): Self = StObject.set(x, "pageDown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageUp(value: Double): Self = StObject.set(x, "pageUp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightArrow(value: Double): Self = StObject.set(x, "rightArrow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpArrow(value: Double): Self = StObject.set(x, "upArrow", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplbackspace | PickImpldelimiter | PickImpldeleteKey | PickImplenter | PickImplescape | PickImplpageUp | PickImplpageDown | PickImplleftArrow | PickImplupArrow | PickImplrightArrow | PickImpldownArrow) with PartialPickImplkeyofImplBackspace
  }
  type KeySettings = typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.KeySettings.Param
  
  object LabelSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 200
        */
      var duration: Double = js.native
      
      /**
        * @default 'horizontal flip'
        */
      var transition: String = js.native
      
      /**
        * @default false
        */
      var variation: `false` | String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(duration: Double, transition: String, variation: `false` | String): Impl = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariation(value: `false` | String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImpltransitionTransition | PickImplduration | PickImplvariation) with PartialPickImplkeyofImplDuration
  }
  type LabelSettings = typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings.Param
  
  object MessageSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 'Add <b>{term}</b>'
        */
      var addResult: String = js.native
      
      /**
        * @default '{count} selected'
        */
      var count: String = js.native
      
      /**
        * @default 'Max {maxCount} selections'
        */
      var maxSelections: String = js.native
      
      /**
        * 'No results found.'
        */
      var noResults: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(addResult: String, count: String, maxSelections: String, noResults: String): Impl = {
        val __obj = js.Dynamic.literal(addResult = addResult.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], maxSelections = maxSelections.asInstanceOf[js.Any], noResults = noResults.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddResult(value: String): Self = StObject.set(x, "addResult", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxSelections(value: String): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImpladdResult | PickImplcount | PickImplmaxSelectionsMaxSelections | PickImplnoResults) with PartialPickImplkeyofImplAddResult
  }
  type MessageSettings = typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings.Param
  
  object MetadataSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default 'defaultText'
        */
      var defaultText: String = js.native
      
      /**
        * @default 'defaultValue'
        */
      var defaultValue: String = js.native
      
      /**
        * @default 'placeholderText'
        */
      var placeholderText: String = js.native
      
      /**
        * @default 'text'
        */
      var text: String = js.native
      
      /**
        * @default 'value'
        */
      var value: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(defaultText: String, defaultValue: String, placeholderText: String, text: String, value: String): Impl = {
        val __obj = js.Dynamic.literal(defaultText = defaultText.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], placeholderText = placeholderText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImpldefaultText | PickImpldefaultValue | PickImplplaceholderText | PickImpltext | PickImplvalue) with PartialPickImplkeyofImplDefaultText
  }
  type MetadataSettings = typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings.Param
  
  /* Inlined semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings.Param */
  @js.native
  trait RegExpSettings extends StObject {
    
    var escape: js.RegExp with js.UndefOr[js.RegExp] = js.native
  }
  object RegExpSettings {
    
    @scala.inline
    def apply(escape: js.RegExp with js.UndefOr[js.RegExp]): RegExpSettings = {
      val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegExpSettings]
    }
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default /[-[\]{}()*+?.,\\^$|#\s]/g
        */
      var escape: js.RegExp = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(escape: js.RegExp): Impl = {
        val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings._Impl, 'escape'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings._Impl>> */
    @js.native
    trait Param extends StObject {
      
      var escape: js.RegExp with js.UndefOr[js.RegExp] = js.native
    }
    object Param {
      
      @scala.inline
      def apply(escape: js.RegExp with js.UndefOr[js.RegExp]): typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings.Param = {
        val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings.Param]
      }
      
      @scala.inline
      implicit class ParamMutableBuilder[Self <: typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings.Param] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEscape(value: js.RegExp with js.UndefOr[js.RegExp]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class RegExpSettingsMutableBuilder[Self <: RegExpSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscape(value: js.RegExp with js.UndefOr[js.RegExp]): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    }
  }
  
  object SelectorSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * @default '.addition'
        */
      var addition: String = js.native
      
      /**
        * @default '.ui.dropdown'
        */
      var dropdown: String = js.native
      
      /**
        * @default '> .dropdown.icon'
        */
      var icon: String = js.native
      
      /**
        * @default '> input[type="hidden"], > select'
        */
      var input: String = js.native
      
      /**
        * @default '.item'
        */
      var item: String = js.native
      
      /**
        * @default '> .label'
        */
      var label: String = js.native
      
      /**
        * @default '.menu'
        */
      var menu: String = js.native
      
      /**
        * @default '.dropdown.icon'
        */
      var menuIcon: String = js.native
      
      /**
        * @default '.message'
        */
      var message: String = js.native
      
      /**
        * @default '> .label > .delete.icon'
        */
      var remove: String = js.native
      
      /**
        * @default 'input.search, .menu > .search > input'
        */
      var search: String = js.native
      
      /**
        * @default '.label'
        */
      var siblingLabel: String = js.native
      
      /**
        * @default '> .text:not(.icon)'
        */
      var text: String = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        addition: String,
        dropdown: String,
        icon: String,
        input: String,
        item: String,
        label: String,
        menu: String,
        menuIcon: String,
        message: String,
        remove: String,
        search: String,
        siblingLabel: String,
        text: String
      ): Impl = {
        val __obj = js.Dynamic.literal(addition = addition.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuIcon = menuIcon.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], siblingLabel = siblingLabel.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddition(value: String): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenuIcon(value: String): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSiblingLabel(value: String): Self = StObject.set(x, "siblingLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImpladdition | PickImpldropdown | PickImplicon | PickImplinput | PickImplitem | PickImpllabelLabel | PickImplremove | PickImplsiblingLabel | PickImplmenu | PickImplmessageMessage | PickImplmenuIcon | PickImplsearchSearch | PickImpltext) with PartialPickImplkeyofImplAddition
  }
  type SelectorSettings = typingsSlinky.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings.Param
}
