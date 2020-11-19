package typingsSlinky.webicon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webicon.identifiableMod.Identifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webicon/System/IdentityMap", JSImport.Namespace)
@js.native
object identityMapMod extends js.Object {
  
  type IdentityMap[TSimple, TComplex] = (js.Array[Identifiable with TComplex]) | (StringDictionary[TSimple | TComplex])
}
