package typingsSlinky.simplemde.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var autoDownloadFontAwesome: js.UndefOr[Boolean] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var autosave: js.UndefOr[AutoSaveOptions] = js.native
  var blockStyles: js.UndefOr[BlockStyleOptions] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var forceSync: js.UndefOr[Boolean] = js.native
  var hideIcons: js.UndefOr[js.Array[String]] = js.native
  var indentWithTabs: js.UndefOr[Boolean] = js.native
  var initialValue: js.UndefOr[String] = js.native
  var insertTexts: js.UndefOr[InsertTextOptions] = js.native
  var lineWrapping: js.UndefOr[Boolean] = js.native
  var parsingConfig: js.UndefOr[ParsingOptions] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var previewRender: js.UndefOr[
    js.Function2[/* markdownPlaintext */ String, /* previewElement */ js.UndefOr[HTMLElement], String]
  ] = js.native
  var promptURLs: js.UndefOr[Boolean] = js.native
  var renderingConfig: js.UndefOr[RenderingOptions] = js.native
  var shortcuts: js.UndefOr[ShortcutsArray] = js.native
  var showIcons: js.UndefOr[js.Array[String]] = js.native
  var spellChecker: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[Boolean | (js.Array[String | StatusBarItem])] = js.native
  var styleSelectedText: js.UndefOr[Boolean] = js.native
  var tabSize: js.UndefOr[Double] = js.native
  var toolbar: js.UndefOr[Boolean | (js.Array[String | ToolbarIcon])] = js.native
  var toolbarTips: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDownloadFontAwesome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDownloadFontAwesome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDownloadFontAwesome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDownloadFontAwesome")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutosave(value: AutoSaveOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutosave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autosave")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockStyles(value: BlockStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSync")(js.undefined)
        ret
    }
    @scala.inline
    def withHideIcons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentWithTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWithTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentWithTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWithTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertTexts(value: InsertTextOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTexts")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWrapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWrapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWrapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWrapping")(js.undefined)
        ret
    }
    @scala.inline
    def withParsingConfig(value: ParsingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
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
    def withPreviewRender(value: (/* markdownPlaintext */ String, /* previewElement */ js.UndefOr[HTMLElement]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreviewRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewRender")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptURLs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptURLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptURLs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptURLs")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderingConfig(value: RenderingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcuts(value: ShortcutsArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIcons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellChecker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellChecker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellChecker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellChecker")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Boolean | (js.Array[String | StatusBarItem])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleSelectedText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSelectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleSelectedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSelectedText")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: Boolean | (js.Array[String | ToolbarIcon])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarTips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarTips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarTips")(js.undefined)
        ret
    }
  }
  
}

