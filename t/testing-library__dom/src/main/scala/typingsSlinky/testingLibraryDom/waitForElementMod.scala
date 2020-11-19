package typingsSlinky.testingLibraryDom

import typingsSlinky.testingLibraryDom.waitForMod.waitForOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/dom/types/wait-for-element", JSImport.Namespace)
@js.native
object waitForElementMod extends js.Object {
  
  def waitForElement[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def waitForElement[T](callback: js.Function0[T], options: waitForOptions): js.Promise[T] = js.native
}
