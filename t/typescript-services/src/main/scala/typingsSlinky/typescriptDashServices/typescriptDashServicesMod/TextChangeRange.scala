package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextChangeRange")
@js.native
class TextChangeRange protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.TextChangeRange {
  def this(span: typingsSlinky.typescriptDashServices.TypeScript.TextSpan, newLength: Double) = this()
}

/* static members */
@JSImport("typescript-services", "TextChangeRange")
@js.native
object TextChangeRange extends js.Object {
  var unchanged: typingsSlinky.typescriptDashServices.TypeScript.TextChangeRange = js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[typingsSlinky.typescriptDashServices.TypeScript.TextChangeRange]): typingsSlinky.typescriptDashServices.TypeScript.TextChangeRange = js.native
  def collapseChangesFromSingleVersion(changes: js.Array[typingsSlinky.typescriptDashServices.TypeScript.TextChangeRange]): typingsSlinky.typescriptDashServices.TypeScript.TextChangeRange = js.native
}

