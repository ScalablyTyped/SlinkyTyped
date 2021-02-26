package typingsSlinky.videoJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.videoJs.mod.videojs.Component
import typingsSlinky.videoJs.mod.videojs.Component.ReadyCallback
import typingsSlinky.videoJs.mod.videojs.ComponentOptions
import typingsSlinky.videoJs.mod.videojs.MenuButtonOptions
import typingsSlinky.videoJs.mod.videojs.MenuItemOptions
import typingsSlinky.videoJs.mod.videojs.MenuOptions
import typingsSlinky.videoJs.mod.videojs.ModalDialogOptions
import typingsSlinky.videoJs.mod.videojs.Player
import typingsSlinky.videoJs.mod.videojs.PlayerOptions
import typingsSlinky.videoJs.mod.videojs.Plugin
import typingsSlinky.videoJs.mod.videojs.Tech
import typingsSlinky.videoJs.mod.videojs.TextTrackMenuItem
import typingsSlinky.videoJs.mod.videojs.TextTrackMenuItemOptions
import typingsSlinky.videoJs.mod.videojs.TimeToolTip
import typingsSlinky.videoJs.videoJsStrings.Button
import typingsSlinky.videoJs.videoJsStrings.ClickableComponent
import typingsSlinky.videoJs.videoJsStrings.Menu
import typingsSlinky.videoJs.videoJsStrings.MenuButton
import typingsSlinky.videoJs.videoJsStrings.MenuItem
import typingsSlinky.videoJs.videoJsStrings.ModalDialog
import typingsSlinky.videoJs.videoJsStrings.MouseTimeDisplay
import typingsSlinky.videoJs.videoJsStrings.Spacer
import typingsSlinky.videoJs.videoJsStrings.TimeTooltip
import typingsSlinky.videoJs.videoJsStrings._empty
import typingsSlinky.videoJs.videoJsStrings.button_
import typingsSlinky.videoJs.videoJsStrings.clickablecomponent_
import typingsSlinky.videoJs.videoJsStrings.component_
import typingsSlinky.videoJs.videoJsStrings.maybe
import typingsSlinky.videoJs.videoJsStrings.menu_
import typingsSlinky.videoJs.videoJsStrings.menubutton_
import typingsSlinky.videoJs.videoJsStrings.menuitem_
import typingsSlinky.videoJs.videoJsStrings.modaldialog_
import typingsSlinky.videoJs.videoJsStrings.mouseTimeDisplay_
import typingsSlinky.videoJs.videoJsStrings.player_
import typingsSlinky.videoJs.videoJsStrings.problably
import typingsSlinky.videoJs.videoJsStrings.spacer_
import typingsSlinky.videoJs.videoJsStrings.timeTooltip_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait All extends StObject {
    
    var DEFAULT: String = js.native
    
    var all: String = js.native
    
    var debug: String = js.native
    
    var error: String = js.native
    
    var info: String = js.native
    
    var off: String = js.native
    
    var warn: String = js.native
  }
  object All {
    
    @scala.inline
    def apply(
      DEFAULT: String,
      all: String,
      debug: String,
      error: String,
      info: String,
      off: String,
      warn: String
    ): All = {
      val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[All]
    }
    
    @scala.inline
    implicit class AllMutableBuilder[Self <: All] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOff(value: String): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarn(value: String): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BASEPLUGINNAME
    extends /**
    * Creates an instance of this class.
    *
    * Sub-classes should call `super` to ensure plugins are properly initialized.
    *
    * @param player
    *        A Video.js player instance.
    */
  Instantiable1[/* player */ Player, Plugin]
       with Instantiable2[/* player */ Player, /* options */ js.Any, Plugin] {
    
    /**
      * The name of the base plugin class as it is registered.
      *
      */
    var BASE_PLUGIN_NAME: String = js.native
    
    /**
      * De-register a Video.js plugin.
      *
      * @param name
      *        The name of the plugin to be deregistered.
      */
    def deregisterPlugin(name: String): Unit = js.native
    
    /**
      * Gets a plugin by name if it exists.
      *
      * @param name
      *           The name of a plugin.
      *
      * @return The plugin (or `undefined`).
      */
    def getPlugin(name: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof Plugin */ js.Any = js.native
    
    /**
      * Gets a plugin's version, if available
      *
      * @param name
      *          The name of a plugin.
      *
      * @return The plugin's version or an empty string.
      */
    def getPluginVersion(name: String): String = js.native
    
    /**
      * Gets an object containing multiple Video.js plugins.
      *
      * @param [names]
      *          If provided, should be an array of plugin names. Defaults to _all_
      *          plugin names.
      *
      * @return An object containing plugin(s) associated with their name(s) or
      *          `undefined` if no matching plugins exist).
      *
      * @check returning type
      */
    def getPlugins(): StringDictionary[Plugin] = js.native
    def getPlugins(names: js.Array[String]): StringDictionary[Plugin] = js.native
    
    /**
      * Determines if a plugin is a basic plugin (i.e. not a sub-class of `Plugin`).
      *
      * @param plugin
      *          If a string, matches the name of a plugin. If a function, will be
      *          tested directly.
      *
      * @return Whether or not a plugin is a basic plugin.
      */
    def isBasic(plugin: String): Boolean = js.native
    def isBasic(plugin: js.Function0[_]): Boolean = js.native
    
    def registerPlugin[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Plugin */ js.Any */](name: String, plugin: T): js.Function0[T] = js.native
    /**
      * Register a Video.js plugin.
      *
      * @param name
      *          The name of the plugin to be registered. Must be a string and
      *          must not match an existing plugin or a method on the `Player`
      *          prototype.
      *
      * @param plugin
      *          A sub-class of `Plugin` or a function for basic plugins.
      *
      * @return For advanced plugins, a factory function for that plugin. For
      *          basic plugins, a wrapper function that initializes the plugin.
      */
    def registerPlugin[T, K](name: String, plugin: js.ThisFunction1[/* this */ Player, /* repeated */ K, T]): js.Function1[/* repeated */ K, T] = js.native
  }
  
  @js.native
  trait Call extends StObject {
    
    /**
      * Returns an array containing everything that has been logged to the history.
      *
      * This array is a shallow clone of the internal history record. However, its
      * contents are _not_ cloned; so, mutating objects inside this array will
      * mutate them in history.
      *
      * @return
      */
    def apply(): js.Array[_] = js.native
    
    /**
      * Clears the internal history tracking, but does not prevent further history
      * tracking.
      */
    def clear(): Unit = js.native
    
    /**
      * Disable history tracking if it is currently enabled.
      */
    def disable(): Unit = js.native
    
    /**
      * Enable history tracking if it is currently disabled.
      */
    def enable(): Unit = js.native
  }
  
  @js.native
  trait CanPlaySource
    extends /**
    * Create an instance of this Tech.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param ready
    *        Callback function to call when the `HTML5` Tech is ready.
    */
  Instantiable0[Tech]
       with Instantiable1[/* options */ js.Any, Tech]
       with Instantiable2[js.UndefOr[/* options */ js.Any], /* ready */ ReadyCallback, Tech] {
    
    /**
      * Check if the tech can support the given source
      * @param srcObj
      *        The source object
      * @param options
      *        The options passed to the tech
      * @return 'probably', 'maybe', or '' (empty string)
      */
    def canPlaySource(srcObj: js.Any, options: js.Any): problably | maybe | _empty = js.native
    
    /**
      * Check if the type is supported by this tech.
      *
      * The base tech does not support any type, but source handlers might
      * overwrite this.
      *
      * @param type
      *        The media type to check
      * @return Returns the native video element's response
      */
    def canPlayType(`type`: String): String = js.native
    
    /**
      * Get a `Tech` from the shared list by name.
      *
      * @param name
      *        `camelCase` or `TitleCase` name of the Tech to get
      *
      * @return The `Tech` or undefined if there was no tech with the name requested.
      */
    def getTech(name: String): js.UndefOr[Tech] = js.native
    
    /**
      * Return whether the argument is a Tech or not.
      * Can be passed either a Class like `Html5` or a instance like `player.tech_`
      *
      * @param component
      *        The item to check
      *
      * @return Whether it is a tech or not
      *         - True if it is a tech
      *         - False if it is not
      */
    def isTech(component: js.Any): Boolean = js.native
    
    /**
      * Registers a `Tech` into a shared list for videojs.
      *
      * @param name
      *        Name of the `Tech` to register.
      *
      * @param tech
      *        The `Tech` class to register.
      */
    def registerTech(name: String, tech: js.Any): Unit = js.native
    
    /**
      * A functional mixin for techs that want to use the Source Handler pattern.
      * Source handlers are scripts for handling specific formats.
      * The source handler pattern is used for adaptive formats (HLS, DASH) that
      * manually load video data and feed it into a Source Buffer (Media Source Extensions)
      * Example: `Tech.withSourceHandlers.call(MyTech);`
      *
      * @param tech
      *        The tech to add source handler functions to.
      *
      */
    def withSourceHandlers(tech: /* import warning: importer.ImportType#apply Failed type conversion: typeof Tech */ js.Any): Unit = js.native
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[
        js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias video.js.video.js.videojs.Child */ js.Object
        ]
      ] = js.native
    
    var name: String = js.native
  }
  object Children {
    
    @scala.inline
    def apply(name: String): Children = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(
        value: js.Array[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias video.js.video.js.videojs.Child */ js.Object
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias video.js.video.js.videojs.Child */ js.Object)*
      ): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetComponent
    extends /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [options.children]
    *        An array of children objects to intialize this component with. Children objects have
    *        a name property that will be used if more than one component of the same type needs to be
    *        added.
    *
    * @param [ready]
    *        Function that gets called when the `Component` is ready.
    */
  Instantiable1[/* player */ Player, Component]
       with Instantiable2[/* player */ Player, /* options */ ComponentOptions, Component]
       with Instantiable3[
          /* player */ Player, 
          js.UndefOr[/* options */ ComponentOptions], 
          /* ready */ ReadyCallback, 
          Component
        ] {
    
    def getComponent(name: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof Component */ js.Any = js.native
    /**
      * Get a `Component` based on the name it was registered with.
      *
      * @param name
      *        The Name of the component to get.
      *
      * @return The `Component` that got registered under the given name.
      *
      * @deprecated In `videojs` 6 this will not return `Component`s that were not
      *             registered using {@link Component.registerComponent}. Currently we
      *             check the global `videojs` object for a `Component` name and
      *             return that if it exists.
      */
    @JSName("getComponent")
    def getComponent_Button(name: Button): /* import warning: importer.ImportType#apply Failed type conversion: typeof Button */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_ClickableComponent(name: ClickableComponent): /* import warning: importer.ImportType#apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_Component(name: typingsSlinky.videoJs.videoJsStrings.Component): /* import warning: importer.ImportType#apply Failed type conversion: typeof Component */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_Menu(name: Menu): /* import warning: importer.ImportType#apply Failed type conversion: typeof Menu */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_MenuButton(name: MenuButton): /* import warning: importer.ImportType#apply Failed type conversion: typeof MenuButton */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_MenuItem(name: MenuItem): /* import warning: importer.ImportType#apply Failed type conversion: typeof MenuItem */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_ModalDialog(name: ModalDialog): /* import warning: importer.ImportType#apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_MouseTimeDisplay(name: MouseTimeDisplay): /* import warning: importer.ImportType#apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_Player(name: typingsSlinky.videoJs.videoJsStrings.Player): /* import warning: importer.ImportType#apply Failed type conversion: typeof Player */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_Spacer(name: Spacer): /* import warning: importer.ImportType#apply Failed type conversion: typeof Spacer */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_TimeTooltip(name: TimeTooltip): /* import warning: importer.ImportType#apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_button(name: button_): /* import warning: importer.ImportType#apply Failed type conversion: typeof Button */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_clickablecomponent(name: clickablecomponent_): /* import warning: importer.ImportType#apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_component(name: component_): /* import warning: importer.ImportType#apply Failed type conversion: typeof Component */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_menu(name: menu_): /* import warning: importer.ImportType#apply Failed type conversion: typeof Menu */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_menubutton(name: menubutton_): /* import warning: importer.ImportType#apply Failed type conversion: typeof MenuButton */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_menuitem(name: menuitem_): /* import warning: importer.ImportType#apply Failed type conversion: typeof MenuItem */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_modaldialog(name: modaldialog_): /* import warning: importer.ImportType#apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_mouseTimeDisplay(name: mouseTimeDisplay_): /* import warning: importer.ImportType#apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_player(name: player_): /* import warning: importer.ImportType#apply Failed type conversion: typeof Player */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_spacer(name: spacer_): /* import warning: importer.ImportType#apply Failed type conversion: typeof Spacer */ js.Any = js.native
    @JSName("getComponent")
    def getComponent_timeTooltip(name: timeTooltip_): /* import warning: importer.ImportType#apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
    
    /**
      * Register a `Component` with `videojs` given the name and the component.
      *
      * > NOTE: {@link Tech}s should not be registered as a `Component`. {@link Tech}s
      *         should be registered using {@link Tech.registerTech} or
      *         {@link videojs:videojs.registerTech}.
      *
      * > NOTE: This function can also be seen on videojs as
      *         {@link videojs:videojs.registerComponent}.
      *
      * @param name
      *        The name of the `Component` to register.
      *
      * @param ComponentToRegister
      *        The `Component` class to register.
      *
      * @return The `Component` that was registered.
      */
    def registerComponent(name: String, ComponentToRegister: js.Any): js.Any = js.native
  }
  
  @js.native
  trait GetTagSettings
    extends /**
    * An instance of the `Player` class is created when any of the Video.js setup methods
    * are used to initialize a video.
    *
    * After an instance has been created it can be accessed globally in two ways:
    * 1. By calling `videojs('example_video_1');`
    * 2. By using it directly via  `videojs.players.example_video_1;`
    */
  Instantiable1[/* player */ Player, Player]
       with Instantiable2[/* player */ Player, /* options */ PlayerOptions, Player] {
    
    /**
      * Gets tag settings
      *
      * @param tag
      *        The player tag
      * @check
      * @return An object containing all of the settings
      *         for a player tag
      */
    def getTagSettings(tag: Element): js.Any = js.native
  }
  
  @js.native
  trait Instantiable
    extends /**
    * Creates an instance of this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  Instantiable1[/* player */ Player, typingsSlinky.videoJs.mod.videojs.Button]
       with Instantiable2[
          /* player */ Player, 
          /* options */ ComponentOptions, 
          typingsSlinky.videoJs.mod.videojs.Button
        ]
  
  @js.native
  trait InstantiableClickableComponent
    extends /**
    * Creates an instance of this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  Instantiable1[/* player */ Player, typingsSlinky.videoJs.mod.videojs.ClickableComponent]
       with Instantiable2[
          /* player */ Player, 
          /* options */ ComponentOptions, 
          typingsSlinky.videoJs.mod.videojs.ClickableComponent
        ]
  
  @js.native
  trait InstantiableMenu
    extends /**
    * Create an instance of this class.
    *
    * @param player
    *        the player that this component should attach to
    *
    * @param [options]
    *        Object of option names and values
    *
    */
  Instantiable1[/* player */ Player, typingsSlinky.videoJs.mod.videojs.Menu]
       with Instantiable2[
          /* player */ Player, 
          /* options */ MenuOptions, 
          typingsSlinky.videoJs.mod.videojs.Menu
        ]
  
  @js.native
  trait InstantiableMenuButton
    extends /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options={}]
    *        The key/value store of player options.
    */
  Instantiable1[/* player */ Player, typingsSlinky.videoJs.mod.videojs.MenuButton]
       with Instantiable2[
          /* player */ Player, 
          /* options */ MenuButtonOptions, 
          typingsSlinky.videoJs.mod.videojs.MenuButton
        ]
  
  @js.native
  trait InstantiableMenuItem
    extends /**
    * Creates an instance of the this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options={}]
    *        The key/value store of player options.
    *
    */
  Instantiable1[/* player */ Player, typingsSlinky.videoJs.mod.videojs.MenuItem]
       with Instantiable2[
          /* player */ Player, 
          /* options */ MenuItemOptions, 
          typingsSlinky.videoJs.mod.videojs.MenuItem
        ]
  
  @js.native
  trait InstantiableModalDialog
    extends /**
    * Create an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  Instantiable1[/* player */ Player, typingsSlinky.videoJs.mod.videojs.ModalDialog]
       with Instantiable2[
          /* player */ Player, 
          /* options */ ModalDialogOptions, 
          typingsSlinky.videoJs.mod.videojs.ModalDialog
        ]
  
  @js.native
  trait InstantiableMouseTimeDisplay
    extends /**
    * Creates an instance of this class.
    *
    * @param player
    *        The {@link Player} that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  Instantiable1[/* player */ Player, typingsSlinky.videoJs.mod.videojs.MouseTimeDisplay]
       with Instantiable2[
          /* player */ Player, 
          /* options */ ComponentOptions, 
          typingsSlinky.videoJs.mod.videojs.MouseTimeDisplay
        ]
  
  @js.native
  trait InstantiableSpacer
    extends /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [ready]
    *        Function that gets called when the `Component` is ready.
    */
  Instantiable1[/* player */ Player, typingsSlinky.videoJs.mod.videojs.Spacer]
       with Instantiable2[
          /* player */ Player, 
          /* options */ ComponentOptions, 
          typingsSlinky.videoJs.mod.videojs.Spacer
        ]
       with Instantiable3[
          /* player */ Player, 
          js.UndefOr[/* options */ ComponentOptions], 
          /* ready */ ReadyCallback, 
          typingsSlinky.videoJs.mod.videojs.Spacer
        ]
  
  @js.native
  trait InstantiableTextTrackMenuItem
    extends /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  Instantiable1[/* player */ Player, TextTrackMenuItem]
       with Instantiable2[/* player */ Player, /* options */ TextTrackMenuItemOptions, TextTrackMenuItem]
  
  @js.native
  trait InstantiableTimeToolTip
    extends /**
    * Creates an instance of this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  Instantiable1[/* player */ Player, TimeToolTip]
       with Instantiable2[/* player */ Player, /* options */ ComponentOptions, TimeToolTip]
  
  @js.native
  trait TypeofComponent extends GetComponent
  
  @js.native
  trait TypeofPlayer extends GetTagSettings
  
  @js.native
  trait TypeofPlugin extends BASEPLUGINNAME
  
  @js.native
  trait TypeofTech extends CanPlaySource
}
