package typingsSlinky.uifabricUtilities

import slinky.core.ReactComponentClass
import typingsSlinky.uifabricUtilities.anon.DefaultRender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icomponentasMod {
  
  type IComponentAs[T] = ReactComponentClass[IComponentAsProps[T]]
  
  type IComponentAsProps[T] = T with DefaultRender[T]
}
