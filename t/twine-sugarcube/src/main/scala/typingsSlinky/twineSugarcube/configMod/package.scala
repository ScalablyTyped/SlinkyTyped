package typingsSlinky.twineSugarcube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object configMod {
  
  type DescriptionHandler = js.ThisFunction0[
    /* this */ typingsSlinky.twineSugarcube.passageMod.Passage, 
    java.lang.String | scala.Null
  ]
  
  type SaveObjectHander = js.Function2[
    /* save */ typingsSlinky.twineSugarcube.saveMod.SaveObject, 
    /* details */ typingsSlinky.twineSugarcube.configMod.SaveDetails, 
    scala.Unit
  ]
}
