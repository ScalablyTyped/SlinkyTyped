package typingsSlinky.videoJs.videoCoreMod.default

import typingsSlinky.videoJs.anon.TypeofTech
import typingsSlinky.videoJs.mod.videojs.Component.ReadyCallback
import typingsSlinky.videoJs.videoJsStrings._empty
import typingsSlinky.videoJs.videoJsStrings.maybe
import typingsSlinky.videoJs.videoJsStrings.problably
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tech {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js/dist/alt/video.core", "default.Tech")
  @js.native
  /**
    * Create an instance of this Tech.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param ready
    *        Callback function to call when the `HTML5` Tech is ready.
    */
  class ^ ()
    extends typingsSlinky.videoJs.mod.videojs.Tech {
    def this(options: js.Any) = this()
    def this(options: js.UndefOr[scala.Nothing], ready: ReadyCallback) = this()
    def this(options: js.Any, ready: ReadyCallback) = this()
  }
  
  /**
    * Check if the tech can support the given source
    * @param srcObj
    *        The source object
    * @param options
    *        The options passed to the tech
    * @return 'probably', 'maybe', or '' (empty string)
    */
  @JSImport("video.js/dist/alt/video.core", "default.Tech.canPlaySource")
  @js.native
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
  @JSImport("video.js/dist/alt/video.core", "default.Tech.canPlayType")
  @js.native
  def canPlayType(`type`: String): String = js.native
  
  /**
    * Get a `Tech` from the shared list by name.
    *
    * @param name
    *        `camelCase` or `TitleCase` name of the Tech to get
    *
    * @return The `Tech` or undefined if there was no tech with the name requested.
    */
  @JSImport("video.js/dist/alt/video.core", "default.Tech.getTech")
  @js.native
  def getTech(name: String): js.UndefOr[typingsSlinky.videoJs.mod.videojs.Tech] = js.native
  
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
  @JSImport("video.js/dist/alt/video.core", "default.Tech.isTech")
  @js.native
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
  @JSImport("video.js/dist/alt/video.core", "default.Tech.registerTech")
  @js.native
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
  @JSImport("video.js/dist/alt/video.core", "default.Tech.withSourceHandlers")
  @js.native
  def withSourceHandlers(tech: TypeofTech): Unit = js.native
}
