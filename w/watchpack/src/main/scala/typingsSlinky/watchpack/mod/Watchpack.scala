package typingsSlinky.watchpack.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.NodeJS.Timer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watchpack extends EventEmitter {
  
  def _dirWatcher(item: String, watcher: typingsSlinky.watchpack.watcherMod.^): typingsSlinky.watchpack.watcherMod.^ = js.native
  
  def _fileWatcher(file: String, watcher: typingsSlinky.watchpack.watcherMod.^): typingsSlinky.watchpack.watcherMod.^ = js.native
  
  def _onChange(item: String, mtime: Double): Unit = js.native
  def _onChange(item: String, mtime: Double, file: String): Unit = js.native
  
  def _onTimeout(): Unit = js.native
  
  var aggregateTimeout: Timer = js.native
  
  var aggregatedChanges: js.Array[String] = js.native
  
  def close(): Unit = js.native
  
  var dirWatchers: js.Array[typingsSlinky.watchpack.watcherMod.^] = js.native
  
  var fileWatchers: js.Array[typingsSlinky.watchpack.watcherMod.^] = js.native
  
  def getTimes(): StringDictionary[Double] = js.native
  
  var mtimes: StringDictionary[Double] = js.native
  
  var options: WatchOptions = js.native
  
  def pause(): Unit = js.native
  
  var paused: Boolean = js.native
  
  def watch(files: js.Array[String], directories: js.Array[String]): Unit = js.native
  def watch(files: js.Array[String], directories: js.Array[String], startTime: Double): Unit = js.native
  
  var watcherOptions: WatcherOptions = js.native
}
