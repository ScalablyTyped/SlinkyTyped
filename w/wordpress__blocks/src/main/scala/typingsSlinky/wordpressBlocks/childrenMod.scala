package typingsSlinky.wordpressBlocks

import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.ParentNode
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childrenMod {
  
  object default {
    
    /**
      * Given two or more block nodes, returns a new block node representing a
      * concatenation of its values.
      *
      * @param blockNodes - Block nodes to concatenate.
      */
    @JSImport("@wordpress/blocks/api/children", "default.concat")
    @js.native
    def concat(blockNodes: ReactChild*): js.Array[ReactChild] = js.native
    
    /**
      * Given an iterable set of DOM nodes, returns equivalent block children.
      * Ignores any non-element/text nodes included in set.
      *
      * @param domNodes - list of DOM nodes to convert.
      */
    @JSImport("@wordpress/blocks/api/children", "default.fromDOM")
    @js.native
    def fromDOM(domNodes: ArrayLike[Node]): js.Array[ReactChild] = js.native
    
    /**
      * Given block children, returns an array of block nodes.
      *
      * @param children - Block children object to convert.
      */
    @JSImport("@wordpress/blocks/api/children", "default.getChildrenArray")
    @js.native
    def getChildrenArray(children: js.Array[ReactChild]): js.Array[ReactChild] = js.native
    
    /**
      * Given a selector, returns an hpq matcher generating a WPBlockChildren value
      * matching the selector result.
      *
      * @param selector - DOM selector.
      */
    @JSImport("@wordpress/blocks/api/children", "default.matcher")
    @js.native
    def matcher(selector: String): js.Function1[/* domNode */ Node with ParentNode, js.Array[ReactChild]] = js.native
    
    /**
      * Given a block node, returns its HTML string representation.
      *
      * @param children - Block node(s) to convert to string.
      */
    @JSImport("@wordpress/blocks/api/children", "default.toHTML")
    @js.native
    def toHTML(children: js.Array[ReactChild]): String = js.native
  }
}
