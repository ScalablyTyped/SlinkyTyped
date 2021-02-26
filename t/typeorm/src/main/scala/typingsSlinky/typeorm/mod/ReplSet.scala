package typingsSlinky.typeorm.mod

import typingsSlinky.typeorm.mongodbTypingsMod.ReplSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "ReplSet")
@js.native
class ReplSet protected ()
  extends typingsSlinky.typeorm.mongodbTypingsMod.ReplSet {
  /**
    *
    * @param servers A seedlist of servers participating in the replicaset.
    * @param options Optional.
    */
  def this(servers: js.Array[typingsSlinky.typeorm.mongodbTypingsMod.Server]) = this()
  def this(servers: js.Array[typingsSlinky.typeorm.mongodbTypingsMod.Server], options: ReplSetOptions) = this()
}
