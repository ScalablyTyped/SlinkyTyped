package typingsSlinky.tstl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<tstl.tstl/base/thread/ISharedTimedLockable.ISharedTimedLockable, 'try_lock_shared_until' | 'unlock_shared'> */
@js.native
trait PickISharedTimedLockabletTrylockshareduntil extends js.Object {
  
  def try_lock_shared_until(at: js.Date): js.Promise[Boolean] = js.native
  @JSName("try_lock_shared_until")
  var try_lock_shared_until_Original: js.Function1[/* at */ js.Date, js.Promise[Boolean]] = js.native
  
  def unlock_shared(): js.Promise[Unit] = js.native
  @JSName("unlock_shared")
  var unlock_shared_Original: js.Function0[js.Promise[Unit]] = js.native
}
