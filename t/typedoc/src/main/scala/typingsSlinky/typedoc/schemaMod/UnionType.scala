package typingsSlinky.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.UnionType, 'type' | 'types'> */
@js.native
trait UnionType extends SomeType {
  
  var `type`: ModelToObject[String] | String = js.native
  
  var types: ModelToObject[js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]] | js.Array[typingsSlinky.typedoc.typesAbstractMod.Type] = js.native
}
object UnionType {
  
  @scala.inline
  def apply(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]] | js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
  ): UnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionType]
  }
  
  @scala.inline
  implicit class UnionTypeOps[Self <: UnionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ModelToObject[String] | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: (typingsSlinky.typedoc.typesAbstractMod.Type | _ModelToObject[js.Any])*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(
      value: ModelToObject[js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]] | js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]
    ): Self = this.set("types", value.asInstanceOf[js.Any])
  }
}
