package typingsSlinky.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingRange extends js.Object {
  /**
    * The zero-based character offset before the folded range ends. If not defined, defaults to the length of the end line.
    */
  var endCharacter: js.UndefOr[Double] = js.native
  /**
    * The zero-based line number where the folded range ends.
    */
  var endLine: Double = js.native
  /**
    * Describes the kind of the folding range such as `comment' or 'region'. The kind
    * is used to categorize folding ranges and used by commands like 'Fold all comments'. See
    * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The zero-based character offset from where the folded range starts. If not defined, defaults to the length of the start line.
    */
  var startCharacter: js.UndefOr[Double] = js.native
  /**
    * The zero-based line number from where the folded range starts.
    */
  var startLine: Double = js.native
}

object FoldingRange {
  @scala.inline
  def apply(endLine: Double, startLine: Double): FoldingRange = {
    val __obj = js.Dynamic.literal(endLine = endLine.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
  @scala.inline
  implicit class FoldingRangeOps[Self <: FoldingRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCharacter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCharacter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCharacter")(js.undefined)
        ret
    }
  }
  
}

