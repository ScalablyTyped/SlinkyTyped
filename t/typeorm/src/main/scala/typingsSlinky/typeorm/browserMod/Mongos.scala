package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.typingsMod.MongosOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Mongos")
@js.native
class Mongos protected ()
  extends typingsSlinky.typeorm.typingsMod.Mongos {
  /**
    *
    * @param servers A seedlist of servers participating in the replicaset.
    * @param options Optional.
    */
  def this(servers: js.Array[typingsSlinky.typeorm.typingsMod.Server]) = this()
  def this(servers: js.Array[typingsSlinky.typeorm.typingsMod.Server], options: MongosOptions) = this()
}
