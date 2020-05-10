package typingsSlinky.stylus.mod.Stylus.Nodes

import typingsSlinky.stylus.AnonColumn
import typingsSlinky.stylus.mod.Stylus.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends Node {
  var length: Double = js.native
  var vals: Dictionary[Node] = js.native
  /**
    * Get `key`.
    */
  def get(key: java.lang.String): Node = js.native
  /**
    * Has `key`?
    */
  def has(key: java.lang.String): scala.Boolean = js.native
  /**
    * Set `key` to `val`.
    */
  def set(key: java.lang.String, value: Node): this.type = js.native
  /**
    * Convert object to string with properties.
    */
  def toBlock(): java.lang.String = js.native
}

object Object {
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    get: java.lang.String => Node,
    has: java.lang.String => scala.Boolean,
    hash: java.lang.String,
    length: Double,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    set: (java.lang.String, Node) => Object,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBlock: () => java.lang.String,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => AnonColumn,
    vals: Dictionary[Node]
  ): Object = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), set = js.Any.fromFunction2(set), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBlock = js.Any.fromFunction0(toBlock), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON), vals = vals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: java.lang.String => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: java.lang.String => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (java.lang.String, Node) => Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToBlock(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBlock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVals(value: Dictionary[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

