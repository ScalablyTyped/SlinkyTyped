package typingsSlinky.tern.ternMod

import typingsSlinky.tern.ternStrings.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeQuery
  extends BaseQueryWithFile
     with Query {
  /**
    * Determines how deep the type string must be expanded.
    * Nested objects will only display property types up to this depth,
    * and be represented by their type name or a representation showing
    * only property names below it. Default `0`
    */
  var depth: js.UndefOr[Double] = js.native
  /** Specify the location of the expression. */
  var end: Double | Position = js.native
  /**
    * Set to `true` when you are interested in a function type.
    * This will cause function types to win when something has multiple types.
    * Default `false`
    */
  var preferFunction: js.UndefOr[Boolean] = js.native
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.native
  /** Query the type of something. */
  @JSName("type")
  var type_TypeQuery: `type` = js.native
}

object TypeQuery {
  @scala.inline
  def apply(end: Double | Position, file: String, `type`: `type`): TypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeQuery]
  }
  @scala.inline
  implicit class TypeQueryOps[Self <: TypeQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double | Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `type`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double | Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

