package typingsSlinky.siesta.Siesta.Test

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.siesta.Siesta.ITest
import typingsSlinky.siesta.Siesta.Test.Simulate.IEvent
import typingsSlinky.siesta.Siesta.Test.Simulate.IKeyboard
import typingsSlinky.siesta.Siesta.Test.Simulate.IMouse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
@js.native
trait Browser
  extends ITest
     with IEvent
     with IKeyboard
     with IMouse
     with IElement
     with ITextSelection {
  def clearTimeout(timeoutId: Double): Unit = js.native
  def elementFromPoint(x: Double, y: Double): HTMLElement = js.native
  def elementFromPoint(x: Double, y: Double, shallow: Boolean): HTMLElement = js.native
  def firesAtLeastNTimes(observable: js.Any, event: String, n: Double, desc: String): Unit = js.native
  def firesOk(options: js.Any): Unit = js.native
  def firesOnce(observable: js.Any, event: String, desc: String): Unit = js.native
  def isntFired(observable: js.Any, event: String, desc: String): Unit = js.native
  def setTimeout(func: js.Function, delay: Double): Double = js.native
  def waitForEvent(observable: js.Any, event: String, callback: js.Function): Unit = js.native
  def waitForEvent(
    observable: js.Any,
    event: String,
    callback: js.Function,
    scope: js.UndefOr[scala.Nothing],
    timeout: Double
  ): Unit = js.native
  def waitForEvent(observable: js.Any, event: String, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForEvent(observable: js.Any, event: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def waitForPageLoad(callback: js.Function): Unit = js.native
  def waitForPageLoad(callback: js.Function, scope: js.Any): Unit = js.native
  def willFireNTimes(observable: js.Any, event: String, n: Double, desc: String): Unit = js.native
  def wontFire(observable: js.Any, event: String, desc: String): Unit = js.native
}

