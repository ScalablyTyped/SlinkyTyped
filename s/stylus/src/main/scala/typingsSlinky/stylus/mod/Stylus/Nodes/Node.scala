package typingsSlinky.stylus.mod.Stylus.Nodes

import typingsSlinky.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var column: Double = js.native
  var filename: java.lang.String = js.native
  var first: Node = js.native
  var hash: java.lang.String = js.native
  var lineno: Double = js.native
  var nodeName: java.lang.String = js.native
  /**
    *  Default coercion throws.
    */
  def coerce(other: Node): Node = js.native
  /**
    * Nodes by default evaluate to themselves.
    */
  def eval(): Node = js.native
  /**
    * Operate on `right` with the given `op`.
    */
  def operate(op: java.lang.String, right: Node): Node = js.native
  /**
    * Return false if `op` is generally not coerced.
    */
  def shouldCoerce(op: java.lang.String): scala.Boolean = js.native
  /**
    * Return true.
    */
  // tslint:disable-next-line no-unnecessary-qualifier
  def toBoolean(): Boolean = js.native
  /**
    * Return the expression, or wrap this node in an expression.
    */
  def toExpression(): Expression = js.native
  /**
    * Return a JSON representation of this node.
    */
  def toJSON(): Column = js.native
}

object Node {
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
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): Node = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoerce(value: Node => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEval(value: () => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eval")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFilename(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineno(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperate(value: (java.lang.String, Node) => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShouldCoerce(value: java.lang.String => scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCoerce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToBoolean(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBoolean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToExpression(value: () => Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toExpression")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

