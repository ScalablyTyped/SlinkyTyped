package typingsSlinky.zookeeper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zookeeper extends Client {
  
  def close(): Unit = js.native
  
  def connect(callback: js.Function2[/* e */ js.Error | Null, /* client */ Client, Unit]): Unit = js.native
}
