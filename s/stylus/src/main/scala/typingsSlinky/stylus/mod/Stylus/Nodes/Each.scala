package typingsSlinky.stylus.mod.Stylus.Nodes

import typingsSlinky.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Each extends Node {
  
  var block: Block = js.native
  
  var expr: Expression = js.native
  
  var key: java.lang.String = js.native
  
  var `val`: java.lang.String = js.native
}
object Each {
  
  @scala.inline
  def apply(
    block: Block,
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    expr: Expression,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    key: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column,
    `val`: java.lang.String
  ): Each = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), expr = expr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Each]
  }
  
  @scala.inline
  implicit class EachOps[Self <: Each] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: Block): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpr(value: Expression): Self = this.set("expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: java.lang.String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: java.lang.String): Self = this.set("val", value.asInstanceOf[js.Any])
  }
}
