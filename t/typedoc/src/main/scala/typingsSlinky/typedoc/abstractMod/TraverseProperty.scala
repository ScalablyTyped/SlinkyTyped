package typingsSlinky.typedoc.abstractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TraverseProperty extends StObject
@JSImport("typedoc/dist/lib/models/reflections/abstract", "TraverseProperty")
@js.native
object TraverseProperty extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TraverseProperty with Double] = js.native
  
  @js.native
  sealed trait Children extends TraverseProperty
  /* 0 */ val Children: typingsSlinky.typedoc.abstractMod.TraverseProperty.Children with Double = js.native
  
  @js.native
  sealed trait GetSignature extends TraverseProperty
  /* 6 */ val GetSignature: typingsSlinky.typedoc.abstractMod.TraverseProperty.GetSignature with Double = js.native
  
  @js.native
  sealed trait IndexSignature extends TraverseProperty
  /* 5 */ val IndexSignature: typingsSlinky.typedoc.abstractMod.TraverseProperty.IndexSignature with Double = js.native
  
  @js.native
  sealed trait Parameters extends TraverseProperty
  /* 1 */ val Parameters: typingsSlinky.typedoc.abstractMod.TraverseProperty.Parameters with Double = js.native
  
  @js.native
  sealed trait SetSignature extends TraverseProperty
  /* 7 */ val SetSignature: typingsSlinky.typedoc.abstractMod.TraverseProperty.SetSignature with Double = js.native
  
  @js.native
  sealed trait Signatures extends TraverseProperty
  /* 4 */ val Signatures: typingsSlinky.typedoc.abstractMod.TraverseProperty.Signatures with Double = js.native
  
  @js.native
  sealed trait TypeLiteral extends TraverseProperty
  /* 2 */ val TypeLiteral: typingsSlinky.typedoc.abstractMod.TraverseProperty.TypeLiteral with Double = js.native
  
  @js.native
  sealed trait TypeParameter extends TraverseProperty
  /* 3 */ val TypeParameter: typingsSlinky.typedoc.abstractMod.TraverseProperty.TypeParameter with Double = js.native
}
