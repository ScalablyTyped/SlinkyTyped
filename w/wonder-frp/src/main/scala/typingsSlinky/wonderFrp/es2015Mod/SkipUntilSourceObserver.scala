package typingsSlinky.wonderFrp.es2015Mod

import typingsSlinky.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "SkipUntilSourceObserver")
@js.native
class SkipUntilSourceObserver protected ()
  extends typingsSlinky.wonderFrp.observerSkipUntilSourceObserverMod.SkipUntilSourceObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typingsSlinky.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "SkipUntilSourceObserver")
@js.native
object SkipUntilSourceObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    skipUntilStream: typingsSlinky.wonderFrp.streamSkipUntilStreamMod.SkipUntilStream
  ): typingsSlinky.wonderFrp.observerSkipUntilSourceObserverMod.SkipUntilSourceObserver = js.native
}

