package typingsSlinky.testingLibraryReact.mod

import typingsSlinky.testingLibraryDom.waitForMod.waitForOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/react", "waitForElement")
@js.native
object waitForElement extends js.Object {
  
  def apply[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def apply[T](callback: js.Function0[T], options: waitForOptions): js.Promise[T] = js.native
}
