package typingsSlinky.twineSugarcube

import typingsSlinky.twineSugarcube.anon.Audio
import typingsSlinky.twineSugarcube.anon.Build
import typingsSlinky.twineSugarcube.anon.IeVersion
import typingsSlinky.twineSugarcube.audioMod.SimpleAudioAPI
import typingsSlinky.twineSugarcube.configMod.ConfigAPI
import typingsSlinky.twineSugarcube.engineMod.EngineAPI
import typingsSlinky.twineSugarcube.macroMod.MacroAPI
import typingsSlinky.twineSugarcube.saveMod.SaveAPI
import typingsSlinky.twineSugarcube.scriptingMod.ScriptingAPI
import typingsSlinky.twineSugarcube.settingsMod.SettingsAPI
import typingsSlinky.twineSugarcube.stateMod.StateAPI
import typingsSlinky.twineSugarcube.storyMod.StoryAPI
import typingsSlinky.twineSugarcube.uiMod.DialogAPI
import typingsSlinky.twineSugarcube.uiMod.FullscreenAPI
import typingsSlinky.twineSugarcube.uiMod.UIAPI
import typingsSlinky.twineSugarcube.uiMod.UIBarAPI
import typingsSlinky.twineSugarcube.userdataMod.SugarCubeSettingVariables
import typingsSlinky.twineSugarcube.userdataMod.SugarCubeSetupObject
import typingsSlinky.twineSugarcube.wikiMod.WikifierAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sugarcubeMod {
  
  @js.native
  trait SugarCubeObject extends StObject {
    
    val Browser: IeVersion = js.native
    
    val Config: ConfigAPI = js.native
    
    val Dialog: DialogAPI = js.native
    
    val Engine: EngineAPI = js.native
    
    val Fullscreen: FullscreenAPI = js.native
    
    val Has: Audio = js.native
    
    val Macro: MacroAPI = js.native
    
    val Save: SaveAPI = js.native
    
    val Scripting: ScriptingAPI = js.native
    
    val Setting: SettingsAPI = js.native
    
    val SimpleAudio: SimpleAudioAPI = js.native
    
    val State: StateAPI = js.native
    
    val Story: StoryAPI = js.native
    
    val UI: UIAPI = js.native
    
    val UIBar: UIBarAPI = js.native
    
    val Wikifier: WikifierAPI = js.native
    
    val session: js.Any = js.native
    
    /**
      * Player settings object, set up by the author/developer. See Setting API for more information.
      * @since 2.0.0
      */
    val settings: SugarCubeSettingVariables = js.native
    
    /**
      * Object that authors/developers may use to set up various bits of static data.
      *
      * Generally, you would use this for data that does not change and should not be stored
      * within story variables, which would make it part of the history.
      * @since 2.0.0
      */
    val setup: SugarCubeSetupObject = js.native
    
    val storage: js.Any = js.native
    
    val version: Build = js.native
  }
  object SugarCubeObject {
    
    @scala.inline
    def apply(
      Browser: IeVersion,
      Config: ConfigAPI,
      Dialog: DialogAPI,
      Engine: EngineAPI,
      Fullscreen: FullscreenAPI,
      Has: Audio,
      Macro: MacroAPI,
      Save: SaveAPI,
      Scripting: ScriptingAPI,
      Setting: SettingsAPI,
      SimpleAudio: SimpleAudioAPI,
      State: StateAPI,
      Story: StoryAPI,
      UI: UIAPI,
      UIBar: UIBarAPI,
      Wikifier: WikifierAPI,
      session: js.Any,
      settings: SugarCubeSettingVariables,
      setup: SugarCubeSetupObject,
      storage: js.Any,
      version: Build
    ): SugarCubeObject = {
      val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Dialog = Dialog.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], Fullscreen = Fullscreen.asInstanceOf[js.Any], Has = Has.asInstanceOf[js.Any], Macro = Macro.asInstanceOf[js.Any], Save = Save.asInstanceOf[js.Any], Scripting = Scripting.asInstanceOf[js.Any], Setting = Setting.asInstanceOf[js.Any], SimpleAudio = SimpleAudio.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Story = Story.asInstanceOf[js.Any], UI = UI.asInstanceOf[js.Any], UIBar = UIBar.asInstanceOf[js.Any], Wikifier = Wikifier.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], setup = setup.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SugarCubeObject]
    }
    
    @scala.inline
    implicit class SugarCubeObjectMutableBuilder[Self <: SugarCubeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: IeVersion): Self = StObject.set(x, "Browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: ConfigAPI): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialog(value: DialogAPI): Self = StObject.set(x, "Dialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngine(value: EngineAPI): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreen(value: FullscreenAPI): Self = StObject.set(x, "Fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas(value: Audio): Self = StObject.set(x, "Has", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacro(value: MacroAPI): Self = StObject.set(x, "Macro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSave(value: SaveAPI): Self = StObject.set(x, "Save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScripting(value: ScriptingAPI): Self = StObject.set(x, "Scripting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: js.Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetting(value: SettingsAPI): Self = StObject.set(x, "Setting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: SugarCubeSettingVariables): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetup(value: SugarCubeSetupObject): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleAudio(value: SimpleAudioAPI): Self = StObject.set(x, "SimpleAudio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: StateAPI): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage(value: js.Any): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory(value: StoryAPI): Self = StObject.set(x, "Story", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUI(value: UIAPI): Self = StObject.set(x, "UI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUIBar(value: UIBarAPI): Self = StObject.set(x, "UIBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Build): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWikifier(value: WikifierAPI): Self = StObject.set(x, "Wikifier", value.asInstanceOf[js.Any])
    }
  }
}
