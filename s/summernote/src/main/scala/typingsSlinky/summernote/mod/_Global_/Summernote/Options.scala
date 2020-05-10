package typingsSlinky.summernote.mod._Global_.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var airMode: js.UndefOr[Boolean] = js.native
  var callbacks: js.UndefOr[js.Any] = js.native
   // todo
  var codemirror: js.UndefOr[CodemirrorOptions] = js.native
  var codeviewFilter: js.UndefOr[Boolean] = js.native
  var codeviewFilterRegex: js.UndefOr[String] = js.native
  var codeviewIframeFilter: js.UndefOr[Boolean] = js.native
  var codeviewIframeWhitelistSrc: js.UndefOr[js.Array[String]] = js.native
  var colors: js.UndefOr[colorsDef] = js.native
  var dialogsFade: js.UndefOr[Boolean] = js.native
  var dialogsInBody: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[String] = js.native
  var disableDragAndDrop: js.UndefOr[Boolean] = js.native
  var focus: js.UndefOr[Boolean] = js.native
  var fontNames: js.UndefOr[js.Array[String]] = js.native
  var fontNamesIgnoreCheck: js.UndefOr[js.Array[String]] = js.native
  var height: js.UndefOr[Double] = js.native
  var hint: js.UndefOr[HintOptions] = js.native
  var icons: js.UndefOr[IconsOptions] = js.native
  var insertTableMaxSize: js.UndefOr[InsertTableMaxSizeOptions] = js.native
  var keyMap: js.UndefOr[KeyMapOptions] = js.native
  var lang: js.UndefOr[String] = js.native
  var lineHeights: js.UndefOr[js.Array[String]] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maximumImageFileSize: js.UndefOr[js.Any] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var modules: js.UndefOr[ModuleOptions] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popover: js.UndefOr[PopoverOptions] = js.native
  var shortcuts: js.UndefOr[Boolean] = js.native
  var styleTags: js.UndefOr[js.Array[styleTagsOptions]] = js.native
  var styleWithSpan: js.UndefOr[Boolean] = js.native
  var tabDisable: js.UndefOr[Boolean] = js.native
  var tableClassName: js.UndefOr[String] = js.native
  var tabsize: js.UndefOr[Double] = js.native
  var textareaAutoSync: js.UndefOr[Boolean] = js.native
  var toolbar: js.UndefOr[toolbarDef] = js.native
  var width: js.UndefOr[Double] = js.native
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
    def withAirMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAirMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withCodemirror(value: CodemirrorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codemirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodemirror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codemirror")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeviewFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeviewFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeviewFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeviewFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeviewFilterRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeviewFilterRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeviewFilterRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeviewFilterRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeviewIframeFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeviewIframeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeviewIframeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeviewIframeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeviewIframeWhitelistSrc(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeviewIframeWhitelistSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeviewIframeWhitelistSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeviewIframeWhitelistSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: colorsDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogsFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogsFade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogsFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogsFade")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogsInBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogsInBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogsInBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogsInBody")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
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
    def withDisableDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFontNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNames")(js.undefined)
        ret
    }
    @scala.inline
    def withFontNamesIgnoreCheck(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNamesIgnoreCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontNamesIgnoreCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontNamesIgnoreCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHint(value: HintOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: IconsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertTableMaxSize(value: InsertTableMaxSizeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableMaxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertTableMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTableMaxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMap(value: KeyMapOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMap")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeights(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeights")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumImageFileSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumImageFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumImageFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumImageFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: ModuleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
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
    def withPopover(value: PopoverOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcuts(value: Boolean): Self = {
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
    def withStyleTags(value: js.Array[styleTagsOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleTags")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleWithSpan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleWithSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleWithSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleWithSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withTabDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabDisable")(js.undefined)
        ret
    }
    @scala.inline
    def withTableClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTabsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsize")(js.undefined)
        ret
    }
    @scala.inline
    def withTextareaAutoSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textareaAutoSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextareaAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textareaAutoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: toolbarDef): Self = {
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

