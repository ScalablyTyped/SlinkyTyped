package typingsSlinky.yup.mod

import typingsSlinky.std.Record
import typingsSlinky.yup.yupBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonExclusiveTestOptions[P /* <: Record[String, _] */, C]
  extends BaseTestOptions[P, C]
     with TestOptions[P, C] {
  
  @JSName("exclusive")
  var exclusive_NonExclusiveTestOptions: js.UndefOr[`false`] = js.native
}
