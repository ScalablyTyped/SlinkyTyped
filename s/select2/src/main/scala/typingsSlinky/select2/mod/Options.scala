package typingsSlinky.select2.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.select2.mod._Global_.JQuery
import typingsSlinky.select2.select2Strings.ltr
import typingsSlinky.select2.select2Strings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[Result, RemoteResult] extends js.Object {
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
  implicit class OptionsOps[Self[result, remoteresult] <: Options[result, remoteresult], Result, RemoteResult] (val x: Self[Result, RemoteResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Result, RemoteResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Result, RemoteResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Result, RemoteResult]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Result, RemoteResult]) with Other]
    @scala.inline
    def withAjax(value: AjaxOptions[Result, RemoteResult]): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjax: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowClear(value: Boolean): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClear: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(js.undefined)
        ret
    }
    @scala.inline
    def withAmdBase(value: String): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amdBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmdBase: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amdBase")(js.undefined)
        ret
    }
    @scala.inline
    def withAmdLanguageBase(value: String): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amdLanguageBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmdLanguageBase: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amdLanguageBase")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnSelect(value: Boolean): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnSelect: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerCss(value: js.Any): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerCss: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerCss")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerCssClass(value: String): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerCssClass: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTag(value: /* params */ SearchOptions => IdTextPair | Null): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateTag: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTag")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[DataFormat | GroupedDataFormat]): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataAdapter(value: js.Any): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAdapter: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAdapter")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: ltr | rtl): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownAdapter(value: js.Any): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownAdapter: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownAdapter")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownAutoWidth(value: Boolean): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownAutoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownAutoWidth: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownAutoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownCss(value: js.Any): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownCss: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownCss")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownCssClass(value: String): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownCssClass: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownParent(value: JQuery[HTMLElement]): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownParent: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownParent")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeMarkup(value: /* markup */ String => String): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeMarkup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEscapeMarkup: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeMarkup")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSelection(
      value: (/* element */ JQuery[HTMLElement], /* callback */ js.Function1[/* data */ js.Any, Unit]) => Unit
    ): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSelection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInitSelection: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertTag(value: (/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair) => Unit): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertTag: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTag")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String | Translation): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withMatcher(
      value: (/* params */ SearchOptions, /* data */ OptGroupData | OptionData) => OptGroupData | OptionData | Null
    ): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMatcher: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumInputLength(value: Double): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumInputLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumInputLength: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumInputLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumSelectionLength(value: Double): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSelectionLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumSelectionLength: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSelectionLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumInputLength(value: Double): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumInputLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumInputLength: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumInputLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumResultsForSearch(value: Double): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumResultsForSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumResultsForSearch: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumResultsForSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String | IdTextPair): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withResultsAdapter(value: js.Any): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultsAdapter: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultsAdapter")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnClose(value: Boolean): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnClose: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnClose")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionAdapter(value: js.Any): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionAdapter: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionAdapter")(js.undefined)
        ret
    }
    @scala.inline
    def withSorter(
      value: /* data */ js.Array[OptGroupData | OptionData | IdTextPair] => js.Array[OptGroupData | OptionData | IdTextPair]
    ): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSorter: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorter")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Boolean): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateResult(value: /* result */ LoadingData | Result => String | JQuery[HTMLElement] | Null): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplateResult: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateResult")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateSelection(value: /* selection */ IdTextPair | LoadingData | Result => String | JQuery[HTMLElement]): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplateSelection: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenSeparators(value: js.Array[String]): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSeparators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenSeparators: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSeparators")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenizer(
      value: (/* input */ String, /* selection */ js.Array[_], /* selectCallback */ js.Function0[Unit], /* options */ Options[DataFormat | GroupedDataFormat, _]) => String
    ): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizer")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutTokenizer: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizer")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

