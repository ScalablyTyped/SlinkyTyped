package typingsSlinky.webgme.Core

import typingsSlinky.webgme.webgmeStrings.`aspect collision`
import typingsSlinky.webgme.webgmeStrings.`attribute collision`
import typingsSlinky.webgme.webgmeStrings.`constraint collision`
import typingsSlinky.webgme.webgmeStrings.`containment collision`
import typingsSlinky.webgme.webgmeStrings.`pointer collision`
import typingsSlinky.webgme.webgmeStrings.`set collision`
import typingsSlinky.webgme.webgmeStrings.error
import typingsSlinky.webgme.webgmeStrings.missing
import typingsSlinky.webgme.webgmeStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MixinViolation extends js.Object {
  /** The colliding mixin nodes (if any). */
  var collisionNodes: js.UndefOr[js.Array[Node]] = js.undefined
  /** The list of paths of colliding nodes (if any). */
  var collisionPaths: js.UndefOr[js.Array[String]] = js.undefined
  /** Hint on how to resolve the issue. */
  var hint: js.UndefOr[String] = js.undefined
  /** The description of the violation. */
  var message: js.UndefOr[String] = js.undefined
  /** The name of the affected rule definition (if available). */
  var ruleName: js.UndefOr[String] = js.undefined
  /** The severity of the given error. */
  var severity: js.UndefOr[error | warning] = js.undefined
  /** The name of the affected rule definition (if available). */
  var targetInfo: js.UndefOr[String] = js.undefined
  /** The target node of the violation (if available). */
  var targetNode: js.UndefOr[Node] = js.undefined
  /** What kind of violation */
  var `type`: js.UndefOr[
    missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
  ] = js.undefined
}

object MixinViolation {
  @scala.inline
  def apply(
    collisionNodes: js.Array[Node] = null,
    collisionPaths: js.Array[String] = null,
    hint: String = null,
    message: String = null,
    ruleName: String = null,
    severity: error | warning = null,
    targetInfo: String = null,
    targetNode: Node = null,
    `type`: missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`) = null
  ): MixinViolation = {
    val __obj = js.Dynamic.literal()
    if (collisionNodes != null) __obj.updateDynamic("collisionNodes")(collisionNodes.asInstanceOf[js.Any])
    if (collisionPaths != null) __obj.updateDynamic("collisionPaths")(collisionPaths.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (targetInfo != null) __obj.updateDynamic("targetInfo")(targetInfo.asInstanceOf[js.Any])
    if (targetNode != null) __obj.updateDynamic("targetNode")(targetNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixinViolation]
  }
}

