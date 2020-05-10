package typingsSlinky.semanticUiDropdown

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
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
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(
      value: activate | select | combo | nothing | hide | (js.ThisFunction3[
          /* this */ JQuery, 
          /* text */ String, 
          /* value */ String | `false`, 
          /* element */ JQuery, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAdditions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAdditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdditions")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCategorySelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCategorySelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCategorySelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCategorySelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReselection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReselection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReselection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReselection")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTab")(js.undefined)
        ret
    }
    @scala.inline
    def withApiSettings(value: `false` | ApiSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: DelaySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: auto | upward | downward): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: FieldsSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterRemoteData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRemoteData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterRemoteData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRemoteData")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withFullTextSearch(value: Boolean | exact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTextSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullTextSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTextSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHideAdditions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAdditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideAdditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAdditions")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepOnScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOnScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepOnScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepOnScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: KeySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: LabelSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch(value: both | value | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSelections(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSelections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelections")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: MessageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdd(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* addedValue */ js.Any, 
          /* addedText */ String, 
          /* $addedChoice */ JQuery, 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: js.ThisFunction3[/* this */ JQuery, /* value */ js.Any, /* text */ String, /* $choice */ JQuery, Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLabelCreate(value: js.ThisFunction2[/* this */ JQuery, /* value */ js.Any, /* text */ String, JQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLabelCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLabelRemove(value: js.ThisFunction1[/* this */ JQuery, /* value */ js.Any, `false` | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLabelRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLabelSelect(value: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLabelSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabelSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNoResults(value: js.ThisFunction1[/* this */ JQuery, /* searchValue */ js.Any, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNoResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnNoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNoResults")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemove(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* removedValue */ js.Any, 
          /* removedText */ String, 
          /* $removedChoice */ JQuery, 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: auto | value | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withRegExp(value: RegExpSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regExp")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveRemoteData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveRemoteData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveRemoteData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveRemoteData")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnKeydown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnKeydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnKeydown")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSortSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: auto | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

