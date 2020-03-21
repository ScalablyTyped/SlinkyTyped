package typingsSlinky.yaml.mod

import typingsSlinky.yaml.mod.cst.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.mod.YAMLSyntaxError
  - typingsSlinky.yaml.mod.YAMLSemanticError
  - typingsSlinky.yaml.mod.YAMLReferenceError
*/
trait YAMLError extends js.Object

object YAMLError {
  @scala.inline
  def YAMLSyntaxError(
    message: String,
    name: typingsSlinky.yaml.yamlStrings.YAMLSyntaxError,
    source: Node,
    stack: String = null
  ): YAMLError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLError]
  }
  @scala.inline
  def YAMLSemanticError(
    message: String,
    name: typingsSlinky.yaml.yamlStrings.YAMLSemanticError,
    source: Node,
    stack: String = null
  ): YAMLError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLError]
  }
  @scala.inline
  def YAMLReferenceError(
    message: String,
    name: typingsSlinky.yaml.yamlStrings.YAMLReferenceError,
    source: Node,
    stack: String = null
  ): YAMLError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAMLError]
  }
}

