package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.mongodbTypingsMod.MongosOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Mongos")
@js.native
class Mongos protected ()
  extends typingsSlinky.typeorm.mongodbTypingsMod.Mongos {
  /**
    *
    * @param servers A seedlist of servers participating in the replicaset.
    * @param options Optional.
    */
  def this(servers: js.Array[typingsSlinky.typeorm.mongodbTypingsMod.Server]) = this()
  def this(servers: js.Array[typingsSlinky.typeorm.mongodbTypingsMod.Server], options: MongosOptions) = this()
}
