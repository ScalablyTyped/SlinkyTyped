package typingsSlinky.tstl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tstl.tstl/base/thread/ITimedLockable.ITimedLockable, 'try_lock_until' | 'unlock'> */
@js.native
trait PickITimedLockabletrylockTrylockuntil extends js.Object {
  
  def try_lock_until(at: js.Date): js.Promise[Boolean] = js.native
  @JSName("try_lock_until")
  var try_lock_until_Original: js.Function1[/* at */ js.Date, js.Promise[Boolean]] = js.native
  
  def unlock(): js.Promise[Unit] = js.native
  @JSName("unlock")
  var unlock_Original: js.Function0[js.Promise[Unit]] = js.native
}
