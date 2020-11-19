package typingsSlinky.tstl

import typingsSlinky.tstl.anon.PickILockablelock
import typingsSlinky.tstl.anon.PickILockabletrylock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/thread/global", JSImport.Namespace)
@js.native
object threadGlobalMod extends js.Object {
  
  def lock(items: PickILockablelock*): js.Promise[Unit] = js.native
  
  @JSName("sleep_for")
  def sleepFor(ms: Double): js.Promise[Unit] = js.native
  
  @JSName("sleep_until")
  def sleepUntil(at: js.Date): js.Promise[Unit] = js.native
  
  @JSName("try_lock")
  def tryLock(items: PickILockabletrylock*): js.Promise[Double] = js.native
}
