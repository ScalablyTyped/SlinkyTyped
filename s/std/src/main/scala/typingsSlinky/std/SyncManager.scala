package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This ServiceWorker API interface provides an interface for registering and listing sync registrations. */
@js.native
trait SyncManager extends js.Object {
  def getTags(): js.Promise[js.Array[java.lang.String]] = js.native
  def register(tag: java.lang.String): js.Promise[Unit] = js.native
}

@JSGlobal("SyncManager")
@js.native
object SyncManager extends Instantiable0[SyncManager]

