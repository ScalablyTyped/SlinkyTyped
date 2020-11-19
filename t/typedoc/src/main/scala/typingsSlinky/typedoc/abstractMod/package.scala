package typingsSlinky.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object abstractMod {
  
  type TraverseCallback = js.Function2[
    /* reflection */ typingsSlinky.typedoc.abstractMod.Reflection, 
    /* property */ typingsSlinky.typedoc.abstractMod.TraverseProperty, 
    scala.Boolean | scala.Unit
  ]
}
