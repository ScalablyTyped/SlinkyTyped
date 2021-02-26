package typingsSlinky.wordpressBlockEditor

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.std.Omit
import typingsSlinky.std.Record
import typingsSlinky.wordpressBlockEditor.alignmentToolbarMod.AlignmentToolbar.Props
import typingsSlinky.wordpressBlockEditor.anon.AjaxUrl
import typingsSlinky.wordpressBlockEditor.anon.Children
import typingsSlinky.wordpressBlockEditor.anon.Description
import typingsSlinky.wordpressBlockEditor.anon.IsLocked
import typingsSlinky.wordpressBlockEditor.anon.OmitPropsname
import typingsSlinky.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typingsSlinky.wordpressBlockEditor.anon.PartialProps
import typingsSlinky.wordpressBlockEditor.anon.PickEditorColorcolor
import typingsSlinky.wordpressBlockEditor.anon.TypeofimportedActions
import typingsSlinky.wordpressBlockEditor.anon.TypeofimportedSelectors
import typingsSlinky.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.`coreSlashblock-editor`
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.`object`
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.`var`
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.a
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.abbr
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.address
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.applet
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.area
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.article
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.aside
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.audio
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.b
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.base
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.basefont
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.bdi
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.bdo
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.blockquote
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.body
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.br
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.button
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.canvas
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.caption
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.cite
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.code
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.col
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.colgroup
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.colors
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.data
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.datalist
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dd
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.del
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.details
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dfn
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dialog
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dir
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.disableCustomColors
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.div
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dl
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.dt
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.em
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.embed
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.fieldset
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.figcaption
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.figure
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.font
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.footer
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.form
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.frame
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.frameset
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h1
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h2
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h3
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h4
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h5
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h6
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.hasColorsToChoose
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.head
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.header
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.hgroup
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.hr
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.html
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.i
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.iframe
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.img
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.input
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ins
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.kbd
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.label
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.legend
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.li
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.link
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.main
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.map
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.mark
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.marquee
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.menu
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.meta
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.meter
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.nav
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.noscript
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ol
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.optgroup
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.option
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.output
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.p
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.param
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.picture
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.pre
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.progress
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.q
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.rp
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.rt
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ruby
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.s
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.samp
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.script
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.section
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.select
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.slot
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.small
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.source
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.span
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.strong
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.style
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.sub
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.summary
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.sup
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.table
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.tbody
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.td
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.template
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.textarea
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.tfoot
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.th
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.thead
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.time
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.title
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.tr
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.track
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.u
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ul
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.video
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.wbr
import typingsSlinky.wordpressBlocks.mod.BlockIconNormalized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/block-editor", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ReactComponentClass[Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  @JSImport("@wordpress/block-editor", "Autocomplete")
  @js.native
  def Autocomplete[T](props: typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): ReactElement = js.native
  
  @JSImport("@wordpress/block-editor", "BlockAlignmentToolbar")
  @js.native
  val BlockAlignmentToolbar: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.blockAlignmentToolbarMod.BlockAlignmentToolbar.Props
  ] = js.native
  
  object BlockControls {
    
    @JSImport("@wordpress/block-editor", "BlockControls")
    @js.native
    def apply(props: typingsSlinky.wordpressBlockEditor.blockControlsMod.BlockControls.Props): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "BlockControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "BlockControls.Slot")
    @js.native
    def Slot: ReactComponentClass[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: ReactComponentClass[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "BlockEdit")
  @js.native
  val BlockEdit: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockEditMod.BlockEdit.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockEditorKeyboardShortcuts")
  @js.native
  val BlockEditorKeyboardShortcuts: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.blockEditorKeyboardShortcutsMod.BlockEditorKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockEditorProvider")
  @js.native
  val BlockEditorProvider: ReactComponentClass[typingsSlinky.wordpressBlockEditor.providerMod.BlockEditorProvider.Props] = js.native
  
  object BlockFormatControls {
    
    @JSImport("@wordpress/block-editor", "BlockFormatControls")
    @js.native
    def apply(props: typingsSlinky.wordpressBlockEditor.blockFormatControlsMod.BlockFormatControls.Props): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "BlockFormatControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "BlockFormatControls.Slot")
    @js.native
    def Slot: ReactComponentClass[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: ReactComponentClass[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "BlockIcon")
  @js.native
  val BlockIcon: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockIconMod.BlockIcon.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockInspector")
  @js.native
  val BlockInspector: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockInspectorMod.BlockInspector.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockList")
  @js.native
  val BlockList: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockListMod.BlockList.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockMover")
  @js.native
  val BlockMover: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockMoverMod.BlockMover.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockNavigationDropdown")
  @js.native
  val BlockNavigationDropdown: ReactComponentClass[typingsSlinky.wordpressBlockEditor.dropdownMod.BlockNavigationDropdown.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockSelectionClearer")
  @js.native
  val BlockSelectionClearer: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.blockSelectionClearerMod.BlockSelectionClearer.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockSettingsMenu")
  @js.native
  val BlockSettingsMenu: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockSettingsMenuMod.BlockSettingsMenu.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockTitle")
  @js.native
  val BlockTitle: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockTitleMod.BlockTitle.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockToolbar")
  @js.native
  val BlockToolbar: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockToolbarMod.BlockToolbar.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "BlockVerticalAlignmentToolbar")
  @js.native
  val BlockVerticalAlignmentToolbar: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.blockVerticalAlignmentToolbarMod.BlockVerticalAlignmentToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "ButtonBlockerAppender")
  @js.native
  val ButtonBlockerAppender: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.buttonBlockAppenderMod.ButtonBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "ColorPalette")
  @js.native
  val ColorPalette: ReactComponentClass[typingsSlinky.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "ContrastChecker")
  @js.native
  val ContrastChecker: ReactComponentClass[typingsSlinky.wordpressBlockEditor.contrastCheckerMod.ContrastChecker.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "CopyHandler")
  @js.native
  val CopyHandler: ReactComponentClass[typingsSlinky.wordpressBlockEditor.copyHandlerMod.CopyHandler.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "DefaultBlockAppender")
  @js.native
  val DefaultBlockAppender: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.defaultBlockAppenderMod.DefaultBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "FontSizePicker")
  @js.native
  val FontSizePicker: ReactComponentClass[typingsSlinky.wordpressBlockEditor.fontSizesMod.FontSizePicker.Props] = js.native
  
  object InnerBlocks {
    
    @JSImport("@wordpress/block-editor", "InnerBlocks")
    @js.native
    def apply(props: typingsSlinky.wordpressBlockEditor.innerBlocksMod.InnerBlocks.Props): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "InnerBlocks")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
      * default Block is inserted.
      */
    @JSImport("@wordpress/block-editor", "InnerBlocks.ButtonBlockerAppender")
    @js.native
    def ButtonBlockerAppender: ReactComponentClass[Children] = js.native
    @scala.inline
    def ButtonBlockerAppender_=(x: ReactComponentClass[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ButtonBlockerAppender")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "InnerBlocks.Content")
    @js.native
    def Content: ReactComponentClass[Children] = js.native
    @scala.inline
    def Content_=(x: ReactComponentClass[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    /**
      * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
      * is the `paragraph` block.
      */
    @JSImport("@wordpress/block-editor", "InnerBlocks.DefaultBlockAppender")
    @js.native
    def DefaultBlockAppender: ReactComponentClass[Children] = js.native
    @scala.inline
    def DefaultBlockAppender_=(x: ReactComponentClass[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlockAppender")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "Inserter")
  @js.native
  val Inserter: ReactComponentClass[typingsSlinky.wordpressBlockEditor.inserterMod.Inserter.Props] = js.native
  
  object InspectorAdvancedControls {
    
    @JSImport("@wordpress/block-editor", "InspectorAdvancedControls")
    @js.native
    def apply(
      props: typingsSlinky.wordpressBlockEditor.inspectorAdvancedControlsMod.InspectorAdvancedControls.Props
    ): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "InspectorAdvancedControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "InspectorAdvancedControls.Slot")
    @js.native
    def Slot: ReactComponentClass[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: ReactComponentClass[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  object InspectorControls {
    
    @JSImport("@wordpress/block-editor", "InspectorControls")
    @js.native
    def apply(props: typingsSlinky.wordpressBlockEditor.inspectorControlsMod.InspectorControls.Props): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "InspectorControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "InspectorControls.Slot")
    @js.native
    def Slot: ReactComponentClass[OmitPropsname] = js.native
    @scala.inline
    def Slot_=(x: ReactComponentClass[OmitPropsname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Slot")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "MediaPlaceholder")
  @js.native
  def MediaPlaceholder[T /* <: Boolean */](props: typingsSlinky.wordpressBlockEditor.mediaPlaceholderMod.MediaPlaceholder.Props[T]): ReactElement = js.native
  
  @JSImport("@wordpress/block-editor", "MediaUpload")
  @js.native
  def MediaUpload[T /* <: Boolean */](props: typingsSlinky.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props[T]): ReactElement = js.native
  
  @JSImport("@wordpress/block-editor", "MediaUploadCheck")
  @js.native
  val MediaUploadCheck: ReactComponentClass[typingsSlinky.wordpressBlockEditor.checkMod.MediaUploadCheck.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "MultiBlocksSwitcher")
  @js.native
  val MultiBlocksSwitcher: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.multiBlocksSwitcherMod.MultiBlocksSwitcher.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "MultiSelectScrollIntoView")
  @js.native
  val MultiSelectScrollIntoView: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.multiSelectScrollIntoViewMod.MultiSelectScrollIntoView.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "NavigableToolbar")
  @js.native
  val NavigableToolbar: ReactComponentClass[typingsSlinky.wordpressBlockEditor.navigableToolbarMod.NavigableToolbar.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "ObserveTyping")
  @js.native
  val ObserveTyping: ReactComponentClass[typingsSlinky.wordpressBlockEditor.observeTypingMod.ObserveTyping.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "PanelColorSettings")
  @js.native
  val PanelColorSettings: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "PlainText")
  @js.native
  val PlainText: ReactComponentClass[typingsSlinky.wordpressBlockEditor.plainTextMod.PlainText.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "PreserveScrollInReorder")
  @js.native
  val PreserveScrollInReorder: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.preserveScrollInReorderMod.PreserveScrollInReorder.Props
  ] = js.native
  
  object RichText {
    
    @JSImport("@wordpress/block-editor", "RichText")
    @js.native
    def apply(
      props: typingsSlinky.wordpressBlockEditor.richTextMod.RichText.Props[
          a | abbr | address | applet | area | article | aside | audio | b | base | basefont | bdi | bdo | blockquote | body | br | button | canvas | caption | cite | code | col | colgroup | data | datalist | dd | del | details | dfn | dialog | dir | div | dl | dt | em | embed | fieldset | figcaption | figure | font | footer | form | frame | frameset | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | img | input | ins | kbd | label | legend | li | link | main | map | mark | marquee | menu | meta | meter | nav | noscript | `object` | ol | optgroup | option | output | p | param | picture | pre | progress | q | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | strong | style | sub | summary | sup | table | tbody | td | template | textarea | tfoot | th | thead | time | title | tr | track | u | ul | `var` | video | wbr
        ]
    ): ReactElement = js.native
    
    /**
      * Should be used in the `save` function of your block to correctly save rich text content.
      */
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_a(props: ContentProps[a]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_abbr(props: ContentProps[abbr]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_address(props: ContentProps[address]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_applet(props: ContentProps[applet]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_area(props: ContentProps[area]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_article(props: ContentProps[article]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_aside(props: ContentProps[aside]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_audio(props: ContentProps[audio]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_b(props: ContentProps[b]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_base(props: ContentProps[base]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_basefont(props: ContentProps[basefont]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_bdi(props: ContentProps[bdi]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_bdo(props: ContentProps[bdo]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_blockquote(props: ContentProps[blockquote]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_body(props: ContentProps[body]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_br(props: ContentProps[br]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_button(props: ContentProps[button]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_canvas(props: ContentProps[canvas]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_caption(props: ContentProps[caption]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_cite(props: ContentProps[cite]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_code(props: ContentProps[code]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_col(props: ContentProps[col]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_colgroup(props: ContentProps[colgroup]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_data(props: ContentProps[data]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_datalist(props: ContentProps[datalist]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dd(props: ContentProps[dd]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_del(props: ContentProps[del]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_details(props: ContentProps[details]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dfn(props: ContentProps[dfn]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dialog(props: ContentProps[dialog]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dir(props: ContentProps[dir]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_div(props: ContentProps[div]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dl(props: ContentProps[dl]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_dt(props: ContentProps[dt]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_em(props: ContentProps[em]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_embed(props: ContentProps[embed]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_fieldset(props: ContentProps[fieldset]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_figcaption(props: ContentProps[figcaption]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_figure(props: ContentProps[figure]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_font(props: ContentProps[font]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_footer(props: ContentProps[footer]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_form(props: ContentProps[form]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_frame(props: ContentProps[frame]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_frameset(props: ContentProps[frameset]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h1(props: ContentProps[h1]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h2(props: ContentProps[h2]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h3(props: ContentProps[h3]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h4(props: ContentProps[h4]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h5(props: ContentProps[h5]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_h6(props: ContentProps[h6]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_head(props: ContentProps[head]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_header(props: ContentProps[header]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_hgroup(props: ContentProps[hgroup]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_hr(props: ContentProps[hr]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_html(props: ContentProps[html]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_i(props: ContentProps[i]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_iframe(props: ContentProps[iframe]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_img(props: ContentProps[img]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_input(props: ContentProps[input]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_ins(props: ContentProps[ins]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_kbd(props: ContentProps[kbd]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_label(props: ContentProps[label]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_legend(props: ContentProps[legend]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_li(props: ContentProps[li]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_link(props: ContentProps[link]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_main(props: ContentProps[main]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_map(props: ContentProps[map]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_mark(props: ContentProps[mark]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_marquee(props: ContentProps[marquee]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_menu(props: ContentProps[menu]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_meta(props: ContentProps[meta]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_meter(props: ContentProps[meter]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_nav(props: ContentProps[nav]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_noscript(props: ContentProps[noscript]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_object(props: ContentProps[`object`]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_ol(props: ContentProps[ol]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_optgroup(props: ContentProps[optgroup]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_option(props: ContentProps[option]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_output(props: ContentProps[output]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_p(props: ContentProps[p]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_param(props: ContentProps[param]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_picture(props: ContentProps[picture]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_pre(props: ContentProps[pre]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_progress(props: ContentProps[progress]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_q(props: ContentProps[q]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_rp(props: ContentProps[rp]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_rt(props: ContentProps[rt]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_ruby(props: ContentProps[ruby]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_s(props: ContentProps[s]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_samp(props: ContentProps[samp]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_script(props: ContentProps[script]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_section(props: ContentProps[section]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_select(props: ContentProps[select]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_slot(props: ContentProps[slot]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_small(props: ContentProps[small]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_source(props: ContentProps[source]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_span(props: ContentProps[span]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_strong(props: ContentProps[strong]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_style(props: ContentProps[style]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_sub(props: ContentProps[sub]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_summary(props: ContentProps[summary]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_sup(props: ContentProps[sup]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_table(props: ContentProps[table]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_tbody(props: ContentProps[tbody]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_td(props: ContentProps[td]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_template(props: ContentProps[template]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_textarea(props: ContentProps[textarea]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_tfoot(props: ContentProps[tfoot]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_th(props: ContentProps[th]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_thead(props: ContentProps[thead]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_time(props: ContentProps[time]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_title(props: ContentProps[title]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_tr(props: ContentProps[tr]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_track(props: ContentProps[track]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_u(props: ContentProps[u]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_ul(props: ContentProps[ul]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_var(props: ContentProps[`var`]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_video(props: ContentProps[video]): ReactElement = js.native
    @JSImport("@wordpress/block-editor", "RichText.Content")
    @js.native
    def Content_wbr(props: ContentProps[wbr]): ReactElement = js.native
    
    @JSImport("@wordpress/block-editor", "RichText.isEmpty")
    @js.native
    def isEmpty(value: String): Boolean = js.native
    @JSImport("@wordpress/block-editor", "RichText.isEmpty")
    @js.native
    def isEmpty(value: js.Array[String]): Boolean = js.native
  }
  
  @JSImport("@wordpress/block-editor", "RichTextShortcut")
  @js.native
  val RichTextShortcut: ReactComponentClass[typingsSlinky.wordpressBlockEditor.richTextMod.RichTextShortcut.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "RichTextToolbarButton")
  @js.native
  val RichTextToolbarButton: ReactComponentClass[typingsSlinky.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "SETTINGS_DEFAULTS")
  @js.native
  val SETTINGS_DEFAULTS: EditorSettings = js.native
  
  @JSImport("@wordpress/block-editor", "SkipToSelectedBlock")
  @js.native
  val SkipToSelectedBlock: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.skipToSelectedBlockMod.SkipToSelectedBlock.Props
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "URLInput")
  @js.native
  val URLInput: ReactComponentClass[typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "URLInputButton")
  @js.native
  val URLInputButton: ReactComponentClass[typingsSlinky.wordpressBlockEditor.buttonMod.URLInputButton.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "URLPopover")
  @js.native
  val URLPopover: ReactComponentClass[typingsSlinky.wordpressBlockEditor.urlPopoverMod.URLPopover.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "Warning")
  @js.native
  val Warning: ReactComponentClass[typingsSlinky.wordpressBlockEditor.warningMod.Warning.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "WritingFlow")
  @js.native
  val WritingFlow: ReactComponentClass[typingsSlinky.wordpressBlockEditor.writingFlowMod.WritingFlow.Props] = js.native
  
  @JSImport("@wordpress/block-editor", "createCustomColorsHOC")
  @js.native
  def createCustomColorsHOC[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]]
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "getColorClassName")
  @js.native
  def getColorClassName(): js.UndefOr[String] = js.native
  @JSImport("@wordpress/block-editor", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: js.UndefOr[scala.Nothing], colorSlug: String): js.UndefOr[String] = js.native
  @JSImport("@wordpress/block-editor", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: String): js.UndefOr[String] = js.native
  @JSImport("@wordpress/block-editor", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: String, colorSlug: String): String = js.native
  @JSImport("@wordpress/block-editor", "getColorClassName")
  @js.native
  def getColorClassName_Union(colorContextName: String, colorSlug: String): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/block-editor", "getColorObjectByAttributeValues")
  @js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: js.UndefOr[scala.Nothing], customColor: String): EditorColor | PickEditorColorcolor = js.native
  @JSImport("@wordpress/block-editor", "getColorObjectByAttributeValues")
  @js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = js.native
  
  @JSImport("@wordpress/block-editor", "getColorObjectByColorValue")
  @js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor]): js.UndefOr[EditorColor] = js.native
  @JSImport("@wordpress/block-editor", "getColorObjectByColorValue")
  @js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor], colorValue: String): js.UndefOr[EditorColor] = js.native
  
  @JSImport("@wordpress/block-editor", "getFontSize")
  @js.native
  def getFontSize(
    fontSizes: js.Array[EditorFontSize],
    fontSizeAttribute: js.UndefOr[scala.Nothing],
    customFontSizeAttribute: Double
  ): PartialEditorFontSizePick = js.native
  @JSImport("@wordpress/block-editor", "getFontSize")
  @js.native
  def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: String, customFontSizeAttribute: Double): PartialEditorFontSizePick = js.native
  
  @JSImport("@wordpress/block-editor", "getFontSizeClass")
  @js.native
  def getFontSizeClass(fontSizeSlug: String): String = js.native
  
  object storeConfig {
    
    @JSImport("@wordpress/block-editor", "storeConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/block-editor", "storeConfig.actions")
    @js.native
    def actions: js.Any = js.native
    @scala.inline
    def actions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("actions")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "storeConfig.controls")
    @js.native
    def controls: js.Any = js.native
    @scala.inline
    def controls_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controls")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "storeConfig.reducer")
    @js.native
    def reducer: js.Any = js.native
    @scala.inline
    def reducer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reducer")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor", "storeConfig.selectors")
    @js.native
    def selectors: js.Any = js.native
    @scala.inline
    def selectors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectors")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/block-editor", "transformStyles")
  @js.native
  def transformStyles(styles: js.Array[EditorStyle]): js.Array[String] = js.native
  @JSImport("@wordpress/block-editor", "transformStyles")
  @js.native
  def transformStyles(styles: js.Array[EditorStyle], wrapperClassName: String): js.Array[String] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/block-editor", "withColorContext")
  @js.native
  def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps with OwnProps, js.Object]): ReactComponentClass[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
  @JSImport("@wordpress/block-editor", "withColorContext")
  @js.native
  def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps with OwnProps]): ReactComponentClass[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
  
  @JSImport("@wordpress/block-editor", "withColors")
  @js.native
  def withColors(colorTypes: (String | (Record[String, String]))*): js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]] = js.native
  
  @JSImport("@wordpress/block-editor", "withFontSizes")
  @js.native
  def withFontSizes(attributeNames: String*): js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]] = js.native
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", "dispatch")
    @js.native
    def dispatch_coreblockeditor(key: `coreSlashblock-editor`): TypeofimportedActions = js.native
    
    @JSImport("@wordpress/data", "select")
    @js.native
    def select_coreblockeditor(key: `coreSlashblock-editor`): TypeofimportedSelectors = js.native
  }
  
  @js.native
  trait EditorBaseSetting extends StObject {
    
    var name: String = js.native
    
    var slug: String = js.native
  }
  object EditorBaseSetting {
    
    @scala.inline
    def apply(name: String, slug: String): EditorBaseSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorBaseSetting]
    }
    
    @scala.inline
    implicit class EditorBaseSettingMutableBuilder[Self <: EditorBaseSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditorBlockListSettings extends StObject {
    
    var allowedBlocks: js.UndefOr[js.Array[String]] = js.native
    
    var templateLock: js.UndefOr[EditorTemplateLock] = js.native
  }
  object EditorBlockListSettings {
    
    @scala.inline
    def apply(): EditorBlockListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorBlockListSettings]
    }
    
    @scala.inline
    implicit class EditorBlockListSettingsMutableBuilder[Self <: EditorBlockListSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedBlocks(value: js.Array[String]): Self = StObject.set(x, "allowedBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlocksUndefined: Self = StObject.set(x, "allowedBlocks", js.undefined)
      
      @scala.inline
      def setAllowedBlocksVarargs(value: String*): Self = StObject.set(x, "allowedBlocks", js.Array(value :_*))
      
      @scala.inline
      def setTemplateLock(value: EditorTemplateLock): Self = StObject.set(x, "templateLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateLockUndefined: Self = StObject.set(x, "templateLock", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.html
    - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.visual
  */
  trait EditorBlockMode extends StObject
  object EditorBlockMode {
    
    @scala.inline
    def html: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.html = "html".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.html]
    
    @scala.inline
    def visual: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.visual = "visual".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.visual]
  }
  
  @js.native
  trait EditorColor extends EditorBaseSetting {
    
    var color: String = js.native
  }
  object EditorColor {
    
    @scala.inline
    def apply(color: String, name: String, slug: String): EditorColor = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorColor]
    }
    
    @scala.inline
    implicit class EditorColorMutableBuilder[Self <: EditorColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditorFontSize extends EditorBaseSetting {
    
    var size: Double = js.native
  }
  object EditorFontSize {
    
    @scala.inline
    def apply(name: String, size: Double, slug: String): EditorFontSize = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorFontSize]
    }
    
    @scala.inline
    implicit class EditorFontSizeMutableBuilder[Self <: EditorFontSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type EditorImageSize = EditorBaseSetting
  
  @js.native
  trait EditorInserterItem extends StObject {
    
    /**
      * Block category that the item is associated with.
      */
    var category: String = js.native
    
    /**
      * Hueristic that combines frequency and recency.
      */
    var frecency: Double = js.native
    
    var hasChildBlocksWithInserterSupport: Boolean = js.native
    
    /**
      * Icon for the item, as it appears in the inserter.
      */
    var icon: BlockIconNormalized = js.native
    
    /**
      * Unique identifier for the item.
      */
    var id: String = js.native
    
    /**
      * Attributes to pass to the newly created block.
      */
    var initialAttributes: Record[String, _] = js.native
    
    /**
      * Whether or not the user should be prevented from inserting this item.
      */
    var isDisabled: Boolean = js.native
    
    /**
      * Keywords that can be searched to find this item.
      */
    var keywords: js.Array[String] = js.native
    
    /**
      * The type of block to create.
      */
    var name: String = js.native
    
    /**
      * Title of the item, as it appears in the inserter.
      */
    var title: String = js.native
    
    /**
      * How useful we think this item is, between 0 and 3.
      */
    var utility: Double = js.native
  }
  object EditorInserterItem {
    
    @scala.inline
    def apply(
      category: String,
      frecency: Double,
      hasChildBlocksWithInserterSupport: Boolean,
      icon: BlockIconNormalized,
      id: String,
      initialAttributes: Record[String, _],
      isDisabled: Boolean,
      keywords: js.Array[String],
      name: String,
      title: String,
      utility: Double
    ): EditorInserterItem = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], frecency = frecency.asInstanceOf[js.Any], hasChildBlocksWithInserterSupport = hasChildBlocksWithInserterSupport.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialAttributes = initialAttributes.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], utility = utility.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorInserterItem]
    }
    
    @scala.inline
    implicit class EditorInserterItemMutableBuilder[Self <: EditorInserterItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrecency(value: Double): Self = StObject.set(x, "frecency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChildBlocksWithInserterSupport(value: Boolean): Self = StObject.set(x, "hasChildBlocksWithInserterSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: BlockIconNormalized): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialAttributes(value: Record[String, _]): Self = StObject.set(x, "initialAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtility(value: Double): Self = StObject.set(x, "utility", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.text
    - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.visual
  */
  trait EditorMode extends StObject
  object EditorMode {
    
    @scala.inline
    def text: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.text = "text".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.text]
    
    @scala.inline
    def visual: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.visual = "visual".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.visual]
  }
  
  @js.native
  trait EditorSelection extends StObject {
    
    /**
      * The selected block attribute key.
      */
    var attributeKey: js.UndefOr[String] = js.native
    
    /**
      * The selected block client ID.
      */
    var clientId: js.UndefOr[String] = js.native
    
    /**
      * The selected block attribute offset.
      */
    var offset: js.UndefOr[Double] = js.native
  }
  object EditorSelection {
    
    @scala.inline
    def apply(): EditorSelection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorSelection]
    }
    
    @scala.inline
    implicit class EditorSelectionMutableBuilder[Self <: EditorSelection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeKey(value: String): Self = StObject.set(x, "attributeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeKeyUndefined: Self = StObject.set(x, "attributeKey", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait EditorSettings extends StObject {
    
    /**
      * Enable/Disable Wide/Full Alignments
      * @defaultValue `false`
      */
    var alignWide: Boolean = js.native
    
    /**
      * Array of allowed block types, `true` for all blocks, or `false` for no blocks.
      * @defaultValue `true`
      */
    var allowedBlockTypes: js.Array[String] | Boolean = js.native
    
    /**
      * Mapping of extension:mimetype
      * @example
      * ```js
      * {
      *   "jpg|jpeg|jpe": "image/jpeg",
      * }
      * ```
      */
    var allowedMimeTypes: (Record[String, String]) | Null = js.native
    
    var autosaveInterval: Double = js.native
    
    /**
      * Array of objects representing the legacy widgets available.
      */
    var availableLegacyWidgets: js.Array[Description] = js.native
    
    // FIXME: it is unclear what this value should be.
    var availableTemplates: js.Array[_] = js.native
    
    /**
      * Empty post placeholder.
      * @defaultValue `"Start writing or type / to choose a block"`
      */
    var bodyPlaceholder: String = js.native
    
    /**
      * Whether or not the user can switch to the code editor.
      */
    var codeEditingEnabled: Boolean = js.native
    
    /**
      * Palette colors.
      */
    var colors: js.Array[EditorColor] = js.native
    
    /**
      * Whether or not the custom colors are disabled.
      */
    var disableCustomColors: Boolean = js.native
    
    /**
      * Whether or not the custom font sizes are disabled.
      */
    var disableCustomEditorFontSizes: Boolean = js.native
    
    /**
      * Whether or not the custom post formats are disabled.
      */
    var disablePostFormats: Boolean = js.native
    
    /**
      * Whether or not the custom fields are enabled.
      */
    var enableCustomFields: Boolean = js.native
    
    /**
      * Whether the focus mode is enabled or not.
      */
    var focusMode: Boolean = js.native
    
    /**
      * Array of available font sizes.
      */
    var fontSizes: js.Array[EditorFontSize] = js.native
    
    /**
      * Whether or not the editor toolbar is fixed.
      */
    var hasFixedToolbar: Boolean = js.native
    
    /**
      * Whether or not the user is able to manage widgets.
      */
    var hasPermissionsToManageWidgets: Boolean = js.native
    
    /**
      * Available image sizes.
      */
    var imageSizes: js.Array[EditorImageSize] = js.native
    
    /**
      * Whether the editor is in RTL mode.
      */
    var isRTL: Boolean = js.native
    
    var maxUploadFileSize: Double = js.native
    
    /**
      * Max width to constraint resizing.
      */
    var maxWidth: Double = js.native
    
    var postLock: IsLocked = js.native
    
    var postLockUtils: AjaxUrl = js.native
    
    var richEditingEnabled: Boolean = js.native
    
    var styles: js.Array[EditorStyle] = js.native
    
    /**
      * Empty title placeholder.
      * @defaultValue `"Add title"`
      */
    var titlePlaceholder: String = js.native
  }
  object EditorSettings {
    
    @scala.inline
    def apply(
      alignWide: Boolean,
      allowedBlockTypes: js.Array[String] | Boolean,
      autosaveInterval: Double,
      availableLegacyWidgets: js.Array[Description],
      availableTemplates: js.Array[_],
      bodyPlaceholder: String,
      codeEditingEnabled: Boolean,
      colors: js.Array[EditorColor],
      disableCustomColors: Boolean,
      disableCustomEditorFontSizes: Boolean,
      disablePostFormats: Boolean,
      enableCustomFields: Boolean,
      focusMode: Boolean,
      fontSizes: js.Array[EditorFontSize],
      hasFixedToolbar: Boolean,
      hasPermissionsToManageWidgets: Boolean,
      imageSizes: js.Array[EditorImageSize],
      isRTL: Boolean,
      maxUploadFileSize: Double,
      maxWidth: Double,
      postLock: IsLocked,
      postLockUtils: AjaxUrl,
      richEditingEnabled: Boolean,
      styles: js.Array[EditorStyle],
      titlePlaceholder: String
    ): EditorSettings = {
      val __obj = js.Dynamic.literal(alignWide = alignWide.asInstanceOf[js.Any], allowedBlockTypes = allowedBlockTypes.asInstanceOf[js.Any], autosaveInterval = autosaveInterval.asInstanceOf[js.Any], availableLegacyWidgets = availableLegacyWidgets.asInstanceOf[js.Any], availableTemplates = availableTemplates.asInstanceOf[js.Any], bodyPlaceholder = bodyPlaceholder.asInstanceOf[js.Any], codeEditingEnabled = codeEditingEnabled.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], disableCustomColors = disableCustomColors.asInstanceOf[js.Any], disableCustomEditorFontSizes = disableCustomEditorFontSizes.asInstanceOf[js.Any], disablePostFormats = disablePostFormats.asInstanceOf[js.Any], enableCustomFields = enableCustomFields.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], fontSizes = fontSizes.asInstanceOf[js.Any], hasFixedToolbar = hasFixedToolbar.asInstanceOf[js.Any], hasPermissionsToManageWidgets = hasPermissionsToManageWidgets.asInstanceOf[js.Any], imageSizes = imageSizes.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], maxUploadFileSize = maxUploadFileSize.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], postLock = postLock.asInstanceOf[js.Any], postLockUtils = postLockUtils.asInstanceOf[js.Any], richEditingEnabled = richEditingEnabled.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], titlePlaceholder = titlePlaceholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorSettings]
    }
    
    @scala.inline
    implicit class EditorSettingsMutableBuilder[Self <: EditorSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignWide(value: Boolean): Self = StObject.set(x, "alignWide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlockTypes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedBlockTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedBlockTypesVarargs(value: String*): Self = StObject.set(x, "allowedBlockTypes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedMimeTypes(value: Record[String, String]): Self = StObject.set(x, "allowedMimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedMimeTypesNull: Self = StObject.set(x, "allowedMimeTypes", null)
      
      @scala.inline
      def setAutosaveInterval(value: Double): Self = StObject.set(x, "autosaveInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLegacyWidgets(value: js.Array[Description]): Self = StObject.set(x, "availableLegacyWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLegacyWidgetsVarargs(value: Description*): Self = StObject.set(x, "availableLegacyWidgets", js.Array(value :_*))
      
      @scala.inline
      def setAvailableTemplates(value: js.Array[_]): Self = StObject.set(x, "availableTemplates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableTemplatesVarargs(value: js.Any*): Self = StObject.set(x, "availableTemplates", js.Array(value :_*))
      
      @scala.inline
      def setBodyPlaceholder(value: String): Self = StObject.set(x, "bodyPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeEditingEnabled(value: Boolean): Self = StObject.set(x, "codeEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColors(value: js.Array[EditorColor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: EditorColor*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCustomEditorFontSizes(value: Boolean): Self = StObject.set(x, "disableCustomEditorFontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePostFormats(value: Boolean): Self = StObject.set(x, "disablePostFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCustomFields(value: Boolean): Self = StObject.set(x, "enableCustomFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizes(value: js.Array[EditorFontSize]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizesVarargs(value: EditorFontSize*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
      
      @scala.inline
      def setHasFixedToolbar(value: Boolean): Self = StObject.set(x, "hasFixedToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPermissionsToManageWidgets(value: Boolean): Self = StObject.set(x, "hasPermissionsToManageWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizes(value: js.Array[EditorImageSize]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizesVarargs(value: EditorImageSize*): Self = StObject.set(x, "imageSizes", js.Array(value :_*))
      
      @scala.inline
      def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUploadFileSize(value: Double): Self = StObject.set(x, "maxUploadFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLock(value: IsLocked): Self = StObject.set(x, "postLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLockUtils(value: AjaxUrl): Self = StObject.set(x, "postLockUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRichEditingEnabled(value: Boolean): Self = StObject.set(x, "richEditingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: js.Array[EditorStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: EditorStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditorStyle extends StObject {
    
    var baseURL: js.UndefOr[String] = js.native
    
    var css: String = js.native
  }
  object EditorStyle {
    
    @scala.inline
    def apply(css: String): EditorStyle = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorStyle]
    }
    
    @scala.inline
    implicit class EditorStyleMutableBuilder[Self <: EditorStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorBooleans.`false`
    - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.all
    - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.insert
  */
  trait EditorTemplateLock extends StObject
  object EditorTemplateLock {
    
    @scala.inline
    def all: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.all = "all".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.all]
    
    @scala.inline
    def `false`: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorBooleans.`false` = false.asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorBooleans.`false`]
    
    @scala.inline
    def insert: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.insert = "insert".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.insert]
  }
}
