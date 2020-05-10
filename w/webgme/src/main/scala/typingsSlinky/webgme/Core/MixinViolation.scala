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

@js.native
trait MixinViolation extends js.Object {
  /** The colliding mixin nodes (if any). */
  var collisionNodes: js.UndefOr[js.Array[Node]] = js.native
  /** The list of paths of colliding nodes (if any). */
  var collisionPaths: js.UndefOr[js.Array[String]] = js.native
  /** Hint on how to resolve the issue. */
  var hint: js.UndefOr[String] = js.native
  /** The description of the violation. */
  var message: js.UndefOr[String] = js.native
  /** The name of the affected rule definition (if available). */
  var ruleName: js.UndefOr[String] = js.native
  /** The severity of the given error. */
  var severity: js.UndefOr[error | warning] = js.native
  /** The name of the affected rule definition (if available). */
  var targetInfo: js.UndefOr[String] = js.native
  /** The target node of the violation (if available). */
  var targetNode: js.UndefOr[Node] = js.native
  /** What kind of violation */
  var `type`: js.UndefOr[
    missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
  ] = js.native
}

object MixinViolation {
  @scala.inline
  def apply(): MixinViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixinViolation]
  }
  @scala.inline
  implicit class MixinViolationOps[Self <: MixinViolation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollisionNodes(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: error | warning): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNode")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

