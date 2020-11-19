package typingsSlinky.testingLibraryDom

import typingsSlinky.testingLibraryDom.anon.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/dom/types/wait", JSImport.Namespace)
@js.native
object waitMod extends js.Object {
  
  def wait(callback: js.UndefOr[scala.Nothing], options: Interval): js.Promise[Unit] = js.native
  def wait(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def wait(callback: js.Function0[Unit], options: Interval): js.Promise[Unit] = js.native
}
