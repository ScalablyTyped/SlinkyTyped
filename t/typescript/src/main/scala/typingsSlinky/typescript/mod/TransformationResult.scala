package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformationResult[T /* <: Node */] extends js.Object {
  /** Gets diagnostics for the transformation. */
  var diagnostics: js.UndefOr[js.Array[DiagnosticWithLocation]] = js.native
  /**
    * Indicates if a given node needs an emit notification
    *
    * @param node The node to emit.
    */
  var isEmitNotificationEnabled: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.native
  /** Gets the transformed source files. */
  var transformed: js.Array[T] = js.native
  /**
    * Clean up EmitNode entries on any parse-tree nodes.
    */
  def dispose(): Unit = js.native
  /**
    * Emits a node with possible notification.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to emit.
    * @param emitCallback A callback used to emit the node.
    */
  def emitNodeWithNotification(hint: EmitHint, node: Node, emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]): Unit = js.native
  /**
    * Gets a substitute for a node, if one is available; otherwise, returns the original node.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to substitute.
    */
  def substituteNode(hint: EmitHint, node: Node): Node = js.native
}

object TransformationResult {
  @scala.inline
  def apply[T](
    dispose: () => Unit,
    emitNodeWithNotification: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit,
    substituteNode: (EmitHint, Node) => Node,
    transformed: js.Array[T]
  ): TransformationResult[T] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), emitNodeWithNotification = js.Any.fromFunction3(emitNodeWithNotification), substituteNode = js.Any.fromFunction2(substituteNode), transformed = transformed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationResult[T]]
  }
  @scala.inline
  implicit class TransformationResultOps[Self[t] <: TransformationResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmitNodeWithNotification(value: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitNodeWithNotification")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSubstituteNode(value: (EmitHint, Node) => Node): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substituteNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTransformed(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiagnostics(value: js.Array[DiagnosticWithLocation]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnostics: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEmitNotificationEnabled(value: /* node */ Node => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmitNotificationEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsEmitNotificationEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmitNotificationEnabled")(js.undefined)
        ret
    }
  }
  
}

