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

trait RenderAnnotationProps extends RenderProps {
  var annotation: Annotation
  var children: TagMod[Any]
}

object RenderAnnotationProps {
  @scala.inline
  def apply(
    annotation: Annotation,
    annotations: List[Annotation] | js.Array[Annotation],
    attributes: RenderAttributes,
    children: TagMod[Any],
    decorations: List[Decoration] | js.Array[Annotation],
    editor: Editor,
    marks: Set_[Mark],
    node: Node,
    offset: Double,
    text: String
  ): RenderAnnotationProps = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], decorations = decorations.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderAnnotationProps]
  }
}

