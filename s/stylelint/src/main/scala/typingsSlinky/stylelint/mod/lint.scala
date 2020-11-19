package typingsSlinky.stylelint.mod

import typingsSlinky.stylelint.anon.PartialLinterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stylelint", "lint")
@js.native
object lint extends js.Object {
  
  def apply(): js.Promise[LinterResult] = js.native
  def apply(options: PartialLinterOptions): js.Promise[LinterResult] = js.native
}
