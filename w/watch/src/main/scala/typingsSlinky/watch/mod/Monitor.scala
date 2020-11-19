package typingsSlinky.watch.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.watch.watchStrings.changed
import typingsSlinky.watch.watchStrings.created
import typingsSlinky.watch.watchStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Monitor extends EventEmitter {
  
  var files: StringDictionary[Stats] = js.native
  
  @JSName("on")
  def on_changed(
    event: changed,
    listener: js.Function3[/* f */ FileOrFiles, /* current */ Stats, /* prev */ Stats, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_created(event: created, listener: js.Function2[/* f */ FileOrFiles, /* stat */ Stats, Unit]): this.type = js.native
  @JSName("on")
  def on_removed(event: removed, listener: js.Function2[/* f */ FileOrFiles, /* stat */ Stats, Unit]): this.type = js.native
  
  def stop(): Unit = js.native
}
