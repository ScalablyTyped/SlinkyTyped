package typingsSlinky.seleniumStandalone.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-standalone", "start")
@js.native
object start extends js.Object {
  
  def apply(cb: js.Function2[js.Error | Null, /* selenium */ ChildProcess, Unit]): Unit = js.native
  def apply(
    optsCb: js.Function2[/* error */ js.Error | Null, /* selenium */ ChildProcess, Unit],
    cb: js.Function2[/* error */ js.Error | Null, /* selenium */ ChildProcess, Unit]
  ): Unit = js.native
  def apply(optsCb: StartOpts): Unit = js.native
  def apply(opts: StartOpts, cb: js.Function2[js.Error | Null, /* selenium */ ChildProcess, Unit]): Unit = js.native
}
