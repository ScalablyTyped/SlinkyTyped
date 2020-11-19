package typingsSlinky.sinonjsFakeTimers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FakeTimerWithContext extends js.Object {
  
  def createClock(): Clock = js.native
  def createClock(now: js.UndefOr[scala.Nothing], loopLimit: Double): Clock = js.native
  def createClock(now: Double): Clock = js.native
  def createClock(now: Double, loopLimit: Double): Clock = js.native
  def createClock(now: js.Date): Clock = js.native
  def createClock(now: js.Date, loopLimit: Double): Clock = js.native
  
  def install(): InstalledClock = js.native
  def install(opts: FakeTimerInstallOpts): InstalledClock = js.native
  
  var timers: GlobalTimers[TimerId] = js.native
  
  def withGlobal(global: js.Object): FakeTimerWithContext = js.native
}
