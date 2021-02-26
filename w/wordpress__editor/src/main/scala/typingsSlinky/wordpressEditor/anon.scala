package typingsSlinky.wordpressEditor

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.std.IterableIterator
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.mod.Schema.Decontextualize
import typingsSlinky.wordpressApiFetch.mod.Schema.PostOrPage
import typingsSlinky.wordpressApiFetch.mod.Schema.User
import typingsSlinky.wordpressBlockEditor.anon.AjaxUrl
import typingsSlinky.wordpressBlockEditor.anon.Children
import typingsSlinky.wordpressBlockEditor.anon.Description
import typingsSlinky.wordpressBlockEditor.anon.Index
import typingsSlinky.wordpressBlockEditor.anon.IsLocked
import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import typingsSlinky.wordpressBlockEditor.anon.PartialBlockInstancekstri
import typingsSlinky.wordpressBlockEditor.blockControlsMod.BlockControls.Props
import typingsSlinky.wordpressBlockEditor.mod.EditorBlockListSettings
import typingsSlinky.wordpressBlockEditor.mod.EditorBlockMode
import typingsSlinky.wordpressBlockEditor.mod.EditorColor
import typingsSlinky.wordpressBlockEditor.mod.EditorFontSize
import typingsSlinky.wordpressBlockEditor.mod.EditorImageSize
import typingsSlinky.wordpressBlockEditor.mod.EditorInserterItem
import typingsSlinky.wordpressBlockEditor.mod.EditorSettings
import typingsSlinky.wordpressBlockEditor.mod.EditorStyle
import typingsSlinky.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typingsSlinky.wordpressBlocks.mod.BlockInstance
import typingsSlinky.wordpressBlocks.templatesMod.TemplateArray
import typingsSlinky.wordpressCoreData.mod.Autosave
import typingsSlinky.wordpressEditor.wordpressEditorNumbers.`-1`
import typingsSlinky.wordpressEditor.wordpressEditorNumbers.`1`
import typingsSlinky.wordpressEditor.wordpressEditorStrings.`object`
import typingsSlinky.wordpressEditor.wordpressEditorStrings.`private`
import typingsSlinky.wordpressEditor.wordpressEditorStrings.`var`
import typingsSlinky.wordpressEditor.wordpressEditorStrings.a
import typingsSlinky.wordpressEditor.wordpressEditorStrings.abbr
import typingsSlinky.wordpressEditor.wordpressEditorStrings.address
import typingsSlinky.wordpressEditor.wordpressEditorStrings.applet
import typingsSlinky.wordpressEditor.wordpressEditorStrings.area
import typingsSlinky.wordpressEditor.wordpressEditorStrings.article
import typingsSlinky.wordpressEditor.wordpressEditorStrings.aside
import typingsSlinky.wordpressEditor.wordpressEditorStrings.audio
import typingsSlinky.wordpressEditor.wordpressEditorStrings.b
import typingsSlinky.wordpressEditor.wordpressEditorStrings.base
import typingsSlinky.wordpressEditor.wordpressEditorStrings.basefont
import typingsSlinky.wordpressEditor.wordpressEditorStrings.bdi
import typingsSlinky.wordpressEditor.wordpressEditorStrings.bdo
import typingsSlinky.wordpressEditor.wordpressEditorStrings.blockquote
import typingsSlinky.wordpressEditor.wordpressEditorStrings.body
import typingsSlinky.wordpressEditor.wordpressEditorStrings.br
import typingsSlinky.wordpressEditor.wordpressEditorStrings.button
import typingsSlinky.wordpressEditor.wordpressEditorStrings.canvas
import typingsSlinky.wordpressEditor.wordpressEditorStrings.caption
import typingsSlinky.wordpressEditor.wordpressEditorStrings.cite
import typingsSlinky.wordpressEditor.wordpressEditorStrings.code
import typingsSlinky.wordpressEditor.wordpressEditorStrings.col
import typingsSlinky.wordpressEditor.wordpressEditorStrings.colgroup
import typingsSlinky.wordpressEditor.wordpressEditorStrings.data
import typingsSlinky.wordpressEditor.wordpressEditorStrings.datalist
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dd
import typingsSlinky.wordpressEditor.wordpressEditorStrings.del
import typingsSlinky.wordpressEditor.wordpressEditorStrings.details
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dfn
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dialog
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dir
import typingsSlinky.wordpressEditor.wordpressEditorStrings.div
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dl
import typingsSlinky.wordpressEditor.wordpressEditorStrings.dt
import typingsSlinky.wordpressEditor.wordpressEditorStrings.edit
import typingsSlinky.wordpressEditor.wordpressEditorStrings.em
import typingsSlinky.wordpressEditor.wordpressEditorStrings.embed
import typingsSlinky.wordpressEditor.wordpressEditorStrings.fieldset
import typingsSlinky.wordpressEditor.wordpressEditorStrings.figcaption
import typingsSlinky.wordpressEditor.wordpressEditorStrings.figure
import typingsSlinky.wordpressEditor.wordpressEditorStrings.font
import typingsSlinky.wordpressEditor.wordpressEditorStrings.footer
import typingsSlinky.wordpressEditor.wordpressEditorStrings.form
import typingsSlinky.wordpressEditor.wordpressEditorStrings.frame
import typingsSlinky.wordpressEditor.wordpressEditorStrings.frameset
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h1
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h2
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h3
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h4
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h5
import typingsSlinky.wordpressEditor.wordpressEditorStrings.h6
import typingsSlinky.wordpressEditor.wordpressEditorStrings.head
import typingsSlinky.wordpressEditor.wordpressEditorStrings.header
import typingsSlinky.wordpressEditor.wordpressEditorStrings.hgroup
import typingsSlinky.wordpressEditor.wordpressEditorStrings.hr
import typingsSlinky.wordpressEditor.wordpressEditorStrings.html
import typingsSlinky.wordpressEditor.wordpressEditorStrings.i
import typingsSlinky.wordpressEditor.wordpressEditorStrings.iframe
import typingsSlinky.wordpressEditor.wordpressEditorStrings.img
import typingsSlinky.wordpressEditor.wordpressEditorStrings.input
import typingsSlinky.wordpressEditor.wordpressEditorStrings.ins
import typingsSlinky.wordpressEditor.wordpressEditorStrings.kbd
import typingsSlinky.wordpressEditor.wordpressEditorStrings.label
import typingsSlinky.wordpressEditor.wordpressEditorStrings.legend
import typingsSlinky.wordpressEditor.wordpressEditorStrings.li
import typingsSlinky.wordpressEditor.wordpressEditorStrings.link
import typingsSlinky.wordpressEditor.wordpressEditorStrings.main
import typingsSlinky.wordpressEditor.wordpressEditorStrings.map
import typingsSlinky.wordpressEditor.wordpressEditorStrings.mark
import typingsSlinky.wordpressEditor.wordpressEditorStrings.marquee
import typingsSlinky.wordpressEditor.wordpressEditorStrings.menu
import typingsSlinky.wordpressEditor.wordpressEditorStrings.meta
import typingsSlinky.wordpressEditor.wordpressEditorStrings.meter
import typingsSlinky.wordpressEditor.wordpressEditorStrings.nav
import typingsSlinky.wordpressEditor.wordpressEditorStrings.noscript
import typingsSlinky.wordpressEditor.wordpressEditorStrings.ol
import typingsSlinky.wordpressEditor.wordpressEditorStrings.optgroup
import typingsSlinky.wordpressEditor.wordpressEditorStrings.option
import typingsSlinky.wordpressEditor.wordpressEditorStrings.output
import typingsSlinky.wordpressEditor.wordpressEditorStrings.p
import typingsSlinky.wordpressEditor.wordpressEditorStrings.param
import typingsSlinky.wordpressEditor.wordpressEditorStrings.password
import typingsSlinky.wordpressEditor.wordpressEditorStrings.picture
import typingsSlinky.wordpressEditor.wordpressEditorStrings.pre
import typingsSlinky.wordpressEditor.wordpressEditorStrings.preview_link
import typingsSlinky.wordpressEditor.wordpressEditorStrings.progress
import typingsSlinky.wordpressEditor.wordpressEditorStrings.public
import typingsSlinky.wordpressEditor.wordpressEditorStrings.q
import typingsSlinky.wordpressEditor.wordpressEditorStrings.rp
import typingsSlinky.wordpressEditor.wordpressEditorStrings.rt
import typingsSlinky.wordpressEditor.wordpressEditorStrings.ruby
import typingsSlinky.wordpressEditor.wordpressEditorStrings.s
import typingsSlinky.wordpressEditor.wordpressEditorStrings.samp
import typingsSlinky.wordpressEditor.wordpressEditorStrings.script
import typingsSlinky.wordpressEditor.wordpressEditorStrings.section
import typingsSlinky.wordpressEditor.wordpressEditorStrings.select
import typingsSlinky.wordpressEditor.wordpressEditorStrings.slot
import typingsSlinky.wordpressEditor.wordpressEditorStrings.small
import typingsSlinky.wordpressEditor.wordpressEditorStrings.source
import typingsSlinky.wordpressEditor.wordpressEditorStrings.span
import typingsSlinky.wordpressEditor.wordpressEditorStrings.strong
import typingsSlinky.wordpressEditor.wordpressEditorStrings.style
import typingsSlinky.wordpressEditor.wordpressEditorStrings.sub
import typingsSlinky.wordpressEditor.wordpressEditorStrings.summary
import typingsSlinky.wordpressEditor.wordpressEditorStrings.sup
import typingsSlinky.wordpressEditor.wordpressEditorStrings.table
import typingsSlinky.wordpressEditor.wordpressEditorStrings.tbody
import typingsSlinky.wordpressEditor.wordpressEditorStrings.td
import typingsSlinky.wordpressEditor.wordpressEditorStrings.template
import typingsSlinky.wordpressEditor.wordpressEditorStrings.textarea
import typingsSlinky.wordpressEditor.wordpressEditorStrings.tfoot
import typingsSlinky.wordpressEditor.wordpressEditorStrings.th
import typingsSlinky.wordpressEditor.wordpressEditorStrings.thead
import typingsSlinky.wordpressEditor.wordpressEditorStrings.time
import typingsSlinky.wordpressEditor.wordpressEditorStrings.title
import typingsSlinky.wordpressEditor.wordpressEditorStrings.tr
import typingsSlinky.wordpressEditor.wordpressEditorStrings.track
import typingsSlinky.wordpressEditor.wordpressEditorStrings.u
import typingsSlinky.wordpressEditor.wordpressEditorStrings.ul
import typingsSlinky.wordpressEditor.wordpressEditorStrings.video
import typingsSlinky.wordpressEditor.wordpressEditorStrings.view
import typingsSlinky.wordpressEditor.wordpressEditorStrings.wbr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor.EditorSettings> */
  @js.native
  trait PartialEditorSettings extends StObject {
    
    var alignWide: js.UndefOr[Boolean] = js.native
    
    var allowedBlockTypes: js.UndefOr[js.Array[String] | Boolean] = js.native
    
    var allowedMimeTypes: js.UndefOr[(Record[String, String]) | Null] = js.native
    
    var autosaveInterval: js.UndefOr[Double] = js.native
    
    var availableLegacyWidgets: js.UndefOr[js.Array[Description]] = js.native
    
    var availableTemplates: js.UndefOr[js.Array[_]] = js.native
    
    var bodyPlaceholder: js.UndefOr[String] = js.native
    
    var codeEditingEnabled: js.UndefOr[Boolean] = js.native
    
    var colors: js.UndefOr[js.Array[EditorColor]] = js.native
    
    var disableCustomColors: js.UndefOr[Boolean] = js.native
    
    var disableCustomEditorFontSizes: js.UndefOr[Boolean] = js.native
    
    var disablePostFormats: js.UndefOr[Boolean] = js.native
    
    var enableCustomFields: js.UndefOr[Boolean] = js.native
    
    var focusMode: js.UndefOr[Boolean] = js.native
    
    var fontSizes: js.UndefOr[js.Array[EditorFontSize]] = js.native
    
    var hasFixedToolbar: js.UndefOr[Boolean] = js.native
    
    var hasPermissionsToManageWidgets: js.UndefOr[Boolean] = js.native
    
    var imageSizes: js.UndefOr[js.Array[EditorImageSize]] = js.native
    
    var isRTL: js.UndefOr[Boolean] = js.native
    
    var maxUploadFileSize: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var postLock: js.UndefOr[IsLocked] = js.native
    
    var postLockUtils: js.UndefOr[AjaxUrl] = js.native
    
    var richEditingEnabled: js.UndefOr[Boolean] = js.native
    
    var styles: js.UndefOr[js.Array[EditorStyle]] = js.native
    
    var titlePlaceholder: js.UndefOr[String] = js.native
  }
  object PartialEditorSettings {
    
    @scala.inline
    def apply(): PartialEditorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEditorSettings]
    }
    
    @scala.inline
    implicit class PartialEditorSettingsMutableBuilder[Self <: PartialEditorSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignWideUndefined: Self = StObject.set(x, "alignWide", js.undefined)
      
      @scala.inline
      def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedBlockTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlockTypesUndefined: Self = StObject.set(x, "allowedBlockTypes", js.undefined)
      
      @scala.inline
      def setAllowedBlockTypesVarargs(value: String*): Self = StObject.set(x, "allowedBlockTypes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "allowedMimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedMimeTypesNull: Self = StObject.set(x, "allowedMimeTypes", null)
      
      @scala.inline
      def setAllowedMimeTypesUndefined: Self = StObject.set(x, "allowedMimeTypes", js.undefined)
      
      @scala.inline
      def setAutosaveInterval(value: Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosaveIntervalUndefined: Self = StObject.set(x, "autosaveInterval", js.undefined)
      
      @scala.inline
      def setAvailableLegacyWidgets(value: js.Array[Description]): Self = StObject.set(x, "availableLegacyWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLegacyWidgetsUndefined: Self = StObject.set(x, "availableLegacyWidgets", js.undefined)
      
      @scala.inline
      def setAvailableLegacyWidgetsVarargs(value: Description*): Self = StObject.set(x, "availableLegacyWidgets", js.Array(value :_*))
      
      @scala.inline
      def setAvailableTemplates(value: js.Array[_]): Self = StObject.set(x, "availableTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableTemplatesUndefined: Self = StObject.set(x, "availableTemplates", js.undefined)
      
      @scala.inline
      def setAvailableTemplatesVarargs(value: js.Any*): Self = StObject.set(x, "availableTemplates", js.Array(value :_*))
      
      @scala.inline
      def setBodyPlaceholder(value: String): Self = StObject.set(x, "bodyPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyPlaceholderUndefined: Self = StObject.set(x, "bodyPlaceholder", js.undefined)
      
      @scala.inline
      def setCodeEditingEnabled(value: Boolean): Self = StObject.set(x, "codeEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeEditingEnabledUndefined: Self = StObject.set(x, "codeEditingEnabled", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
      
      @scala.inline
      def setDisableCustomEditorFontSizes(value: Boolean): Self = StObject.set(x, "disableCustomEditorFontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCustomEditorFontSizesUndefined: Self = StObject.set(x, "disableCustomEditorFontSizes", js.undefined)
      
      @scala.inline
      def setDisablePostFormats(value: Boolean): Self = StObject.set(x, "disablePostFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePostFormatsUndefined: Self = StObject.set(x, "disablePostFormats", js.undefined)
      
      @scala.inline
      def setEnableCustomFields(value: Boolean): Self = StObject.set(x, "enableCustomFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCustomFieldsUndefined: Self = StObject.set(x, "enableCustomFields", js.undefined)
      
      @scala.inline
      def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusModeUndefined: Self = StObject.set(x, "focusMode", js.undefined)
      
      @scala.inline
      def setFontSizes(value: js.Array[EditorFontSize]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
      
      @scala.inline
      def setFontSizesVarargs(value: EditorFontSize*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
      
      @scala.inline
      def setHasFixedToolbar(value: Boolean): Self = StObject.set(x, "hasFixedToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasFixedToolbarUndefined: Self = StObject.set(x, "hasFixedToolbar", js.undefined)
      
      @scala.inline
      def setHasPermissionsToManageWidgets(value: Boolean): Self = StObject.set(x, "hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPermissionsToManageWidgetsUndefined: Self = StObject.set(x, "hasPermissionsToManageWidgets", js.undefined)
      
      @scala.inline
      def setImageSizes(value: js.Array[EditorImageSize]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizesUndefined: Self = StObject.set(x, "imageSizes", js.undefined)
      
      @scala.inline
      def setImageSizesVarargs(value: EditorImageSize*): Self = StObject.set(x, "imageSizes", js.Array(value :_*))
      
      @scala.inline
      def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      @scala.inline
      def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUploadFileSizeUndefined: Self = StObject.set(x, "maxUploadFileSize", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setPostLock(value: IsLocked): Self = StObject.set(x, "postLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLockUndefined: Self = StObject.set(x, "postLock", js.undefined)
      
      @scala.inline
      def setPostLockUtils(value: AjaxUrl): Self = StObject.set(x, "postLockUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLockUtilsUndefined: Self = StObject.set(x, "postLockUtils", js.undefined)
      
      @scala.inline
      def setRichEditingEnabled(value: Boolean): Self = StObject.set(x, "richEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRichEditingEnabledUndefined: Self = StObject.set(x, "richEditingEnabled", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Array[EditorStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setStylesVarargs(value: EditorStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePlaceholderUndefined: Self = StObject.set(x, "titlePlaceholder", js.undefined)
    }
  }
  
  @js.native
  trait PostName extends StObject {
    
    var postName: String = js.native
    
    var prefix: String = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object PostName {
    
    @scala.inline
    def apply(postName: String, prefix: String): PostName = {
      val __obj = js.Dynamic.literal(postName = postName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostName]
    }
    
    @scala.inline
    implicit class PostNameMutableBuilder[Self <: PostName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostName(value: String): Self = StObject.set(x, "postName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait Typeof extends StObject {
    
    def apply(props: Props): ReactElement = js.native
    
    var Slot: ReactComponentClass[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofApply extends StObject {
    
    def apply(props: typingsSlinky.wordpressBlockEditor.blockFormatControlsMod.BlockFormatControls.Props): ReactElement = js.native
    
    var Slot: ReactComponentClass[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofApplySlot extends StObject {
    
    def apply(props: typingsSlinky.wordpressBlockEditor.inspectorControlsMod.InspectorControls.Props): ReactElement = js.native
    
    var Slot: ReactComponentClass[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofButtonBlockerAppender extends StObject {
    
    def apply(props: typingsSlinky.wordpressBlockEditor.innerBlocksMod.InnerBlocks.Props): ReactElement = js.native
    
    /**
      * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
      * default Block is inserted.
      */
    var ButtonBlockerAppender: ReactComponentClass[Children] = js.native
    
    var Content: ReactComponentClass[Children] = js.native
    
    /**
      * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
      * is the `paragraph` block.
      */
    var DefaultBlockAppender: ReactComponentClass[Children] = js.native
  }
  
  @js.native
  trait TypeofContent extends StObject {
    
    def apply(
      props: typingsSlinky.wordpressBlockEditor.richTextMod.RichText.Props[
          a | abbr | address | applet | area | article | aside | audio | b | base | basefont | bdi | bdo | blockquote | body | br | button | canvas | caption | cite | code | col | colgroup | data | datalist | dd | del | details | dfn | dialog | dir | div | dl | dt | em | embed | fieldset | figcaption | figure | font | footer | form | frame | frameset | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | img | input | ins | kbd | label | legend | li | link | main | map | mark | marquee | menu | meta | meter | nav | noscript | `object` | ol | optgroup | option | output | p | param | picture | pre | progress | q | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | strong | style | sub | summary | sup | table | tbody | td | template | textarea | tfoot | th | thead | time | title | tr | track | u | ul | `var` | video | wbr
        ]
    ): ReactElement = js.native
    
    /**
      * Should be used in the `save` function of your block to correctly save rich text content.
      */
    @JSName("Content")
    def Content_a(props: ContentProps[a]): ReactElement = js.native
    @JSName("Content")
    def Content_abbr(props: ContentProps[abbr]): ReactElement = js.native
    @JSName("Content")
    def Content_address(props: ContentProps[address]): ReactElement = js.native
    @JSName("Content")
    def Content_applet(props: ContentProps[applet]): ReactElement = js.native
    @JSName("Content")
    def Content_area(props: ContentProps[area]): ReactElement = js.native
    @JSName("Content")
    def Content_article(props: ContentProps[article]): ReactElement = js.native
    @JSName("Content")
    def Content_aside(props: ContentProps[aside]): ReactElement = js.native
    @JSName("Content")
    def Content_audio(props: ContentProps[audio]): ReactElement = js.native
    @JSName("Content")
    def Content_b(props: ContentProps[b]): ReactElement = js.native
    @JSName("Content")
    def Content_base(props: ContentProps[base]): ReactElement = js.native
    @JSName("Content")
    def Content_basefont(props: ContentProps[basefont]): ReactElement = js.native
    @JSName("Content")
    def Content_bdi(props: ContentProps[bdi]): ReactElement = js.native
    @JSName("Content")
    def Content_bdo(props: ContentProps[bdo]): ReactElement = js.native
    @JSName("Content")
    def Content_blockquote(props: ContentProps[blockquote]): ReactElement = js.native
    @JSName("Content")
    def Content_body(props: ContentProps[body]): ReactElement = js.native
    @JSName("Content")
    def Content_br(props: ContentProps[br]): ReactElement = js.native
    @JSName("Content")
    def Content_button(props: ContentProps[button]): ReactElement = js.native
    @JSName("Content")
    def Content_canvas(props: ContentProps[canvas]): ReactElement = js.native
    @JSName("Content")
    def Content_caption(props: ContentProps[caption]): ReactElement = js.native
    @JSName("Content")
    def Content_cite(props: ContentProps[cite]): ReactElement = js.native
    @JSName("Content")
    def Content_code(props: ContentProps[code]): ReactElement = js.native
    @JSName("Content")
    def Content_col(props: ContentProps[col]): ReactElement = js.native
    @JSName("Content")
    def Content_colgroup(props: ContentProps[colgroup]): ReactElement = js.native
    @JSName("Content")
    def Content_data(props: ContentProps[data]): ReactElement = js.native
    @JSName("Content")
    def Content_datalist(props: ContentProps[datalist]): ReactElement = js.native
    @JSName("Content")
    def Content_dd(props: ContentProps[dd]): ReactElement = js.native
    @JSName("Content")
    def Content_del(props: ContentProps[del]): ReactElement = js.native
    @JSName("Content")
    def Content_details(props: ContentProps[details]): ReactElement = js.native
    @JSName("Content")
    def Content_dfn(props: ContentProps[dfn]): ReactElement = js.native
    @JSName("Content")
    def Content_dialog(props: ContentProps[dialog]): ReactElement = js.native
    @JSName("Content")
    def Content_dir(props: ContentProps[dir]): ReactElement = js.native
    @JSName("Content")
    def Content_div(props: ContentProps[div]): ReactElement = js.native
    @JSName("Content")
    def Content_dl(props: ContentProps[dl]): ReactElement = js.native
    @JSName("Content")
    def Content_dt(props: ContentProps[dt]): ReactElement = js.native
    @JSName("Content")
    def Content_em(props: ContentProps[em]): ReactElement = js.native
    @JSName("Content")
    def Content_embed(props: ContentProps[embed]): ReactElement = js.native
    @JSName("Content")
    def Content_fieldset(props: ContentProps[fieldset]): ReactElement = js.native
    @JSName("Content")
    def Content_figcaption(props: ContentProps[figcaption]): ReactElement = js.native
    @JSName("Content")
    def Content_figure(props: ContentProps[figure]): ReactElement = js.native
    @JSName("Content")
    def Content_font(props: ContentProps[font]): ReactElement = js.native
    @JSName("Content")
    def Content_footer(props: ContentProps[footer]): ReactElement = js.native
    @JSName("Content")
    def Content_form(props: ContentProps[form]): ReactElement = js.native
    @JSName("Content")
    def Content_frame(props: ContentProps[frame]): ReactElement = js.native
    @JSName("Content")
    def Content_frameset(props: ContentProps[frameset]): ReactElement = js.native
    @JSName("Content")
    def Content_h1(props: ContentProps[h1]): ReactElement = js.native
    @JSName("Content")
    def Content_h2(props: ContentProps[h2]): ReactElement = js.native
    @JSName("Content")
    def Content_h3(props: ContentProps[h3]): ReactElement = js.native
    @JSName("Content")
    def Content_h4(props: ContentProps[h4]): ReactElement = js.native
    @JSName("Content")
    def Content_h5(props: ContentProps[h5]): ReactElement = js.native
    @JSName("Content")
    def Content_h6(props: ContentProps[h6]): ReactElement = js.native
    @JSName("Content")
    def Content_head(props: ContentProps[head]): ReactElement = js.native
    @JSName("Content")
    def Content_header(props: ContentProps[header]): ReactElement = js.native
    @JSName("Content")
    def Content_hgroup(props: ContentProps[hgroup]): ReactElement = js.native
    @JSName("Content")
    def Content_hr(props: ContentProps[hr]): ReactElement = js.native
    @JSName("Content")
    def Content_html(props: ContentProps[html]): ReactElement = js.native
    @JSName("Content")
    def Content_i(props: ContentProps[i]): ReactElement = js.native
    @JSName("Content")
    def Content_iframe(props: ContentProps[iframe]): ReactElement = js.native
    @JSName("Content")
    def Content_img(props: ContentProps[img]): ReactElement = js.native
    @JSName("Content")
    def Content_input(props: ContentProps[input]): ReactElement = js.native
    @JSName("Content")
    def Content_ins(props: ContentProps[ins]): ReactElement = js.native
    @JSName("Content")
    def Content_kbd(props: ContentProps[kbd]): ReactElement = js.native
    @JSName("Content")
    def Content_label(props: ContentProps[label]): ReactElement = js.native
    @JSName("Content")
    def Content_legend(props: ContentProps[legend]): ReactElement = js.native
    @JSName("Content")
    def Content_li(props: ContentProps[li]): ReactElement = js.native
    @JSName("Content")
    def Content_link(props: ContentProps[link]): ReactElement = js.native
    @JSName("Content")
    def Content_main(props: ContentProps[main]): ReactElement = js.native
    @JSName("Content")
    def Content_map(props: ContentProps[map]): ReactElement = js.native
    @JSName("Content")
    def Content_mark(props: ContentProps[mark]): ReactElement = js.native
    @JSName("Content")
    def Content_marquee(props: ContentProps[marquee]): ReactElement = js.native
    @JSName("Content")
    def Content_menu(props: ContentProps[menu]): ReactElement = js.native
    @JSName("Content")
    def Content_meta(props: ContentProps[meta]): ReactElement = js.native
    @JSName("Content")
    def Content_meter(props: ContentProps[meter]): ReactElement = js.native
    @JSName("Content")
    def Content_nav(props: ContentProps[nav]): ReactElement = js.native
    @JSName("Content")
    def Content_noscript(props: ContentProps[noscript]): ReactElement = js.native
    @JSName("Content")
    def Content_object(props: ContentProps[`object`]): ReactElement = js.native
    @JSName("Content")
    def Content_ol(props: ContentProps[ol]): ReactElement = js.native
    @JSName("Content")
    def Content_optgroup(props: ContentProps[optgroup]): ReactElement = js.native
    @JSName("Content")
    def Content_option(props: ContentProps[option]): ReactElement = js.native
    @JSName("Content")
    def Content_output(props: ContentProps[output]): ReactElement = js.native
    @JSName("Content")
    def Content_p(props: ContentProps[p]): ReactElement = js.native
    @JSName("Content")
    def Content_param(props: ContentProps[param]): ReactElement = js.native
    @JSName("Content")
    def Content_picture(props: ContentProps[picture]): ReactElement = js.native
    @JSName("Content")
    def Content_pre(props: ContentProps[pre]): ReactElement = js.native
    @JSName("Content")
    def Content_progress(props: ContentProps[progress]): ReactElement = js.native
    @JSName("Content")
    def Content_q(props: ContentProps[q]): ReactElement = js.native
    @JSName("Content")
    def Content_rp(props: ContentProps[rp]): ReactElement = js.native
    @JSName("Content")
    def Content_rt(props: ContentProps[rt]): ReactElement = js.native
    @JSName("Content")
    def Content_ruby(props: ContentProps[ruby]): ReactElement = js.native
    @JSName("Content")
    def Content_s(props: ContentProps[s]): ReactElement = js.native
    @JSName("Content")
    def Content_samp(props: ContentProps[samp]): ReactElement = js.native
    @JSName("Content")
    def Content_script(props: ContentProps[script]): ReactElement = js.native
    @JSName("Content")
    def Content_section(props: ContentProps[section]): ReactElement = js.native
    @JSName("Content")
    def Content_select(props: ContentProps[select]): ReactElement = js.native
    @JSName("Content")
    def Content_slot(props: ContentProps[slot]): ReactElement = js.native
    @JSName("Content")
    def Content_small(props: ContentProps[small]): ReactElement = js.native
    @JSName("Content")
    def Content_source(props: ContentProps[source]): ReactElement = js.native
    @JSName("Content")
    def Content_span(props: ContentProps[span]): ReactElement = js.native
    @JSName("Content")
    def Content_strong(props: ContentProps[strong]): ReactElement = js.native
    @JSName("Content")
    def Content_style(props: ContentProps[style]): ReactElement = js.native
    @JSName("Content")
    def Content_sub(props: ContentProps[sub]): ReactElement = js.native
    @JSName("Content")
    def Content_summary(props: ContentProps[summary]): ReactElement = js.native
    @JSName("Content")
    def Content_sup(props: ContentProps[sup]): ReactElement = js.native
    @JSName("Content")
    def Content_table(props: ContentProps[table]): ReactElement = js.native
    @JSName("Content")
    def Content_tbody(props: ContentProps[tbody]): ReactElement = js.native
    @JSName("Content")
    def Content_td(props: ContentProps[td]): ReactElement = js.native
    @JSName("Content")
    def Content_template(props: ContentProps[template]): ReactElement = js.native
    @JSName("Content")
    def Content_textarea(props: ContentProps[textarea]): ReactElement = js.native
    @JSName("Content")
    def Content_tfoot(props: ContentProps[tfoot]): ReactElement = js.native
    @JSName("Content")
    def Content_th(props: ContentProps[th]): ReactElement = js.native
    @JSName("Content")
    def Content_thead(props: ContentProps[thead]): ReactElement = js.native
    @JSName("Content")
    def Content_time(props: ContentProps[time]): ReactElement = js.native
    @JSName("Content")
    def Content_title(props: ContentProps[title]): ReactElement = js.native
    @JSName("Content")
    def Content_tr(props: ContentProps[tr]): ReactElement = js.native
    @JSName("Content")
    def Content_track(props: ContentProps[track]): ReactElement = js.native
    @JSName("Content")
    def Content_u(props: ContentProps[u]): ReactElement = js.native
    @JSName("Content")
    def Content_ul(props: ContentProps[ul]): ReactElement = js.native
    @JSName("Content")
    def Content_var(props: ContentProps[`var`]): ReactElement = js.native
    @JSName("Content")
    def Content_video(props: ContentProps[video]): ReactElement = js.native
    @JSName("Content")
    def Content_wbr(props: ContentProps[wbr]): ReactElement = js.native
    
    def isEmpty(value: String): Boolean = js.native
    def isEmpty(value: js.Array[String]): Boolean = js.native
  }
  
  @js.native
  trait TypeofSlot extends StObject {
    
    def apply(
      props: typingsSlinky.wordpressBlockEditor.inspectorAdvancedControlsMod.InspectorAdvancedControls.Props
    ): ReactElement = js.native
    
    var Slot: ReactComponentClass[OmitPropsname] = js.native
  }
  
  @js.native
  trait TypeofimportedActions extends StObject {
    
    def autosave(): IterableIterator[Unit] = js.native
    def autosave(options: Record[String, Boolean]): IterableIterator[Unit] = js.native
    
    def clearSelectedBlock(): Unit = js.native
    
    def createUndoLevel(): Unit = js.native
    
    def disablePublishSidebar(): Unit = js.native
    
    def editPost(edits: Record[String, _]): Unit = js.native
    
    def enablePublishSidebar(): Unit = js.native
    
    def enterFormattedText(): Unit = js.native
    
    def exitFormattedText(): Unit = js.native
    
    def hideInsertionPoint(): Unit = js.native
    
    def insertBlock(block: BlockInstance[StringDictionary[_]]): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[_]],
      index: js.UndefOr[scala.Nothing],
      rootClientId: js.UndefOr[scala.Nothing],
      updateSelection: Boolean
    ): Unit = js.native
    def insertBlock(block: BlockInstance[StringDictionary[_]], index: js.UndefOr[scala.Nothing], rootClientId: String): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[_]],
      index: js.UndefOr[scala.Nothing],
      rootClientId: String,
      updateSelection: Boolean
    ): Unit = js.native
    def insertBlock(block: BlockInstance[StringDictionary[_]], index: Double): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[_]],
      index: Double,
      rootClientId: js.UndefOr[scala.Nothing],
      updateSelection: Boolean
    ): Unit = js.native
    def insertBlock(block: BlockInstance[StringDictionary[_]], index: Double, rootClientId: String): Unit = js.native
    def insertBlock(
      block: BlockInstance[StringDictionary[_]],
      index: Double,
      rootClientId: String,
      updateSelection: Boolean
    ): Unit = js.native
    
    def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      index: js.UndefOr[scala.Nothing],
      rootClientId: js.UndefOr[scala.Nothing],
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      index: js.UndefOr[scala.Nothing],
      rootClientId: String
    ): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      index: js.UndefOr[scala.Nothing],
      rootClientId: String,
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]], index: Double): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      index: Double,
      rootClientId: js.UndefOr[scala.Nothing],
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    def insertBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]], index: Double, rootClientId: String): IterableIterator[Unit] = js.native
    def insertBlocks(
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      index: Double,
      rootClientId: String,
      updateSelection: Boolean
    ): IterableIterator[Unit] = js.native
    
    def insertDefaultBlock(): Unit = js.native
    def insertDefaultBlock(attributes: js.UndefOr[scala.Nothing], rootClientId: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
    def insertDefaultBlock(attributes: js.UndefOr[scala.Nothing], rootClientId: String): Unit = js.native
    def insertDefaultBlock(attributes: js.UndefOr[scala.Nothing], rootClientId: String, index: Double): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, _]): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, _], rootClientId: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, _], rootClientId: String): Unit = js.native
    def insertDefaultBlock(attributes: Record[String, _], rootClientId: String, index: Double): Unit = js.native
    
    def lockPostSaving(lockName: String): Unit = js.native
    
    def mergeBlocks(firstBlockClientId: String, secondBlockClientId: String): Unit = js.native
    
    def moveBlockToPosition(
      clientId: js.UndefOr[scala.Nothing],
      fromRootClientId: js.UndefOr[scala.Nothing],
      toRootClientId: js.UndefOr[scala.Nothing],
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: js.UndefOr[scala.Nothing],
      fromRootClientId: js.UndefOr[scala.Nothing],
      toRootClientId: String,
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: js.UndefOr[scala.Nothing],
      fromRootClientId: String,
      toRootClientId: js.UndefOr[scala.Nothing],
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: js.UndefOr[scala.Nothing],
      fromRootClientId: String,
      toRootClientId: String,
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: String,
      fromRootClientId: js.UndefOr[scala.Nothing],
      toRootClientId: js.UndefOr[scala.Nothing],
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: String,
      fromRootClientId: js.UndefOr[scala.Nothing],
      toRootClientId: String,
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(
      clientId: String,
      fromRootClientId: String,
      toRootClientId: js.UndefOr[scala.Nothing],
      index: Double
    ): IterableIterator[Unit] = js.native
    def moveBlockToPosition(clientId: String, fromRootClientId: String, toRootClientId: String, index: Double): IterableIterator[Unit] = js.native
    
    def moveBlocksDown(clientIds: String, rootClientId: String): Unit = js.native
    def moveBlocksDown(clientIds: js.Array[String], rootClientId: String): Unit = js.native
    
    def moveBlocksUp(clientIds: String, rootClientId: String): Unit = js.native
    def moveBlocksUp(clientIds: js.Array[String], rootClientId: String): Unit = js.native
    
    def multiSelect(start: String, end: String): Unit = js.native
    
    def receiveBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
    
    def redo(): Unit = js.native
    
    def refreshPost(): IterableIterator[Unit] = js.native
    
    def removeBlock(clientId: String): Unit = js.native
    def removeBlock(clientId: String, selectPrevious: Boolean): Unit = js.native
    
    def removeBlocks(clientIds: String): IterableIterator[Unit] = js.native
    def removeBlocks(clientIds: String, selectPrevious: Boolean): IterableIterator[Unit] = js.native
    def removeBlocks(clientIds: js.Array[String]): IterableIterator[Unit] = js.native
    def removeBlocks(clientIds: js.Array[String], selectPrevious: Boolean): IterableIterator[Unit] = js.native
    
    def replaceBlock(clientId: String, block: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
    def replaceBlock(clientId: String, block: BlockInstance[StringDictionary[_]]): Unit = js.native
    def replaceBlock(clientId: js.Array[String], block: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
    def replaceBlock(clientId: js.Array[String], block: BlockInstance[StringDictionary[_]]): Unit = js.native
    
    def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: String, blocks: js.Array[BlockInstance[StringDictionary[_]]], indexToSelect: Double): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[_]]): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: String, blocks: BlockInstance[StringDictionary[_]], indexToSelect: Double): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: js.Array[String], blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
    def replaceBlocks(
      clientIds: js.Array[String],
      blocks: js.Array[BlockInstance[StringDictionary[_]]],
      indexToSelect: Double
    ): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[_]]): IterableIterator[Unit] = js.native
    def replaceBlocks(clientIds: js.Array[String], blocks: BlockInstance[StringDictionary[_]], indexToSelect: Double): IterableIterator[Unit] = js.native
    
    def resetAutosave(newAutosave: Autosave): IterableIterator[Unit] = js.native
    
    def resetBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Unit = js.native
    
    def resetEditorBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]]): IterableIterator[Unit] = js.native
    def resetEditorBlocks(blocks: js.Array[BlockInstance[StringDictionary[_]]], options: Record[String, _]): IterableIterator[Unit] = js.native
    
    def resetPost(post: Record[String, _]): Unit = js.native
    
    def savePost(): IterableIterator[Unit] = js.native
    def savePost(options: Record[String, _]): IterableIterator[Unit] = js.native
    
    def selectBlock(clientId: String): Unit = js.native
    def selectBlock(clientId: String, initialPosition: Double): Unit = js.native
    
    def setTemplateValidity(isValid: Boolean): Unit = js.native
    
    def setupEditor(post: Record[String, _]): IterableIterator[Unit] = js.native
    def setupEditor(post: Record[String, _], edits: js.UndefOr[scala.Nothing], template: TemplateArray): IterableIterator[Unit] = js.native
    def setupEditor(post: Record[String, _], edits: Record[String, _]): IterableIterator[Unit] = js.native
    def setupEditor(post: Record[String, _], edits: Record[String, _], template: TemplateArray): IterableIterator[Unit] = js.native
    
    def setupEditorState(post: Record[String, _]): Unit = js.native
    
    def showInsertionPoint(): Unit = js.native
    def showInsertionPoint(rootClientId: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
    def showInsertionPoint(rootClientId: String): Unit = js.native
    def showInsertionPoint(rootClientId: String, index: Double): Unit = js.native
    
    def startMultiSelect(): Unit = js.native
    
    def startTyping(): Unit = js.native
    
    def stopMultiSelect(): Unit = js.native
    
    def stopTyping(): Unit = js.native
    
    def synchronizeTemplate(): Unit = js.native
    
    def toggleBlockMode(clientId: String): Unit = js.native
    
    def toggleSelection(): Unit = js.native
    def toggleSelection(isSelectionEnabled: Boolean): Unit = js.native
    
    def trashPost(): IterableIterator[Unit] = js.native
    
    def undo(): Unit = js.native
    
    def unlockPostSaving(lockName: String): Unit = js.native
    
    def updateBlock(clientId: String, updates: PartialBlockInstancekstri): Unit = js.native
    
    def updateBlockAttributes(clientId: String, attributes: Record[String, _]): Unit = js.native
    
    def updateBlockListSettings(clientId: String, settings: EditorBlockListSettings): Unit = js.native
    
    def updateEditorSettings(settings: PartialEditorSettings): Unit = js.native
    
    def updatePost(edits: Record[String, _]): Unit = js.native
    
    def updatePostLock(lock: IsLocked): Unit = js.native
  }
  
  @js.native
  trait TypeofimportedSelectors extends StObject {
    
    def canInsertBlockType(blockName: String): Boolean = js.native
    def canInsertBlockType(blockName: String, rootClientId: String): Boolean = js.native
    
    def canUserUseUnfilteredHTML(): Boolean = js.native
    
    def didPostSaveRequestFail(): Boolean = js.native
    
    def didPostSaveRequestSucceed(): Boolean = js.native
    
    def getActivePostLock(): js.UndefOr[String] = js.native
    
    def getAdjacentBlockClientId(): String | Null = js.native
    def getAdjacentBlockClientId(startClientId: String): String | Null = js.native
    @JSName("getAdjacentBlockClientId")
    def getAdjacentBlockClientId_1(startClientId: js.UndefOr[scala.Nothing], modifier: `-1`): String | Null = js.native
    @JSName("getAdjacentBlockClientId")
    def getAdjacentBlockClientId_1(startClientId: js.UndefOr[scala.Nothing], modifier: `1`): String | Null = js.native
    @JSName("getAdjacentBlockClientId")
    def getAdjacentBlockClientId_1(startClientId: String, modifier: `-1`): String | Null = js.native
    @JSName("getAdjacentBlockClientId")
    def getAdjacentBlockClientId_1(startClientId: String, modifier: `1`): String | Null = js.native
    
    def getAutosave(): Autosave | js.Object = js.native
    
    @JSName("getAutosaveAttribute")
    def getAutosaveAttribute_previewlink(attributeName: preview_link): String | js.Object = js.native
    
    def getBlock(clientId: String): BlockInstance[StringDictionary[_]] | Null = js.native
    
    def getBlockAttributes(clientId: String): (Record[String, _]) | Null = js.native
    
    def getBlockCount(): Double = js.native
    def getBlockCount(rootClientId: String): Double = js.native
    
    def getBlockHierarchyRootClientId(clientId: String): String = js.native
    
    def getBlockIndex(clientId: String): Double = js.native
    def getBlockIndex(clientId: String, rootClientId: String): Double = js.native
    
    def getBlockInsertionPoint(): Index = js.native
    
    def getBlockListSettings(): js.UndefOr[EditorBlockListSettings] = js.native
    def getBlockListSettings(clientId: String): js.UndefOr[EditorBlockListSettings] = js.native
    
    def getBlockMode(clientId: String): EditorBlockMode = js.native
    
    def getBlockName(clientId: String): String | Null = js.native
    
    def getBlockOrder(): js.Array[String] = js.native
    def getBlockOrder(rootClientId: String): js.Array[String] = js.native
    
    def getBlockRootClientId(clientId: String): String | Null = js.native
    
    def getBlockSelectionEnd(): js.UndefOr[String] = js.native
    
    def getBlockSelectionStart(): js.UndefOr[String] = js.native
    
    def getBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
    def getBlocks(rootClientId: String): js.Array[BlockInstance[StringDictionary[_]]] = js.native
    
    def getBlocksByClientId(clientIds: String): js.Array[BlockInstance[StringDictionary[_]] | Null] = js.native
    def getBlocksByClientId(clientIds: js.Array[String]): js.Array[BlockInstance[StringDictionary[_]] | Null] = js.native
    
    def getBlocksForSerialization(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
    
    def getClientIdsOfDescendants(clientIds: js.Array[String]): js.Array[String] = js.native
    
    def getClientIdsWithDescendants(): js.Array[String] = js.native
    
    def getCurrentPost(): Decontextualize[PostOrPage[edit]] = js.native
    
    def getCurrentPostAttribute[T /* <: /* keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
      ] = js.native
    
    def getCurrentPostId(): Double = js.native
    
    def getCurrentPostLastRevisionId(): Double | Null = js.native
    
    def getCurrentPostRevisionsCount(): Double = js.native
    
    def getCurrentPostType(): String = js.native
    
    def getEditedPostAttribute[T /* <: /* keyof @wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'> */ String */](attributeName: T): js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @wordpress/api-fetch.@wordpress/api-fetch.Schema.Decontextualize<@wordpress/api-fetch.@wordpress/api-fetch.Schema.PostOrPage<'edit'>>[T] */ js.Any
      ] = js.native
    
    def getEditedPostContent(): String = js.native
    
    def getEditedPostPreviewLink(): String | Null = js.native
    
    def getEditedPostVisibility(): password | `private` | public = js.native
    
    def getEditorBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
    
    def getEditorSettings(): EditorSettings = js.native
    
    def getFirstMultiSelectedBlockClientId(): String | Null = js.native
    
    def getGlobalBlockCount(): Double = js.native
    def getGlobalBlockCount(blockName: String): Double = js.native
    
    def getInserterItems(): js.Array[EditorInserterItem] = js.native
    def getInserterItems(rootClientId: String): js.Array[EditorInserterItem] = js.native
    
    def getLastMultiSelectedBlockClientId(): String | Null = js.native
    
    def getMultiSelectedBlockClientIds(): js.Array[String] = js.native
    
    def getMultiSelectedBlocks(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
    
    def getMultiSelectedBlocksEndClientId(): String | Null = js.native
    
    def getMultiSelectedBlocksStartClientId(): String | Null = js.native
    
    def getNextBlockClientId(): String | Null = js.native
    def getNextBlockClientId(startClientId: String): String | Null = js.native
    
    def getPermalink(): String | Null = js.native
    
    def getPermalinkParts(): PostName | Null = js.native
    
    def getPostEdits(): Partial[Decontextualize[PostOrPage[edit]]] = js.native
    
    def getPostLockUser(): js.UndefOr[User[view] | Null] = js.native
    
    def getPreviousBlockClientId(): String | Null = js.native
    def getPreviousBlockClientId(startClientId: String): String | Null = js.native
    
    def getReferenceByDistinctEdits(): js.Array[js.Any] = js.native
    
    def getSelectedBlock(): BlockInstance[StringDictionary[_]] | Null = js.native
    
    def getSelectedBlockClientId(): String | Null = js.native
    
    def getSelectedBlockCount(): Double = js.native
    
    def getSelectedBlocksInitialCaretPosition(): Double | Null = js.native
    
    def getStateBeforeOptimisticTransaction(transactionId: js.Object): js.Any = js.native
    
    def getSuggestedPostFormat(): String | Null = js.native
    
    def getTemplate(): js.Any = js.native
    
    def getTemplateLock(): js.UndefOr[String] = js.native
    def getTemplateLock(rootClientId: String): js.UndefOr[String] = js.native
    
    def hasAutosave(): Boolean = js.native
    
    def hasChangedContent(): Boolean = js.native
    
    def hasEditorRedo(): Boolean = js.native
    
    def hasEditorUndo(): Boolean = js.native
    
    def hasInserterItems(): Boolean = js.native
    def hasInserterItems(rootClientId: String): Boolean = js.native
    
    def hasMultiSelection(): Boolean = js.native
    
    def hasSelectedBlock(): Boolean = js.native
    
    def hasSelectedInnerBlock(clientId: String): Boolean = js.native
    def hasSelectedInnerBlock(clientId: String, deep: Boolean): Boolean = js.native
    
    def inSomeHistory(predicate: js.Function1[/* state */ Record[String, _], Boolean]): Boolean = js.native
    
    def isAncestorMultiSelected(clientId: String): Boolean = js.native
    
    def isAutosavingPost(): Boolean = js.native
    
    def isBlockInsertionPointVisible(): Boolean = js.native
    
    def isBlockMultiSelected(clientId: String): Boolean = js.native
    
    def isBlockSelected(clientId: String): Boolean = js.native
    
    def isBlockValid(clientId: String): Boolean = js.native
    
    def isBlockWithinSelection(clientId: String): Boolean = js.native
    
    def isCaretWithinFormattedText(): Boolean = js.native
    
    def isCleanNewPost(): Boolean = js.native
    
    def isCurrentPostPending(): Boolean = js.native
    
    def isCurrentPostPublished(): Boolean = js.native
    
    def isCurrentPostScheduled(): Boolean = js.native
    
    def isEditedPostAutosaveable(): Boolean = js.native
    
    def isEditedPostBeingScheduled(): Boolean = js.native
    
    def isEditedPostDateFloating(): Boolean = js.native
    
    def isEditedPostDirty(): Boolean = js.native
    
    def isEditedPostEmpty(): Boolean = js.native
    
    def isEditedPostNew(): Boolean = js.native
    
    def isEditedPostPublishable(): Boolean = js.native
    
    def isEditedPostSaveable(): Boolean = js.native
    
    def isFirstMultiSelectedBlock(clientId: String): Boolean = js.native
    
    def isMultiSelecting(): Boolean = js.native
    
    def isPermalinkEditable(): Boolean = js.native
    
    def isPostLockTakeover(): Boolean = js.native
    
    def isPostLocked(): Boolean = js.native
    
    def isPostSavingLocked(): Boolean = js.native
    
    def isPreviewingPost(): Boolean = js.native
    
    def isPublishSidebarEnabled(): Boolean = js.native
    
    def isPublishingPost(): Boolean = js.native
    
    def isSavingPost(): Boolean = js.native
    
    def isSelectionEnabled(): Boolean = js.native
    
    def isTyping(): Boolean = js.native
    
    def isValidTemplate(): Boolean = js.native
  }
}
