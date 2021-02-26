package typingsSlinky.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.TextChangeRange")
@js.native
class TextChangeRange protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TextChangeRange {
  def this(span: typingsSlinky.typescriptServices.TypeScript.TextSpan, newLength: Double) = this()
}
object TextChangeRange {
  
  @JSGlobal("TypeScript.TextChangeRange")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.TextChangeRange.collapseChangesAcrossMultipleVersions")
  @js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[typingsSlinky.typescriptServices.TypeScript.TextChangeRange]): typingsSlinky.typescriptServices.TypeScript.TextChangeRange = js.native
  
  /* static member */
  @JSGlobal("TypeScript.TextChangeRange.collapseChangesFromSingleVersion")
  @js.native
  def collapseChangesFromSingleVersion(changes: js.Array[typingsSlinky.typescriptServices.TypeScript.TextChangeRange]): typingsSlinky.typescriptServices.TypeScript.TextChangeRange = js.native
  
  /* static member */
  @JSGlobal("TypeScript.TextChangeRange.unchanged")
  @js.native
  def unchanged: typingsSlinky.typescriptServices.TypeScript.TextChangeRange = js.native
  @scala.inline
  def unchanged_=(x: typingsSlinky.typescriptServices.TypeScript.TextChangeRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unchanged")(x.asInstanceOf[js.Any])
}
