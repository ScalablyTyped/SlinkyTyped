package typingsSlinky.stylus.mod.Stylus.Nodes

import typingsSlinky.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selector extends Node {
  
  var inherits: scala.Boolean = js.native
  
  var segments: js.Array[Node] = js.native
}
object Selector {
  
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    inherits: scala.Boolean,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    segments: js.Array[Node],
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): Selector = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), segments = segments.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  implicit class SelectorMutableBuilder[Self <: Selector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInherits(value: scala.Boolean): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: js.Array[Node]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsVarargs(value: Node*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
