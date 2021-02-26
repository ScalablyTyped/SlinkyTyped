package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.typingsMod.ReplSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "ReplSet")
@js.native
class ReplSet protected ()
  extends typingsSlinky.typeorm.typingsMod.ReplSet {
  /**
    *
    * @param servers A seedlist of servers participating in the replicaset.
    * @param options Optional.
    */
  def this(servers: js.Array[typingsSlinky.typeorm.typingsMod.Server]) = this()
  def this(servers: js.Array[typingsSlinky.typeorm.typingsMod.Server], options: ReplSetOptions) = this()
}
