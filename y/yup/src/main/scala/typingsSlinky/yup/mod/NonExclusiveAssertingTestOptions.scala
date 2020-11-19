package typingsSlinky.yup.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonExclusiveAssertingTestOptions[U, P /* <: Record[String, _] */]
  extends NonExclusiveTestOptions[P]
     with AssertingTestOptions[U, P] {
  
  @JSName("test")
  var test_Original_NonExclusiveAssertingTestOptions: AssertingTestFunction[U] = js.native
}
