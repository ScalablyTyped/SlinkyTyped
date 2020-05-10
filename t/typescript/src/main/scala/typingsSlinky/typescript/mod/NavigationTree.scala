package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node in a tree of nested declarations in a file.
  * The top node is always a script or module node.
  */
@js.native
trait NavigationTree extends js.Object {
  /** Present if non-empty */
  var childItems: js.UndefOr[js.Array[NavigationTree]] = js.native
  var kind: ScriptElementKind = js.native
  /** ScriptElementKindModifier separated by commas, e.g. "public,abstract" */
  var kindModifiers: java.lang.String = js.native
  var nameSpan: js.UndefOr[TextSpan] = js.native
  /**
    * Spans of the nodes that generated this declaration.
    * There will be more than one if this is the result of merging.
    */
  var spans: js.Array[TextSpan] = js.native
  /** Name of the declaration, or a short description, e.g. "<class>". */
  var text: java.lang.String = js.native
}

object NavigationTree {
  @scala.inline
  def apply(
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: js.Array[TextSpan],
    text: java.lang.String
  ): NavigationTree = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationTree]
  }
  @scala.inline
  implicit class NavigationTreeOps[Self <: NavigationTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: ScriptElementKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKindModifiers(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kindModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpans(value: js.Array[TextSpan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildItems(value: js.Array[NavigationTree]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNameSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameSpan")(js.undefined)
        ret
    }
  }
  
}

