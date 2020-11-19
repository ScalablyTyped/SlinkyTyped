package typingsSlinky.wordpressBlocks.mod

import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.ParentNode
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object of utility functions used in managing block attribute values of
  * source `node`.
  *
  * @see https://github.com/WordPress/gutenberg/pull/10439
  *
  * @deprecated since 4.0. The `node` source should not be used, and can be
  *             replaced by the `html` source.
  */
@JSImport("@wordpress/blocks", "node")
@js.native
object node extends js.Object {
  
  /**
    * Given a DOM Element or Text node, returns an equivalent block node. Throws
    * if passed any node type other than element or text.
    *
    * @throws {TypeError} If non-element/text node is passed.
    *
    * @param domNode - DOM node to convert.
    */
  def fromDOM(domNode: Node): ReactElement = js.native
  
  /**
    * Given a single node and a node type (e.g. `'br'`), returns `true` if the node
    * corresponds to that type, `false` otherwise.
    *
    * @param node - Block node to test
    * @param type - Node to type to test against.
    */
  @JSName("isNodeOfType")
  def isNodeOfType_type(
    node: ReactElement,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
  ): Boolean = js.native
  
  /**
    * Given a selector, returns an hpq matcher generating a WPBlockNode value
    * matching the selector result.
    */
  val matcher: js.Function1[
    /* selector */ String, 
    js.Function1[/* domNode */ Node with ParentNode, js.Array[ReactChild]]
  ] = js.native
  
  /**
    * Given a block node, returns its HTML string representation.
    *
    * @param node - Block node to convert to string.
    */
  def toHTML(node: ReactChild): String = js.native
}
