package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationPreloadManager extends js.Object {
  def disable(): js.Promise[Unit] = js.native
  def enable(): js.Promise[Unit] = js.native
  def getState(): js.Promise[NavigationPreloadState] = js.native
  def setHeaderValue(value: java.lang.String): js.Promise[Unit] = js.native
}

@JSGlobal("NavigationPreloadManager")
@js.native
object NavigationPreloadManager extends Instantiable0[NavigationPreloadManager]

