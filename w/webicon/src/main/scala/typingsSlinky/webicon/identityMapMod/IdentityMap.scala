package typingsSlinky.webicon.identityMapMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webicon.identifiableMod.Identifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.webicon.identifiableMod.Identifiable with TComplex]
  - org.scalablytyped.runtime.StringDictionary[TSimple | TComplex]
*/
trait IdentityMap[TSimple, TComplex] extends js.Object

object IdentityMap {
  @scala.inline
  implicit def apply[TSimple, TComplex](value: js.Array[Identifiable with TComplex]): IdentityMap[TSimple, TComplex] = value.asInstanceOf[IdentityMap[TSimple, TComplex]]
  @scala.inline
  implicit def apply[TSimple, TComplex](value: StringDictionary[TSimple | TComplex]): IdentityMap[TSimple, TComplex] = value.asInstanceOf[IdentityMap[TSimple, TComplex]]
}

