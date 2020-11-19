package typingsSlinky.unistBuilder

import typingsSlinky.unist.mod.Node
import typingsSlinky.unistBuilder.anon.Children
import typingsSlinky.unistBuilder.anon.Type
import typingsSlinky.unistBuilder.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("unist-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  // NOTE: the order of the unistBuilder overloads is important.
  // Looking at the generics' "extends" left to right.
  // It should go from more specific types higher in the file, to more broad types lower in the file.
  /**
    * Creates a node, with a given type
    *
    * @param type type of node
    */
  def apply[T /* <: String */](`type`: T): Type[T] = js.native
  /**
    * Creates a node, with type and value
    *
    * @param type type of node
    * @param value  value property of node
    */
  def apply[T /* <: String */](`type`: T, value: String): Value[T] = js.native
  /**
    * Creates a node, with type and children
    *
    * @param type type of node
    * @param children child nodes of the current node
    */
  def apply[T /* <: String */, C /* <: js.Array[Node] */](`type`: T, children: C): Children[T, C] = js.native
  /**
    * Creates a node, with type, props, and value
    *
    * @param type type of node
    * @param props additional properties for node
    * @param value value property of node
    */
  def apply[T /* <: String */, P /* <: js.Object */](`type`: T, props: P, value: String): Value[T] with P = js.native
  /**
    * Creates a node, with type, props, and children
    *
    * @param type type of node
    * @param props additional properties for node
    * @param children child nodes of the current node
    */
  def apply[T /* <: String */, P /* <: js.Object */, C /* <: js.Array[Node] */](`type`: T, props: P, children: C): (Children[T, C]) with P = js.native
}
