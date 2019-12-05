package typingsSlinky.zookeeper.zookeeperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zookeeper extends Client {
  def close(): Unit = js.native
  def connect(callback: js.Function2[/* e */ js.Error | Null, /* client */ Client, Unit]): Unit = js.native
}

