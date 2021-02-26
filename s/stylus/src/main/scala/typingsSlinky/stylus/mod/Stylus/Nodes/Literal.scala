package typingsSlinky.stylus.mod.Stylus.Nodes

import typingsSlinky.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Literal extends Node {
  
  var prefixed: scala.Boolean = js.native
  
  var string: java.lang.String = js.native
  
  var `val`: java.lang.String = js.native
}
object Literal {
  
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    prefixed: scala.Boolean,
    shouldCoerce: java.lang.String => scala.Boolean,
    string: java.lang.String,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column,
    `val`: java.lang.String
  ): Literal = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), prefixed = prefixed.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), string = string.asInstanceOf[js.Any], toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  implicit class LiteralMutableBuilder[Self <: Literal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixed(value: scala.Boolean): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: java.lang.String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
