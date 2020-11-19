package typingsSlinky.seleniumStandalone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-standalone", "install")
@js.native
object install extends js.Object {
  
  def apply(cb: js.Function2[js.UndefOr[js.Error], /* fsPaths */ FsPaths, Unit]): Unit = js.native
  def apply(
    optsCb: js.Function2[/* error */ js.UndefOr[js.Error], /* fsPaths */ FsPaths, Unit],
    cb: js.Function2[/* error */ js.UndefOr[js.Error], /* fsPaths */ FsPaths, Unit]
  ): Unit = js.native
  def apply(optsCb: InstallOpts): Unit = js.native
  def apply(opts: InstallOpts, cb: js.Function2[js.UndefOr[js.Error], /* fsPaths */ FsPaths, Unit]): Unit = js.native
}
