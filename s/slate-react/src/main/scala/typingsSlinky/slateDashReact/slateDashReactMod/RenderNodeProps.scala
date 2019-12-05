package typingsSlinky.slateDashReact.slateDashReactMod

import slinky.core.TagMod
import typingsSlinky.slate.slateMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderNodeProps extends js.Object {
  var attributes: RenderAttributes
  var children: TagMod[Any]
  var editor: Editor
  var isFocused: Boolean
  var isSelected: Boolean
  var key: String
  var parent: Node
  var readOnly: Boolean
}

object RenderNodeProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    children: TagMod[Any],
    editor: Editor,
    isFocused: Boolean,
    isSelected: Boolean,
    key: String,
    parent: Node,
    readOnly: Boolean
  ): RenderNodeProps = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderNodeProps]
  }
}

