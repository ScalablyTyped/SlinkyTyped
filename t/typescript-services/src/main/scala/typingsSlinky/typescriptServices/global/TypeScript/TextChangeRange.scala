package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TextChangeRange")
@js.native
class TextChangeRange protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TextChangeRange {
  def this(span: typingsSlinky.typescriptServices.TypeScript.TextSpan, newLength: Double) = this()
}

/* static members */
@JSGlobal("TypeScript.TextChangeRange")
@js.native
object TextChangeRange extends js.Object {
  var unchanged: typingsSlinky.typescriptServices.TypeScript.TextChangeRange = js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[typingsSlinky.typescriptServices.TypeScript.TextChangeRange]): typingsSlinky.typescriptServices.TypeScript.TextChangeRange = js.native
  def collapseChangesFromSingleVersion(changes: js.Array[typingsSlinky.typescriptServices.TypeScript.TextChangeRange]): typingsSlinky.typescriptServices.TypeScript.TextChangeRange = js.native
}

