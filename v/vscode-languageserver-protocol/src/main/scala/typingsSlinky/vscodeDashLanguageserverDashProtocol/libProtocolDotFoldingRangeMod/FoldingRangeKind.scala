package typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FoldingRangeKind extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol.foldingRange", "FoldingRangeKind")
@js.native
object FoldingRangeKind extends js.Object {
  /**
    * Folding range for a comment
    */
  @js.native
  sealed trait Comment extends FoldingRangeKind
  
  /**
    * Folding range for a imports or includes
    */
  @js.native
  sealed trait Imports extends FoldingRangeKind
  
  /**
    * Folding range for a region (e.g. `#region`)
    */
  @js.native
  sealed trait Region extends FoldingRangeKind
  
  /* "comment" */ val Comment: typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRangeKind.Comment with String = js.native
  /* "imports" */ val Imports: typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRangeKind.Imports with String = js.native
  /* "region" */ val Region: typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod.FoldingRangeKind.Region with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FoldingRangeKind with String] = js.native
}

