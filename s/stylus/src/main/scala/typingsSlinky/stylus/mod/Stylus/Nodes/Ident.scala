package typingsSlinky.stylus.mod.Stylus.Nodes

import typingsSlinky.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ident extends Node {
  
  var isEmpty: scala.Boolean = js.native
  
  var mixin: scala.Boolean = js.native
  
  var name: java.lang.String = js.native
  
  var string: java.lang.String = js.native
  
  var `val`: Node = js.native
}
object Ident {
  
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    isEmpty: scala.Boolean,
    lineno: Double,
    mixin: scala.Boolean,
    name: java.lang.String,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    string: java.lang.String,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column,
    `val`: Node
  ): Ident = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], mixin = mixin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), string = string.asInstanceOf[js.Any], toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ident]
  }
  
  @scala.inline
  implicit class IdentOps[Self <: Ident] (val x: Self) extends AnyVal {
    
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
    def setIsEmpty(value: scala.Boolean): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixin(value: scala.Boolean): Self = this.set("mixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: java.lang.String): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: Node): Self = this.set("val", value.asInstanceOf[js.Any])
  }
}
