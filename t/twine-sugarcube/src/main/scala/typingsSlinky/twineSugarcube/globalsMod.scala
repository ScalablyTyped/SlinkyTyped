package typingsSlinky.twineSugarcube

import typingsSlinky.twineSugarcube.audioMod.SimpleAudioAPI
import typingsSlinky.twineSugarcube.configMod.ConfigAPI
import typingsSlinky.twineSugarcube.engineMod.EngineAPI
import typingsSlinky.twineSugarcube.macroMod.MacroAPI
import typingsSlinky.twineSugarcube.scriptingMod.ScriptingAPI
import typingsSlinky.twineSugarcube.settingsMod.SettingsAPI
import typingsSlinky.twineSugarcube.stateMod.StateAPI
import typingsSlinky.twineSugarcube.storyMod.StoryAPI
import typingsSlinky.twineSugarcube.sugarcubeMod.SugarCubeObject
import typingsSlinky.twineSugarcube.templateMod.TemplateAPI
import typingsSlinky.twineSugarcube.uiMod.DialogAPI
import typingsSlinky.twineSugarcube.uiMod.FullscreenAPI
import typingsSlinky.twineSugarcube.uiMod.LoadScreenAPI
import typingsSlinky.twineSugarcube.uiMod.UIAPI
import typingsSlinky.twineSugarcube.uiMod.UIBarAPI
import typingsSlinky.twineSugarcube.userdataMod.SugarCubeSettingVariables
import typingsSlinky.twineSugarcube.userdataMod.SugarCubeSetupObject
import typingsSlinky.twineSugarcube.wikiMod.WikifierAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  object global {
    
    /**
      * Configuration API.
      * @since 2.0.0
      */
    @JSGlobal("Config")
    @js.native
    val Config: ConfigAPI = js.native
    
    /**
      * Dialog API.
      * @since 2.0.0
      */
    @JSGlobal("Dialog")
    @js.native
    val Dialog: DialogAPI = js.native
    
    /**
      * Engine API.
      */
    @JSGlobal("Engine")
    @js.native
    val Engine: EngineAPI = js.native
    
    @JSGlobal("Fullscreen")
    @js.native
    val Fullscreen: FullscreenAPI = js.native
    
    @JSGlobal("LoadScreen")
    @js.native
    val LoadScreen: LoadScreenAPI = js.native
    
    /**
      * Macro API.
      * @since 2.0.0
      */
    @JSGlobal("Macro")
    @js.native
    val Macro: MacroAPI = js.native
    
    @JSGlobal("Scripting")
    @js.native
    val Scripting: ScriptingAPI = js.native
    
    @JSGlobal("Setting")
    @js.native
    val Setting: SettingsAPI = js.native
    
    /**
      *
      * @since 2.28.0
      */
    @JSGlobal("SimpleAudio")
    @js.native
    val SimpleAudio: SimpleAudioAPI = js.native
    
    @JSGlobal("State")
    @js.native
    val State: StateAPI = js.native
    
    @JSGlobal("Story")
    @js.native
    val Story: StoryAPI = js.native
    
    @JSGlobal("SugarCube")
    @js.native
    val SugarCube: SugarCubeObject = js.native
    
    /**
      * Template API.
      * @since 2.29.0
      */
    @JSGlobal("Template")
    @js.native
    val Template: TemplateAPI = js.native
    
    @JSGlobal("UI")
    @js.native
    val UI: UIAPI = js.native
    
    @JSGlobal("UIBar")
    @js.native
    val UIBar: UIBarAPI = js.native
    
    @JSGlobal("Wikifier")
    @js.native
    val Wikifier: WikifierAPI = js.native
    
    /**
      * A prototype-less generic object whose properties and values are defined by the Setting.addToggle(),
      * Setting.addList(), and Setting.addRange() methods.
      *
      * Normally, the values of its properties are automatically managed by their associated Settings dialog
      * control. If necessary, however, you may manually change their values—n.b. you'll need to call the
      * Setting.save() after having done so.
      * @since 2.0.0
      */
    @JSGlobal("settings")
    @js.native
    val settings: SugarCubeSettingVariables = js.native
    
    /**
      * Object that authors/developers may use to set up various bits of static data. Generally, you would use this for data that
      * does not change and should not be stored within story variables, which would make it part of the history.
      * @since 2.0.0
      */
    @JSGlobal("setup")
    @js.native
    val setup: SugarCubeSetupObject = js.native
    
    /**
      * Strings localization object.
      * @since 2.10.0
      */
    object l10nStrings
  }
}
