package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.facade.ReactElement
import typingsSlinky.emotionSerialize.mod.Keyframes
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookUi.anon.PickPropsWithChildrenIcon
import typingsSlinky.storybookUi.anon.PropsWithChildrenPickPick
import typingsSlinky.storybookUi.anon.RecordFeatureany
import typingsSlinky.storybookUi.anon.Valid
import typingsSlinky.storybookUi.anon.ValidString
import typingsSlinky.storybookUi.storybookUiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutsMod {
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "Description")
  @js.native
  val Description: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "Fade")
  @js.native
  val Fade: Keyframes = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "GridHeaderRow")
  @js.native
  val GridHeaderRow: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "GridWrapper")
  @js.native
  val GridWrapper: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "HeaderItem")
  @js.native
  val HeaderItem: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "Row")
  @js.native
  val Row: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "ShortcutsScreen")
  @js.native
  class ShortcutsScreen protected ()
    extends Component[ShortcutsScreenProps, ShortcutsScreenState, js.Any] {
    def this(props: ShortcutsScreenProps) = this()
    
    def displayError(activeElement: Feature): ValidationStates = js.native
    
    def displaySuccessMessage(activeElement: Feature): String = js.native
    
    def onBlur(): js.Promise[`false` | Unit] = js.native
    
    def onFocus(focusedInput: Feature): js.Function0[Unit] = js.native
    
    def onKeyDown(e: KeyboardEvent): `false` | Unit | js.Promise[Unit] = js.native
    
    def renderKeyForm(): ReactElement = js.native
    
    def renderKeyInput(): js.Array[ReactElement] = js.native
    
    def restoreDefault(): js.Promise[Unit] = js.native
    
    def restoreDefaults(): js.Promise[Unit] = js.native
    
    def saveShortcut(): js.Promise[Unit] = js.native
  }
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "SuccessIcon")
  @js.native
  val SuccessIcon: StyledComponent[PickPropsWithChildrenIcon, ValidString, Theme] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "TextInput")
  @js.native
  val TextInput: StyledComponent[PropsWithChildrenPickPick, Valid, Theme] = js.native
  
  /* keyof @storybook/ui.anon.AboutPage */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookUi.storybookUiStrings.fullScreen
    - typingsSlinky.storybookUi.storybookUiStrings.togglePanel
    - typingsSlinky.storybookUi.storybookUiStrings.panelPosition
    - typingsSlinky.storybookUi.storybookUiStrings.toggleNav
    - typingsSlinky.storybookUi.storybookUiStrings.toolbar
    - typingsSlinky.storybookUi.storybookUiStrings.search
    - typingsSlinky.storybookUi.storybookUiStrings.focusNav
    - typingsSlinky.storybookUi.storybookUiStrings.focusIframe
    - typingsSlinky.storybookUi.storybookUiStrings.focusPanel
    - typingsSlinky.storybookUi.storybookUiStrings.prevComponent
    - typingsSlinky.storybookUi.storybookUiStrings.nextComponent
    - typingsSlinky.storybookUi.storybookUiStrings.prevStory
    - typingsSlinky.storybookUi.storybookUiStrings.nextStory
    - typingsSlinky.storybookUi.storybookUiStrings.shortcutsPage
    - typingsSlinky.storybookUi.storybookUiStrings.aboutPage
    - typingsSlinky.storybookUi.storybookUiStrings.collapseAll
    - typingsSlinky.storybookUi.storybookUiStrings.expandAll
  */
  trait Feature extends StObject
  
  @js.native
  trait ShortcutsScreenProps extends StObject {
    
    var restoreAllDefaultShortcuts: js.Function = js.native
    
    var restoreDefaultShortcut: js.Function = js.native
    
    var setShortcut: js.Function = js.native
    
    var shortcutKeys: RecordFeatureany = js.native
  }
  object ShortcutsScreenProps {
    
    @scala.inline
    def apply(
      restoreAllDefaultShortcuts: js.Function,
      restoreDefaultShortcut: js.Function,
      setShortcut: js.Function,
      shortcutKeys: RecordFeatureany
    ): ShortcutsScreenProps = {
      val __obj = js.Dynamic.literal(restoreAllDefaultShortcuts = restoreAllDefaultShortcuts.asInstanceOf[js.Any], restoreDefaultShortcut = restoreDefaultShortcut.asInstanceOf[js.Any], setShortcut = setShortcut.asInstanceOf[js.Any], shortcutKeys = shortcutKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcutsScreenProps]
    }
    
    @scala.inline
    implicit class ShortcutsScreenPropsMutableBuilder[Self <: ShortcutsScreenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRestoreAllDefaultShortcuts(value: js.Function): Self = StObject.set(x, "restoreAllDefaultShortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreDefaultShortcut(value: js.Function): Self = StObject.set(x, "restoreDefaultShortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetShortcut(value: js.Function): Self = StObject.set(x, "setShortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutKeys(value: RecordFeatureany): Self = StObject.set(x, "shortcutKeys", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShortcutsScreenState extends StObject {
    
    var activeFeature: Feature = js.native
    
    var shortcutKeys: RecordFeatureany = js.native
    
    var successField: Feature = js.native
  }
  object ShortcutsScreenState {
    
    @scala.inline
    def apply(activeFeature: Feature, shortcutKeys: RecordFeatureany, successField: Feature): ShortcutsScreenState = {
      val __obj = js.Dynamic.literal(activeFeature = activeFeature.asInstanceOf[js.Any], shortcutKeys = shortcutKeys.asInstanceOf[js.Any], successField = successField.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcutsScreenState]
    }
    
    @scala.inline
    implicit class ShortcutsScreenStateMutableBuilder[Self <: ShortcutsScreenState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveFeature(value: Feature): Self = StObject.set(x, "activeFeature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutKeys(value: RecordFeatureany): Self = StObject.set(x, "shortcutKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessField(value: Feature): Self = StObject.set(x, "successField", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookUi.storybookUiStrings.valid
    - typingsSlinky.storybookUi.storybookUiStrings.error
    - typingsSlinky.storybookUi.storybookUiStrings.warn
  */
  trait ValidationStates extends StObject
  object ValidationStates {
    
    @scala.inline
    def error: typingsSlinky.storybookUi.storybookUiStrings.error = "error".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.error]
    
    @scala.inline
    def valid: typingsSlinky.storybookUi.storybookUiStrings.valid = "valid".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.valid]
    
    @scala.inline
    def warn: typingsSlinky.storybookUi.storybookUiStrings.warn = "warn".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.warn]
  }
}
