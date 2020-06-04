package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationResult[T /* <: Node */] extends js.Object {
  /** Gets diagnostics for the transformation. */
  var diagnostics: js.UndefOr[js.Array[DiagnosticWithLocation]] = js.undefined
  /**
    * Indicates if a given node needs an emit notification
    *
    * @param node The node to emit.
    */
  var isEmitNotificationEnabled: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  /** Gets the transformed source files. */
  var transformed: js.Array[T]
  /**
    * Clean up EmitNode entries on any parse-tree nodes.
    */
  def dispose(): Unit
  /**
    * Emits a node with possible notification.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to emit.
    * @param emitCallback A callback used to emit the node.
    */
  def emitNodeWithNotification(hint: EmitHint, node: Node, emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]): Unit
  /**
    * Gets a substitute for a node, if one is available; otherwise, returns the original node.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to substitute.
    */
  def substituteNode(hint: EmitHint, node: Node): Node
}

object TransformationResult {
  @scala.inline
  def apply[/* <: typingsSlinky.typescript.mod.Node */ T](
    dispose: () => Unit,
    emitNodeWithNotification: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit,
    substituteNode: (EmitHint, Node) => Node,
    transformed: js.Array[T]
  ): TransformationResult[T] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), emitNodeWithNotification = js.Any.fromFunction3(emitNodeWithNotification), substituteNode = js.Any.fromFunction2(substituteNode), transformed = transformed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationResult[T]]
  }
  @scala.inline
  implicit class TransformationResultOps[Self <: TransformationResult[_], /* <: typingsSlinky.typescript.mod.Node */ T] (val x: Self with TransformationResult[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setEmitNodeWithNotification(value: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit): Self = this.set("emitNodeWithNotification", js.Any.fromFunction3(value))
    @scala.inline
    def setSubstituteNode(value: (EmitHint, Node) => Node): Self = this.set("substituteNode", js.Any.fromFunction2(value))
    @scala.inline
    def setTransformed(value: js.Array[T]): Self = this.set("transformed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagnostics(value: js.Array[DiagnosticWithLocation]): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    @scala.inline
    def setIsEmitNotificationEnabled(value: /* node */ Node => Boolean): Self = this.set("isEmitNotificationEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsEmitNotificationEnabled: Self = this.set("isEmitNotificationEnabled", js.undefined)
  }
  
}

