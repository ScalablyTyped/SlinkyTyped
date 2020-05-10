package typingsSlinky.yaml.parseCstMod.CST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseContext extends js.Object {
  /** Node starts at beginning of line */
  var atLineStart: Boolean = js.native
  /** true if currently in a collection context */
  var inCollection: Boolean = js.native
  /** true if currently in a flow context */
  var inFlow: Boolean = js.native
  /** Current level of indentation */
  var indent: Double = js.native
  /** Start of the current line */
  var lineStart: Double = js.native
  /** The parent of the node */
  var parent: Node = js.native
  /** Source of the YAML document */
  var src: String = js.native
}

object ParseContext {
  @scala.inline
  def apply(
    atLineStart: Boolean,
    inCollection: Boolean,
    inFlow: Boolean,
    indent: Double,
    lineStart: Double,
    parent: Node,
    src: String
  ): ParseContext = {
    val __obj = js.Dynamic.literal(atLineStart = atLineStart.asInstanceOf[js.Any], inCollection = inCollection.asInstanceOf[js.Any], inFlow = inFlow.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseContext]
  }
  @scala.inline
  implicit class ParseContextOps[Self <: ParseContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtLineStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atLineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInCollection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInFlow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

