package typingsSlinky.testingLibraryVue.mod

import typingsSlinky.testingLibraryDom.waitForMod.waitForOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/vue", "waitForElementToBeRemoved")
@js.native
object waitForElementToBeRemoved extends js.Object {
  
  def apply[T](callback: T): js.Promise[Unit] = js.native
  def apply[T](callback: T, options: waitForOptions): js.Promise[Unit] = js.native
  def apply[T](callback: js.Function0[T]): js.Promise[Unit] = js.native
  def apply[T](callback: js.Function0[T], options: waitForOptions): js.Promise[Unit] = js.native
}
