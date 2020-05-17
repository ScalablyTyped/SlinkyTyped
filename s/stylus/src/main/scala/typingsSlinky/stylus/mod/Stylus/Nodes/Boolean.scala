package typingsSlinky.stylus.mod.Stylus.Nodes

import typingsSlinky.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boolean extends Node {
  var isFalse: scala.Boolean = js.native
  var isTrue: scala.Boolean = js.native
  var `val`: scala.Boolean = js.native
  /**
    * Return 'Boolean'.
    */
  def inspect(): java.lang.String = js.native
  /**
    * Negate the value.
    */
  // tslint:disable-next-line no-unnecessary-qualifier
  def negate(): Boolean = js.native
}

object Boolean {
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    inspect: () => java.lang.String,
    isFalse: scala.Boolean,
    isTrue: scala.Boolean,
    lineno: Double,
    negate: () => Boolean,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column,
    `val`: scala.Boolean
  ): Boolean = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), isFalse = isFalse.asInstanceOf[js.Any], isTrue = isTrue.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], negate = js.Any.fromFunction0(negate), nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
  @scala.inline
  implicit class BooleanOps[Self <: Boolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInspect(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFalse(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFalse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTrue(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVal(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

