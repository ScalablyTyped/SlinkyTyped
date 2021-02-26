package typingsSlinky.semanticUiDropdown.anon

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
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.activate
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.auto
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.both
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.combo
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.downward
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.exact
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.hide
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.select
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.text
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.upward
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends StObject {
  
  var action: js.UndefOr[
    activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ])
  ] = js.native
  
  var allowAdditions: js.UndefOr[Boolean] = js.native
  
  var allowCategorySelection: js.UndefOr[Boolean] = js.native
  
  var allowReselection: js.UndefOr[Boolean] = js.native
  
  var allowTab: js.UndefOr[Boolean] = js.native
  
  var apiSettings: js.UndefOr[`false` | ApiSettings] = js.native
  
  var className: js.UndefOr[ClassNameSettings] = js.native
  
  var context: js.UndefOr[String | JQuery] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var delay: js.UndefOr[DelaySettings] = js.native
  
  var direction: js.UndefOr[auto | upward | downward] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[ErrorSettings] = js.native
  
  var fields: js.UndefOr[FieldsSettings] = js.native
  
  var filterRemoteData: js.UndefOr[Boolean] = js.native
  
  var forceSelection: js.UndefOr[Boolean] = js.native
  
  var fullTextSearch: js.UndefOr[Boolean | exact] = js.native
  
  var glyphWidth: js.UndefOr[Double] = js.native
  
  var hideAdditions: js.UndefOr[Boolean] = js.native
  
  var keepOnScreen: js.UndefOr[Boolean] = js.native
  
  var keys: js.UndefOr[KeySettings] = js.native
  
  var label: js.UndefOr[LabelSettings] = js.native
  
  var `match`: js.UndefOr[both | value | text] = js.native
  
  var maxSelections: js.UndefOr[`false` | Double] = js.native
  
  var message: js.UndefOr[MessageSettings] = js.native
  
  var metadata: js.UndefOr[MetadataSettings] = js.native
  
  var minCharacters: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  var on: js.UndefOr[String] = js.native
  
  var onAdd: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* addedValue */ js.Any, 
      /* addedText */ String, 
      /* $addedChoice */ JQuery, 
      Unit
    ]
  ] = js.native
  
  var onChange: js.UndefOr[
    js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
  ] = js.native
  
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, `false` | Unit]] = js.native
  
  var onLabelCreate: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]
  ] = js.native
  
  var onLabelRemove: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]] = js.native
  
  var onLabelSelect: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]] = js.native
  
  var onNoResults: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]] = js.native
  
  var onRemove: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* removedValue */ js.Any, 
      /* removedText */ String, 
      /* $removedChoice */ JQuery, 
      Unit
    ]
  ] = js.native
  
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, `false` | Unit]] = js.native
  
  var performance: js.UndefOr[Boolean] = js.native
  
  var placeholder: js.UndefOr[auto | value | `false`] = js.native
  
  var preserveHTML: js.UndefOr[Boolean] = js.native
  
  var regExp: js.UndefOr[RegExpSettings] = js.native
  
  var saveRemoteData: js.UndefOr[Boolean] = js.native
  
  var selectOnKeydown: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[SelectorSettings] = js.native
  
  var showOnFocus: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var sortSelect: js.UndefOr[Boolean] = js.native
  
  var transition: js.UndefOr[auto | String] = js.native
  
  var useLabels: js.UndefOr[Boolean] = js.native
  
  var values: js.UndefOr[js.Any] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object PartialPickImplkeyofImpl {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplMutableBuilder[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(
      value: activate | select | combo | nothing | hide | (js.ThisFunction3[
          /* this */ JQuery, 
          /* text */ String, 
          /* value */ String | `false`, 
          /* element */ JQuery, 
          Unit
        ])
    ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAllowAdditions(value: Boolean): Self = StObject.set(x, "allowAdditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAdditionsUndefined: Self = StObject.set(x, "allowAdditions", js.undefined)
    
    @scala.inline
    def setAllowCategorySelection(value: Boolean): Self = StObject.set(x, "allowCategorySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCategorySelectionUndefined: Self = StObject.set(x, "allowCategorySelection", js.undefined)
    
    @scala.inline
    def setAllowReselection(value: Boolean): Self = StObject.set(x, "allowReselection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReselectionUndefined: Self = StObject.set(x, "allowReselection", js.undefined)
    
    @scala.inline
    def setAllowTab(value: Boolean): Self = StObject.set(x, "allowTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTabUndefined: Self = StObject.set(x, "allowTab", js.undefined)
    
    @scala.inline
    def setApiSettings(value: `false` | ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiSettingsUndefined: Self = StObject.set(x, "apiSettings", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDelay(value: DelaySettings): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDirection(value: auto | upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFields(value: FieldsSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFilterRemoteData(value: Boolean): Self = StObject.set(x, "filterRemoteData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRemoteDataUndefined: Self = StObject.set(x, "filterRemoteData", js.undefined)
    
    @scala.inline
    def setForceSelection(value: Boolean): Self = StObject.set(x, "forceSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSelectionUndefined: Self = StObject.set(x, "forceSelection", js.undefined)
    
    @scala.inline
    def setFullTextSearch(value: Boolean | exact): Self = StObject.set(x, "fullTextSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTextSearchUndefined: Self = StObject.set(x, "fullTextSearch", js.undefined)
    
    @scala.inline
    def setGlyphWidth(value: Double): Self = StObject.set(x, "glyphWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphWidthUndefined: Self = StObject.set(x, "glyphWidth", js.undefined)
    
    @scala.inline
    def setHideAdditions(value: Boolean): Self = StObject.set(x, "hideAdditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAdditionsUndefined: Self = StObject.set(x, "hideAdditions", js.undefined)
    
    @scala.inline
    def setKeepOnScreen(value: Boolean): Self = StObject.set(x, "keepOnScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepOnScreenUndefined: Self = StObject.set(x, "keepOnScreen", js.undefined)
    
    @scala.inline
    def setKeys(value: KeySettings): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setLabel(value: LabelSettings): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMatch(value: both | value | text): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setMaxSelections(value: `false` | Double): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSelectionsUndefined: Self = StObject.set(x, "maxSelections", js.undefined)
    
    @scala.inline
    def setMessage(value: MessageSettings): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCharactersUndefined: Self = StObject.set(x, "minCharacters", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAdd(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* addedValue */ js.Any, 
          /* addedText */ String, 
          /* $addedChoice */ JQuery, 
          Unit
        ]
    ): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnHide(value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnLabelCreate(value: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]): Self = StObject.set(x, "onLabelCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLabelCreateUndefined: Self = StObject.set(x, "onLabelCreate", js.undefined)
    
    @scala.inline
    def setOnLabelRemove(value: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]): Self = StObject.set(x, "onLabelRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLabelRemoveUndefined: Self = StObject.set(x, "onLabelRemove", js.undefined)
    
    @scala.inline
    def setOnLabelSelect(value: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]): Self = StObject.set(x, "onLabelSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLabelSelectUndefined: Self = StObject.set(x, "onLabelSelect", js.undefined)
    
    @scala.inline
    def setOnNoResults(value: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]): Self = StObject.set(x, "onNoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnNoResultsUndefined: Self = StObject.set(x, "onNoResults", js.undefined)
    
    @scala.inline
    def setOnRemove(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* removedValue */ js.Any, 
          /* removedText */ String, 
          /* $removedChoice */ JQuery, 
          Unit
        ]
    ): Self = StObject.set(x, "onRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: auto | value | `false`): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPreserveHTML(value: Boolean): Self = StObject.set(x, "preserveHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveHTMLUndefined: Self = StObject.set(x, "preserveHTML", js.undefined)
    
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    @scala.inline
    def setSaveRemoteData(value: Boolean): Self = StObject.set(x, "saveRemoteData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveRemoteDataUndefined: Self = StObject.set(x, "saveRemoteData", js.undefined)
    
    @scala.inline
    def setSelectOnKeydown(value: Boolean): Self = StObject.set(x, "selectOnKeydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOnKeydownUndefined: Self = StObject.set(x, "selectOnKeydown", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setSortSelect(value: Boolean): Self = StObject.set(x, "sortSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortSelectUndefined: Self = StObject.set(x, "sortSelect", js.undefined)
    
    @scala.inline
    def setTransition(value: auto | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setUseLabels(value: Boolean): Self = StObject.set(x, "useLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLabelsUndefined: Self = StObject.set(x, "useLabels", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
