package typingsSlinky.select2.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.select2.mod.global.JQuery
import typingsSlinky.select2.select2Strings.ltr
import typingsSlinky.select2.select2Strings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[Result, RemoteResult] extends StObject {
  
  var ajax: js.UndefOr[AjaxOptions[Result, RemoteResult]] = js.native
  
  var allowClear: js.UndefOr[Boolean] = js.native
  
  var amdBase: js.UndefOr[String] = js.native
  
  var amdLanguageBase: js.UndefOr[String] = js.native
  
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  
  var containerCss: js.UndefOr[js.Any] = js.native
  
  var containerCssClass: js.UndefOr[String] = js.native
  
  // Not in https://select2.org/configuration/options-api
  var createTag: js.UndefOr[js.Function1[/* params */ SearchOptions, IdTextPair | Null]] = js.native
  
  var data: js.UndefOr[js.Array[DataFormat | GroupedDataFormat]] = js.native
  
  var dataAdapter: js.UndefOr[js.Any] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var dir: js.UndefOr[ltr | rtl] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dropdownAdapter: js.UndefOr[js.Any] = js.native
  
  var dropdownAutoWidth: js.UndefOr[Boolean] = js.native
  
  var dropdownCss: js.UndefOr[js.Any] = js.native
  
  var dropdownCssClass: js.UndefOr[String] = js.native
  
  var dropdownParent: js.UndefOr[JQuery[HTMLElement]] = js.native
  
  var escapeMarkup: js.UndefOr[js.Function1[/* markup */ String, String]] = js.native
  
  var initSelection: js.UndefOr[
    js.Function2[
      /* element */ JQuery[HTMLElement], 
      /* callback */ js.Function1[/* data */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  
  var insertTag: js.UndefOr[
    js.Function2[/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair, Unit]
  ] = js.native
  
  var language: js.UndefOr[String | Translation] = js.native
  
  var matcher: js.UndefOr[
    js.Function2[
      /* params */ SearchOptions, 
      /* data */ OptGroupData | OptionData, 
      OptGroupData | OptionData | Null
    ]
  ] = js.native
  
  var maximumInputLength: js.UndefOr[Double] = js.native
  
  var maximumSelectionLength: js.UndefOr[Double] = js.native
  
  var minimumInputLength: js.UndefOr[Double] = js.native
  
  var minimumResultsForSearch: js.UndefOr[Double] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var placeholder: js.UndefOr[String | IdTextPair] = js.native
  
  var resultsAdapter: js.UndefOr[js.Any] = js.native
  
  var selectOnClose: js.UndefOr[Boolean] = js.native
  
  var selectionAdapter: js.UndefOr[js.Any] = js.native
  
  var sorter: js.UndefOr[
    js.Function1[
      /* data */ js.Array[OptGroupData | OptionData | IdTextPair], 
      js.Array[OptGroupData | OptionData | IdTextPair]
    ]
  ] = js.native
  
  var tags: js.UndefOr[Boolean] = js.native
  
  var templateResult: js.UndefOr[
    js.Function1[/* result */ LoadingData | Result, String | JQuery[HTMLElement] | Null]
  ] = js.native
  
  var templateSelection: js.UndefOr[
    js.Function1[/* selection */ IdTextPair | LoadingData | Result, String | JQuery[HTMLElement]]
  ] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
  
  var tokenizer: js.UndefOr[
    js.Function4[
      /* input */ String, 
      /* selection */ js.Array[_], 
      /* selectCallback */ js.Function0[Unit], 
      /* options */ Options[DataFormat | GroupedDataFormat, _], 
      String
    ]
  ] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply[Result, RemoteResult](): Options[Result, RemoteResult] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Result, RemoteResult]]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options[_, _], Result, RemoteResult] (val x: Self with (Options[Result, RemoteResult])) extends AnyVal {
    
    @scala.inline
    def setAjax(value: AjaxOptions[Result, RemoteResult]): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
    
    @scala.inline
    def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
    
    @scala.inline
    def setAmdBase(value: String): Self = StObject.set(x, "amdBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmdBaseUndefined: Self = StObject.set(x, "amdBase", js.undefined)
    
    @scala.inline
    def setAmdLanguageBase(value: String): Self = StObject.set(x, "amdLanguageBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmdLanguageBaseUndefined: Self = StObject.set(x, "amdLanguageBase", js.undefined)
    
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
    
    @scala.inline
    def setContainerCss(value: js.Any): Self = StObject.set(x, "containerCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerCssClass(value: String): Self = StObject.set(x, "containerCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerCssClassUndefined: Self = StObject.set(x, "containerCssClass", js.undefined)
    
    @scala.inline
    def setContainerCssUndefined: Self = StObject.set(x, "containerCss", js.undefined)
    
    @scala.inline
    def setCreateTag(value: /* params */ SearchOptions => IdTextPair | Null): Self = StObject.set(x, "createTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateTagUndefined: Self = StObject.set(x, "createTag", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[DataFormat | GroupedDataFormat]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAdapter(value: js.Any): Self = StObject.set(x, "dataAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAdapterUndefined: Self = StObject.set(x, "dataAdapter", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (DataFormat | GroupedDataFormat)*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDir(value: ltr | rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDropdownAdapter(value: js.Any): Self = StObject.set(x, "dropdownAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownAdapterUndefined: Self = StObject.set(x, "dropdownAdapter", js.undefined)
    
    @scala.inline
    def setDropdownAutoWidth(value: Boolean): Self = StObject.set(x, "dropdownAutoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownAutoWidthUndefined: Self = StObject.set(x, "dropdownAutoWidth", js.undefined)
    
    @scala.inline
    def setDropdownCss(value: js.Any): Self = StObject.set(x, "dropdownCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownCssClass(value: String): Self = StObject.set(x, "dropdownCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownCssClassUndefined: Self = StObject.set(x, "dropdownCssClass", js.undefined)
    
    @scala.inline
    def setDropdownCssUndefined: Self = StObject.set(x, "dropdownCss", js.undefined)
    
    @scala.inline
    def setDropdownParent(value: JQuery[HTMLElement]): Self = StObject.set(x, "dropdownParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownParentUndefined: Self = StObject.set(x, "dropdownParent", js.undefined)
    
    @scala.inline
    def setEscapeMarkup(value: /* markup */ String => String): Self = StObject.set(x, "escapeMarkup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEscapeMarkupUndefined: Self = StObject.set(x, "escapeMarkup", js.undefined)
    
    @scala.inline
    def setInitSelection(
      value: (/* element */ JQuery[HTMLElement], /* callback */ js.Function1[/* data */ js.Any, Unit]) => Unit
    ): Self = StObject.set(x, "initSelection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitSelectionUndefined: Self = StObject.set(x, "initSelection", js.undefined)
    
    @scala.inline
    def setInsertTag(value: (/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair) => Unit): Self = StObject.set(x, "insertTag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertTagUndefined: Self = StObject.set(x, "insertTag", js.undefined)
    
    @scala.inline
    def setLanguage(value: String | Translation): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMatcher(
      value: (/* params */ SearchOptions, /* data */ OptGroupData | OptionData) => OptGroupData | OptionData | Null
    ): Self = StObject.set(x, "matcher", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    
    @scala.inline
    def setMaximumInputLength(value: Double): Self = StObject.set(x, "maximumInputLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumInputLengthUndefined: Self = StObject.set(x, "maximumInputLength", js.undefined)
    
    @scala.inline
    def setMaximumSelectionLength(value: Double): Self = StObject.set(x, "maximumSelectionLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSelectionLengthUndefined: Self = StObject.set(x, "maximumSelectionLength", js.undefined)
    
    @scala.inline
    def setMinimumInputLength(value: Double): Self = StObject.set(x, "minimumInputLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumInputLengthUndefined: Self = StObject.set(x, "minimumInputLength", js.undefined)
    
    @scala.inline
    def setMinimumResultsForSearch(value: Double): Self = StObject.set(x, "minimumResultsForSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumResultsForSearchUndefined: Self = StObject.set(x, "minimumResultsForSearch", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String | IdTextPair): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setResultsAdapter(value: js.Any): Self = StObject.set(x, "resultsAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsAdapterUndefined: Self = StObject.set(x, "resultsAdapter", js.undefined)
    
    @scala.inline
    def setSelectOnClose(value: Boolean): Self = StObject.set(x, "selectOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOnCloseUndefined: Self = StObject.set(x, "selectOnClose", js.undefined)
    
    @scala.inline
    def setSelectionAdapter(value: js.Any): Self = StObject.set(x, "selectionAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionAdapterUndefined: Self = StObject.set(x, "selectionAdapter", js.undefined)
    
    @scala.inline
    def setSorter(
      value: /* data */ js.Array[OptGroupData | OptionData | IdTextPair] => js.Array[OptGroupData | OptionData | IdTextPair]
    ): Self = StObject.set(x, "sorter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    
    @scala.inline
    def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTemplateResult(value: /* result */ LoadingData | Result => String | JQuery[HTMLElement] | Null): Self = StObject.set(x, "templateResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplateResultUndefined: Self = StObject.set(x, "templateResult", js.undefined)
    
    @scala.inline
    def setTemplateSelection(value: /* selection */ IdTextPair | LoadingData | Result => String | JQuery[HTMLElement]): Self = StObject.set(x, "templateSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplateSelectionUndefined: Self = StObject.set(x, "templateSelection", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTokenSeparators(value: js.Array[String]): Self = StObject.set(x, "tokenSeparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenSeparatorsUndefined: Self = StObject.set(x, "tokenSeparators", js.undefined)
    
    @scala.inline
    def setTokenSeparatorsVarargs(value: String*): Self = StObject.set(x, "tokenSeparators", js.Array(value :_*))
    
    @scala.inline
    def setTokenizer(
      value: (/* input */ String, /* selection */ js.Array[_], /* selectCallback */ js.Function0[Unit], /* options */ Options[DataFormat | GroupedDataFormat, _]) => String
    ): Self = StObject.set(x, "tokenizer", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTokenizerUndefined: Self = StObject.set(x, "tokenizer", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
