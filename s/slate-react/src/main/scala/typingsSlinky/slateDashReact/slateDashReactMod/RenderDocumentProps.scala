package typingsSlinky.slateDashReact.slateDashReactMod

import slinky.core.TagMod
import typingsSlinky.slate.slateMod.Document
import typingsSlinky.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderDocumentProps extends RenderNodeProps {
  var node: Document
}

object RenderDocumentProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    children: TagMod[Any],
    editor: Editor,
    isFocused: Boolean,
    isSelected: Boolean,
    key: String,
    node: Document,
    parent: Node,
    readOnly: Boolean
  ): RenderDocumentProps = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderDocumentProps]
  }
}

