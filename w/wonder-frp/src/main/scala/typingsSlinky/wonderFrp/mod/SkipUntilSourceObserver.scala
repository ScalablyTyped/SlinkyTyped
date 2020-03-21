package typingsSlinky.wonderFrp.mod

import typingsSlinky.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
class SkipUntilSourceObserver protected ()
  extends typingsSlinky.wonderFrp.skipUntilSourceObserverMod.SkipUntilSourceObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typingsSlinky.wonderFrp.skipUntilStreamMod.SkipUntilStream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SkipUntilSourceObserver")
@js.native
object SkipUntilSourceObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    skipUntilStream: typingsSlinky.wonderFrp.skipUntilStreamMod.SkipUntilStream
  ): typingsSlinky.wonderFrp.skipUntilSourceObserverMod.SkipUntilSourceObserver = js.native
}

