package typingsSlinky.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object abstractMod {
  
  type TraverseCallback = js.Function2[
    /* reflection */ typingsSlinky.typedoc.abstractMod.Reflection, 
    /* property */ typingsSlinky.typedoc.abstractMod.TraverseProperty, 
    scala.Boolean | scala.Unit
  ]
  
  @scala.inline
  def resetReflectionID(): scala.Unit = typingsSlinky.typedoc.abstractMod.^.asInstanceOf[js.Dynamic].applyDynamic("resetReflectionID")().asInstanceOf[scala.Unit]
}
