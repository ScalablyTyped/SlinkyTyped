package typingsSlinky.typeorm

import typingsSlinky.typeorm.commonObjectTypeMod.ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/common/EntityTarget", JSImport.Namespace)
@js.native
object commonEntityTargetMod extends js.Object {
  
  trait _EntityTarget[Entity] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.commonObjectTypeMod.ObjectType[Entity]
    - typingsSlinky.typeorm.mod.EntitySchema[Entity]
    - java.lang.String
    - typingsSlinky.typeorm.anon.Name[Entity]
  */
  type EntityTarget[Entity] = _EntityTarget[Entity] | ObjectType[Entity] | String
}
