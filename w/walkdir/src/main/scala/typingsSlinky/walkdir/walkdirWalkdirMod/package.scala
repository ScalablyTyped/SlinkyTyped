package typingsSlinky.walkdir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object walkdirWalkdirMod {
  import typingsSlinky.node.eventsMod.EventEmitter
  import typingsSlinky.node.fsMod.Stats
  import typingsSlinky.walkdir.Anon_Blockdevice

  type WalkEmitter = EventEmitter with Anon_Blockdevice
  type WalkEventListener = js.ThisFunction3[
    /* this */ WalkEmitter, 
    /* path */ String, 
    /* stat */ Stats, 
    /* ignore */ js.Function1[/* path */ String | js.Array[String], Unit], 
    Unit
  ]
}
