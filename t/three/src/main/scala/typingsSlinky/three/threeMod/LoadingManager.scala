package typingsSlinky.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "LoadingManager")
@js.native
class LoadingManager ()
  extends typingsSlinky.three.srcLoadersLoadingManagerMod.LoadingManager {
  def this(onLoad: js.Function0[Unit]) = this()
  def this(
    onLoad: js.Function0[Unit],
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit]
  ) = this()
  def this(
    onLoad: js.Function0[Unit],
    onProgress: js.Function3[/* url */ String, /* loaded */ Double, /* total */ Double, Unit],
    onError: js.Function1[/* url */ String, Unit]
  ) = this()
}

