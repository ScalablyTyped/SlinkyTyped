package typingsSlinky.typeorm

import typingsSlinky.typeorm.objectTypeMod.ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/common/EntityTarget", JSImport.Namespace)
@js.native
object entityTargetMod extends js.Object {
  
  trait _EntityTarget[Entity] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.objectTypeMod.ObjectType[Entity]
    - typingsSlinky.typeorm.browserMod.EntitySchema[Entity]
    - java.lang.String
    - typingsSlinky.typeorm.anon.Name[Entity]
  */
  type EntityTarget[Entity] = _EntityTarget[Entity] | ObjectType[Entity] | String
}
