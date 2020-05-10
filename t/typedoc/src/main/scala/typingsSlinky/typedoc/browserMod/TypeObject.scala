package typingsSlinky.typedoc.browserMod

import typingsSlinky.typedoc.typedocStrings.Object
import typingsSlinky.typedoc.typedocStrings.`this`
import typingsSlinky.typedoc.typedocStrings.array
import typingsSlinky.typedoc.typedocStrings.boolean
import typingsSlinky.typedoc.typedocStrings.intersection
import typingsSlinky.typedoc.typedocStrings.intrinsic
import typingsSlinky.typedoc.typedocStrings.number
import typingsSlinky.typedoc.typedocStrings.reference
import typingsSlinky.typedoc.typedocStrings.reflection
import typingsSlinky.typedoc.typedocStrings.string
import typingsSlinky.typedoc.typedocStrings.stringLiteral
import typingsSlinky.typedoc.typedocStrings.tuple
import typingsSlinky.typedoc.typedocStrings.typeParameter
import typingsSlinky.typedoc.typedocStrings.union
import typingsSlinky.typedoc.typedocStrings.unknown
import typingsSlinky.typedoc.typedocStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeObject extends js.Object {
  var constraint: js.UndefOr[TypeObject] = js.native
  var declaration: js.UndefOr[ReflectionObject] = js.native
  var elementType: js.UndefOr[TypeObject] = js.native
  var elements: js.UndefOr[js.Array[TypeObject]] = js.native
  var id: js.UndefOr[Double] = js.native
  var name: js.UndefOr[Object | string | number | boolean | `this` | String] = js.native
  var `type`: void | array | intersection | intrinsic | reference | reflection | stringLiteral | tuple | typeParameter | union | unknown | String = js.native
  var typeArguments: js.UndefOr[js.Array[TypeObject]] = js.native
  var types: js.UndefOr[js.Array[TypeObject]] = js.native
  var value: js.UndefOr[String] = js.native
}

object TypeObject {
  @scala.inline
  def apply(
    `type`: void | array | intersection | intrinsic | reference | reflection | stringLiteral | tuple | typeParameter | union | unknown | String
  ): TypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeObject]
  }
  @scala.inline
  implicit class TypeObjectOps[Self <: TypeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(
      value: void | array | intersection | intrinsic | reference | reflection | stringLiteral | tuple | typeParameter | union | unknown | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraint(value: TypeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclaration(value: ReflectionObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(js.undefined)
        ret
    }
    @scala.inline
    def withElementType(value: TypeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(js.undefined)
        ret
    }
    @scala.inline
    def withElements(value: js.Array[TypeObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Object | string | number | boolean | `this` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeArguments(value: js.Array[TypeObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[TypeObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

