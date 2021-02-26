package typingsSlinky.wordpressEditor

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.std.Omit
import typingsSlinky.std.Record
import typingsSlinky.wordpressBlockEditor.alignmentToolbarMod.AlignmentToolbar.Props
import typingsSlinky.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typingsSlinky.wordpressBlockEditor.anon.PartialProps
import typingsSlinky.wordpressBlockEditor.anon.PickEditorColorcolor
import typingsSlinky.wordpressBlockEditor.mod.EditorColor
import typingsSlinky.wordpressBlockEditor.mod.EditorFontSize
import typingsSlinky.wordpressEditor.anon.Typeof
import typingsSlinky.wordpressEditor.anon.TypeofApply
import typingsSlinky.wordpressEditor.anon.TypeofApplySlot
import typingsSlinky.wordpressEditor.anon.TypeofButtonBlockerAppender
import typingsSlinky.wordpressEditor.anon.TypeofContent
import typingsSlinky.wordpressEditor.anon.TypeofSlot
import typingsSlinky.wordpressEditor.wordpressEditorStrings.colors
import typingsSlinky.wordpressEditor.wordpressEditorStrings.disableCustomColors
import typingsSlinky.wordpressEditor.wordpressEditorStrings.hasColorsToChoose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedMod {
  
  @JSImport("@wordpress/editor/components/deprecated", "AlignmentToolbar")
  @js.native
  val AlignmentToolbar: ReactComponentClass[Props] = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  @JSImport("@wordpress/editor/components/deprecated", "Autocomplete")
  @js.native
  def Autocomplete[T](props: typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete.Props[T]): ReactElement = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockAlignmentToolbar")
  @js.native
  val BlockAlignmentToolbar: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.blockAlignmentToolbarMod.BlockAlignmentToolbar.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockControls")
  @js.native
  val BlockControls: Typeof = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockEdit")
  @js.native
  val BlockEdit: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockEditMod.BlockEdit.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockEditorKeyboardShortcuts")
  @js.native
  val BlockEditorKeyboardShortcuts: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.blockEditorKeyboardShortcutsMod.BlockEditorKeyboardShortcuts.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockFormatControls")
  @js.native
  val BlockFormatControls: TypeofApply = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockIcon")
  @js.native
  val BlockIcon: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockIconMod.BlockIcon.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockInspector")
  @js.native
  val BlockInspector: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockInspectorMod.BlockInspector.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockList")
  @js.native
  val BlockList: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockListMod.BlockList.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockMover")
  @js.native
  val BlockMover: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockMoverMod.BlockMover.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockNavigationDropdown")
  @js.native
  val BlockNavigationDropdown: ReactComponentClass[typingsSlinky.wordpressBlockEditor.dropdownMod.BlockNavigationDropdown.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockSelectionClearer")
  @js.native
  val BlockSelectionClearer: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.blockSelectionClearerMod.BlockSelectionClearer.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockSettingsMenu")
  @js.native
  val BlockSettingsMenu: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockSettingsMenuMod.BlockSettingsMenu.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockTitle")
  @js.native
  val BlockTitle: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockTitleMod.BlockTitle.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "BlockToolbar")
  @js.native
  val BlockToolbar: ReactComponentClass[typingsSlinky.wordpressBlockEditor.blockToolbarMod.BlockToolbar.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "ColorPalette")
  @js.native
  val ColorPalette: ReactComponentClass[typingsSlinky.wordpressComponents.colorPaletteMod.ColorPalette.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "ContrastChecker")
  @js.native
  val ContrastChecker: ReactComponentClass[typingsSlinky.wordpressBlockEditor.contrastCheckerMod.ContrastChecker.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "CopyHandler")
  @js.native
  val CopyHandler: ReactComponentClass[typingsSlinky.wordpressBlockEditor.copyHandlerMod.CopyHandler.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "DefaultBlockAppender")
  @js.native
  val DefaultBlockAppender: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.defaultBlockAppenderMod.DefaultBlockAppender.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "FontSizePicker")
  @js.native
  val FontSizePicker: ReactComponentClass[typingsSlinky.wordpressBlockEditor.fontSizesMod.FontSizePicker.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "InnerBlocks")
  @js.native
  val InnerBlocks: TypeofButtonBlockerAppender = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "Inserter")
  @js.native
  val Inserter: ReactComponentClass[typingsSlinky.wordpressBlockEditor.inserterMod.Inserter.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "InspectorAdvancedControls")
  @js.native
  val InspectorAdvancedControls: TypeofSlot = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "InspectorControls")
  @js.native
  val InspectorControls: TypeofApplySlot = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "MediaPlaceholder")
  @js.native
  def MediaPlaceholder[T /* <: Boolean */](props: typingsSlinky.wordpressBlockEditor.mediaPlaceholderMod.MediaPlaceholder.Props[T]): ReactElement = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "MediaUpload")
  @js.native
  def MediaUpload[T /* <: Boolean */](props: typingsSlinky.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props[T]): ReactElement = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "MediaUploadCheck")
  @js.native
  val MediaUploadCheck: ReactComponentClass[typingsSlinky.wordpressBlockEditor.checkMod.MediaUploadCheck.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "MultiBlocksSwitcher")
  @js.native
  val MultiBlocksSwitcher: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.multiBlocksSwitcherMod.MultiBlocksSwitcher.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "MultiSelectScrollIntoView")
  @js.native
  val MultiSelectScrollIntoView: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.multiSelectScrollIntoViewMod.MultiSelectScrollIntoView.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "NavigableToolbar")
  @js.native
  val NavigableToolbar: ReactComponentClass[typingsSlinky.wordpressBlockEditor.navigableToolbarMod.NavigableToolbar.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "ObserveTyping")
  @js.native
  val ObserveTyping: ReactComponentClass[typingsSlinky.wordpressBlockEditor.observeTypingMod.ObserveTyping.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "PanelColorSettings")
  @js.native
  val PanelColorSettings: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "PlainText")
  @js.native
  val PlainText: ReactComponentClass[typingsSlinky.wordpressBlockEditor.plainTextMod.PlainText.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "PreserveScrollInReorder")
  @js.native
  val PreserveScrollInReorder: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.preserveScrollInReorderMod.PreserveScrollInReorder.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "RichText")
  @js.native
  val RichText: TypeofContent = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "RichTextShortcut")
  @js.native
  val RichTextShortcut: ReactComponentClass[typingsSlinky.wordpressBlockEditor.richTextMod.RichTextShortcut.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "RichTextToolbarButton")
  @js.native
  val RichTextToolbarButton: ReactComponentClass[typingsSlinky.wordpressBlockEditor.richTextMod.RichTextToolbarButton.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "SkipToSelectedBlock")
  @js.native
  val SkipToSelectedBlock: ReactComponentClass[
    typingsSlinky.wordpressBlockEditor.skipToSelectedBlockMod.SkipToSelectedBlock.Props
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "URLInput")
  @js.native
  val URLInput: ReactComponentClass[typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "URLInputButton")
  @js.native
  val URLInputButton: ReactComponentClass[typingsSlinky.wordpressBlockEditor.buttonMod.URLInputButton.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "URLPopover")
  @js.native
  val URLPopover: ReactComponentClass[typingsSlinky.wordpressBlockEditor.urlPopoverMod.URLPopover.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "Warning")
  @js.native
  val Warning: ReactComponentClass[typingsSlinky.wordpressBlockEditor.warningMod.Warning.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "WritingFlow")
  @js.native
  val WritingFlow: ReactComponentClass[typingsSlinky.wordpressBlockEditor.writingFlowMod.WritingFlow.Props] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "createCustomColorsHOC")
  @js.native
  def createCustomColorsHOC[T /* <: js.Array[String] */](colorsArray: js.Array[EditorColor]): js.Function1[
    /* colorNames */ T, 
    js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]]
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "getColorClassName")
  @js.native
  def getColorClassName(): js.UndefOr[String] = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: js.UndefOr[scala.Nothing], colorSlug: String): js.UndefOr[String] = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: String): js.UndefOr[String] = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorClassName")
  @js.native
  def getColorClassName(colorContextName: String, colorSlug: String): String = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorClassName")
  @js.native
  def getColorClassName_Union(colorContextName: String, colorSlug: String): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "getColorObjectByAttributeValues")
  @js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: js.UndefOr[scala.Nothing], customColor: String): EditorColor | PickEditorColorcolor = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorObjectByAttributeValues")
  @js.native
  def getColorObjectByAttributeValues(colors: js.Array[EditorColor], definedColor: String, customColor: String): EditorColor | PickEditorColorcolor = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "getColorObjectByColorValue")
  @js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor]): js.UndefOr[EditorColor] = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getColorObjectByColorValue")
  @js.native
  def getColorObjectByColorValue(colors: js.Array[EditorColor], colorValue: String): js.UndefOr[EditorColor] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "getFontSize")
  @js.native
  def getFontSize(
    fontSizes: js.Array[EditorFontSize],
    fontSizeAttribute: js.UndefOr[scala.Nothing],
    customFontSizeAttribute: Double
  ): PartialEditorFontSizePick = js.native
  @JSImport("@wordpress/editor/components/deprecated", "getFontSize")
  @js.native
  def getFontSize(fontSizes: js.Array[EditorFontSize], fontSizeAttribute: String, customFontSizeAttribute: Double): PartialEditorFontSizePick = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "getFontSizeClass")
  @js.native
  val getFontSizeClass: js.Function1[/* fontSizeSlug */ String, String] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/editor/components/deprecated", "withColorContext")
  @js.native
  def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps with OwnProps, js.Object]): ReactComponentClass[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
  @JSImport("@wordpress/editor/components/deprecated", "withColorContext")
  @js.native
  def withColorContext[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps with OwnProps]): ReactComponentClass[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "withColors")
  @js.native
  val withColors: js.Function1[
    /* repeated */ String | (Record[String, String]), 
    js.Function1[/* component */ ReactComponentClass[js.Any], ReactComponentClass[js.Any]]
  ] = js.native
  
  @JSImport("@wordpress/editor/components/deprecated", "withFontSizes")
  @js.native
  val withFontSizes: js.Function1[
    /* repeated */ String, 
    js.Function1[/* component */ ReactComponentClass[js.Any], ReactComponentClass[js.Any]]
  ] = js.native
}
