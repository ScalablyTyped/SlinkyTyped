package typingsSlinky.typedoc.distLibSerializationBrowserMod

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

trait TypeObject extends js.Object {
  var constraint: js.UndefOr[TypeObject] = js.undefined
  var declaration: js.UndefOr[ReflectionObject] = js.undefined
  var elementType: js.UndefOr[TypeObject] = js.undefined
  var elements: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[Object | string | number | boolean | `this` | String] = js.undefined
  var `type`: void | array | intersection | intrinsic | reference | reflection | stringLiteral | tuple | typeParameter | union | unknown | String
  var typeArguments: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var types: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TypeObject {
  @scala.inline
  def apply(
    `type`: void | array | intersection | intrinsic | reference | reflection | stringLiteral | tuple | typeParameter | union | unknown | String,
    constraint: TypeObject = null,
    declaration: ReflectionObject = null,
    elementType: TypeObject = null,
    elements: js.Array[TypeObject] = null,
    id: Int | Double = null,
    name: Object | string | number | boolean | `this` | String = null,
    typeArguments: js.Array[TypeObject] = null,
    types: js.Array[TypeObject] = null,
    value: String = null
  ): TypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeObject]
  }
}

