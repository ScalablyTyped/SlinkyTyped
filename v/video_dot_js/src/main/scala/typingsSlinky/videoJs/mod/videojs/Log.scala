package typingsSlinky.videoJs.mod.videojs

import typingsSlinky.videoJs.anon.All
import typingsSlinky.videoJs.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @file log.js
  */
@js.native
trait Log extends js.Object {
  
  /**
    * Logs plain debug messages. Similar to `console.log`.
    * @param args
    *           One or more messages or objects that should be logged.
    */
  def apply(args: js.Any*): Unit = js.native
  
  /**
    * Make a new module or plugin and log messages with a label.
    * It takes a name and gives you back a log object like videojs.log
    *
    * @param label
    */
  def createLogger(label: String): Log = js.native
  
  /**
    * Logs debug messages. Similar to `console.debug`, but may also act as a comparable
    * log if `console.debug` is not available
    *
    * @param args
    *        One or more messages or objects that should be logged as debug.
    */
  def debug(args: js.Any*): Unit = js.native
  
  /**
    * Logs error messages. Similar to `console.error`.
    *
    * @param args
    *        One or more messages or objects that should be logged as an error
    */
  def error(args: js.Any*): Unit = js.native
  
  /**
    * Returns an array containing everything that has been logged to the history.
    *
    * This array is a shallow clone of the internal history record. However, its
    * contents are _not_ cloned; so, mutating objects inside this array will
    * mutate them in history.
    *
    * @return
    */
  def history(): js.Array[_] = js.native
  @JSName("history")
  var history_Original: Call = js.native
  
  /**
    * Get or set the current logging level. If a string matching a key from
    * {@link log.levels} is provided, acts as a setter. Regardless of argument,
    * returns the current logging level.
    *
    * @param [lvl]
    *         Pass to set a new logging level.
    *
    * @return The current logging level.
    */
  def level(): String = js.native
  def level(lvl: String): String = js.native
  
  /**
    * Enumeration of available logging levels, where the keys are the level names
    * and the values are `|`-separated strings containing logging methods allowed
    * in that logging level. These strings are used to create a regular expression
    * matching the function name being called.
    *
    * Levels provided by video.js are:
    *
    * - `off`: Matches no calls. Any value that can be cast to `false` will have
    *   this effect. The most restrictive.
    * - `all`: Matches only Video.js-provided functions (`debug`, `log`,
    *   `log.warn`, and `log.error`).
    * - `debug`: Matches `log.debug`, `log`, `log.warn`, and `log.error` calls.
    * - `info` (default): Matches `log`, `log.warn`, and `log.error` calls.
    * - `warn`: Matches `log.warn` and `log.error` calls.
    * - `error`: Matches only `log.error` calls.
    *
    */
  var levels: All = js.native
  
  /**
    * Logs warning messages. Similar to `console.warn`.
    *
    * @param args
    *        One or more messages or objects that should be logged as a warning.
    */
  def warn(args: js.Any*): Unit = js.native
}
