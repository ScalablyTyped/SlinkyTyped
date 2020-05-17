package typingsSlinky.unistUtilIs.mod

import typingsSlinky.unist.mod.Node
import typingsSlinky.unist.mod.Parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unist-util-is", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[_]]): /* is T */ Boolean = js.native
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[_]], index: Double): /* is T */ Boolean = js.native
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[_]], index: Double, parent: Parent): /* is T */ Boolean = js.native
  def apply[T /* <: Node */](node: js.Any, test: js.Array[Test[_]], index: Double, parent: Parent, context: js.Any): /* is T */ Boolean = js.native
  /**
    * Unist utility to check if a node passes a test.
    *
    * @param node Node to check.
    * @param test When not given, checks if `node` is a `Node`.
    * When `string`, works like passing `function (node) {return node.type === test}`.
    * When `function` checks if function passed the node is true.
    * When `object`, checks that all keys in test are in node, and that they have (strictly) equal values.
    * When `array`, checks any one of the subtests pass.
    * @param index Position of `node` in `parent`
    * @param parent Parent of `node`
    * @param context Context object to invoke `test` with
    * @typeParam T type that node is compared with
    * @returns Whether test passed and `node` is a `Node` (object with `type` set to non-empty `string`).
    */
  def apply[T /* <: Node */](node: js.Any, test: Test[T]): /* is T */ Boolean = js.native
  def apply[T /* <: Node */](node: js.Any, test: Test[T], index: Double): /* is T */ Boolean = js.native
  def apply[T /* <: Node */](node: js.Any, test: Test[T], index: Double, parent: Parent): /* is T */ Boolean = js.native
  def apply[T /* <: Node */](node: js.Any, test: Test[T], index: Double, parent: Parent, context: js.Any): /* is T */ Boolean = js.native
}

