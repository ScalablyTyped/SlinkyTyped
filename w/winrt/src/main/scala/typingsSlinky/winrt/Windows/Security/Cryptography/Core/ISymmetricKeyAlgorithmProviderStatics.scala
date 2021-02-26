package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISymmetricKeyAlgorithmProviderStatics extends StObject {
  
  def openAlgorithm(algorithm: String): SymmetricKeyAlgorithmProvider = js.native
}
object ISymmetricKeyAlgorithmProviderStatics {
  
  @scala.inline
  def apply(openAlgorithm: String => SymmetricKeyAlgorithmProvider): ISymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[ISymmetricKeyAlgorithmProviderStatics]
  }
  
  @scala.inline
  implicit class ISymmetricKeyAlgorithmProviderStaticsMutableBuilder[Self <: ISymmetricKeyAlgorithmProviderStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenAlgorithm(value: String => SymmetricKeyAlgorithmProvider): Self = StObject.set(x, "openAlgorithm", js.Any.fromFunction1(value))
  }
}
