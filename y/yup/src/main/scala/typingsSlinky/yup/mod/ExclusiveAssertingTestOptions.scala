package typingsSlinky.yup.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExclusiveAssertingTestOptions[U, P /* <: Record[String, _] */]
  extends ExclusiveTestOptions[P]
     with AssertingTestOptions[U, P] {
  
  @JSName("test")
  var test_Original_ExclusiveAssertingTestOptions: AssertingTestFunction[U] = js.native
}
