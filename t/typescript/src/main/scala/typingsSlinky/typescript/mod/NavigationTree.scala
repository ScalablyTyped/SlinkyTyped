package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node in a tree of nested declarations in a file.
  * The top node is always a script or module node.
  */
trait NavigationTree extends js.Object {
  /** Present if non-empty */
  var childItems: js.UndefOr[js.Array[NavigationTree]] = js.undefined
  var kind: ScriptElementKind
  /** ScriptElementKindModifier separated by commas, e.g. "public,abstract" */
  var kindModifiers: java.lang.String
  var nameSpan: js.UndefOr[TextSpan] = js.undefined
  /**
    * Spans of the nodes that generated this declaration.
    * There will be more than one if this is the result of merging.
    */
  var spans: js.Array[TextSpan]
  /** Name of the declaration, or a short description, e.g. "<class>". */
  var text: java.lang.String
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: ScriptElementKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = this.set("kindModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpans(value: js.Array[TextSpan]): Self = this.set("spans", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildItems(value: js.Array[NavigationTree]): Self = this.set("childItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildItems: Self = this.set("childItems", js.undefined)
    @scala.inline
    def setNameSpan(value: TextSpan): Self = this.set("nameSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameSpan: Self = this.set("nameSpan", js.undefined)
  }
  
}

