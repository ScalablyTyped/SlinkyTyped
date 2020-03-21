package typingsSlinky.wonderFrp.mod

import typingsSlinky.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
@js.native
class SkipUntilOtherObserver protected ()
  extends typingsSlinky.wonderFrp.skipUntilOtherObserverMod.SkipUntilOtherObserver {
  def this(
    prevObserver: IObserver,
    skipUntilStream: typingsSlinky.wonderFrp.skipUntilStreamMod.SkipUntilStream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SkipUntilOtherObserver")
@js.native
object SkipUntilOtherObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    skipUntilStream: typingsSlinky.wonderFrp.skipUntilStreamMod.SkipUntilStream
  ): typingsSlinky.wonderFrp.skipUntilOtherObserverMod.SkipUntilOtherObserver = js.native
}

