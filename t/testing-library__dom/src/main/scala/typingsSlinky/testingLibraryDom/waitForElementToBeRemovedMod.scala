package typingsSlinky.testingLibraryDom

import typingsSlinky.testingLibraryDom.waitForMod.waitForOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/dom/types/wait-for-element-to-be-removed", JSImport.Namespace)
@js.native
object waitForElementToBeRemovedMod extends js.Object {
  
  def waitForElementToBeRemoved[T](callback: T): js.Promise[Unit] = js.native
  def waitForElementToBeRemoved[T](callback: T, options: waitForOptions): js.Promise[Unit] = js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[Unit] = js.native
  def waitForElementToBeRemoved[T](callback: js.Function0[T], options: waitForOptions): js.Promise[Unit] = js.native
}
