package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Navigation bar interface designed for visual studio's dual-column layout.
  * This does not form a proper tree.
  * The navbar is returned as a list of top-level items, each of which has a list of child items.
  * Child items always have an empty array for their `childItems`.
  */
@js.native
trait NavigationBarItem extends js.Object {
  var bolded: Boolean = js.native
  var childItems: js.Array[NavigationBarItem] = js.native
  var grayed: Boolean = js.native
  var indent: Double = js.native
  var kind: ScriptElementKind = js.native
  var kindModifiers: java.lang.String = js.native
  var spans: js.Array[TextSpan] = js.native
  var text: java.lang.String = js.native
}

object NavigationBarItem {
  @scala.inline
  def apply(
    bolded: Boolean,
    childItems: js.Array[NavigationBarItem],
    grayed: Boolean,
    indent: Double,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: js.Array[TextSpan],
    text: java.lang.String
  ): NavigationBarItem = {
    val __obj = js.Dynamic.literal(bolded = bolded.asInstanceOf[js.Any], childItems = childItems.asInstanceOf[js.Any], grayed = grayed.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarItem]
  }
  @scala.inline
  implicit class NavigationBarItemOps[Self <: NavigationBarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBolded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bolded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildItems(value: js.Array[NavigationBarItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrayed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

