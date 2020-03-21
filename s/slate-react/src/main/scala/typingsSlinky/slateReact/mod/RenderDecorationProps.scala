package typingsSlinky.slateReact.mod

import slinky.core.TagMod
import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Set_
import typingsSlinky.slate.mod.Annotation
import typingsSlinky.slate.mod.Decoration
import typingsSlinky.slate.mod.Mark
import typingsSlinky.slate.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderDecorationProps extends RenderProps {
  var children: TagMod[Any]
  var decoration: Decoration
}

object RenderDecorationProps {
  @scala.inline
  def apply(
    annotations: List[Annotation] | js.Array[Annotation],
    attributes: RenderAttributes,
    children: TagMod[Any],
    decoration: Decoration,
    decorations: List[Decoration] | js.Array[Annotation],
    editor: Editor,
    marks: Set_[Mark],
    node: Node,
    offset: Double,
    text: String
  ): RenderDecorationProps = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], decoration = decoration.asInstanceOf[js.Any], decorations = decorations.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderDecorationProps]
  }
}

