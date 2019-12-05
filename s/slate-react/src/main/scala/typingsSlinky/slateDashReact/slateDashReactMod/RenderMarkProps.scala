package typingsSlinky.slateDashReact.slateDashReactMod

import slinky.core.TagMod
import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Set
import typingsSlinky.slate.slateMod.Annotation
import typingsSlinky.slate.slateMod.Decoration
import typingsSlinky.slate.slateMod.Mark
import typingsSlinky.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMarkProps extends RenderProps {
  var children: TagMod[Any]
  var mark: Mark
}

object RenderMarkProps {
  @scala.inline
  def apply(
    annotations: List[Annotation] | js.Array[Annotation],
    attributes: RenderAttributes,
    children: TagMod[Any],
    decorations: List[Decoration] | js.Array[Annotation],
    editor: Editor,
    mark: Mark,
    marks: Set[Mark],
    node: Node,
    offset: Double,
    text: String
  ): RenderMarkProps = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], decorations = decorations.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marks = marks.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderMarkProps]
  }
}

