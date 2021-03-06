package typingsSlinky.slate.mod

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.slate.slateStrings.insert_text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "InsertTextOperation")
@js.native
class InsertTextOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var offset: Double = js.native
  var path: List[Double] = js.native
  var text: String = js.native
  @JSName("type")
  var type_InsertTextOperation: insert_text = js.native
}

